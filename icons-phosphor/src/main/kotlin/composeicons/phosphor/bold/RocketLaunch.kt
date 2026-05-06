package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorBoldIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.85 46.89C227.232 36.807 219.193 28.768 209.11 28.15c-13.13-.77-46.65 .42-74.48 28.24L131 60h-56.64c-5.308-.018-10.401 2.093-14.14 5.86L25.87 100.19c-5.364 5.361-7.234 13.295-4.829 20.487 2.404 7.192 8.67 12.406 16.179 13.463l37.14 5.18 42.32 42.32 5.19 37.18c1.031 7.523 6.258 13.802 13.47 16.18 2.056 .673 4.207 1.011 6.37 1 5.294-.003 10.368-2.116 14.1-5.87l34.34-34.35c3.761-3.742 5.868-8.834 5.85-14.14v-56.64l3.6-3.59C227.43 93.54 228.62 60 227.85 46.89ZM76 84h31L75.75 115.28 48.52 111.48ZM151.6 73.37C165.436 59.42 184.355 51.704 204 52c.307 19.652-7.414 38.58-21.38 52.41L128 159 97 128ZM172 180l-27.49 27.49-3.8-27.23L172 149ZM100 202c-8.71 11.85-26.19 26-60 26-6.627 0-12-5.373-12-12 0-33.84 14.12-51.32 26-60 3.425-2.878 8.167-3.611 12.302-1.903 4.135 1.709 6.976 5.575 7.37 10.032 .395 4.456-1.722 8.762-5.492 11.171C62.3 179.63 55.51 187.8 53 203c15.21-2.51 23.37-9.3 27.7-15.18 2.409-3.77 6.715-5.887 11.171-5.492 4.456 .395 8.323 3.236 10.032 7.37 1.709 4.135 .975 8.877-1.903 12.302Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
