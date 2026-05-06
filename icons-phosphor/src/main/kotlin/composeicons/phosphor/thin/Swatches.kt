package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorThinIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.27 152.07 216.19 99.85c-2.284-6.189-9.136-9.374-15.34-7.13l-74.3 26.92L139.82 43.81c1.152-6.509-3.176-12.723-9.68-13.9L75.47 20.19c-3.112-.556-6.316 .165-8.89 2-2.623 1.822-4.403 4.622-4.94 7.77l-25 143.13c-3.825 21.649 10.538 42.326 32.16 46.3 2.378 .406 4.787 .611 7.2 .61h148c6.627 0 12-5.373 12-12v-51.81c-.036-1.402-.282-2.791-.73-4.12ZM203.57 100.24c2.059-.741 4.332 .311 5.1 2.36l19.09 52.21c.359 .977 .312 2.057-.13 3-.453 .936-1.259 1.655-2.24 2L108.78 202.11c3.021-4.591 5.063-9.755 6-15.17L125 128.73ZM93.75 206.29c-6.835 4.822-15.318 6.702-23.55 5.22C52.891 208.323 41.405 191.757 44.49 174.43L69.49 31.3c.181-1.047 .771-1.979 1.64-2.59 .657-.466 1.444-.715 2.25-.71 .231 0 .462 .02 .69 .06l54.67 9.73c2.16 .405 3.589 2.477 3.2 4.64l-25 143.13h0c-1.441 8.398-6.193 15.867-13.19 20.73ZM228 208c0 2.209-1.791 4-4 4h-119L228 167.41ZM84 180c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
