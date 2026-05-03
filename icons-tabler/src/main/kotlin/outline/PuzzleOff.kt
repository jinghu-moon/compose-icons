package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PuzzleOff: ImageVector
    get() {
        if (_puzzleOff != null) return _puzzleOff!!
        _puzzleOff = tablerOutlineIcon(
            name = "PuzzleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.180 4.171 C 8.570 3.315 9.505 2.846 10.424 3.046 C 11.344 3.245 12.000 4.059 12.000 5.000 L 12.000 6.000 C 12.000 6.552 12.448 7.000 13.000 7.000 L 16.000 7.000 C 16.552 7.000 17.000 7.448 17.000 8.000 L 17.000 11.000 C 17.000 11.552 17.448 12.000 18.000 12.000 L 19.000 12.000 C 19.944 12.000 20.759 12.659 20.957 13.581 C 21.154 14.504 20.680 15.439 19.819 15.825M 17.000 17.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 13.000 21.000 C 12.448 21.000 12.000 20.552 12.000 20.000 L 12.000 19.000 C 12.000 17.895 11.105 17.000 10.000 17.000 C 8.895 17.000 8.000 17.895 8.000 19.000 L 8.000 20.000 C 8.000 20.552 7.552 21.000 7.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 17.000 C 3.000 16.448 3.448 16.000 4.000 16.000 L 5.000 16.000 C 6.105 16.000 7.000 15.105 7.000 14.000 C 7.000 12.895 6.105 12.000 5.000 12.000 L 4.000 12.000 C 3.448 12.000 3.000 11.552 3.000 11.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000 L 7.000 7.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _puzzleOff!!
    }

private var _puzzleOff: ImageVector? = null
