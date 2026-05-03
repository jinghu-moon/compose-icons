package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Layout: ImageVector
    get() {
        if (_layout != null) return _layout!!
        _layout = tablerOutlineIcon(
            name = "Layout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000 L 8.000 4.000 C 9.105 4.000 10.000 4.895 10.000 6.000 L 10.000 7.000 C 10.000 8.105 9.105 9.000 8.000 9.000 L 6.000 9.000 C 4.895 9.000 4.000 8.105 4.000 7.000 L 4.000 6.000"),
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
        pathData = parseSvgPathData("M 4.000 15.000 C 4.000 13.895 4.895 13.000 6.000 13.000 L 8.000 13.000 C 9.105 13.000 10.000 13.895 10.000 15.000 L 10.000 18.000 C 10.000 19.105 9.105 20.000 8.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 15.000"),
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
        pathData = parseSvgPathData("M 14.000 6.000 C 14.000 4.895 14.895 4.000 16.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000 L 16.000 20.000 C 14.895 20.000 14.000 19.105 14.000 18.000 L 14.000 6.000"),
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
        return _layout!!
    }

private var _layout: ImageVector? = null
