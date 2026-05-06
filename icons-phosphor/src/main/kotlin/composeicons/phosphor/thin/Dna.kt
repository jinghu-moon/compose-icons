package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorThinIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 204.5v27.5c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-27.5c.089-25.782-14.49-49.37-37.59-60.82L102 119.48C76.183 106.672 59.894 80.299 60 51.48v-27.48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v27.5c-.089 25.782 14.49 49.37 37.59 60.82l48.4 24.2c25.814 12.802 42.106 39.166 42.01 67.98ZM160 204h-92c.063-8.212 1.618-16.344 4.59-24h75.51c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-71.8c4.764-8.776 11.405-16.394 19.45-22.31 1.781-1.312 2.162-3.819 .85-5.6-1.312-1.781-3.819-2.162-5.6-.85C71.539 157.591 60.037 180.32 60 204.5v27.5c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h92c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM192 20c-2.209 0-4 1.791-4 4v20h-92c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h92c-.063 8.212-1.618 16.344-4.59 24h-75.52c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h71.81c-4.764 8.776-11.405 16.394-19.45 22.31-1.781 1.309-2.164 3.814-.855 5.595 1.309 1.781 3.814 2.164 5.595 .855C184.455 98.411 195.961 75.682 196 51.5v-27.5c0-2.209-1.791-4-4-4Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
