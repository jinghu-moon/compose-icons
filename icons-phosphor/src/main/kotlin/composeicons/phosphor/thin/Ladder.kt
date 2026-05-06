package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorThinIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.76 214.63 160.26 73 170.8 44h13.2c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h10.29l-62 170.63c-.364 .997-.316 2.098 .132 3.06 .448 .962 1.261 1.707 2.258 2.07 .424 .151 .87 .232 1.32 .24 1.682 .001 3.184-1.05 3.76-2.63L54.44 188h55.49l-9.69 26.63c-.364 .997-.316 2.098 .132 3.06 .448 .962 1.261 1.707 2.258 2.07 .44 .157 .903 .238 1.37 .24 1.682 .001 3.184-1.05 3.76-2.63L127.17 164h57.66l19.41 53.37c.576 1.58 2.078 2.631 3.76 2.63 .467-.003 .93-.084 1.37-.24 .998-.363 1.81-1.107 2.258-2.07 .448-.962 .496-2.063 .132-3.06ZM130.29 132h-55.49L89.35 92h55.48ZM162.29 44 147.74 84h-55.48L106.8 44ZM57.35 180 71.89 140h55.49l-14.55 40ZM130.07 156 156 84.7 181.92 156Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
