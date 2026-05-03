package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = tablerFilledIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 2.000 L 9.883 2.007 C 9.380 2.066 9.000 2.493 9.000 3.000 L 9.000 7.000 L 5.000 7.000 C 4.448 7.000 4.000 7.448 4.000 8.000 L 4.000 12.000 L 4.007 12.117 C 4.066 12.620 4.493 13.000 5.000 13.000 L 9.000 13.000 L 9.000 21.000 C 9.000 21.552 9.448 22.000 10.000 22.000 L 14.000 22.000 L 14.117 21.993 C 14.620 21.934 15.000 21.507 15.000 21.000 L 15.000 13.000 L 19.000 13.000 C 19.552 13.000 20.000 12.552 20.000 12.000 L 20.000 8.000 L 19.993 7.883 C 19.934 7.380 19.507 7.000 19.000 7.000 L 15.000 7.000 L 15.000 3.000 C 15.000 2.448 14.552 2.000 14.000 2.000 L 10.000 2.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
