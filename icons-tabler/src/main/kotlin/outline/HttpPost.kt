package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpPost: ImageVector
    get() {
        if (_httpPost != null) return _httpPost!!
        _httpPost = tablerOutlineIcon(
            name = "HttpPost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 L 5.000 12.000 C 6.105 12.000 7.000 11.105 7.000 10.000 C 7.000 8.895 6.105 8.000 5.000 8.000 L 3.000 8.000 L 3.000 16.000"),
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
        pathData = parseSvgPathData("M 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 L 14.000 14.000 C 14.000 15.105 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 15.105 10.000 14.000 L 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000"),
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
        pathData = parseSvgPathData("M 17.000 15.000 C 17.000 15.552 17.448 16.000 18.000 16.000 L 20.000 16.000 C 20.552 16.000 21.000 15.552 21.000 15.000 L 21.000 13.000 C 21.000 12.448 20.552 12.000 20.000 12.000 L 18.000 12.000 C 17.448 12.000 17.000 11.552 17.000 11.000 L 17.000 9.000 C 17.000 8.448 17.448 8.000 18.000 8.000 L 20.000 8.000 C 20.552 8.000 21.000 8.448 21.000 9.000"),
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
        return _httpPost!!
    }

private var _httpPost: ImageVector? = null
