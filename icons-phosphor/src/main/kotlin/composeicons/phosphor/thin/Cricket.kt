package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorThinIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 84.2 187.8 31.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L63.52 138.83c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5L87 179.31 37.17 229.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L92.69 185l23.51 23.51c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L240.49 101.17c4.686-4.686 4.686-12.284 0-16.97ZM127.49 202.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L98.34 179.31l32.49-32.48c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L92.69 173.66 69.17 150.14c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L105.66 108h58.34v58.34ZM234.83 95.51 172 158.34v-54.34c0-2.209-1.791-4-4-4h-54.34L176.49 37.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l52.68 52.68c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM60 84C73.255 84 84 73.255 84 60 84 46.745 73.255 36 60 36 46.745 36 36 46.745 36 60c0 13.255 10.745 24 24 24ZM60 44c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C51.163 76 44 68.837 44 60 44 51.163 51.163 44 60 44Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
