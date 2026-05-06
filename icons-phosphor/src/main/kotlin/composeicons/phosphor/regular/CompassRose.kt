package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorRegularIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.94 120.24l-27.05-6.76C216.584 71.984 184.016 39.416 142.52 33.11L135.76 6.11C134.868 2.551 131.669 .055 128 .055c-3.669 0-6.868 2.496-7.76 6.055l-6.76 27.05C71.984 39.466 39.416 72.034 33.11 113.53L6.11 120.29c-3.559 .892-6.055 4.091-6.055 7.76 0 3.669 2.496 6.868 6.055 7.76l27.05 6.76c6.306 41.496 38.874 74.064 80.37 80.37l6.76 27.05c.892 3.559 4.091 6.055 7.76 6.055 3.669 0 6.868-2.496 7.76-6.055l6.76-27.05c41.496-6.306 74.064-38.874 80.37-80.37l27.05-6.76c3.559-.892 6.055-4.091 6.055-7.76 0-3.669-2.496-6.868-6.055-7.76ZM154.45 143.14 139.31 128l15.14-15.14L215 128ZM101.55 143.14 41 128l60.57-15.14L116.69 128ZM205.77 109.2 158.6 97.4 146.8 50.23c29.172 7.021 51.949 29.798 58.97 58.97ZM143.14 101.55 128 116.69 112.86 101.55 128 41ZM109.2 50.23 97.4 97.4 50.23 109.2C57.251 80.028 80.028 57.251 109.2 50.23ZM50.2 146.8l47.2 11.8 11.8 47.17C80.028 198.749 57.251 175.972 50.23 146.8ZM112.83 154.45 128 139.31l15.14 15.14L128 215ZM146.77 205.77l11.8-47.17 47.17-11.8c-7.016 29.164-29.78 51.939-58.94 58.97Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
