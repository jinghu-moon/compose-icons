package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorDuotoneIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124.88 109.74 27.15 145.33C17.322 118.343 31.233 88.498 58.22 78.67c26.987-9.828 56.832 4.083 66.66 31.07ZM212.88 94.67l-97.73 35.59c9.828 26.987 39.673 40.898 66.66 31.07 26.987-9.828 40.898-39.673 31.07-66.66Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M229.66 218.34 181.24 169.93c1.1-.33 2.19-.68 3.27-1.07C215.626 157.526 231.675 123.126 220.37 92c-1.512-4.149-6.1-6.289-10.25-4.78l-44.2 16.08c.32-.62 .64-1.24 .93-1.88C177.11 79.433 173.119 53.431 156.737 35.535 140.354 17.638 114.806 11.369 92 19.65c-2 .718-3.632 2.202-4.536 4.125-.904 1.923-1.006 4.127-.284 6.125l16.08 44.2c-.62-.32-1.24-.64-1.88-.93C79.389 62.923 53.39 66.928 35.503 83.318 17.615 99.709 11.359 125.259 19.65 148.06c1.512 4.149 6.1 6.289 10.25 4.78L74.1 136.75c-.32 .63-.64 1.25-.93 1.89-10.247 21.991-6.242 47.99 10.148 65.877 16.391 17.888 41.941 24.144 64.742 15.853 4.149-1.512 6.289-6.1 4.78-10.25L136.75 165.92c.63 .32 1.25 .64 1.89 .93 7.059 3.306 14.695 5.201 22.48 5.58l57.22 57.23c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM131.07 36.15c14.838 6.895 24.625 21.454 25.408 37.797 .783 16.343-7.567 31.771-21.678 40.053L105.19 32.63c8.784-1.497 17.815-.268 25.88 3.52ZM32.63 134.82C29.043 113.854 40.969 93.324 60.958 86.052c19.989-7.272 42.318 .798 53.042 19.168ZM109 203.87C94.182 196.968 84.412 182.42 83.63 166.092c-.783-16.328 7.551-31.744 21.64-40.032l29.6 81.33c-8.78 1.497-17.809 .268-25.87-3.52ZM164.56 156.49h-.11c-15.732 .119-30.339-8.144-38.34-21.69l81.33-29.61c2.113 12.675-1.414 25.641-9.655 35.501-8.241 9.859-20.376 15.63-33.225 15.799Z"),
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
