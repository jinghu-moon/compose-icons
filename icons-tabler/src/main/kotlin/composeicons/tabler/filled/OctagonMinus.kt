package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.OctagonMinus: ImageVector
    get() {
        if (_octagonMinus != null) return _octagonMinus!!
        _octagonMinus = tablerFilledIcon(
            name = "OctagonMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.196 1.246l5.575 2.39c.716 .307 1.287 .878 1.595 1.594l2.388 5.573c.328 .764 .328 1.63 0 2.393l-2.39 5.575c-.307 .716-.878 1.287-1.594 1.595l-5.573 2.388c-.764 .328-1.629 .328-2.393 0L5.23 20.365C4.513 20.058 3.942 19.487 3.635 18.77L1.247 13.196c-.327-.764-.327-1.628 0-2.392L3.637 5.229C3.944 4.513 4.514 3.942 5.23 3.634L10.804 1.246c.764-.327 1.628-.327 2.392 0M15 11h-6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _octagonMinus!!
    }

private var _octagonMinus: ImageVector? = null
