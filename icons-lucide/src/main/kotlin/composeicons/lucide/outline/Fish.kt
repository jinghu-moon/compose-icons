package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = lucideOutlineIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.5f, 12.0f),
                    PathNode.CurveTo(7.44f, 8.54f, 11.44f, 6.0f, 15.0f, 6.0f),
                    PathNode.CurveTo(18.56f, 6.0f, 21.06f, 8.54f, 22.0f, 12.0f),
                    PathNode.CurveTo(21.06f, 15.47f, 18.56f, 18.0f, 15.0f, 18.0f),
                    PathNode.CurveTo(11.44f, 18.0f, 7.44f, 15.47f, 6.5f, 12.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.5f)
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
                    PathNode.MoveTo(16.0f, 17.93f),
                    PathNode.CurveTo(13.326046f, 14.428819f, 13.326046f, 9.571181f, 16.0f, 6.07f)
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
                    PathNode.MoveTo(7.0f, 10.67f),
                    PathNode.CurveTo(7.0f, 8.0f, 5.58f, 5.97f, 2.73f, 5.5f),
                    PathNode.CurveTo(1.73f, 7.0f, 1.73f, 10.5f, 2.96f, 12.0f),
                    PathNode.CurveTo(1.72f, 13.5f, 1.72f, 17.0f, 2.73f, 18.5f),
                    PathNode.CurveTo(5.58f, 18.03f, 7.0f, 16.0f, 7.0f, 13.33f)
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
                    PathNode.MoveTo(10.46f, 7.26f),
                    PathNode.CurveTo(10.2f, 5.88f, 9.17f, 4.24f, 8.0f, 3.0f),
                    PathNode.LineTo(13.8f, 3.0f),
                    PathNode.CurveTo(14.780019f, 2.996369f, 15.618302f, 3.703406f, 15.78f, 4.67f),
                    PathNode.LineTo(16.01f, 6.07f)
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
                    PathNode.MoveTo(16.01f, 17.93f),
                    PathNode.LineTo(15.78f, 19.33f),
                    PathNode.CurveTo(15.618302f, 20.296595f, 14.780019f, 21.003632f, 13.8f, 21.0f),
                    PathNode.LineTo(9.5f, 21.0f),
                    PathNode.CurveTo(10.46885f, 19.901493f, 10.999264f, 18.484684f, 10.99f, 17.02f)
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
        return _fish!!
    }

private var _fish: ImageVector? = null
