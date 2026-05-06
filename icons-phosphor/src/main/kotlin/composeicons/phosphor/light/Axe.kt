package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorLightIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.25 98.36c-1.703-5.086-6.161-8.752-11.48-9.44C222.392 86.31 203.784 79.63 187.17 69.32L199.27 57.21c6.333-5.687 9.008-14.407 6.952-22.667C204.167 26.283 197.717 19.833 189.457 17.778c-8.26-2.056-16.98 .619-22.667 6.952L152 39.47c-3.21-3.73-5.19-6.46-5.92-7.5-2.372-3.385-6.119-5.549-10.237-5.912-4.118-.363-8.185 1.113-11.113 4.032L86.09 68.77c-2.916 2.932-4.386 7.002-4.018 11.12 .368 4.118 2.538 7.863 5.928 10.23 1 .73 3.77 2.71 7.5 5.92L8.73 182.79C2.189 189.374 .246 199.243 3.803 207.815 7.36 216.387 15.72 221.981 25 222c6.096 .019 11.945-2.405 16.24-6.73l84.11-84.1c10.31 16.614 16.99 35.222 19.6 54.6 .688 5.319 4.354 9.777 9.44 11.48 5.032 1.727 10.608 .421 14.35-3.36l81.18-81.18c3.768-3.75 5.062-9.324 3.33-14.35ZM175.25 33.21c4.359-3.801 10.917-3.576 15.007 .513 4.09 4.09 4.314 10.647 .513 15.007L177 62.49C171.08 58.143 165.479 53.378 160.24 48.23ZM32.73 206.79c-4.359 3.801-10.917 3.576-15.007-.513-4.09-4.09-4.314-10.647-.513-15.007l87-87c5.154 5.228 9.926 10.819 14.28 16.73ZM241.41 104.22l-81.19 81.19c-.511 .545-1.297 .734-2 .48-.76-.244-1.302-.916-1.38-1.71C148.17 119.4 100.3 84.11 94.87 80.3c-.498-.337-.817-.881-.87-1.48-.057-.583 .153-1.159 .57-1.57L133.24 38.58c.37-.367 .869-.575 1.39-.58h.18c.597 .05 1.14 .366 1.48 .86 3.81 5.43 39.1 53.3 103.88 62 .794 .078 1.466 .62 1.71 1.38 .253 .695 .068 1.473-.47 1.98Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
