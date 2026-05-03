package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ListDetails: ImageVector
    get() {
        if (_listDetails != null) return _listDetails!!
        _listDetails = tablerFilledIcon(
            name = "ListDetails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 5.000 C 22.000 5.552 21.552 6.000 21.000 6.000 L 13.000 6.000 C 12.448 6.000 12.000 5.552 12.000 5.000 C 12.000 4.448 12.448 4.000 13.000 4.000 L 21.000 4.000 C 21.552 4.000 22.000 4.448 22.000 5.000M 19.000 9.000 C 19.000 9.552 18.552 10.000 18.000 10.000 L 13.000 10.000 C 12.448 10.000 12.000 9.552 12.000 9.000 C 12.000 8.448 12.448 8.000 13.000 8.000 L 18.000 8.000 C 18.552 8.000 19.000 8.448 19.000 9.000M 22.000 15.000 C 22.000 15.552 21.552 16.000 21.000 16.000 L 13.000 16.000 C 12.448 16.000 12.000 15.552 12.000 15.000 C 12.000 14.448 12.448 14.000 13.000 14.000 L 21.000 14.000 C 21.552 14.000 22.000 14.448 22.000 15.000M 19.000 19.000 C 19.000 19.552 18.552 20.000 18.000 20.000 L 13.000 20.000 C 12.448 20.000 12.000 19.552 12.000 19.000 C 12.000 18.448 12.448 18.000 13.000 18.000 L 18.000 18.000 C 18.552 18.000 19.000 18.448 19.000 19.000M 8.000 3.000 C 9.105 3.000 10.000 3.895 10.000 5.000 L 10.000 9.000 C 10.000 10.105 9.105 11.000 8.000 11.000 L 4.000 11.000 C 2.895 11.000 2.000 10.105 2.000 9.000 L 2.001 4.949 L 2.005 4.898 C 2.057 3.834 2.935 2.999 4.000 3.000 ZM 8.000 13.000 C 9.105 13.000 10.000 13.895 10.000 15.000 L 10.000 19.000 C 10.000 20.105 9.105 21.000 8.000 21.000 L 4.000 21.000 C 2.895 21.000 2.000 20.105 2.000 19.000 L 2.001 14.949 L 2.005 14.898 C 2.057 13.834 2.935 12.999 4.000 13.000 Z"),
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
        return _listDetails!!
    }

private var _listDetails: ImageVector? = null
