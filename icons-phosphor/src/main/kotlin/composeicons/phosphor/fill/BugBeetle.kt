package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorFillIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120h-16v-16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM32 104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v-16ZM208 160c0 2.7-.14 5.37-.4 8h16.4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-19.68C193.844 217.336 162.943 240.015 128 240.015 93.057 240.015 62.156 217.336 51.68 184h-19.68c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16.4C48.14 165.37 48 162.7 48 160v-8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16h160v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16ZM136 144c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM69.84 57.15C57.707 69.965 50.167 86.442 48.4 104h159.2C205.833 86.442 198.293 69.965 186.16 57.15L205.66 37.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L174.05 46.64c-27.597-19.521-64.503-19.521-92.1 0L61.66 26.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32Z"),
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
