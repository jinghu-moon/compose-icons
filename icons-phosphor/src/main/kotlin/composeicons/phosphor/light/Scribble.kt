package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorLightIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.25 188.24c-3.119 3.119-4.872 7.349-4.872 11.76 0 4.411 1.752 8.641 4.872 11.76 1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723-5.371-5.366-8.389-12.647-8.389-20.24 0-7.593 3.018-14.874 8.389-20.24l9.37-9.38c6.306-6.526 6.216-16.902-.202-23.318-6.418-6.415-16.794-6.501-23.318-.192l-66.75 66.75c-11.181 11.181-29.309 11.181-40.49 0-11.181-11.181-11.181-29.309 0-40.49L173.14 74.38c6.306-6.526 6.216-16.902-.202-23.318-6.418-6.415-16.794-6.501-23.318-.192L82.86 117.62c-11.181 11.181-29.309 11.181-40.49 0C31.189 106.439 31.189 88.311 42.37 77.13L83.75 35.76c1.511-1.537 3.73-2.146 5.813-1.595 2.084 .551 3.712 2.177 4.265 4.26 .553 2.083-.053 4.303-1.588 5.815L50.86 85.62c-6.306 6.526-6.216 16.902 .202 23.318 6.418 6.415 16.794 6.501 23.318 .192L141.13 42.38c11.181-11.181 29.309-11.181 40.49 0 11.181 11.181 11.181 29.309 0 40.49L82.86 181.62c-6.306 6.526-6.216 16.902 .202 23.318 6.418 6.415 16.794 6.501 23.318 .192l66.76-66.75c11.181-11.181 29.309-11.181 40.49 0 11.181 11.181 11.181 29.309 0 40.49Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
