package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEvernote: ImageVector
    get() {
        if (_brandEvernote != null) return _brandEvernote!!
        _brandEvernote = tablerOutlineIcon(
            name = "BrandEvernote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 8.000 L 9.000 8.000 L 9.000 3.000"),
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
        pathData = parseSvgPathData("M 17.900 19.000 C 18.500 16.500 19.000 13.529 19.000 10.000 C 19.000 5.500 17.000 5.000 16.000 5.000 C 14.094 5.000 13.000 4.500 12.500 4.000 C 12.146 3.646 12.000 3.000 11.000 3.000 L 9.000 3.000 L 4.000 8.000 C 4.000 14.000 6.500 16.000 9.000 16.000 C 10.000 16.000 10.500 15.500 11.000 14.500 C 11.500 13.500 12.414 14.174 13.500 14.500 C 14.544 14.813 15.510 14.755 16.000 15.000 C 17.000 15.500 18.000 16.500 18.000 18.000 C 18.000 18.500 18.000 21.000 15.000 21.000 C 12.000 21.000 12.000 18.000 14.000 18.000"),
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
        pathData = parseSvgPathData("M 15.000 10.000 L 16.000 10.000"),
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
        return _brandEvernote!!
    }

private var _brandEvernote: ImageVector? = null
