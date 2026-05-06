package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorLightIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 101.52v74.48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-74.48c19.571-3.129 33.45-20.775 31.881-40.533C164.311 41.23 147.82 25.997 128 25.997c-19.82 0-36.311 15.233-37.881 34.991C88.55 80.745 102.429 98.391 122 101.52ZM128 38c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C113.641 90 102 78.359 102 64c0-14.359 11.641-26 26-26ZM238 176c0 13.34-12.18 25.38-34.31 33.88C183.38 217.7 156.5 222 128 222 99.5 222 72.62 217.7 52.31 209.88 30.18 201.38 18 189.34 18 176c0-19.6 26.46-36 69.05-42.86 3.275-.538 6.367 1.68 6.905 4.955 .538 3.275-1.68 6.367-4.955 6.905-18 2.89-33.27 7.66-44.09 13.78C35.28 164.2 30 170.32 30 176c0 16.08 40.25 34 98 34 57.75 0 98-17.92 98-34 0-5.68-5.28-11.8-14.86-17.23-10.82-6.12-26.07-10.89-44.09-13.78-3.272-.525-5.5-3.603-4.975-6.875 .525-3.272 3.603-5.5 6.875-4.975C211.54 140 238 156.4 238 176Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
