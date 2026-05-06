package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorThinIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 136c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM120 100h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 159.74v64.26c.002 1.43-.759 2.753-1.997 3.469-1.238 .716-2.764 .717-4.003 .001L196 212.61l-26 14.86c-1.239 .715-2.765 .714-4.003-.001-1.238-.716-2-2.038-1.997-3.469v-28h-124c-6.627 0-12-5.373-12-12v-128C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12v32.26c10.179 9.091 15.999 22.092 15.999 35.74 0 13.648-5.82 26.648-15.999 35.74ZM196 84c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C236 101.909 218.091 84 196 84ZM164 188v-28.26C145.832 143.302 142.96 115.82 157.336 95.981 171.712 76.142 198.722 70.314 220 82.46v-26.46c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4ZM220 165.54c-14.841 8.614-33.159 8.614-48 0v51.57l22-12.58c1.238-.715 2.762-.715 4 0l22 12.58Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
