package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = lucideOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 12.500 C 15.000 14.433 13.433 16.000 11.500 16.000 C 9.567 16.000 8.000 14.433 8.000 12.500 C 8.000 10.567 9.567 9.000 11.500 9.000 C 13.433 9.000 15.000 10.567 15.000 12.500 Z"),
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
        pathData = parseSvgPathData("M 3.000 8.000 C 3.000 4.500 5.500 2.000 9.500 2.000 C 14.500 2.000 14.330 5.000 17.000 7.000 C 19.670 9.000 22.000 9.000 22.000 13.000 C 22.000 17.500 19.500 19.500 15.000 19.500 C 12.500 19.500 12.500 22.000 9.000 22.000 C 5.500 22.000 2.000 20.000 2.000 16.500 C 2.000 13.500 3.500 13.500 3.500 11.500 C 3.500 10.000 3.000 9.000 3.000 8.000 Z"),
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
