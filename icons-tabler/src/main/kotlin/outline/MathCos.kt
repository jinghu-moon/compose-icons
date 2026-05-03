package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathCos: ImageVector
    get() {
        if (_mathCos != null) return _mathCos!!
        _mathCos = tablerOutlineIcon(
            name = "MathCos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 10.000 C 7.000 8.895 6.105 8.000 5.000 8.000 C 3.895 8.000 3.000 8.895 3.000 10.000 L 3.000 14.000 C 3.000 15.105 3.895 16.000 5.000 16.000 C 6.105 16.000 7.000 15.105 7.000 14.000"),
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
        pathData = parseSvgPathData("M 17.000 15.000 C 17.345 15.600 18.258 16.000 19.000 16.000 C 20.105 16.000 21.000 15.105 21.000 14.000 C 21.000 12.895 20.105 12.000 19.000 12.000 C 17.895 12.000 17.000 11.105 17.000 10.000 C 17.000 8.895 17.895 8.000 19.000 8.000 C 19.746 8.000 20.656 8.394 21.000 9.000"),
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
        return _mathCos!!
    }

private var _mathCos: ImageVector? = null
