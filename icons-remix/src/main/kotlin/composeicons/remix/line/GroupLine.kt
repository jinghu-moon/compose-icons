package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GroupLine: ImageVector
    get() {
        if (_groupLine != null) return _groupLine!!
        _groupLine = remixIcon(
            name = "GroupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-2c0-3.314-2.686-6-6-6C6.686 16 4 18.686 4 22h-2ZM10 13C6.685 13 4 10.315 4 7 4 3.685 6.685 1 10 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM10 11c2.21 0 4-1.79 4-4C14 4.79 12.21 3 10 3 7.79 3 6 4.79 6 7c0 2.21 1.79 4 4 4ZM18.284 14.703C21.064 15.956 23 18.752 23 22h-2c0-2.436-1.452-4.533-3.537-5.473l.821-1.824ZM17.596 3.413C19.594 4.237 21 6.204 21 8.5c0 2.87-2.196 5.225-5 5.478v-2.013c1.697-.242 3-1.701 3-3.465C19 7.119 18.202 5.926 17.041 5.356l.555-1.943Z"),
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
        return _groupLine!!
    }

private var _groupLine: ImageVector? = null
