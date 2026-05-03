package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorThinIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 80.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 L 92.000 48.000 C 92.000 41.373 86.627 36.000 80.000 36.000 ZM 84.000 208.000 C 84.000 210.209 82.209 212.000 80.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 L 80.000 44.000 C 82.209 44.000 84.000 45.791 84.000 48.000 ZM 152.000 36.000 L 128.000 36.000 C 121.373 36.000 116.000 41.373 116.000 48.000 L 116.000 208.000 C 116.000 214.627 121.373 220.000 128.000 220.000 L 152.000 220.000 C 158.627 220.000 164.000 214.627 164.000 208.000 L 164.000 48.000 C 164.000 41.373 158.627 36.000 152.000 36.000 ZM 156.000 208.000 C 156.000 210.209 154.209 212.000 152.000 212.000 L 128.000 212.000 C 125.791 212.000 124.000 210.209 124.000 208.000 L 124.000 48.000 C 124.000 45.791 125.791 44.000 128.000 44.000 L 152.000 44.000 C 154.209 44.000 156.000 45.791 156.000 48.000 ZM 244.000 128.000 C 244.000 130.209 242.209 132.000 240.000 132.000 L 220.000 132.000 L 220.000 152.000 C 220.000 154.209 218.209 156.000 216.000 156.000 C 213.791 156.000 212.000 154.209 212.000 152.000 L 212.000 132.000 L 192.000 132.000 C 189.791 132.000 188.000 130.209 188.000 128.000 C 188.000 125.791 189.791 124.000 192.000 124.000 L 212.000 124.000 L 212.000 104.000 C 212.000 101.791 213.791 100.000 216.000 100.000 C 218.209 100.000 220.000 101.791 220.000 104.000 L 220.000 124.000 L 240.000 124.000 C 242.209 124.000 244.000 125.791 244.000 128.000 Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
