package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorLightIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 78c14.359 0 26-11.641 26-26C190 37.641 178.359 26 164 26c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26ZM164 38c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM217.69 114.24l-136-40c-2.076-.668-4.35-.157-5.941 1.334-1.591 1.491-2.248 3.728-1.716 5.842 .532 2.115 2.17 3.774 4.277 4.334l43.45 12.78L85.92 152.3 39.79 138.93c-7.054-2.077-14.675-.686-20.54 3.75C13.411 147.034 9.98 153.897 10 161.18c.058 10.308 6.877 19.355 16.77 22.25h0l157.44 45.63c2.138 .621 4.353 .938 6.58 .94 11.557 .023 21.364-8.476 22.986-19.919 1.622-11.443-5.437-22.331-16.546-25.521L143.71 169.05 165 137.34c1.069-1.59 1.314-3.595 .66-5.396-.654-1.801-2.129-3.181-3.97-3.714l-38-11 10.11-15.16 80.49 23.67c.554 .171 1.13 .259 1.71 .26 2.988 .005 5.524-2.189 5.949-5.147 .425-2.957-1.391-5.777-4.259-6.613ZM202 206.81c.01 3.506-1.646 6.809-4.46 8.9-2.854 2.162-6.567 2.838-10 1.82L30.11 171.9h0C25.332 170.515 22.033 166.154 22 161.18c-.01-3.506 1.646-6.809 4.46-8.9 2.854-2.162 6.567-2.838 10-1.82l157.44 45.63c4.774 1.389 8.068 5.749 8.1 10.72ZM150.44 137.47l-18.83 28.07L98 155.8l18.73-28.09Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
