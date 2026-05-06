package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorThinIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L86.16 87.93q-1.38 2.55-2.59 5.19C61.175 88.731 38.229 97.427 24.367 115.556 10.506 133.685 8.129 158.108 18.235 178.569 28.34 199.031 49.179 211.988 72 212h88c11.301 .026 22.488-2.25 32.88-6.69L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM160 204h-88C43.281 204 20 180.719 20 152c0-28.719 23.281-52 52-52 2.861 .009 5.717 .25 8.54 .72C77.534 109.501 76 118.719 76 128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4-.003-11.712 2.701-23.266 7.9-33.76L187.13 199c-8.659 3.322-17.856 5.017-27.13 5ZM244 128c.012 20.637-7.586 40.554-21.34 55.94-1.472 1.657-4.008 1.807-5.665 .335-1.657-1.472-1.807-4.008-.335-5.665 25.852-29.031 25.631-72.89-.514-101.658C190.001 48.184 146.363 43.783 115 66.75c-1.781 1.309-4.286 .926-5.595-.855-1.309-1.781-.926-4.286 .855-5.595 25.521-18.754 59.421-21.559 87.678-7.255C226.194 67.349 244.004 96.329 244 128Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
