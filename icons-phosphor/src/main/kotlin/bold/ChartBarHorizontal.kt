package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorBoldIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 92.000 L 188.000 92.000 L 188.000 56.000 C 188.000 49.373 182.627 44.000 176.000 44.000 L 60.000 44.000 L 60.000 40.000 C 60.000 33.373 54.627 28.000 48.000 28.000 C 41.373 28.000 36.000 33.373 36.000 40.000 L 36.000 216.000 C 36.000 222.627 41.373 228.000 48.000 228.000 C 54.627 228.000 60.000 222.627 60.000 216.000 L 60.000 212.000 L 144.000 212.000 C 150.627 212.000 156.000 206.627 156.000 200.000 L 156.000 164.000 L 224.000 164.000 C 230.627 164.000 236.000 158.627 236.000 152.000 L 236.000 104.000 C 236.000 97.373 230.627 92.000 224.000 92.000 ZM 164.000 68.000 L 164.000 92.000 L 60.000 92.000 L 60.000 68.000 ZM 132.000 188.000 L 60.000 188.000 L 60.000 164.000 L 132.000 164.000 ZM 212.000 140.000 L 60.000 140.000 L 60.000 116.000 L 212.000 116.000 Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
