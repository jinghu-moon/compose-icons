package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnDown: ImageVector
    get() {
        if (_sTurnDown != null) return _sTurnDown!!
        _sTurnDown = tablerOutlineIcon(
            name = "STurnDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 5.000 C 7.000 6.105 6.105 7.000 5.000 7.000 C 3.895 7.000 3.000 6.105 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 C 6.105 3.000 7.000 3.895 7.000 5.000"),
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
                pathData = parseSvgPathData("M 5.000 7.000 L 5.000 16.500 C 5.000 18.433 6.567 20.000 8.500 20.000 C 10.433 20.000 12.000 18.433 12.000 16.500 L 12.000 7.500 C 12.000 5.567 13.567 4.000 15.500 4.000 C 17.433 4.000 19.000 5.567 19.000 7.500 L 19.000 21.000"),
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
                pathData = parseSvgPathData("M 16.000 18.000 L 19.000 21.000 L 22.000 18.000"),
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
        return _sTurnDown!!
    }

private var _sTurnDown: ImageVector? = null
