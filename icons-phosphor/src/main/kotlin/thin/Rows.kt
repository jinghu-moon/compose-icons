package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorThinIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 145.373 36.000 152.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 L 220.000 152.000 C 220.000 145.373 214.627 140.000 208.000 140.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 149.791 212.000 152.000 ZM 208.000 52.000 L 48.000 52.000 C 41.373 52.000 36.000 57.373 36.000 64.000 L 36.000 104.000 C 36.000 110.627 41.373 116.000 48.000 116.000 L 208.000 116.000 C 214.627 116.000 220.000 110.627 220.000 104.000 L 220.000 64.000 C 220.000 57.373 214.627 52.000 208.000 52.000 ZM 212.000 104.000 C 212.000 106.209 210.209 108.000 208.000 108.000 L 48.000 108.000 C 45.791 108.000 44.000 106.209 44.000 104.000 L 44.000 64.000 C 44.000 61.791 45.791 60.000 48.000 60.000 L 208.000 60.000 C 210.209 60.000 212.000 61.791 212.000 64.000 Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
