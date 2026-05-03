package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorFillIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 120.000 L 223.700 120.000 C 219.456 64.240 171.877 21.818 115.997 23.970 C 60.117 26.122 15.942 72.078 16.000 128.000 L 16.000 152.000 C 16.044 191.746 48.254 223.956 88.000 224.000 L 128.000 224.000 C 167.746 223.956 199.956 191.746 200.000 152.000 L 200.000 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 88.000 180.000 C 74.745 180.000 64.000 169.255 64.000 156.000 C 64.000 142.745 74.745 132.000 88.000 132.000 C 101.255 132.000 112.000 142.745 112.000 156.000 C 112.000 169.255 101.255 180.000 88.000 180.000 ZM 184.000 152.000 C 183.969 180.770 162.166 204.846 133.540 207.720 C 150.287 194.068 160.004 173.606 160.000 152.000 L 160.000 136.000 L 184.000 136.000 Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
