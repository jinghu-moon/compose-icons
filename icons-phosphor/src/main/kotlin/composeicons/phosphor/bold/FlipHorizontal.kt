package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorBoldIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 20.41C94.665 18.446 85.254 23.408 81.6 32.22c-.07 .15-.13 .31-.19 .46L21.47 192.49c-2.497 6.164-1.767 13.167 1.949 18.683 3.716 5.516 9.93 8.825 16.581 8.827h60c11.046 0 20-8.954 20-20v-160c.064-9.525-6.654-17.75-16-19.59ZM96 196h-50.21L96 62.09ZM234.53 192.49 174.61 32.68c-.06-.15-.12-.31-.19-.46C170.715 23.46 161.353 18.521 152.031 20.409 142.708 22.297 136.005 30.489 136 40v160c0 11.046 8.954 20 20 20h60c6.653 .001 12.871-3.306 16.589-8.823 3.718-5.517 4.449-12.521 1.951-18.687ZM160 196v-133.91L210.21 196Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
