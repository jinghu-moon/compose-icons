package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = lucideOutlineIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 16.000 L 4.000 16.000 C 2.895 16.000 2.000 15.105 2.000 14.000 C 2.000 12.895 2.895 12.000 4.000 12.000 L 20.000 12.000 C 21.105 12.000 22.000 12.895 22.000 14.000 C 22.000 15.105 21.105 16.000 20.000 16.000 L 15.750 16.000"),
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
        pathData = parseSvgPathData("M 5.000 12.000 C 3.895 12.000 3.000 11.105 3.000 10.000 C 3.000 6.134 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 6.134 21.000 10.000 C 21.000 11.105 20.105 12.000 19.000 12.000"),
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
        pathData = parseSvgPathData("M 5.000 16.000 C 3.895 16.000 3.000 16.895 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 16.895 20.105 16.000 19.000 16.000 Q 19.000 16.000 19.000 16.000"),
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
        pathData = parseSvgPathData("M 6.670 12.000 L 12.800 16.600 C 13.684 17.263 14.937 17.084 15.600 16.200 L 18.750 12.000"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
