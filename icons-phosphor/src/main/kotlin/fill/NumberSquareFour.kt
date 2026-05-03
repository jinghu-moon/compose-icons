package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorFillIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 160.000 160.000 L 152.000 160.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 160.000 L 88.000 160.000 C 84.946 159.998 82.160 158.257 80.819 155.513 C 79.477 152.769 79.816 149.501 81.690 147.090 L 137.690 75.090 C 139.789 72.397 143.366 71.332 146.596 72.441 C 149.826 73.549 151.997 76.585 152.000 80.000 L 152.000 144.000 L 160.000 144.000 C 164.418 144.000 168.000 147.582 168.000 152.000 C 168.000 156.418 164.418 160.000 160.000 160.000 ZM 104.360 144.000 L 136.000 103.320 L 136.000 144.000 Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
