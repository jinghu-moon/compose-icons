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
                pathData = parseSvgPathData("M14 4v10.54c1.568 .905 2.332 2.751 1.864 4.499-.469 1.749-2.053 2.965-3.864 2.965-1.81 0-3.395-1.216-3.864-2.965C7.668 17.291 8.432 15.445 10 14.54v-10.54c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z"),
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
