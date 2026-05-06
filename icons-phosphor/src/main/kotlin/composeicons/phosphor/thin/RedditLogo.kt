package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorThinIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 104C243.998 92.545 237.019 82.247 226.38 78c-10.639-4.247-22.791-1.585-30.68 6.72-17.9-10.11-40-15.94-63-16.65l6.59-39.52L164 32.36c.185 10.265 8.113 18.723 18.345 19.571 10.232 .848 19.444-6.189 21.317-16.284C205.534 25.553 199.459 15.68 189.604 12.801c-9.855-2.878-20.289 2.173-24.144 11.689L136.59 20.05c-2.164-.337-4.197 1.13-4.56 3.29l-7.43 44.71c-23.48 .52-46.06 6.36-64.3 16.67C53.07 76.994 42.103 74.004 31.952 76.99 21.801 79.977 14.201 88.431 12.307 98.841c-1.893 10.41 2.243 20.999 10.693 27.369-1.97 5.725-2.983 11.736-3 17.79 0 20.58 11.43 39.83 32.18 54.2C72.49 212.26 99.42 220 128 220c28.58 0 55.51-7.74 75.82-21.8C224.57 183.83 236 164.58 236 144c-.017-6.054-1.03-12.065-3-17.79 6.905-5.303 10.967-13.504 11-22.21ZM184 20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM224.53 126.25c2.278 5.641 3.456 11.666 3.47 17.75 0 37.5-44.86 68-100 68C72.86 212 28 181.5 28 144c.012-6.072 1.183-12.087 3.45-17.72 .784-1.837 .093-3.972-1.62-5C22.846 117.14 19.058 109.189 20.243 101.157 21.428 93.125 27.351 86.606 35.233 84.659c7.882-1.947 16.159 1.064 20.947 7.621 1.194 1.637 3.423 2.122 5.19 1.13l.25-.16C80 82.11 103.51 76 128 76h0c24.48 0 48 6.11 66.37 17.21l.25 .16c1.767 .992 3.996 .507 5.19-1.13 4.788-6.556 13.065-9.567 20.947-7.621 7.882 1.947 13.805 8.465 14.99 16.497 1.185 8.032-2.603 15.983-9.587 20.123-1.722 1.026-2.418 3.167-1.63 5.01ZM163.53 174.13c1.031 1.947 .293 4.362-1.65 5.4-21.185 11.253-46.575 11.253-67.76 0-1.908-1.059-2.616-3.452-1.59-5.378 1.026-1.926 3.406-2.675 5.35-1.682 18.835 10 41.405 10 60.24 0 .937-.498 2.034-.602 3.049-.291 1.015 .311 1.864 1.013 2.361 1.951ZM88 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM180 128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
