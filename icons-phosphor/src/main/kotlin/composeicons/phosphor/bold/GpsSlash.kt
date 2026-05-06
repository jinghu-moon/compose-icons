package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorBoldIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 128c0 6.627-5.373 12-12 12h-20.79c-.706 5.429-1.898 10.784-3.56 16-1.588 4.973-6.209 8.349-11.43 8.35-1.239-.003-2.469-.196-3.65-.57-3.034-.968-5.558-3.102-7.017-5.933-1.459-2.83-1.734-6.124-.763-9.157 6.578-20.679 2.9-43.255-9.901-60.778C170.089 70.39 149.7 60.022 128 60c-4.868-.001-9.721 .515-14.48 1.54-4.231 1.017-8.681-.337-11.629-3.537C98.942 54.802 97.958 50.257 99.317 46.123c1.36-4.134 4.85-7.207 9.123-8.033 2.49-.54 5-1 7.56-1.31v-20.78C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12v20.78c41.26 5.499 73.721 37.96 79.22 79.22h20.78c6.627 0 12 5.373 12 12ZM216.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L180.47 203.56c-12.043 8.379-25.922 13.743-40.47 15.64v20.8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20.78C74.74 213.721 42.279 181.26 36.78 140h-20.78C9.373 140 4 134.627 4 128c0-6.627 5.373-12 12-12h20.79c2.327-17.488 9.615-33.943 21-47.42L39.12 48.07C36.175 44.907 35.159 40.405 36.459 36.284c1.3-4.121 4.716-7.225 8.942-8.126 4.226-.901 8.611 .54 11.479 3.773L190.69 179.11h0ZM164.14 185.6l-90-99c-19.95 26.1-18.389 62.73 3.709 87.038 22.098 24.308 58.414 29.342 86.291 11.962Z"),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
