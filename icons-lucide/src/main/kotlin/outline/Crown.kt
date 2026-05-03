package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = lucideOutlineIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.562 3.266 C 11.650 3.106 11.818 3.007 12.000 3.007 C 12.182 3.007 12.350 3.106 12.438 3.266 L 15.390 8.870 C 15.533 9.133 15.785 9.318 16.079 9.375 C 16.372 9.432 16.676 9.354 16.906 9.164 L 21.183 5.500 C 21.351 5.363 21.589 5.350 21.771 5.469 C 21.953 5.587 22.038 5.809 21.981 6.019 L 19.147 16.265 C 19.028 16.696 18.638 16.995 18.191 16.999 L 5.810 16.999 C 5.363 16.996 4.972 16.696 4.853 16.265 L 2.020 6.020 C 1.963 5.810 2.048 5.588 2.230 5.470 C 2.412 5.351 2.650 5.364 2.818 5.501 L 7.094 9.165 C 7.324 9.355 7.628 9.433 7.921 9.376 C 8.215 9.319 8.467 9.134 8.610 8.871 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 21.000 L 19.000 21.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _crown!!
    }

private var _crown: ImageVector? = null
