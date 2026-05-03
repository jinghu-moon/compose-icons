package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandReddit: ImageVector
    get() {
        if (_brandReddit != null) return _brandReddit!!
        _brandReddit = tablerOutlineIcon(
            name = "BrandReddit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 C 14.648 8.000 17.028 8.826 18.675 10.140 C 19.839 9.732 21.127 10.234 21.708 11.323 C 22.288 12.411 21.988 13.760 21.001 14.500 C 21.001 18.090 16.971 21.000 12.001 21.000 C 7.126 21.000 3.156 18.200 3.001 14.706 L 2.001 14.500 C 1.014 13.760 0.714 12.411 1.294 11.323 C 1.875 10.234 3.163 9.732 4.327 10.140 C 5.973 8.827 8.353 8.000 11.001 8.000 L 12.000 8.000"),
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
        pathData = parseSvgPathData("M 12.000 8.000 L 13.000 3.000 L 19.000 4.000"),
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
        pathData = parseSvgPathData("M 18.000 4.000 C 18.000 4.552 18.448 5.000 19.000 5.000 C 19.552 5.000 20.000 4.552 20.000 4.000 C 20.000 3.448 19.552 3.000 19.000 3.000 C 18.448 3.000 18.000 3.448 18.000 4.000"),
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
        pathData = parseSvgPathData("M 8.500 13.000 C 8.500 13.276 8.724 13.500 9.000 13.500 C 9.276 13.500 9.500 13.276 9.500 13.000 C 9.500 12.724 9.276 12.500 9.000 12.500 C 8.724 12.500 8.500 12.724 8.500 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 14.500 13.000 C 14.500 13.276 14.724 13.500 15.000 13.500 C 15.276 13.500 15.500 13.276 15.500 13.000 C 15.500 12.724 15.276 12.500 15.000 12.500 C 14.724 12.500 14.500 12.724 14.500 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 10.000 17.000 C 10.667 17.333 11.333 17.500 12.000 17.500 C 12.667 17.500 13.333 17.333 14.000 17.000"),
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
        return _brandReddit!!
    }

private var _brandReddit: ImageVector? = null
