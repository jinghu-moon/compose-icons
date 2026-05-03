package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorThinIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 88.000 220.000 C 94.627 220.000 100.000 214.627 100.000 208.000 L 100.000 156.000 L 156.000 156.000 L 156.000 176.000 C 156.000 182.627 161.373 188.000 168.000 188.000 L 208.000 188.000 C 214.627 188.000 220.000 182.627 220.000 176.000 L 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 ZM 92.000 208.000 C 92.000 210.209 90.209 212.000 88.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 124.000 L 92.000 124.000 ZM 92.000 116.000 L 44.000 116.000 L 44.000 60.000 L 92.000 60.000 ZM 156.000 148.000 L 100.000 148.000 L 100.000 60.000 L 156.000 60.000 ZM 212.000 176.000 C 212.000 178.209 210.209 180.000 208.000 180.000 L 168.000 180.000 C 165.791 180.000 164.000 178.209 164.000 176.000 L 164.000 124.000 L 212.000 124.000 ZM 212.000 116.000 L 164.000 116.000 L 164.000 60.000 L 212.000 60.000 Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
