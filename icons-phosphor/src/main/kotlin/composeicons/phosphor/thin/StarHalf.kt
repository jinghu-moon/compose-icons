package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorThinIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.66 111.81l-5.06 4.36c-1.078 .968-2.595 1.278-3.966 .81-1.371-.468-2.382-1.642-2.642-3.067-.26-1.425 .271-2.88 1.388-3.803l5.05-4.36c1.385-1.164 1.91-3.06 1.32-4.77-.529-1.691-2.042-2.883-3.81-3l-8.27-.67c-2.209-.177-3.857-2.111-3.68-4.32 .177-2.209 2.111-3.857 4.32-3.68l8.28 .67c4.995 .424 9.248 3.802 10.791 8.571 1.544 4.769 .077 9.998-3.721 13.269ZM176.47 151.7l4.08 17.21c.425 1.8 2.03 3.074 3.88 3.08 .313 .003 .626-.034 .93-.11 1.037-.238 1.936-.879 2.499-1.782 .563-.903 .743-1.992 .501-3.028l-3.52-14.85 9.79-8.45c1.619-1.455 1.778-3.937 .357-5.586-1.421-1.649-3.899-1.86-5.577-.474l-11.63 10c-1.156 .975-1.663 2.519-1.31 3.99ZM197.81 207.07c-.508-2.151-2.664-3.483-4.815-2.975-2.151 .508-3.483 2.664-2.975 4.815l1.32 5.58c.446 1.754-.234 3.602-1.71 4.65-1.415 1.051-3.331 1.123-4.82 .18l-6.72-4.13c-1.218-.805-2.778-.883-4.07-.202-1.292 .68-2.11 2.011-2.135 3.471-.025 1.46 .747 2.817 2.015 3.542l6.72 4.13c4.279 2.609 9.708 2.385 13.758-.567 4.05-2.952 5.925-8.051 4.752-12.923ZM175.67 94.07 160 92.79c-1.5-.119-2.806-1.07-3.38-2.46L132 30.73v-.09 156.2l9.34 5.74c1.883 1.16 2.47 3.627 1.31 5.51-1.16 1.883-3.627 2.47-5.51 1.31L128 193.77 75.38 226.13c-4.279 2.609-9.708 2.385-13.758-.567-4.05-2.952-5.925-8.051-4.752-12.923L71.19 152.22 24.34 111.81c-3.777-3.275-5.23-8.491-3.688-13.247C22.193 93.808 26.43 90.436 31.41 90L92.88 85 116.56 27.66c1.907-4.637 6.426-7.664 11.44-7.664 5.014 0 9.533 3.027 11.44 7.664L163.12 85l13.2 1.06c2.209 .179 3.854 2.116 3.675 4.325-.179 2.209-2.116 3.854-4.325 3.675ZM124 186.84v-156.2 .09L99.34 90.33c-.568 1.378-1.855 2.326-3.34 2.46L32.06 98c-1.768 .117-3.281 1.309-3.81 3-.59 1.71-.065 3.606 1.32 4.77l48.68 42c1.13 .975 1.624 2.498 1.28 3.95L64.66 214.49c-.446 1.754 .234 3.602 1.71 4.65 1.417 1.046 3.329 1.117 4.82 .18Z"),
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
