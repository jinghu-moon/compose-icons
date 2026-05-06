package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorLightIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 140v36c0 25.13-8.28 42-8.64 42.68-.917 1.986-2.842 3.317-5.024 3.471-2.182 .154-4.276-.891-5.463-2.729-1.187-1.838-1.28-4.176-.242-6.102C194.7 213.18 202 198.13 202 176v-36c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v4c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-20c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v12c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-68c0-7.732-6.268-14-14-14-7.732 0-14 6.268-14 14v108c-.003 2.676-1.778 5.027-4.351 5.762-2.573 .735-5.322-.322-6.739-2.592l-18.68-30c-.039-.053-.072-.11-.1-.17-3.866-6.696-12.429-8.991-19.125-5.125-6.696 3.866-8.991 12.429-5.125 19.125l29.29 50c1.391 2.832 .352 6.257-2.378 7.838-2.73 1.581-6.218 .778-7.982-1.838L29.49 169c-7.216-12.426-2.991-28.349 9.435-35.565 12.426-7.216 28.349-2.991 35.565 9.435L82 155v-87C82 53.641 93.641 42 108 42c14.359 0 26 11.641 26 26v34.1c7.171-4.587 16.133-5.374 23.993-2.106 7.86 3.268 13.623 10.177 15.427 18.496 7.965-5.394 18.257-5.95 26.757-1.445 8.499 4.505 13.817 13.335 13.823 22.955ZM248 50h-57.52L212.24 28.24c2.309-2.35 2.292-6.122-.039-8.451-2.331-2.328-6.104-2.341-8.451-.029l-32 32c-2.34 2.343-2.34 6.137 0 8.48l32 32c2.347 2.312 6.12 2.299 8.451-.029 2.331-2.328 2.349-6.101 .039-8.451L190.48 62h57.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
