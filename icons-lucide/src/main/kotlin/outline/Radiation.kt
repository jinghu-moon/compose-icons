package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radiation: ImageVector
    get() {
        if (_radiation != null) return _radiation!!
        _radiation = lucideOutlineIcon(
            name = "Radiation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 12.000 L 12.010 12.000"),
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
        pathData = parseSvgPathData("M 14.000 15.464 C 12.762 16.179 11.238 16.179 10.000 15.464 L 7.528 19.746 C 7.386 19.992 7.355 20.288 7.444 20.558 C 7.533 20.828 7.732 21.048 7.993 21.162 C 10.548 22.279 13.452 22.279 16.007 21.162 C 16.268 21.048 16.467 20.828 16.556 20.558 C 16.645 20.288 16.614 19.992 16.472 19.746 Z"),
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
        pathData = parseSvgPathData("M 16.000 12.000 C 16.000 10.571 15.238 9.251 14.000 8.536 L 16.472 4.254 C 16.614 4.007 16.855 3.833 17.134 3.775 C 17.413 3.717 17.703 3.780 17.932 3.949 C 20.176 5.603 21.628 8.118 21.938 10.889 C 21.969 11.162 21.886 11.436 21.708 11.647 C 21.531 11.857 21.275 11.985 21.000 12.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 12.000 C 8.000 10.571 8.762 9.251 10.000 8.536 L 7.528 4.254 C 7.386 4.007 7.145 3.833 6.866 3.775 C 6.588 3.717 6.297 3.780 6.068 3.949 C 3.824 5.603 2.372 8.118 2.062 10.889 C 2.031 11.162 2.114 11.436 2.292 11.647 C 2.469 11.857 2.725 11.985 3.000 12.000 Z"),
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
        return _radiation!!
    }

private var _radiation: ImageVector? = null
