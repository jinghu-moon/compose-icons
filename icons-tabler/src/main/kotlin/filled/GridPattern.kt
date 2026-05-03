package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GridPattern: ImageVector
    get() {
        if (_gridPattern != null) return _gridPattern!!
        _gridPattern = tablerFilledIcon(
            name = "GridPattern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 ZM 14.000 7.000 C 13.448 7.000 13.000 7.448 13.000 8.000 L 13.000 9.000 L 11.000 9.000 L 11.000 8.000 C 11.000 7.493 10.620 7.066 10.117 7.007 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 9.000 L 8.000 9.000 C 7.493 9.000 7.066 9.380 7.007 9.883 L 7.000 10.000 C 7.000 10.552 7.448 11.000 8.000 11.000 L 9.000 11.000 L 9.000 13.000 L 8.000 13.000 C 7.493 13.000 7.066 13.380 7.007 13.883 L 7.000 14.000 C 7.000 14.552 7.448 15.000 8.000 15.000 L 9.000 15.000 L 9.000 16.000 C 9.000 16.507 9.380 16.934 9.883 16.993 L 10.000 17.000 C 10.552 17.000 11.000 16.552 11.000 16.000 L 11.000 15.000 L 13.000 15.000 L 13.000 16.000 C 13.000 16.507 13.380 16.934 13.883 16.993 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 15.000 15.000 L 16.000 15.000 C 16.507 15.000 16.934 14.620 16.993 14.117 L 17.000 14.000 C 17.000 13.448 16.552 13.000 16.000 13.000 L 15.000 13.000 L 15.000 11.000 L 16.000 11.000 C 16.507 11.000 16.934 10.620 16.993 10.117 L 17.000 10.000 C 17.000 9.448 16.552 9.000 16.000 9.000 L 15.000 9.000 L 15.000 8.000 C 15.000 7.493 14.620 7.066 14.117 7.007 ZM 13.000 11.000 L 13.000 13.000 L 11.000 13.000 L 11.000 11.000 Z"),
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
        return _gridPattern!!
    }

private var _gridPattern: ImageVector? = null
