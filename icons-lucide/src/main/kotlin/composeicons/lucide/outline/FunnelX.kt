package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = lucideOutlineIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.531f, 3.0f),
                    PathNode.LineTo(3.0f, 3.0f),
                    PathNode.CurveTo(2.604902f, 3.000143f, 2.246929f, 3.2329f, 2.086505f, 3.593963f),
                    PathNode.CurveTo(1.92608f, 3.955026f, 1.993284f, 4.376695f, 2.258f, 4.67f),
                    PathNode.LineTo(9.483f, 12.659f),
                    PathNode.CurveTo(9.815536f, 13.026501f, 9.999776f, 13.504382f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(9.999824f, 20.379026f, 10.213948f, 20.725574f, 10.553f, 20.895f),
                    PathNode.LineTo(12.553f, 21.895f),
                    PathNode.CurveTo(12.863062f, 22.049938f, 13.231244f, 22.033264f, 13.526031f, 21.850931f),
                    PathNode.CurveTo(13.820818f, 21.6686f, 14.000161f, 21.346619f, 14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.000224f, 13.504382f, 14.184464f, 13.026501f, 14.517f, 12.659f),
                    PathNode.LineTo(14.944f, 12.186f)
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
                    PathNode.MoveTo(16.5f, 3.5f),
                    PathNode.LineTo(21.5f, 8.5f)
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
                    PathNode.MoveTo(21.5f, 3.5f),
                    PathNode.LineTo(16.5f, 8.5f)
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
