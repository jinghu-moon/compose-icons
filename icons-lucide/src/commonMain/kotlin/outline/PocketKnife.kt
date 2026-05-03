package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PocketKnife: ImageVector
    get() {
        if (_pocketKnife != null) return _pocketKnife!!
        _pocketKnife = lucideOutlineIcon(
            name = "PocketKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 2.0f),
                    PathNode.LineTo(3.0f, 3.0f),
                    PathNode.CurveTo(3.0f, 4.0f, 5.0f, 4.0f, 5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 6.0f, 3.0f, 6.0f, 3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 8.0f, 5.0f, 8.0f, 5.0f, 9.0f),
                    PathNode.CurveTo(5.0f, 10.0f, 3.0f, 10.0f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 12.0f, 5.0f, 12.0f, 5.0f, 13.0f)
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
                    PathNode.MoveTo(18.0f, 6.0f),
                    PathNode.LineTo(18.01f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 18.0f),
                    PathNode.LineTo(6.01f, 18.0f)
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
                    PathNode.MoveTo(20.83f, 8.83f),
                    PathNode.CurveTo(22.392965f, 7.267034f, 22.392965f, 4.732966f, 20.83f, 3.17f),
                    PathNode.CurveTo(19.267035f, 1.607034f, 16.732965f, 1.607034f, 15.17f, 3.17f),
                    PathNode.LineTo(3.17f, 15.17f),
                    PathNode.CurveTo(1.607034f, 16.732965f, 1.607034f, 19.267035f, 3.17f, 20.83f),
                    PathNode.CurveTo(4.732966f, 22.392965f, 7.267034f, 22.392965f, 8.83f, 20.83f),
                    PathNode.Close
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
                    PathNode.MoveTo(18.0f, 11.66f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(20.209139f, 22.0f, 22.0f, 20.209139f, 22.0f, 18.0f),
                    PathNode.LineTo(22.0f, 6.0f)
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
        return _pocketKnife!!
    }

private var _pocketKnife: ImageVector? = null
