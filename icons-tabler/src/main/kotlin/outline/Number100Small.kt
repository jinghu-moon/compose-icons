package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number100Small: ImageVector
    get() {
        if (_number100Small != null) return _number100Small!!
        _number100Small = tablerOutlineIcon(
            name = "Number100Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 8.000 L 5.000 8.000 L 5.000 16.000"),
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
        pathData = parseSvgPathData("M 9.000 10.000 L 9.000 14.000 C 9.000 15.105 9.895 16.000 11.000 16.000 C 12.105 16.000 13.000 15.105 13.000 14.000 L 13.000 10.000 C 13.000 8.895 12.105 8.000 11.000 8.000 C 9.895 8.000 9.000 8.895 9.000 10.000"),
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
        pathData = parseSvgPathData("M 16.000 10.000 L 16.000 14.000 C 16.000 15.105 16.895 16.000 18.000 16.000 C 19.105 16.000 20.000 15.105 20.000 14.000 L 20.000 10.000 C 20.000 8.895 19.105 8.000 18.000 8.000 C 16.895 8.000 16.000 8.895 16.000 10.000"),
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
        return _number100Small!!
    }

private var _number100Small: ImageVector? = null
