package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorThinIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L69.81 69.93C52.7 94.85 44 119.75 44 144c.004 34.477 21.075 65.451 53.141 78.117 32.066 12.666 68.616 4.452 92.179-20.717L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM128 220C86.045 219.956 52.044 185.955 52 144 52 121.9 59.85 99.05 75.33 76L183.92 195.46C169.543 211.116 149.256 220.019 128 220ZM92.78 47.62C91.206 46.098 91.148 43.593 92.65 42 102.767 31.278 113.832 21.491 125.71 12.76c1.376-.961 3.204-.961 4.58 0C145.211 23.75 158.865 36.364 171 50.37c26.81 30.84 41 63.21 41 93.63 .004 7.547-1.005 15.061-3 22.34-.478 1.738-2.058 2.941-3.86 2.94-.358 .003-.715-.044-1.06-.14-1.024-.28-1.895-.957-2.42-1.88-.525-.923-.662-2.017-.38-3.04 1.813-6.587 2.728-13.388 2.72-20.22C204 81.71 140.92 30.75 128 21 117.464 29.034 107.58 37.888 98.44 47.48c-.732 .77-1.739 1.217-2.801 1.244-1.062 .026-2.09-.371-2.859-1.104Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
