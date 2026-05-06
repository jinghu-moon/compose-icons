package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorBoldIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.7 102.46 62.81 37.21l-.25-.09C55.324 34.616 47.293 36.464 41.879 41.879c-5.414 5.414-7.262 13.445-4.759 20.681l.09 .25 65.25 175.89c2.834 7.972 10.379 13.298 18.84 13.3h.35c8.653-.15 16.227-5.848 18.77-14.12l.09-.29 21.23-75.85 75.85-21.23 .29-.09c8.271-2.516 13.989-10.06 14.175-18.703 .187-8.643-5.201-16.427-13.355-19.297ZM148.77 140.46c-4.036 1.13-7.19 4.284-8.32 8.32l-19.68 70.29L62.8 62.8l156.26 58Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
