package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = tablerFilledIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 15.866 1.000 19.000 4.134 19.000 8.000 C 19.000 13.457 15.972 18.000 12.000 18.000 C 8.100 18.000 5.110 13.621 5.003 8.297 L 5.000 8.000 L 5.004 7.760 C 5.133 3.990 8.227 1.000 12.000 1.000 ZM 12.000 5.000 C 11.448 5.000 11.000 5.448 11.000 6.000 C 11.000 6.552 11.448 7.000 12.000 7.000 L 12.117 7.007 C 12.620 7.066 13.000 7.493 13.000 8.000 L 13.007 8.117 C 13.069 8.642 13.530 9.028 14.059 8.997 C 14.587 8.966 14.999 8.529 15.000 8.000 C 15.000 6.343 13.657 5.000 12.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 16.000 C 12.507 16.000 12.934 16.380 12.993 16.883 L 13.000 17.000 L 13.000 18.000 C 13.000 19.589 11.762 20.902 10.176 20.995 L 10.000 21.000 L 7.000 21.000 C 6.493 21.000 6.066 21.380 6.007 21.883 L 6.000 22.000 C 6.000 22.552 5.552 23.000 5.000 23.000 C 4.448 23.000 4.000 22.552 4.000 22.000 C 4.000 20.411 5.238 19.098 6.824 19.005 L 7.000 19.000 L 10.000 19.000 C 10.507 19.000 10.934 18.620 10.993 18.117 L 11.000 18.000 L 11.000 17.000 C 11.000 16.448 11.448 16.000 12.000 16.000 Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
