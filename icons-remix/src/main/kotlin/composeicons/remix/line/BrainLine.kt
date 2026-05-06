package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrainLine: ImageVector
    get() {
        if (_brainLine != null) return _brainLine!!
        _brainLine = remixIcon(
            name = "BrainLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4c1.105 0 2 .895 2 2v6.827C10.106 12.137 8.966 11.731 7.664 11.514l-.329 1.973c1.381 .23 2.262 .666 2.805 1.254 .53 .574 .86 1.426 .86 2.759C11 18.881 9.881 20 8.5 20 7.119 20 6 18.881 6 17.5v-.351c.43 .143 .876 .261 1.336 .337l.329-1.973c-.743-.124-1.489-.399-2.235-.754C4.582 14.357 4 13.499 4 12.5c0-.835 .208-1.491 .559-1.974 .346-.475 .883-.855 1.684-1.056L7 9.281v-3.281C7 4.895 7.895 4 9 4ZM12 3.354C11.267 2.524 10.195 2 9 2 6.791 2 5 3.791 5 6v1.774C4.149 8.116 3.451 8.648 2.941 9.349 2.292 10.241 2 11.335 2 12.5c0 1.565 .796 2.937 2 3.742v1.258C4 19.985 6.015 22 8.5 22c1.414 0 2.675-.652 3.5-1.671 .825 1.02 2.086 1.671 3.5 1.671C17.985 22 20 19.985 20 17.5v-1.258c1.204-.806 2-2.177 2-3.742 0-1.165-.292-2.259-.941-3.151C20.549 8.648 19.851 8.116 19 7.774v-1.774C19 3.791 17.209 2 15 2c-1.195 0-2.267 .524-3 1.354ZM18 17.149v.351C18 18.881 16.881 20 15.5 20 14.119 20 13 18.881 13 17.5c0-1.333 .33-2.185 .86-2.759 .543-.588 1.424-1.024 2.805-1.254l-.329-1.973c-1.302 .217-2.441 .624-3.336 1.313v-6.827c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3.281l.757 .189c.801 .2 1.338 .58 1.684 1.056 .351 .483 .559 1.14 .559 1.974 0 .999-.582 1.857-1.429 2.26-.746 .354-1.492 .63-2.235 .754l.329 1.973c.459-.076 .906-.194 1.336-.337Z"),
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
        return _brainLine!!
    }

private var _brainLine: ImageVector? = null
