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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 5.000 C 17.634 5.000 21.853 8.110 21.996 12.754 L 22.000 13.000 C 22.000 14.657 20.657 16.000 19.000 16.000 L 3.000 16.000 C 2.448 16.000 2.000 15.552 2.000 15.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 ZM 7.000 7.000 L 4.000 7.000 L 4.000 10.000 L 7.000 10.000 ZM 11.000 7.000 L 9.000 7.000 L 9.000 10.000 L 12.000 10.000 L 12.000 7.026 C 11.667 7.009 11.334 7.000 11.000 7.000M 14.001 7.257 L 14.000 10.000 L 19.040 10.000 C 18.061 8.663 16.351 7.694 14.001 7.257M 21.000 18.000 C 21.552 18.000 22.000 18.448 22.000 19.000 C 22.000 19.552 21.552 20.000 21.000 20.000 L 3.000 20.000 C 2.448 20.000 2.000 19.552 2.000 19.000 C 2.000 18.448 2.448 18.000 3.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _train!!
    }

private var _train: ImageVector? = null
