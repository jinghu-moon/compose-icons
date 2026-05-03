package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorFillIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 32.000 C 183.221 31.998 182.445 32.113 181.700 32.340 L 21.700 80.340 L 21.700 80.340 C 18.318 81.355 16.001 84.468 16.000 88.000 L 16.000 104.000 C 16.000 108.418 19.582 112.000 24.000 112.000 L 31.460 112.000 C 44.910 112.000 56.250 123.000 56.000 136.460 C 55.749 149.535 45.077 160.002 32.000 160.000 L 24.000 160.000 C 19.582 160.000 16.000 163.582 16.000 168.000 L 16.000 192.000 C 16.000 196.418 19.582 200.000 24.000 200.000 L 224.000 200.000 C 232.837 200.000 240.000 192.837 240.000 184.000 L 240.000 88.000 C 239.967 57.086 214.914 32.033 184.000 32.000 ZM 80.000 184.000 C 80.000 166.327 94.327 152.000 112.000 152.000 C 129.673 152.000 144.000 166.327 144.000 184.000 ZM 168.000 136.000 C 158.100 136.005 148.755 131.427 142.691 123.602 C 136.626 115.777 134.525 105.586 137.000 96.000 L 199.000 96.000 C 201.475 105.586 199.374 115.777 193.309 123.602 C 187.245 131.427 177.900 136.005 168.000 136.000 ZM 78.510 80.000 L 185.120 48.000 C 203.696 48.545 219.459 61.794 223.190 80.000 Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
