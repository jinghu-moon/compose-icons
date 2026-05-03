package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = lucideOutlineIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 4.000 L 14.000 14.540 C 15.568 15.445 16.332 17.291 15.864 19.039 C 15.395 20.788 13.810 22.004 12.000 22.004 C 10.190 22.004 8.605 20.788 8.136 19.039 C 7.668 17.291 8.432 15.445 10.000 14.540 L 10.000 4.000 C 10.000 2.895 10.895 2.000 12.000 2.000 C 13.105 2.000 14.000 2.895 14.000 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
