package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) return _handSwipeRight!!
        _handSwipeRight = phosphorLightIcon(
            name = "HandSwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 140v36c0 25.13-8.28 42-8.64 42.68-1.014 2.032-3.089 3.317-5.36 3.32-.931 .002-1.85-.217-2.68-.64-2.934-1.482-4.129-5.049-2.68-8 .07-.14 7.37-15.19 7.37-37.32v-36.04c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v4c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-20c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v12c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-68c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v108c-.003 2.676-1.778 5.027-4.351 5.762-2.573 .735-5.322-.322-6.739-2.592l-18.68-30c-.039-.053-.072-.11-.1-.17-3.866-6.696-12.429-8.991-19.125-5.125-6.696 3.866-8.991 12.429-5.125 19.125l29.29 50c1.435 2.84 .403 6.306-2.351 7.899-2.754 1.593-6.272 .76-8.019-1.899L29.49 169c-7.216-12.426-2.991-28.349 9.435-35.565 12.426-7.216 28.349-2.991 35.565 9.435L82 155v-87C82 53.641 93.641 42 108 42c14.359 0 26 11.641 26 26v34.1c7.171-4.587 16.133-5.374 23.993-2.106 7.86 3.268 13.623 10.177 15.427 18.496 7.965-5.394 18.257-5.95 26.757-1.445 8.499 4.505 13.817 13.335 13.823 22.955ZM252.24 51.76l-32-32c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L233.51 50h-57.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h57.51L211.76 83.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l32-32c2.34-2.343 2.34-6.137 0-8.48Z"),
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
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
