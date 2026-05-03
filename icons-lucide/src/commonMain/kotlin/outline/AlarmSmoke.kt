package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) return _alarmSmoke!!
        _alarmSmoke = lucideOutlineIcon(
            name = "AlarmSmoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 21.0f),
                    PathNode.CurveTo(11.0f, 18.5f, 13.0f, 18.5f, 13.0f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 21.0f),
                    PathNode.CurveTo(16.0f, 18.5f, 18.0f, 18.5f, 18.0f, 16.0f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.LineTo(18.2f, 11.0f),
                    PathNode.CurveTo(18.083158f, 11.572993f, 17.58467f, 11.9884f, 17.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(6.415331f, 11.9884f, 5.916842f, 11.572993f, 5.8f, 11.0f),
                    PathNode.LineTo(5.0f, 8.0f)
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
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.CurveTo(21.552284f, 3.0f, 22.0f, 3.447715f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.CurveTo(22.0f, 7.10457f, 21.10457f, 8.0f, 20.0f, 8.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(2.895431f, 8.0f, 2.0f, 7.10457f, 2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 3.447715f, 2.447715f, 3.0f, 3.0f, 3.0f),
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
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.CurveTo(6.0f, 18.5f, 8.0f, 18.5f, 8.0f, 16.0f)
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
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
