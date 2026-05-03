package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Id: ImageVector
    get() {
        if (_id != null) return _id!!
        _id = tablerFilledIcon(
            name = "Id",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000 L 6.000 21.000 C 3.791 21.000 2.000 19.209 2.000 17.000 L 2.000 7.000 Q 2.000 6.947 2.005 6.898 C 2.057 4.729 3.831 2.999 6.000 3.000 ZM 17.000 15.000 L 7.000 15.000 C 6.448 15.000 6.000 15.448 6.000 16.000 C 6.000 16.552 6.448 17.000 7.000 17.000 L 17.000 17.000 C 17.552 17.000 18.000 16.552 18.000 16.000 C 18.000 15.448 17.552 15.000 17.000 15.000M 9.000 7.000 C 7.383 6.999 6.057 8.282 6.005 9.898 C 6.002 9.932 6.000 9.966 6.000 10.000 C 6.000 11.657 7.343 13.000 9.000 13.000 C 10.657 13.000 12.000 11.657 12.000 10.000 C 12.000 8.343 10.657 7.000 9.000 7.000M 17.000 11.000 L 15.000 11.000 C 14.448 11.000 14.000 11.448 14.000 12.000 C 14.000 12.552 14.448 13.000 15.000 13.000 L 17.000 13.000 C 17.552 13.000 18.000 12.552 18.000 12.000 C 18.000 11.448 17.552 11.000 17.000 11.000M 17.000 7.000 L 15.000 7.000 C 14.448 7.000 14.000 7.448 14.000 8.000 C 14.000 8.552 14.448 9.000 15.000 9.000 L 17.000 9.000 C 17.552 9.000 18.000 8.552 18.000 8.000 C 18.000 7.448 17.552 7.000 17.000 7.000"),
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
        return _id!!
    }

private var _id: ImageVector? = null
