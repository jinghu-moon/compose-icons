package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorBoldIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93c2.945 3.163 3.961 7.665 2.661 11.786-1.3 4.121-4.716 7.225-8.942 8.126-4.227 .901-8.611-.54-11.479-3.773L147.78 167.6c-17.646-6.649-37.452-3.981-52.71 7.1-5.357 3.905-12.865 2.727-16.77-2.63-3.905-5.357-2.727-12.865 2.63-16.77 12.242-8.941 26.789-14.188 41.92-15.12L103.51 118.9c-14.607 3.55-28.274 10.219-40.06 19.55-5.201 3.975-12.628 3.048-16.693-2.083-4.065-5.131-3.267-12.573 1.793-16.727C59.689 110.828 72.212 103.924 85.61 99.21l-17.31-19C55.076 85.854 42.725 93.356 31.62 102.49c-5.131 4.206-12.699 3.456-16.905-1.675C10.509 95.684 11.259 88.116 16.39 83.91c10.74-8.819 22.489-16.332 35-22.38L39.12 48.07C36.175 44.907 35.159 40.405 36.459 36.284c1.3-4.121 4.716-7.225 8.942-8.126 4.226-.901 8.611 .54 11.479 3.773ZM128 188c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM192.55 138.45c5.201 3.975 12.628 3.048 16.693-2.083 4.065-5.131 3.267-12.573-1.793-16.727C196.216 110.715 183.555 103.753 170 99.05c-6.226-2.055-12.948 1.266-15.098 7.46-2.15 6.193 1.068 12.966 7.228 15.21 11.009 3.826 21.293 9.482 30.42 16.73ZM239.61 83.91C208.127 58.126 168.694 44.026 128 44c-3.94 0-7.93 .13-11.86 .39-6.627 .439-11.644 6.168-11.205 12.795 .439 6.627 6.168 11.644 12.795 11.205 3.4-.23 6.86-.34 10.27-.34 35.141 .019 69.193 12.194 96.38 34.46 5.122 4.206 12.684 3.462 16.89-1.66 4.206-5.122 3.462-12.684-1.66-16.89Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
