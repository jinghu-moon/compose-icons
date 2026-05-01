package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) return _cloudMoonRain!!
        _cloudMoonRain = lucideOutlineIcon(
            name = "CloudMoonRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 22.0f)
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
                    PathNode.MoveTo(18.376f, 14.512f),
                    PathNode.CurveTo(20.117002f, 13.760536f, 21.400305f, 12.230288f, 21.837f, 10.385f),
                    PathNode.CurveTo(21.985f, 9.76f, 21.178f, 9.415f, 20.589f, 9.671f),
                    PathNode.CurveTo(19.08317f, 10.322366f, 17.332273f, 9.988144f, 16.172255f, 8.827905f),
                    PathNode.CurveTo(15.012237f, 7.667666f, 14.678348f, 5.916706f, 15.33f, 4.411f),
                    PathNode.CurveTo(15.585f, 3.822f, 15.24f, 3.016f, 14.614f, 3.163f),
                    PathNode.CurveTo(12.082417f, 3.764496f, 10.227077f, 5.929194f, 10.02f, 8.523f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.CurveTo(1.769671f, 18.357962f, 1.667411f, 16.130938f, 2.742082f, 14.383058f),
                    PathNode.CurveTo(3.816753f, 12.635179f, 5.850192f, 11.721273f, 7.870767f, 12.078031f),
                    PathNode.CurveTo(9.891342f, 12.434788f, 11.488866f, 13.989783f, 11.9f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(14.245733f, 15.998169f, 15.362979f, 16.76639f, 15.807193f, 17.930231f),
                    PathNode.CurveTo(16.251408f, 19.094074f, 15.93015f, 20.41134f, 15.0f, 21.24f)
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
                    PathNode.MoveTo(7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
