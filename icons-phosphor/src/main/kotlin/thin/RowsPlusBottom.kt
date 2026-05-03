package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorThinIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 116.000 L 48.000 116.000 C 41.373 116.000 36.000 121.373 36.000 128.000 L 36.000 152.000 C 36.000 158.627 41.373 164.000 48.000 164.000 L 208.000 164.000 C 214.627 164.000 220.000 158.627 220.000 152.000 L 220.000 128.000 C 220.000 121.373 214.627 116.000 208.000 116.000 ZM 212.000 152.000 C 212.000 154.209 210.209 156.000 208.000 156.000 L 48.000 156.000 C 45.791 156.000 44.000 154.209 44.000 152.000 L 44.000 128.000 C 44.000 125.791 45.791 124.000 48.000 124.000 L 208.000 124.000 C 210.209 124.000 212.000 125.791 212.000 128.000 ZM 208.000 44.000 L 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 80.000 C 36.000 86.627 41.373 92.000 48.000 92.000 L 208.000 92.000 C 214.627 92.000 220.000 86.627 220.000 80.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 212.000 80.000 C 212.000 82.209 210.209 84.000 208.000 84.000 L 48.000 84.000 C 45.791 84.000 44.000 82.209 44.000 80.000 L 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 53.791 212.000 56.000 ZM 156.000 216.000 C 156.000 218.209 154.209 220.000 152.000 220.000 L 132.000 220.000 L 132.000 240.000 C 132.000 242.209 130.209 244.000 128.000 244.000 C 125.791 244.000 124.000 242.209 124.000 240.000 L 124.000 220.000 L 104.000 220.000 C 101.791 220.000 100.000 218.209 100.000 216.000 C 100.000 213.791 101.791 212.000 104.000 212.000 L 124.000 212.000 L 124.000 192.000 C 124.000 189.791 125.791 188.000 128.000 188.000 C 130.209 188.000 132.000 189.791 132.000 192.000 L 132.000 212.000 L 152.000 212.000 C 154.209 212.000 156.000 213.791 156.000 216.000 Z"),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
