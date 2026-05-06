package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorThinIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 88h0c.022-17.817-5.149-35.255-14.88-50.18-.737-1.134-1.997-1.819-3.35-1.82h-147.54c-1.353 .001-2.613 .686-3.35 1.82C41.149 52.745 35.978 70.183 36 88h0c.058 49.231 38.818 89.713 88 91.91v40.09h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-40.09C181.182 177.713 219.942 137.231 220 88ZM56.43 44h143.14c7.436 12.071 11.676 25.837 12.32 40h-167.78C44.754 69.837 48.994 56.071 56.43 44ZM128 172C83.185 171.947 46.285 136.761 44.1 92h167.8c-2.185 44.761-39.085 79.947-83.9 80Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
