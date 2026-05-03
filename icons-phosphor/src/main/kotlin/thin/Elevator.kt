package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorThinIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 180.000 108.000 L 180.000 212.000 L 132.000 212.000 L 132.000 108.000 ZM 124.000 212.000 L 76.000 212.000 L 76.000 108.000 L 124.000 108.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 188.000 212.000 L 188.000 104.000 C 188.000 101.791 186.209 100.000 184.000 100.000 L 72.000 100.000 C 69.791 100.000 68.000 101.791 68.000 104.000 L 68.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 148.000 72.000 C 148.000 74.209 146.209 76.000 144.000 76.000 L 112.000 76.000 C 109.791 76.000 108.000 74.209 108.000 72.000 C 108.000 69.791 109.791 68.000 112.000 68.000 L 144.000 68.000 C 146.209 68.000 148.000 69.791 148.000 72.000 Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
