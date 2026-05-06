package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorBoldIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.37 51.6C167.92 15.125 110.78 9.48 67.897 38.117 25.015 66.755 8.335 121.697 28.06 169.341c19.725 47.644 70.36 74.718 120.935 64.663C199.571 223.949 235.999 179.565 236 128 235.999 99.348 224.623 71.868 204.37 51.6ZM176 197c-4.998 3.493-10.363 6.427-16 8.75v-92.75L176 97ZM68.6 68.58C98.141 39.086 144.847 35.731 178.3 60.7L60.72 178.33C35.721 144.868 39.077 98.128 68.6 68.58ZM96 177v28.69C89.487 203.011 83.338 199.52 77.7 195.3ZM120 211.62v-58.62l16-16v74.64c-5.322 .498-10.679 .492-16-.02ZM200 171.35v-86.7c16.014 26.682 16.014 60.018 0 86.7Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
