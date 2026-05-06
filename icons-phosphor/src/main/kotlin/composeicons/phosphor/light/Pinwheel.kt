package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorLightIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.24 219.76 177.38 168.9c2.184-.519 4.337-1.16 6.45-1.92 30.099-10.958 45.617-44.241 34.66-74.34-1.136-3.111-4.578-4.714-7.69-3.58L161.5 107c1.311-2.079 2.493-4.236 3.54-6.46 9.904-21.259 6.031-46.391-9.815-63.681C139.379 19.569 114.68 13.523 92.64 21.54c-3.111 1.136-4.714 4.578-3.58 7.69L107 78.52C104.92 77.216 102.763 76.04 100.54 75 79.281 65.096 54.149 68.969 36.859 84.815 19.569 100.661 13.523 125.36 21.54 147.4c.545 1.493 1.66 2.708 3.1 3.38 1.443 .673 3.094 .745 4.59 .2L78.52 133c-1.309 2.084-2.485 4.248-3.52 6.48-8.341 17.955-6.957 38.922 3.67 55.626 10.627 16.704 29.033 26.841 48.83 26.894 6.782-.01 13.509-1.205 19.88-3.53 3.117-1.12 4.737-4.552 3.62-7.67L133 161.5c8.697 5.513 18.709 8.603 29 8.95l57.79 57.79c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM102.52 31.11c22.546-5.015 45.315 7.466 53.214 29.169 7.9 21.704-1.52 45.9-22.014 56.551ZM31.11 137.5C26.095 114.954 38.576 92.185 60.279 84.286c21.704-7.9 45.9 1.52 56.551 22.014ZM137.5 208.9c-22.546 5.015-45.315-7.466-53.214-29.169-7.9-21.704 1.52-45.9 22.014-56.551ZM164.45 158.49c-17.319 .157-33.263-9.412-41.27-24.77l85.72-31.2c2.992 13.533-.269 27.694-8.878 38.556-8.61 10.861-21.653 17.269-35.512 17.444Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
