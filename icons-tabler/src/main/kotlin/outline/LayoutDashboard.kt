package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutDashboard: ImageVector
    get() {
        if (_layoutDashboard != null) return _layoutDashboard!!
        _layoutDashboard = tablerOutlineIcon(
            name = "LayoutDashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 4.000 L 9.000 4.000 C 9.552 4.000 10.000 4.448 10.000 5.000 L 10.000 11.000 C 10.000 11.552 9.552 12.000 9.000 12.000 L 5.000 12.000 C 4.448 12.000 4.000 11.552 4.000 11.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000"),
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
        pathData = parseSvgPathData("M 5.000 16.000 L 9.000 16.000 C 9.552 16.000 10.000 16.448 10.000 17.000 L 10.000 19.000 C 10.000 19.552 9.552 20.000 9.000 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 17.000 C 4.000 16.448 4.448 16.000 5.000 16.000"),
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
        pathData = parseSvgPathData("M 15.000 12.000 L 19.000 12.000 C 19.552 12.000 20.000 12.448 20.000 13.000 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 15.000 20.000 C 14.448 20.000 14.000 19.552 14.000 19.000 L 14.000 13.000 C 14.000 12.448 14.448 12.000 15.000 12.000"),
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
        pathData = parseSvgPathData("M 15.000 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 7.000 C 20.000 7.552 19.552 8.000 19.000 8.000 L 15.000 8.000 C 14.448 8.000 14.000 7.552 14.000 7.000 L 14.000 5.000 C 14.000 4.448 14.448 4.000 15.000 4.000"),
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
        return _layoutDashboard!!
    }

private var _layoutDashboard: ImageVector? = null
