package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorLightIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.84 51.39C164.636 38.792 148.16 27.812 130.68 18.63c-1.687-.842-3.673-.842-5.36 0C107.84 27.812 91.364 38.792 76.16 51.39 42.88 79.13 26 107.59 26 136c-.001 18.146 9.112 35.079 24.258 45.074 15.146 9.994 34.299 11.714 50.982 4.576l-11 36.63c-.544 1.818-.196 3.787 .939 5.308 1.135 1.521 2.923 2.416 4.821 2.412h64c1.896 .001 3.681-.895 4.814-2.416 1.133-1.521 1.48-3.487 .936-5.304l-11-36.63c16.684 7.142 35.841 5.425 50.989-4.57C220.888 171.085 230.002 154.149 230 136 230 107.59 213.12 79.13 179.84 51.39ZM176 178c-10.147 .001-19.951-3.672-27.6-10.34-2.014-1.754-4.944-1.965-7.189-.52-2.245 1.446-3.264 4.201-2.501 6.76L151.94 218h-47.88l13.23-44.1c.763-2.559-.256-5.314-2.501-6.76-2.245-1.446-5.175-1.234-7.189 .52-12.412 10.821-30.002 13.39-44.99 6.572C47.621 167.414 37.999 152.466 38 136 38 82.27 112.77 39 128 30.78 143.24 39 218 82.2 218 136c0 23.196-18.804 42-42 42Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
