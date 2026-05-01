package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 8.895431f, 6.10457f, 8.0f, 5.0f, 8.0f),
                    PathNode.CurveTo(3.895431f, 8.0f, 3.0f, 8.895431f, 3.0f, 10.0f),
                    PathNode.LineTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 15.104569f, 3.895431f, 16.0f, 5.0f, 16.0f),
                    PathNode.CurveTo(6.10457f, 16.0f, 7.0f, 15.104569f, 7.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(13.104569f, 8.0f, 14.0f, 8.895431f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 15.104569f, 13.104569f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(10.895431f, 16.0f, 10.0f, 15.104569f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 8.895431f, 10.895431f, 8.0f, 12.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.345f, 15.6f, 18.258f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(20.10457f, 16.0f, 21.0f, 15.104569f, 21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 12.895431f, 20.10457f, 12.0f, 19.0f, 12.0f),
                    PathNode.CurveTo(17.89543f, 12.0f, 17.0f, 11.104569f, 17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 8.895431f, 17.89543f, 8.0f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.746f, 8.0f, 20.656f, 8.394f, 21.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mathCos!!
    }

private var _mathCos: ImageVector? = null
