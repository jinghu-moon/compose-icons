package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Favicon: ImageVector
    get() {
        if (_favicon != null) return _favicon!!
        _favicon = tablerFilledIcon(
            name = "Favicon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 C 21.209 4.000 23.000 5.791 23.000 8.000 L 23.000 16.000 C 23.000 18.209 21.209 20.000 19.000 20.000 L 5.000 20.000 C 2.791 20.000 1.000 18.209 1.000 16.000 L 1.000 8.000 C 1.000 5.791 2.791 4.000 5.000 4.000 ZM 6.000 9.000 C 5.448 9.000 5.000 9.448 5.000 10.000 L 5.000 14.000 C 5.000 14.552 5.448 15.000 6.000 15.000 C 6.552 15.000 7.000 14.552 7.000 14.000 L 7.000 10.000 C 7.000 9.448 6.552 9.000 6.000 9.000M 11.000 9.000 C 9.343 9.000 8.000 10.343 8.000 12.000 C 8.000 13.657 9.343 15.000 11.000 15.000 C 11.529 14.999 11.966 14.587 11.997 14.059 C 12.028 13.530 11.642 13.069 11.117 13.007 L 11.000 13.000 C 10.471 12.999 10.034 12.587 10.003 12.059 C 9.972 11.530 10.358 11.069 10.883 11.007 L 11.000 11.000 C 11.552 11.000 12.000 10.552 12.000 10.000 C 12.000 9.448 11.552 9.000 11.000 9.000M 16.000 9.000 C 14.411 9.000 13.098 10.238 13.005 11.824 L 13.000 12.000 C 13.000 13.657 14.343 15.000 16.000 15.000 C 17.657 15.000 19.000 13.657 19.000 12.000 C 19.000 10.343 17.657 9.000 16.000 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 11.000 C 15.448 11.000 15.000 11.448 15.000 12.000 C 15.000 12.552 15.448 13.000 16.000 13.000 C 16.552 13.000 17.000 12.552 17.000 12.000 C 17.000 11.448 16.552 11.000 16.000 11.000"),
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
        return _favicon!!
    }

private var _favicon: ImageVector? = null
