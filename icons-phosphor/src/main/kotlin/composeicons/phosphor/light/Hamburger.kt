package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorLightIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48.07 102h159.86c4.255 .026 8.29-1.884 10.967-5.192 2.677-3.307 3.705-7.652 2.793-11.808C214.45 50.83 175.05 26 128 26 80.95 26 41.55 50.83 34.31 85c-.912 4.156 .116 8.501 2.793 11.808 2.677 3.307 6.713 5.218 10.967 5.192ZM46.07 87.52C52 59.29 87.25 38 128 38c40.75 0 76 21.29 82 49.52 .15 .607 .008 1.25-.385 1.736-.393 .487-.99 .762-1.615 .744h-159.93c-.625 .018-1.223-.257-1.615-.744-.393-.487-.535-1.129-.385-1.736ZM230 154.36l-41.9 15.22L150.23 154.43c-1.431-.573-3.029-.573-4.46 0L108 169.54 70.23 154.43c-1.37-.549-2.893-.574-4.28-.07l-44 16c-2.739 .994-4.367 3.812-3.862 6.681 .505 2.869 2.999 4.961 5.912 4.959 .699-.002 1.392-.124 2.05-.36l16-5.8v8.16c0 20.987 17.013 38 38 38h96c20.987 0 38-17.013 38-38v-11.07l20.05-7.29c3.115-1.132 4.722-4.575 3.59-7.69-1.132-3.115-4.575-4.722-7.69-3.59ZM202 184c0 14.359-11.641 26-26 26h-96C65.641 210 54 198.359 54 184v-12.52l13.9-5.06 37.87 15.15c1.431 .573 3.029 .573 4.46 0L148 166.46l37.77 15.11c1.37 .549 2.893 .574 4.28 .07L202 177.29ZM18 128c0-3.314 2.686-6 6-6h208c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-208c-3.314 0-6-2.686-6-6Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
