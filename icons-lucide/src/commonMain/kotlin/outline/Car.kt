package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = lucideOutlineIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.6f, 17.0f, 22.0f, 16.6f, 22.0f, 16.0f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 12.1f, 21.3f, 11.3f, 20.5f, 11.1f),
                    PathNode.CurveTo(18.7f, 10.6f, 16.0f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 10.0f, 14.7f, 8.6f, 13.8f, 7.7f),
                    PathNode.CurveTo(13.3f, 7.3f, 12.7f, 7.0f, 12.0f, 7.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(4.4f, 7.0f, 3.9f, 7.4f, 3.6f, 7.9f),
                    PathNode.LineTo(2.2f, 10.8f),
                    PathNode.CurveTo(2.06758f, 11.186225f, 2.0f, 11.591705f, 2.0f, 12.0f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.CurveTo(2.0f, 16.6f, 2.4f, 17.0f, 3.0f, 17.0f),
                    PathNode.LineTo(5.0f, 17.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 8.10457f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(5.895431f, 19.0f, 5.0f, 18.10457f, 5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 15.895431f, 5.895431f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(8.10457f, 15.0f, 9.0f, 15.895431f, 9.0f, 17.0f),
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f)
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
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 18.10457f, 18.10457f, 19.0f, 17.0f, 19.0f),
                    PathNode.CurveTo(15.895431f, 19.0f, 15.0f, 18.10457f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 15.895431f, 15.895431f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(18.10457f, 15.0f, 19.0f, 15.895431f, 19.0f, 17.0f),
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
        }
        return _car!!
    }

private var _car: ImageVector? = null
