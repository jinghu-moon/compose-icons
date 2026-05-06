package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorThinIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 84c13.255 0 24-10.745 24-24C196 46.745 185.255 36 172 36c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM172 44c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM38.88 83.84l112 32.65 6.33 6.33c.739 .744 1.741 1.168 2.79 1.18h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-38.34L130.83 85.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-12 12-72.05-21c-2.121-.619-4.341 .599-4.96 2.72-.619 2.121 .599 4.341 2.72 4.96ZM128 93.65l11.07 11.08-17.14-5ZM234.22 200.92c-16.185 10.805-36.322 13.891-55 8.43L22.88 163.83c-2.121-.619-3.339-2.839-2.72-4.96 .619-2.121 2.839-3.339 4.96-2.72l78.27 22.79 33-33L86.9 131.84c-1.399-.371-2.489-1.469-2.849-2.871-.36-1.402 .065-2.889 1.112-3.889 1.047-.999 2.552-1.355 3.936-.93l56 16c1.361 .39 2.414 1.471 2.77 2.841 .355 1.37-.04 2.827-1.04 3.829l-34.68 34.68 69.28 20.17c16.419 4.806 34.124 2.093 48.35-7.41 1.839-1.226 4.324-.729 5.55 1.11 1.226 1.839 .729 4.324-1.11 5.55Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
