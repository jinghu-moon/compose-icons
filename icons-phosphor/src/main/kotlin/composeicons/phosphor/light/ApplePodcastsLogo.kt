package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) return _applePodcastsLogo!!
        _applePodcastsLogo = phosphorLightIcon(
            name = "ApplePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M151 139.2c10.171-12.184 9.093-30.182-2.461-41.064-11.554-10.882-29.584-10.882-41.138 0-11.554 10.882-12.632 28.88-2.461 41.064-4.098 1.398-7.697 3.967-10.35 7.39-4.16 5.304-5.616 12.241-3.94 18.77l12.18 48c2.536 9.846 11.443 16.704 21.61 16.64h7.12c10.156 .051 19.047-6.805 21.58-16.64l12.18-48c1.676-6.529 .22-13.466-3.94-18.77-2.661-3.427-6.271-5.997-10.38-7.39ZM128 102c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM153.69 162.4l-12.18 48c-1.186 4.512-5.285 7.643-9.95 7.6h-7.12c-4.684 .066-8.81-3.069-10-7.6l-12.18-48c-.751-2.937-.093-6.056 1.78-8.44 1.948-2.532 4.965-4.011 8.16-4h31.5c3.195-.011 6.212 1.468 8.16 4 1.891 2.375 2.567 5.495 1.83 8.44ZM186 128C185.969 105.408 172.823 84.889 152.311 75.419 131.799 65.95 107.655 69.252 90.44 83.883 73.225 98.514 66.072 121.809 72.11 143.58c.808 3.164-1.062 6.392-4.208 7.266-3.146 .874-6.413-.929-7.352-4.056C52.639 118.287 63.498 87.887 87.679 70.848c24.181-17.039 56.462-17.039 80.642 0 24.181 17.039 35.04 47.439 27.129 75.942-.939 3.127-4.206 4.93-7.352 4.056-3.146-.874-5.016-4.102-4.208-7.266 1.403-5.074 2.113-10.315 2.11-15.58ZM230 128c.019 34.055-16.974 65.869-45.29 84.79-2.761 1.845-6.495 1.101-8.34-1.66-1.845-2.761-1.101-6.495 1.66-8.34 32.948-22.033 47.603-63.028 36.09-100.955C202.607 63.907 167.636 37.977 128 37.977c-39.636 0-74.607 25.931-86.12 63.858-11.513 37.927 3.142 78.922 36.09 100.955 2.761 1.845 3.505 5.579 1.66 8.34-1.845 2.761-5.579 3.505-8.34 1.66C30.849 185.739 15.143 133.891 33.776 88.946 52.409 44.001 100.192 18.473 147.91 27.97 195.629 37.467 229.996 79.346 230 128Z"),
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
