package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = lucideOutlineIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.900 18.550 L 12.900 2.570 C 12.733 2.225 12.383 2.006 12.000 2.006 C 11.617 2.006 11.267 2.225 11.100 2.570 L 3.100 18.550"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 19.000 C 21.000 20.657 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 20.657 3.000 19.000 C 3.000 17.343 7.029 16.000 12.000 16.000 C 16.971 16.000 21.000 17.343 21.000 19.000 Z"),
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
        return _cone!!
    }

private var _cone: ImageVector? = null
