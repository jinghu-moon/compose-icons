package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorFillIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 45.660 C 239.951 43.372 240.636 39.929 239.397 36.938 C 238.158 33.947 235.238 31.997 232.000 32.000 L 24.000 32.000 C 20.762 31.997 17.842 33.947 16.603 36.938 C 15.364 39.929 16.049 43.372 18.340 45.660 L 120.000 147.310 L 120.000 208.000 L 88.000 208.000 C 83.582 208.000 80.000 211.582 80.000 216.000 C 80.000 220.418 83.582 224.000 88.000 224.000 L 168.000 224.000 C 172.418 224.000 176.000 220.418 176.000 216.000 C 176.000 211.582 172.418 208.000 168.000 208.000 L 136.000 208.000 L 136.000 147.310 ZM 212.660 48.000 L 196.660 64.000 L 59.310 64.000 L 43.310 48.000 Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
