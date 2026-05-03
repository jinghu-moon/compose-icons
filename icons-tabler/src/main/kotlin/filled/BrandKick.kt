package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandKick: ImageVector
    get() {
        if (_brandKick != null) return _brandKick!!
        _brandKick = tablerFilledIcon(
            name = "BrandKick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 C 9.552 3.000 10.000 3.448 10.000 4.000 L 10.000 7.000 L 11.000 7.000 L 11.000 6.000 C 11.000 5.493 11.380 5.066 11.883 5.007 L 12.000 5.000 L 13.000 5.000 L 13.000 4.000 C 13.000 3.493 13.380 3.066 13.883 3.007 L 14.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 8.000 C 21.000 8.552 20.552 9.000 20.000 9.000 L 19.000 9.000 L 19.000 10.000 C 19.000 10.507 18.620 10.934 18.117 10.993 L 18.000 11.000 L 17.000 11.000 L 17.000 13.000 L 18.000 13.000 C 18.507 13.000 18.934 13.380 18.993 13.883 L 19.000 14.000 L 19.000 15.000 L 20.000 15.000 C 20.507 15.000 20.934 15.380 20.993 15.883 L 21.000 16.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 14.000 21.000 C 13.448 21.000 13.000 20.552 13.000 20.000 L 13.000 19.000 L 12.000 19.000 C 11.493 19.000 11.066 18.620 11.007 18.117 L 11.000 18.000 L 11.000 17.000 L 10.000 17.000 L 10.000 20.000 C 10.000 20.507 9.620 20.934 9.117 20.993 L 9.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
        return _brandKick!!
    }

private var _brandKick: ImageVector? = null
