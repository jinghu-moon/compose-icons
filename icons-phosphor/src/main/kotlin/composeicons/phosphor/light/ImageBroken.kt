package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorLightIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h64c2.581-.001 4.873-1.652 5.69-4.1l15.12-45.36 37.42-15c1.523-.61 2.73-1.817 3.34-3.34l15-37.42L225.9 93.69c2.448-.817 4.099-3.109 4.1-5.69v-32c0-7.732-6.268-14-14-14ZM117.77 154.43c-1.636 .656-2.902 1.998-3.46 3.67L99.68 202h-59.68c-1.105 0-2-.895-2-2v-28.83L90.58 118.59c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587L126 151.15ZM218 83.68 174.1 98.31c-1.672 .558-3.014 1.824-3.67 3.46l-15.05 37.61-17.28 6.92L101.9 110.1C99.274 107.474 95.713 105.999 92 105.999c-3.713 0-7.274 1.475-9.9 4.101L38 154.2v-98.2c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM227.51 116.86c-1.566-1.128-3.58-1.433-5.41-.82L198.3 124c-1.674 .56-3.017 1.83-3.67 3.47L180 164l-36.56 14.63c-1.629 .66-2.886 2.002-3.44 3.67l-8 23.8c-.611 1.83-.305 3.841 .823 5.407 1.127 1.565 2.938 2.493 4.867 2.493h78.31c7.732 0 14-6.268 14-14v-78.27c.001-1.929-.925-3.741-2.49-4.87ZM218 200c0 1.105-.895 2-2 2h-69.94l4.42-13.26 36.37-14.55c1.523-.61 2.73-1.817 3.34-3.34l14.55-36.37L218 130.06Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
