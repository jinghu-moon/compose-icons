package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorBoldIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.170 13.710 C 226.556 11.541 222.069 11.427 218.350 13.410 L 101.000 76.000 L 32.000 76.000 C 20.954 76.000 12.000 84.954 12.000 96.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 120.000 220.000 C 131.046 220.000 140.000 211.046 140.000 200.000 L 140.000 168.000 C 140.001 166.831 139.829 165.669 139.490 164.550 L 118.320 94.000 L 212.000 44.000 L 212.000 156.000 L 200.000 156.000 L 200.000 152.000 C 200.000 145.373 194.627 140.000 188.000 140.000 C 181.373 140.000 176.000 145.373 176.000 152.000 L 176.000 160.000 C 176.000 171.046 184.954 180.000 196.000 180.000 L 216.000 180.000 C 227.046 180.000 236.000 171.046 236.000 160.000 L 236.000 24.000 C 235.999 19.784 233.786 15.878 230.170 13.710 ZM 95.070 100.000 L 111.870 156.000 L 76.000 156.000 L 76.000 100.000 ZM 52.000 100.000 L 52.000 156.000 L 36.000 156.000 L 36.000 100.000 ZM 36.000 196.000 L 36.000 180.000 L 116.000 180.000 L 116.000 196.000 Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
