package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorThinIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M147.26 140.3c8.32-7.884 10.994-20.043 6.75-30.69C149.767 98.962 139.462 91.976 128 91.976c-11.462 0-21.767 6.986-26.01 17.633-4.244 10.647-1.569 22.806 6.75 30.69-4.975 .845-9.451 3.529-12.54 7.52-3.782 4.816-5.106 11.119-3.58 17.05l12.18 48c2.309 8.946 10.401 15.18 19.64 15.13h7.12c9.239 .05 17.331-6.184 19.64-15.13l12.18-48c1.526-5.931 .202-12.234-3.58-17.05-3.089-3.991-7.565-6.675-12.54-7.52ZM108 120c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM155.63 162.9l-12.18 48c-1.414 5.397-6.311 9.145-11.89 9.1h-7.12c-5.579 .045-10.476-3.703-11.89-9.1l-12.18-48c-.905-3.538-.114-7.296 2.14-10.17 2.335-3.005 5.935-4.753 9.74-4.73h31.5c3.805-.023 7.405 1.725 9.74 4.73 2.254 2.874 3.045 6.632 2.14 10.17ZM188 128C187.981 104.621 174.385 83.382 153.161 73.578 131.937 63.774 106.952 67.191 89.139 82.333 71.327 97.475 63.931 121.585 70.19 144.11c.591 2.129-.656 4.334-2.785 4.925-2.129 .591-4.334-.656-4.925-2.785C54.754 118.551 65.288 88.986 88.788 72.412c23.5-16.574 54.885-16.574 78.385 0 23.5 16.574 34.033 46.139 26.308 73.838-.48 1.73-2.055 2.928-3.85 2.93-.361 .003-.722-.044-1.07-.14-1.025-.282-1.895-.961-2.418-1.886-.523-.925-.657-2.02-.372-3.044 1.469-5.244 2.219-10.664 2.23-16.11ZM228 128c.018 33.388-16.641 64.578-44.4 83.13-1.832 1.186-4.277 .684-5.494-1.128-1.217-1.812-.757-4.264 1.034-5.512 33.681-22.522 48.662-64.428 36.894-103.199C204.265 62.52 168.517 36.013 128 36.013c-40.517 0-76.265 26.507-88.034 65.278-11.769 38.771 3.213 80.676 36.894 103.199 1.791 1.248 2.25 3.7 1.034 5.512-1.217 1.812-3.661 2.314-5.494 1.128C32.753 184.609 17.356 133.778 35.624 89.715 53.891 45.652 100.736 20.625 147.518 29.935 194.3 39.245 227.994 80.301 228 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
