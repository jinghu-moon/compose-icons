package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorRegularIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 98.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L200 91.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L188.69 80 170.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L200 68.69 218.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L211.31 80ZM128 192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM172.71 158.53c-26.658-19.374-62.762-19.374-89.42 0-3.573 2.601-4.361 7.607-1.76 11.18 2.601 3.573 7.607 4.361 11.18 1.76 21.039-15.301 49.541-15.301 70.58 0 3.573 2.601 8.579 1.813 11.18-1.76 2.601-3.573 1.813-8.579-1.76-11.18ZM135.62 64.18c4.418 .21 8.17-3.202 8.38-7.62 .21-4.418-3.202-8.17-7.62-8.38-2.78-.13-5.6-.2-8.38-.2C88.227 48.011 49.688 61.797 18.92 87c-3.416 2.806-3.911 7.849-1.105 11.265 2.806 3.416 7.849 3.911 11.265 1.105C56.983 76.516 91.933 64.02 128 64c2.53 0 5.09 .06 7.62 .18ZM135.46 112.25c4.418 .298 8.242-3.042 8.54-7.46 .298-4.418-3.042-8.242-7.46-8.54-2.83-.19-5.7-.29-8.54-.29-27.967-.11-55.133 9.335-77 26.77-2.673 2.118-3.709 5.697-2.581 8.915 1.128 3.218 4.171 5.368 7.581 5.355 1.816 .013 3.581-.598 5-1.73C80.033 120.112 103.669 111.903 128 112c2.48 0 5 .08 7.46 .25Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
