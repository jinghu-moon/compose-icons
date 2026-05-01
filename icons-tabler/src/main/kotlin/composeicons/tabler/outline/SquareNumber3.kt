package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareNumber3: ImageVector
    get() {
        if (_squareNumber3 != null) return _squareNumber3!!
        _squareNumber3 = tablerOutlineIcon(
            name = "SquareNumber3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.895431f, 21.0f, 3.0f, 20.10457f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 5.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 8.447715f, 10.447715f, 8.0f, 11.0f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(13.552285f, 8.0f, 14.0f, 8.447715f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 11.552285f, 13.552285f, 12.0f, 13.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.552285f, 12.0f, 14.0f, 12.447715f, 14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 15.552285f, 13.552285f, 16.0f, 13.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(10.447715f, 16.0f, 10.0f, 15.552285f, 10.0f, 15.0f)
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
        return _squareNumber3!!
    }

private var _squareNumber3: ImageVector? = null
