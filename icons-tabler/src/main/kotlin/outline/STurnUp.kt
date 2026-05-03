package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnUp: ImageVector
    get() {
        if (_sTurnUp != null) return _sTurnUp!!
        _sTurnUp = tablerOutlineIcon(
            name = "STurnUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 19.000 C 7.000 17.895 6.105 17.000 5.000 17.000 C 3.895 17.000 3.000 17.895 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 C 6.105 21.000 7.000 20.105 7.000 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 5.000 17.000 L 5.000 7.500 C 5.000 5.567 6.567 4.000 8.500 4.000 C 10.433 4.000 12.000 5.567 12.000 7.500 L 12.000 16.500 C 12.000 18.433 13.567 20.000 15.500 20.000 C 17.433 20.000 19.000 18.433 19.000 16.500 L 19.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 6.000 L 19.000 3.000 L 22.000 6.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _sTurnUp!!
    }

private var _sTurnUp: ImageVector? = null
