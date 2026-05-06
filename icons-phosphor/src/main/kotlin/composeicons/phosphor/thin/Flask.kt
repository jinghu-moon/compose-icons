package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorThinIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.27 201.83 156 98v-62h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v62L37.73 201.83c-2.22 3.704-2.279 8.315-.154 12.075 2.125 3.759 6.106 6.087 10.424 6.095h160c4.322-.001 8.31-2.326 10.44-6.087 2.13-3.761 2.073-8.376-.15-12.083ZM107.43 101.2c.37-.624 .567-1.335 .57-2.06v-63.14h40v63.14c.003 .725 .2 1.436 .57 2.06l41 68.33c-12.76 3.94-32.54 4.68-59.75-9.1C111.82 151.29 94.82 147.19 79.28 148.14ZM211.46 210c-.708 1.252-2.042 2.018-3.48 2h-159.98c-1.442 0-2.772-.775-3.482-2.03-.71-1.255-.69-2.794 .052-4.03L74.1 156.73c15.54-2.43 33.05 1.21 52.07 10.84C144.54 176.86 160 180 172.42 180c7.263 .048 14.483-1.121 21.36-3.46l17.63 29.38c.779 1.243 .798 2.818 .05 4.08Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
