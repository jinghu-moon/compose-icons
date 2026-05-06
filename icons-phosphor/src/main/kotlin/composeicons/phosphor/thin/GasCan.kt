package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorThinIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-76.69c-3.18 0-6.23 1.263-8.48 3.51L101.66 44.69 88.49 31.51C86.238 29.251 83.18 27.981 79.99 27.981c-3.19 0-6.248 1.27-8.5 3.529L47.49 55.51c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5L60.69 85.66 47.52 98.83c-2.26 2.242-3.528 5.296-3.52 8.48v108.69c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM53.17 66.83C52.419 66.08 51.997 65.062 51.997 64c0-1.062 .422-2.08 1.173-2.83l24-24c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L96 50.34 66.34 80ZM204 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-108.69c.002-1.058 .422-2.072 1.17-2.82l16-16h0L104.48 53.18h0l16-16c.749-.754 1.767-1.178 2.83-1.18h76.69c2.209 0 4 1.791 4 4ZM180 64c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM178.4 123.2 134.67 156l43.73 32.8c1.767 1.325 2.125 3.833 .8 5.6-1.325 1.767-3.833 2.125-5.6 .8L128 161 82.4 195.2c-1.767 1.325-4.275 .967-5.6-.8-1.325-1.767-.967-4.275 .8-5.6L121.33 156 77.6 123.2c-1.767-1.325-2.125-3.833-.8-5.6 1.325-1.767 3.833-2.125 5.6-.8L128 151l45.6-34.2c1.767-1.325 4.275-.967 5.6 .8 1.325 1.767 .967 4.275-.8 5.6Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
