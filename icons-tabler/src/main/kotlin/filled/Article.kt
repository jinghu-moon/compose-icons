package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = tablerFilledIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 C 20.589 3.000 21.902 4.238 21.995 5.824 L 22.000 6.000 L 22.000 18.000 C 22.000 19.589 20.762 20.902 19.176 20.995 L 19.000 21.000 L 5.000 21.000 C 3.411 21.000 2.098 19.762 2.005 18.176 L 2.000 18.000 L 2.000 6.000 C 2.000 4.411 3.238 3.098 4.824 3.005 L 5.000 3.000 L 19.000 3.000 ZM 17.000 15.000 L 7.000 15.000 L 6.883 15.007 C 6.380 15.067 6.001 15.493 6.001 16.000 C 6.001 16.507 6.380 16.933 6.883 16.993 L 7.000 17.000 L 17.000 17.000 L 17.117 16.993 C 17.620 16.933 17.999 16.507 17.999 16.000 C 17.999 15.493 17.620 15.067 17.117 15.007 L 17.000 15.000 ZM 17.000 11.000 L 7.000 11.000 L 6.883 11.007 C 6.380 11.067 6.001 11.493 6.001 12.000 C 6.001 12.507 6.380 12.933 6.883 12.993 L 7.000 13.000 L 17.000 13.000 L 17.117 12.993 C 17.620 12.933 17.999 12.507 17.999 12.000 C 17.999 11.493 17.620 11.067 17.117 11.007 L 17.000 11.000 ZM 17.000 7.000 L 7.000 7.000 L 6.883 7.007 C 6.380 7.067 6.001 7.493 6.001 8.000 C 6.001 8.507 6.380 8.933 6.883 8.993 L 7.000 9.000 L 17.000 9.000 L 17.117 8.993 C 17.620 8.933 17.999 8.507 17.999 8.000 C 17.999 7.493 17.620 7.067 17.117 7.007 L 17.000 7.000 Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
