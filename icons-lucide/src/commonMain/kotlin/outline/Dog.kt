package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = lucideOutlineIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.25f, 16.25f),
                    PathNode.LineTo(12.75f, 16.25f),
                    PathNode.LineTo(12.0f, 17.0f),
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
                    PathNode.MoveTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 14.5f)
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
                    PathNode.MoveTo(4.42f, 11.247f),
                    PathNode.CurveTo(4.140132f, 12.327704f, 3.998997f, 13.439645f, 4.0f, 14.556f),
                    PathNode.CurveTo(4.0f, 18.728f, 7.582f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.418f, 21.0f, 20.0f, 18.728f, 20.0f, 14.556f),
                    PathNode.CurveTo(19.994999f, 13.435081f, 19.82897f, 12.320695f, 19.507f, 11.247f)
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
                    PathNode.MoveTo(8.0f, 14.0f),
                    PathNode.LineTo(8.0f, 14.5f)
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
                    PathNode.MoveTo(8.5f, 8.5f),
                    PathNode.CurveTo(8.116f, 9.55f, 7.417f, 10.528f, 6.156f, 11.0f),
                    PathNode.CurveTo(4.225f, 11.722f, 2.58f, 10.703f, 2.5f, 10.0f),
                    PathNode.CurveTo(2.387f, 9.006f, 3.677f, 3.47f, 6.5f, 3.0f),
                    PathNode.CurveTo(8.423f, 2.679f, 10.151f, 3.845f, 10.151f, 5.235f),
                    PathNode.CurveTo(11.41579f, 4.913779f, 12.74252f, 4.928256f, 14.0f, 5.277f),
                    PathNode.CurveTo(14.0f, 3.887f, 15.844f, 2.679f, 17.767f, 3.0f),
                    PathNode.CurveTo(20.59f, 3.47f, 21.88f, 9.006f, 21.767f, 10.0f),
                    PathNode.CurveTo(21.687f, 10.703f, 20.042f, 11.722f, 18.111f, 11.0f),
                    PathNode.CurveTo(16.85f, 10.528f, 16.256f, 9.55f, 15.872f, 8.5f)
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
        return _dog!!
    }

private var _dog: ImageVector? = null
