package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorFillIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M105.72 67.81c-1.411-1.531-1.411-3.889 0-5.42L154.11 10.54c2.436-2.612 6.309-3.293 9.49-1.667 3.181 1.625 4.899 5.162 4.21 8.667L153.18 90.9l57.43 21.53c1.75 .625 3.237 1.823 4.22 3.4 1.867 3.07 1.458 7.009-1 9.63l-25.27 27.07c-.757 .821-1.823 1.288-2.94 1.288-1.117 0-2.183-.467-2.94-1.288ZM133.48 122.13 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L81.34 88.56 42.34 130.39c-1.321 1.323-2.147 3.06-2.34 4.92-.309 3.575 1.8 6.919 5.16 8.18l57.63 21.61L88.16 238.43c-.682 3.5 1.035 7.029 4.21 8.653 3.175 1.624 7.041 .949 9.48-1.653l61.86-66.28 38.37 42.2c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
