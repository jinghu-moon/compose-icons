package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = lucideOutlineIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.42f, 10.922f),
                    PathNode.CurveTo(21.785915f, 10.760575f, 22.020458f, 10.396656f, 22.016323f, 9.996737f),
                    PathNode.CurveTo(22.01219f, 9.596819f, 21.770174f, 9.237825f, 21.401f, 9.084f),
                    PathNode.LineTo(12.83f, 5.18f),
                    PathNode.CurveTo(12.302794f, 4.939524f, 11.697206f, 4.939524f, 11.17f, 5.18f),
                    PathNode.LineTo(2.6f, 9.08f),
                    PathNode.CurveTo(2.236206f, 9.23933f, 2.001178f, 9.598845f, 2.001178f, 9.996f),
                    PathNode.CurveTo(2.001178f, 10.393155f, 2.236206f, 10.75267f, 2.6f, 10.912f),
                    PathNode.LineTo(11.17f, 14.82f),
                    PathNode.CurveTo(11.697206f, 15.060476f, 12.302794f, 15.060476f, 12.83f, 14.82f),
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
                    PathNode.MoveTo(22.0f, 10.0f),
                    PathNode.LineTo(22.0f, 16.0f)
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
                    PathNode.MoveTo(6.0f, 12.5f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 17.656855f, 8.686292f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(15.313708f, 19.0f, 18.0f, 17.656855f, 18.0f, 16.0f),
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
        }
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
