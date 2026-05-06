package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorRegularIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 152h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16.4C205.833 86.442 198.293 69.965 186.16 57.15L205.66 37.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L174.05 46.64c-27.597-19.521-64.503-19.521-92.1 0L61.66 26.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L69.84 57.15C57.707 69.965 50.167 86.442 48.4 104h-16.4c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v8c0 2.7 .14 5.37 .4 8h-16.4c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h19.68c10.476 33.336 41.377 56.015 76.32 56.015 34.943 0 65.844-22.679 76.32-56.015h19.68c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16.4c.26-2.63 .4-5.3 .4-8ZM128 48c32.234 .04 59.42 24.022 63.48 56h-127C68.542 72.007 95.75 48.02 128 48ZM136 223.48v-79.48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v79.48C88.022 219.42 64.04 192.234 64 160v-40h128v40c-.04 32.234-24.022 59.42-56 63.48Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
