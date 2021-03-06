export interface GiphyImageData{
    type: string;
    images: GiphyImageTypes;
}

export interface GiphyImageDataArray{
    data: Array<GiphyImageData>;
}

export interface GiphyImageTypes{
    original: GiphyImage; 
    downsized :GiphyImage;
}

export interface GiphyImage{
    height: string;
    width: string;
    size: string;
    url: string;
}


