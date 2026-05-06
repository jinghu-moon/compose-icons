package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bicycle: ImageVector
    get() {
        if (_bicycle != null) return _bicycle!!
        _bicycle = phosphorLightIcon(
            name = "Bicycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 114c-6.113-.004-12.164 1.213-17.8 3.58L162.45 70h29.55c5.523 0 10 4.477 10 10 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C214 67.85 204.15 58 192 58h-40c-2.141 .006-4.116 1.152-5.184 3.007-1.068 1.855-1.066 4.139 .004 5.993l13.4 23h-62.11L81.18 61C80.111 59.149 78.138 58.006 76 58h-28c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24.55l15 25.64L70 119.62C48.646 107.899 21.86 114.763 8.775 135.309-4.311 155.856 .797 183.032 20.449 197.425c19.652 14.394 47.102 11.065 62.744-7.61C98.834 171.142 97.297 143.533 79.68 126.71L94.11 107l32.71 56c1.071 1.855 3.049 2.998 5.19 3 1.055-.001 2.091-.284 3-.82 2.859-1.669 3.826-5.339 2.16-8.2L105.1 101.98h62.11l12.63 21.66c-17.78 13.779-22.988 38.395-12.311 58.193 10.676 19.799 34.105 28.973 55.387 21.687 21.282-7.285 34.173-28.893 30.476-51.081C249.695 130.252 230.494 113.992 208 114ZM82 160c.003 15.165-10.039 28.499-24.615 32.685C42.809 196.871 27.223 190.898 19.178 178.042c-8.045-12.856-6.603-29.485 3.535-40.764 10.138-11.279 26.519-14.481 40.157-7.848l-19.72 27c-1.955 2.679-1.369 6.435 1.31 8.39 2.679 1.955 6.435 1.369 8.39-1.31l19.7-27c6.067 6.314 9.454 14.733 9.45 23.49ZM208 194c-14.227-.031-26.931-8.917-31.839-22.271-4.908-13.354-.982-28.352 9.839-37.589L202.82 163c1.071 1.855 3.049 2.998 5.19 3 1.055-.001 2.091-.284 3-.82 2.859-1.669 3.826-5.339 2.16-8.2L196.31 128.07c12.751-4.665 27.056-1.297 36.385 8.568 9.329 9.865 11.895 24.335 6.526 36.806C233.852 185.916 221.578 193.997 208 194Z"),
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
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
