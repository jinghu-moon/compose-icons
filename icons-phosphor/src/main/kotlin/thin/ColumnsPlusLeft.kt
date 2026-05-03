package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorThinIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 36.000 L 104.000 36.000 C 97.373 36.000 92.000 41.373 92.000 48.000 L 92.000 208.000 C 92.000 214.627 97.373 220.000 104.000 220.000 L 128.000 220.000 C 134.627 220.000 140.000 214.627 140.000 208.000 L 140.000 48.000 C 140.000 41.373 134.627 36.000 128.000 36.000 ZM 132.000 208.000 C 132.000 210.209 130.209 212.000 128.000 212.000 L 104.000 212.000 C 101.791 212.000 100.000 210.209 100.000 208.000 L 100.000 48.000 C 100.000 45.791 101.791 44.000 104.000 44.000 L 128.000 44.000 C 130.209 44.000 132.000 45.791 132.000 48.000 ZM 200.000 36.000 L 176.000 36.000 C 169.373 36.000 164.000 41.373 164.000 48.000 L 164.000 208.000 C 164.000 214.627 169.373 220.000 176.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 214.627 212.000 208.000 L 212.000 48.000 C 212.000 41.373 206.627 36.000 200.000 36.000 ZM 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 210.209 172.000 208.000 L 172.000 48.000 C 172.000 45.791 173.791 44.000 176.000 44.000 L 200.000 44.000 C 202.209 44.000 204.000 45.791 204.000 48.000 ZM 68.000 128.000 C 68.000 130.209 66.209 132.000 64.000 132.000 L 44.000 132.000 L 44.000 152.000 C 44.000 154.209 42.209 156.000 40.000 156.000 C 37.791 156.000 36.000 154.209 36.000 152.000 L 36.000 132.000 L 16.000 132.000 C 13.791 132.000 12.000 130.209 12.000 128.000 C 12.000 125.791 13.791 124.000 16.000 124.000 L 36.000 124.000 L 36.000 104.000 C 36.000 101.791 37.791 100.000 40.000 100.000 C 42.209 100.000 44.000 101.791 44.000 104.000 L 44.000 124.000 L 64.000 124.000 C 66.209 124.000 68.000 125.791 68.000 128.000 Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
