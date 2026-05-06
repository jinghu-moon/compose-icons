package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = tablerFilledIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 5c6.634 0 10.853 3.11 10.996 7.754L22 13c0 1.657-1.343 3-3 3h-16C2.448 16 2 15.552 2 15v-9C2 5.448 2.448 5 3 5ZM7 7h-3v3h3ZM11 7h-2v3h3v-2.974C11.667 7.009 11.334 7 11 7M14.001 7.257 14 10h5.04C18.061 8.663 16.351 7.694 14.001 7.257M21 18c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-18C2.448 20 2 19.552 2 19c0-.552 .448-1 1-1Z"),
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
        return _train!!
    }

private var _train: ImageVector? = null
