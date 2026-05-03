package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = lucideOutlineIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 5.000 C 19.105 5.000 20.000 5.895 20.000 7.000 L 20.000 15.526 C 20.000 15.837 20.072 16.145 20.212 16.423 L 21.280 18.550 C 21.437 18.861 21.420 19.231 21.237 19.527 C 21.053 19.823 20.728 20.002 20.380 20.000 L 3.620 20.000 C 3.272 20.002 2.947 19.823 2.763 19.527 C 2.580 19.231 2.563 18.861 2.720 18.550 L 3.788 16.423 C 3.928 16.145 4.000 15.837 4.000 15.526 L 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 20.054 15.987 L 3.946 15.987"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
