package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = lucideOutlineIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.477f, 12.89f),
                    PathNode.LineTo(16.992f, 21.416f),
                    PathNode.CurveTo(17.026749f, 21.621586f, 16.930273f, 21.827154f, 16.749931f, 21.931799f),
                    PathNode.CurveTo(16.56959f, 22.03644f, 16.343245f, 22.018187f, 16.182f, 21.886f),
                    PathNode.LineTo(12.602f, 19.199f),
                    PathNode.CurveTo(12.247057f, 18.93383f, 11.759943f, 18.93383f, 11.405f, 19.199f),
                    PathNode.LineTo(7.819f, 21.885f),
                    PathNode.CurveTo(7.657892f, 22.016941f, 7.431875f, 22.035213f, 7.251663f, 21.930868f),
                    PathNode.CurveTo(7.071451f, 21.826523f, 6.974779f, 21.62141f, 7.009f, 21.416f),
                    PathNode.LineTo(8.523f, 12.89f)
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
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 11.313708f, 15.313708f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(8.686292f, 14.0f, 6.0f, 11.313708f, 6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 4.686292f, 8.686292f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(15.313708f, 2.0f, 18.0f, 4.686292f, 18.0f, 8.0f),
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
        return _award!!
    }

private var _award: ImageVector? = null
