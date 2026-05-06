package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorLightIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 88.18c-.377 13.42-5.89 26.184-15.4 35.66l-34.75 34.75c-9.853 9.905-23.26 15.454-37.23 15.41h-.05c-14.206-.011-27.805-5.764-37.705-15.953C102.964 147.859 97.603 134.101 98 119.9c.087-3.251 2.748-5.841 6-5.84h.17c3.31 .093 5.92 2.85 5.83 6.16-.313 10.966 3.822 21.592 11.465 29.461 7.643 7.869 18.144 12.312 29.115 12.319h0c10.781 .026 21.125-4.259 28.73-11.9l34.75-34.74c15.265-15.958 14.988-41.187-.623-56.807C197.825 42.933 172.596 42.643 156.63 57.9l-11 11c-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49l11-11c9.869-9.872 23.256-15.419 37.215-15.419 13.959 0 27.346 5.547 37.215 15.419C232.815 59.669 238.395 73.687 238 88.18ZM110.38 187.08l-11 11C91.768 205.745 81.402 210.038 70.6 210h0C54.172 209.988 39.368 200.084 33.087 184.905c-6.281-15.18-2.803-32.648 8.813-44.265L76.62 105.9C88.383 94.106 106.154 90.687 121.454 97.274c15.3 6.587 25.029 21.845 24.546 38.496-.09 3.31 2.52 6.067 5.83 6.16h.17c3.252 .001 5.913-2.589 6-5.84 .611-21.559-11.994-41.309-31.805-49.835C106.384 77.73 83.376 82.154 68.14 97.42L33.38 132.16C18.336 147.208 13.833 169.834 21.97 189.495c8.137 19.661 27.312 32.488 48.59 32.505h0c13.969 .041 27.373-5.512 37.22-15.42l11-11c1.535-1.512 2.142-3.732 1.588-5.815-.553-2.083-2.181-3.709-4.265-4.26-2.084-.551-4.303 .058-5.813 1.595Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
