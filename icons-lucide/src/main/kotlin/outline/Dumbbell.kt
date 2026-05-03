package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) return _dumbbell!!
        _dumbbell = lucideOutlineIcon(
            name = "Dumbbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.596 12.768 C 18.377 13.549 19.644 13.549 20.425 12.768 C 21.206 11.987 21.206 10.720 20.425 9.939 L 18.657 8.172 C 19.438 8.953 20.705 8.953 21.486 8.172 C 22.266 7.390 22.266 6.124 21.485 5.343 L 18.657 2.515 C 17.876 1.734 16.610 1.734 15.828 2.514 C 15.047 3.295 15.047 4.562 15.828 5.343 L 14.061 3.575 C 13.280 2.794 12.013 2.794 11.232 3.575 C 10.451 4.356 10.451 5.623 11.232 6.404 Z"),
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
        pathData = parseSvgPathData("M 2.500 21.500 L 3.900 20.100"),
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
        pathData = parseSvgPathData("M 20.100 3.900 L 21.500 2.500"),
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
        pathData = parseSvgPathData("M 5.343 21.485 C 6.124 22.266 7.390 22.266 8.172 21.486 C 8.953 20.705 8.953 19.438 8.172 18.657 L 9.939 20.425 C 10.720 21.206 11.987 21.206 12.768 20.425 C 13.549 19.644 13.549 18.377 12.768 17.596 L 6.404 11.232 C 5.623 10.451 4.356 10.451 3.575 11.232 C 2.794 12.013 2.794 13.280 3.575 14.061 L 5.343 15.828 C 4.562 15.047 3.295 15.047 2.514 15.828 C 1.734 16.610 1.734 17.876 2.515 18.657 Z"),
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
        pathData = parseSvgPathData("M 9.600 14.400 L 14.400 9.600"),
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
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
