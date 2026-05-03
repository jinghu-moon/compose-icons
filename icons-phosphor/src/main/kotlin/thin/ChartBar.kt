package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorThinIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 204.000 L 212.000 204.000 L 212.000 40.000 C 212.000 37.791 210.209 36.000 208.000 36.000 L 152.000 36.000 C 149.791 36.000 148.000 37.791 148.000 40.000 L 148.000 84.000 L 96.000 84.000 C 93.791 84.000 92.000 85.791 92.000 88.000 L 92.000 132.000 L 48.000 132.000 C 45.791 132.000 44.000 133.791 44.000 136.000 L 44.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 205.791 28.000 208.000 C 28.000 210.209 29.791 212.000 32.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 C 228.000 205.791 226.209 204.000 224.000 204.000 ZM 156.000 44.000 L 204.000 44.000 L 204.000 204.000 L 156.000 204.000 ZM 100.000 92.000 L 148.000 92.000 L 148.000 204.000 L 100.000 204.000 ZM 52.000 140.000 L 92.000 140.000 L 92.000 204.000 L 52.000 204.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
