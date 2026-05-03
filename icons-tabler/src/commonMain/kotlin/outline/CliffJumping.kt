package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CliffJumping: ImageVector
    get() {
        if (_cliffJumping != null) return _cliffJumping!!
        _cliffJumping = tablerOutlineIcon(
            name = "CliffJumping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.552285f, 8.0f, 16.0f, 7.552285f, 16.0f, 7.0f),
                    PathNode.CurveTo(16.0f, 6.447716f, 15.552285f, 6.0f, 15.0f, 6.0f),
                    PathNode.CurveTo(14.447715f, 6.0f, 14.0f, 6.447716f, 14.0f, 7.0f)
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
                    PathNode.MoveTo(10.5f, 18.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(18.0f, 21.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.LineTo(16.0f, 11.0f)
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
                    PathNode.MoveTo(10.5f, 7.5f),
                    PathNode.LineTo(12.5f, 10.5f),
                    PathNode.LineTo(16.0f, 11.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.5f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(6.5f, 14.5f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.5f),
                    PathNode.LineTo(3.0f, 3.0f)
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
        return _cliffJumping!!
    }

private var _cliffJumping: ImageVector? = null
