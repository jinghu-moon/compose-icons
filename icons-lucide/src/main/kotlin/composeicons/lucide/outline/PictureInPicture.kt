package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = lucideOutlineIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 4.0f)
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
                    PathNode.MoveTo(2.0f, 4.0f),
                    PathNode.LineTo(8.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.0f, 5.895431f, 20.10457f, 5.0f, 19.0f, 5.0f),
                    PathNode.LineTo(12.0f, 5.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f)
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
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.552284f, 14.0f, 22.0f, 14.447715f, 22.0f, 15.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 20.552284f, 21.552284f, 21.0f, 21.0f, 21.0f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(12.447715f, 21.0f, 12.0f, 20.552284f, 12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(12.0f, 14.447715f, 12.447715f, 14.0f, 13.0f, 14.0f),
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
        }
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
