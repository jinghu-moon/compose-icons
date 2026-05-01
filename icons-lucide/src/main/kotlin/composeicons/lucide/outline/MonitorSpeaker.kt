package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorSpeaker: ImageVector
    get() {
        if (_monitorSpeaker != null) return _monitorSpeaker!!
        _monitorSpeaker = lucideOutlineIcon(
            name = "MonitorSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.5f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(17.01f, 9.0f)
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
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(21.10457f, 4.0f, 22.0f, 4.895431f, 22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.10457f, 21.10457f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(12.895431f, 20.0f, 12.0f, 19.10457f, 12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.CurveTo(12.0f, 4.895431f, 12.895431f, 4.0f, 14.0f, 4.0f),
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.CurveTo(2.895431f, 6.0f, 2.0f, 6.895431f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.CurveTo(2.0f, 15.104569f, 2.895431f, 16.0f, 4.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 15.552285f, 17.552284f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(16.447716f, 16.0f, 16.0f, 15.552285f, 16.0f, 15.0f),
                    PathNode.CurveTo(16.0f, 14.447715f, 16.447716f, 14.0f, 17.0f, 14.0f),
                    PathNode.CurveTo(17.552284f, 14.0f, 18.0f, 14.447715f, 18.0f, 15.0f),
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
        return _monitorSpeaker!!
    }

private var _monitorSpeaker: ImageVector? = null
