package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(8.180001f, 4.171f),
                    PathNode.CurveTo(8.570162f, 3.314655f, 9.504526f, 2.846137f, 10.424158f, 3.045712f),
                    PathNode.CurveTo(11.34379f, 3.245286f, 11.999898f, 4.058962f, 12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(12.0f, 6.552285f, 12.447715f, 7.0f, 13.0f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(16.552284f, 7.0f, 17.0f, 7.447716f, 17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.0f, 11.552285f, 17.447716f, 12.0f, 18.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.943514f, 11.9996f, 20.758974f, 12.658654f, 20.95652f, 13.581256f),
                    PathNode.CurveTo(21.154064f, 14.503858f, 20.679956f, 15.439031f, 19.819f, 15.825f),
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 20.552284f, 16.552284f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(12.447715f, 21.0f, 12.0f, 20.552284f, 12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.CurveTo(12.0f, 17.89543f, 11.104569f, 17.0f, 10.0f, 17.0f),
                    PathNode.CurveTo(8.895431f, 17.0f, 8.0f, 17.89543f, 8.0f, 19.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 20.552284f, 7.552285f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 16.447716f, 3.447715f, 16.0f, 4.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(6.10457f, 16.0f, 7.0f, 15.104569f, 7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 12.895431f, 6.10457f, 12.0f, 5.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(3.447715f, 12.0f, 3.0f, 11.552285f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 7.447716f, 3.447715f, 7.0f, 4.0f, 7.0f),
                    PathNode.LineTo(7.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _puzzleOff!!
    }

private var _puzzleOff: ImageVector? = null
