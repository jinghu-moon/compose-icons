package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorFillIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 80.000 56.000 C 84.418 56.000 88.000 59.582 88.000 64.000 C 88.000 68.418 84.418 72.000 80.000 72.000 L 72.000 72.000 L 72.000 184.000 L 80.000 184.000 C 84.418 184.000 88.000 187.582 88.000 192.000 C 88.000 196.418 84.418 200.000 80.000 200.000 ZM 160.000 160.000 C 155.582 160.000 152.000 156.418 152.000 152.000 L 152.000 120.000 C 152.000 115.582 148.418 112.000 144.000 112.000 C 139.582 112.000 136.000 115.582 136.000 120.000 L 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 C 123.582 160.000 120.000 156.418 120.000 152.000 L 120.000 120.000 C 120.000 115.582 116.418 112.000 112.000 112.000 C 107.582 112.000 104.000 115.582 104.000 120.000 L 104.000 152.000 C 104.000 156.418 100.418 160.000 96.000 160.000 C 91.582 160.000 88.000 156.418 88.000 152.000 L 88.000 104.000 C 88.001 100.764 89.952 97.848 92.942 96.611 C 95.932 95.374 99.373 96.061 101.660 98.350 C 110.396 94.165 120.793 95.657 128.000 102.130 C 135.052 95.823 145.151 94.247 153.790 98.106 C 162.428 101.965 167.993 110.539 168.000 120.000 L 168.000 152.000 C 168.000 156.418 164.418 160.000 160.000 160.000 ZM 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 176.000 200.000 C 171.582 200.000 168.000 196.418 168.000 192.000 C 168.000 187.582 171.582 184.000 176.000 184.000 L 184.000 184.000 L 184.000 72.000 L 176.000 72.000 C 171.582 72.000 168.000 68.418 168.000 64.000 C 168.000 59.582 171.582 56.000 176.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
