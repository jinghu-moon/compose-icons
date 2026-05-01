package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = lucideOutlineIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.CurveTo(14.656855f, 16.0f, 16.0f, 17.343145f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 20.656855f, 14.656855f, 22.0f, 13.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(4.368874f, 21.999462f, 2.188343f, 19.959892f, 2.012233f, 17.334665f),
                    PathNode.CurveTo(1.836124f, 14.70944f, 3.724699f, 12.396898f, 6.332179f, 12.044937f),
                    PathNode.CurveTo(8.939658f, 11.692975f, 11.373775f, 13.422033f, 11.9f, 16.0f),
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
        }
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
