package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorFillIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.650 144.000 L 144.000 94.810 L 144.000 144.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 184.000 152.000 C 184.000 147.582 180.418 144.000 176.000 144.000 L 160.000 144.000 L 160.000 72.000 C 160.003 68.600 157.857 65.570 154.649 64.445 C 151.441 63.319 147.872 64.344 145.750 67.000 L 81.750 147.000 C 79.827 149.402 79.452 152.693 80.785 155.466 C 82.118 158.239 84.923 160.002 88.000 160.000 L 144.000 160.000 L 144.000 184.000 C 144.000 188.418 147.582 192.000 152.000 192.000 C 156.418 192.000 160.000 188.418 160.000 184.000 L 160.000 160.000 L 176.000 160.000 C 180.418 160.000 184.000 156.418 184.000 152.000 Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
