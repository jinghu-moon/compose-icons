package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blockquote: ImageVector
    get() {
        if (_blockquote != null) return _blockquote!!
        _blockquote = tablerOutlineIcon(
            name = "Blockquote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f)
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
                    PathNode.MoveTo(21.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f)
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
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f)
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
                    PathNode.MoveTo(21.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f)
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
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.552285f, 9.0f, 11.0f, 9.447715f, 11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 10.552285f, 10.552285f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(9.447715f, 11.0f, 9.0f, 10.552285f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 7.5f),
                    PathNode.CurveTo(9.0f, 6.395431f, 9.895431f, 5.5f, 11.0f, 5.5f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.552285f, 9.0f, 5.0f, 9.447715f, 5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 10.552285f, 4.552285f, 11.0f, 4.0f, 11.0f),
                    PathNode.CurveTo(3.447715f, 11.0f, 3.0f, 10.552285f, 3.0f, 10.0f),
                    PathNode.LineTo(3.0f, 7.5f),
                    PathNode.CurveTo(3.0f, 6.395431f, 3.895431f, 5.5f, 5.0f, 5.5f)
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
        return _blockquote!!
    }

private var _blockquote: ImageVector? = null
