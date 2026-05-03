package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorFillIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 208.000 C 248.000 212.418 244.418 216.000 240.000 216.000 L 16.000 216.000 C 11.582 216.000 8.000 212.418 8.000 208.000 C 8.000 203.582 11.582 200.000 16.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 203.582 248.000 208.000 ZM 16.300 98.180 C 15.322 94.732 16.756 91.055 19.810 89.180 L 123.810 25.180 C 126.380 23.600 129.620 23.600 132.190 25.180 L 236.190 89.180 C 239.245 91.053 240.681 94.729 239.706 98.176 C 238.732 101.624 235.583 104.004 232.000 104.000 L 208.000 104.000 L 208.000 168.000 L 224.000 168.000 C 228.418 168.000 232.000 171.582 232.000 176.000 C 232.000 180.418 228.418 184.000 224.000 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 C 24.000 171.582 27.582 168.000 32.000 168.000 L 48.000 168.000 L 48.000 104.000 L 24.000 104.000 C 20.420 104.001 17.275 101.624 16.300 98.180 ZM 144.000 160.000 C 144.000 164.418 147.582 168.000 152.000 168.000 C 156.418 168.000 160.000 164.418 160.000 160.000 L 160.000 112.000 C 160.000 107.582 156.418 104.000 152.000 104.000 C 147.582 104.000 144.000 107.582 144.000 112.000 ZM 96.000 160.000 C 96.000 164.418 99.582 168.000 104.000 168.000 C 108.418 168.000 112.000 164.418 112.000 160.000 L 112.000 112.000 C 112.000 107.582 108.418 104.000 104.000 104.000 C 99.582 104.000 96.000 107.582 96.000 112.000 Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
