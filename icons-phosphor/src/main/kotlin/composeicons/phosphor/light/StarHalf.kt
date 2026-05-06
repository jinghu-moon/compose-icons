package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorLightIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233 113.32l-5.06 4.36c-1.607 1.506-3.911 2.01-6 1.313-2.09-.697-3.629-2.482-4.011-4.652-.382-2.169 .455-4.373 2.181-5.742l5.06-4.36c.777-.642 1.065-1.703 .72-2.65-.267-.935-1.099-1.598-2.07-1.65l-8.28-.67c-3.314-.276-5.776-3.186-5.5-6.5 .276-3.314 3.186-5.776 6.5-5.5l8.27 .67c5.809 .411 10.775 4.334 12.52 9.89 1.835 5.564 .124 11.684-4.33 15.49ZM174.55 152.15l4.08 17.22c.639 2.704 3.051 4.616 5.83 4.62 .469 .003 .936-.054 1.39-.17 1.549-.366 2.889-1.332 3.726-2.686 .836-1.354 1.101-2.985 .734-4.534l-3.24-13.67 8.87-7.65c2.51-2.165 2.79-5.955 .625-8.465-2.165-2.51-5.955-2.79-8.465-.625l-11.63 10c-1.715 1.464-2.465 3.767-1.94 5.96ZM199.78 206.6c-.439-2.143-2.01-3.878-4.1-4.526-2.09-.648-4.367-.108-5.942 1.41-1.575 1.518-2.199 3.774-1.628 5.886l1.32 5.57c.267 .972-.115 2.006-.95 2.57-.756 .585-1.801 .625-2.6 .1l-6.71-4.13c-2.822-1.737-6.518-.857-8.255 1.965-1.737 2.822-.857 6.518 1.965 8.255l6.72 4.13c4.966 3.039 11.273 2.787 15.98-.64 4.707-3.426 6.886-9.351 5.52-15.01ZM175.52 96 159.88 94.74c-2.246-.182-4.2-1.608-5.06-3.69L134 40.7v145l8.39 5.15c2.825 1.737 3.707 5.435 1.97 8.26-1.737 2.825-5.435 3.707-8.26 1.97l-8.1-5L76.42 227.83c-4.966 3.039-11.273 2.787-15.98-.64-4.707-3.426-6.886-9.351-5.52-15.01l14-59.25L23 113.32c-4.427-3.806-6.124-9.904-4.3-15.45C20.454 92.315 25.429 88.4 31.24 88L91.49 83.13 114.71 26.93c2.216-5.388 7.465-8.904 13.29-8.904 5.825 0 11.074 3.517 13.29 8.904l23.22 56.2 12 1c3.314 .276 5.776 3.186 5.5 6.5-.276 3.314-3.186 5.776-6.5 5.5ZM122 185.72v-145.02L101.18 91.09c-.86 2.082-2.814 3.508-5.06 3.69L32.2 99.94c-.971 .052-1.803 .715-2.07 1.65-.345 .947-.057 2.008 .72 2.65l48.7 42c1.693 1.461 2.433 3.743 1.92 5.92L66.59 214.94c-.257 .983 .146 2.02 1 2.57 .756 .585 1.801 .625 2.6 .1Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
