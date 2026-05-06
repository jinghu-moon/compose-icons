package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorBoldIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M179.76 110.75c-.77-3.791-3.321-6.977-6.85-8.56L126 81.12 138.9 26.77c1.256-5.304-1.221-10.789-6.031-13.353-4.81-2.565-10.744-1.565-14.449 2.433L23.19 118.7c-2.625 2.835-3.725 6.761-2.953 10.548 .771 3.786 3.318 6.97 6.843 8.552l47 21.08L61.12 213.22c-1.271 5.311 1.204 10.81 6.023 13.38 4.818 2.57 10.764 1.563 14.467-2.45L176.8 121.29c2.625-2.832 3.727-6.755 2.96-10.54ZM95 174.31l4.64-19.54c1.331-5.603-1.506-11.361-6.76-13.72L52.12 122.75 105 65.69l-4.64 19.54c-1.363 5.609 1.46 11.394 6.72 13.77l40.77 18.3ZM242.7 210.63l-36-72c-2.032-4.067-6.188-6.637-10.735-6.637-4.547 0-8.703 2.57-10.735 6.637l-36 72c-2.042 3.848-1.837 8.501 .533 12.155 2.371 3.655 6.536 5.737 10.882 5.441 4.346-.296 8.191-2.924 10.044-6.866L175.37 212h41.17l4.68 9.36c2.963 5.929 10.171 8.333 16.1 5.37 5.929-2.963 8.333-10.171 5.37-16.1ZM187.41 188 196 170.83 204.58 188Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
