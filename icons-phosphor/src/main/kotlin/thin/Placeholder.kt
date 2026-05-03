package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Placeholder: ImageVector
    get() {
        if (_placeholder != null) return _placeholder!!
        _placeholder = phosphorThinIcon(
            name = "Placeholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 48.000 L 212.000 206.340 L 49.660 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 44.000 208.000 L 44.000 49.660 L 206.340 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 Z"),
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
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
