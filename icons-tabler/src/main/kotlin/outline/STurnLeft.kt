package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.STurnLeft: ImageVector
    get() {
        if (_sTurnLeft != null) return _sTurnLeft!!
        _sTurnLeft = tablerOutlineIcon(
            name = "STurnLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 7.000 C 17.895 7.000 17.000 6.105 17.000 5.000 C 17.000 3.895 17.895 3.000 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 C 21.000 6.105 20.105 7.000 19.000 7.000"),
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
                pathData = parseSvgPathData("M 17.000 5.000 L 7.500 5.000 C 5.567 5.000 4.000 6.567 4.000 8.500 C 4.000 10.433 5.567 12.000 7.500 12.000 L 16.500 12.000 C 18.433 12.000 20.000 13.567 20.000 15.500 C 20.000 17.433 18.433 19.000 16.500 19.000 L 3.000 19.000"),
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
                pathData = parseSvgPathData("M 6.000 16.000 L 3.000 19.000 L 6.000 22.000"),
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
        return _sTurnLeft!!
    }

private var _sTurnLeft: ImageVector? = null
