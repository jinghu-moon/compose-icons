package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlogger: ImageVector
    get() {
        if (_brandBlogger != null) return _brandBlogger!!
        _brandBlogger = tablerOutlineIcon(
            name = "BrandBlogger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 21.000 L 16.000 21.000 C 18.761 21.000 21.000 18.761 21.000 16.000 L 21.000 13.000 C 21.000 11.343 19.657 10.000 18.000 10.000 L 17.000 10.000 L 17.000 8.000 C 17.000 5.239 14.761 3.000 12.000 3.000 L 8.000 3.000 C 5.239 3.000 3.000 5.239 3.000 8.000 L 3.000 16.000 C 3.000 18.761 5.239 21.000 8.000 21.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 8.500 C 7.000 7.672 7.672 7.000 8.500 7.000 L 11.500 7.000 C 12.328 7.000 13.000 7.672 13.000 8.500 C 13.000 9.328 12.328 10.000 11.500 10.000 L 8.500 10.000 C 7.672 10.000 7.000 9.328 7.000 8.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 15.500 C 7.000 14.672 7.672 14.000 8.500 14.000 L 15.500 14.000 C 16.328 14.000 17.000 14.672 17.000 15.500 C 17.000 16.328 16.328 17.000 15.500 17.000 L 8.500 17.000 C 7.672 17.000 7.000 16.328 7.000 15.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandBlogger!!
    }

private var _brandBlogger: ImageVector? = null
