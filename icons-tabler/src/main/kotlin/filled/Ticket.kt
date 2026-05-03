package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = tablerFilledIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 4.000 L 14.000 6.000 C 14.000 6.552 14.448 7.000 15.000 7.000 C 15.552 7.000 16.000 6.552 16.000 6.000 L 16.000 4.000 L 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 10.000 C 22.000 10.507 21.620 10.934 21.117 10.993 L 21.000 11.000 C 20.471 11.001 20.034 11.413 20.003 11.941 C 19.972 12.470 20.358 12.931 20.883 12.993 L 21.000 13.000 C 21.552 13.000 22.000 13.448 22.000 14.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 16.000 20.000 L 16.000 18.000 C 16.000 17.493 15.620 17.066 15.117 17.007 L 15.000 17.000 C 14.448 17.000 14.000 17.448 14.000 18.000 L 14.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 14.000 C 2.000 13.493 2.380 13.066 2.883 13.007 L 3.000 13.000 C 3.529 12.999 3.966 12.587 3.997 12.059 C 4.028 11.530 3.642 11.069 3.117 11.007 L 3.000 11.000 C 2.448 11.000 2.000 10.552 2.000 10.000 L 2.000 7.000 C 1.999 5.449 3.182 4.154 4.727 4.015 L 4.949 4.001 ZM 15.000 10.000 C 14.448 10.000 14.000 10.448 14.000 11.000 L 14.000 13.000 C 14.000 13.552 14.448 14.000 15.000 14.000 C 15.552 14.000 16.000 13.552 16.000 13.000 L 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
