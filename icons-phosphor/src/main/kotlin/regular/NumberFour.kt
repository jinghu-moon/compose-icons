package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorRegularIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 160.000 L 168.000 160.000 L 168.000 48.000 C 168.003 44.600 165.857 41.570 162.649 40.445 C 159.441 39.319 155.872 40.344 153.750 43.000 L 57.750 163.000 C 55.827 165.402 55.452 168.693 56.785 171.466 C 58.118 174.239 60.923 176.002 64.000 176.000 L 152.000 176.000 L 152.000 208.000 C 152.000 212.418 155.582 216.000 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 L 168.000 176.000 L 184.000 176.000 C 188.418 176.000 192.000 172.418 192.000 168.000 C 192.000 163.582 188.418 160.000 184.000 160.000 ZM 152.000 160.000 L 80.640 160.000 L 152.000 70.810 Z"),
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
