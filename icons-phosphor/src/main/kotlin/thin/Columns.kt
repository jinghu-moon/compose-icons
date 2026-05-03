package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorThinIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 104.000 36.000 L 64.000 36.000 C 57.373 36.000 52.000 41.373 52.000 48.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 104.000 220.000 C 110.627 220.000 116.000 214.627 116.000 208.000 L 116.000 48.000 C 116.000 41.373 110.627 36.000 104.000 36.000 ZM 108.000 208.000 C 108.000 210.209 106.209 212.000 104.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 48.000 C 60.000 45.791 61.791 44.000 64.000 44.000 L 104.000 44.000 C 106.209 44.000 108.000 45.791 108.000 48.000 ZM 192.000 36.000 L 152.000 36.000 C 145.373 36.000 140.000 41.373 140.000 48.000 L 140.000 208.000 C 140.000 214.627 145.373 220.000 152.000 220.000 L 192.000 220.000 C 198.627 220.000 204.000 214.627 204.000 208.000 L 204.000 48.000 C 204.000 41.373 198.627 36.000 192.000 36.000 ZM 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 L 152.000 212.000 C 149.791 212.000 148.000 210.209 148.000 208.000 L 148.000 48.000 C 148.000 45.791 149.791 44.000 152.000 44.000 L 192.000 44.000 C 194.209 44.000 196.000 45.791 196.000 48.000 Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
