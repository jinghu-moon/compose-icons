package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorFillIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 218.34 181.24 169.93c1.1-.33 2.19-.68 3.27-1.07C215.626 157.526 231.675 123.126 220.37 92c-1.512-4.149-6.1-6.289-10.25-4.78l-44.2 16.08c.32-.62 .64-1.24 .93-1.88C177.11 79.433 173.119 53.431 156.737 35.535 140.354 17.638 114.806 11.369 92 19.65c-2 .718-3.632 2.202-4.536 4.125-.904 1.923-1.006 4.127-.284 6.125l16.09 44.22c-.63-.32-1.25-.65-1.89-1C79.389 62.873 53.39 66.878 35.503 83.268 17.615 99.659 11.359 125.209 19.65 148.01c1.512 4.149 6.1 6.289 10.25 4.78L74.1 136.7c-.32 .63-.64 1.25-.93 1.89-10.247 21.991-6.242 47.99 10.148 65.877 16.391 17.888 41.941 24.144 64.742 15.853 4.149-1.512 6.289-6.1 4.78-10.25L136.76 165.89c.62 .31 1.24 .62 1.88 .91 7.059 3.306 14.695 5.201 22.48 5.58l57.22 57.23c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM109 203.87C94.182 196.968 84.412 182.42 83.63 166.092c-.783-16.328 7.551-31.744 21.64-40.032l29.6 81.33c-8.78 1.497-17.809 .268-25.87-3.52ZM152.4 94.62c-3.752 8.104-9.894 14.867-17.6 19.38L105.19 32.63c16.12-2.708 32.413 3.744 42.309 16.754 9.896 13.01 11.764 30.434 4.851 45.246Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
