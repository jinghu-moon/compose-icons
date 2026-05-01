package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartX: ImageVector
    get() {
        if (_heartX != null) return _heartX!!
        _heartX = lucideOutlineIcon(
            name = "HeartX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 12.5f),
                    PathNode.LineTo(20.5f, 17.5f)
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
                    PathNode.MoveTo(20.5f, 12.5f),
                    PathNode.LineTo(15.5f, 17.5f)
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
                    PathNode.MoveTo(21.955f, 8.774f),
                    PathNode.CurveTo(21.672752f, 6.64568f, 20.177868f, 4.876145f, 18.126625f, 4.24225f),
                    PathNode.CurveTo(16.075386f, 3.608355f, 13.842796f, 4.225989f, 12.409f, 5.824f),
                    PathNode.CurveTo(12.178586f, 6.03867f, 11.821414f, 6.03867f, 11.591f, 5.824f),
                    PathNode.CurveTo(10.06839f, 4.129542f, 7.658774f, 3.549108f, 5.531609f, 4.364399f),
                    PathNode.CurveTo(3.404444f, 5.179691f, 2.000042f, 7.221946f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 11.8f, 3.5f, 13.5f, 5.0f, 15.0f),
                    PathNode.LineTo(10.508f, 20.332f),
                    PathNode.CurveTo(11.162114f, 21.064293f, 12.251073f, 21.213442f, 13.078f, 20.684f)
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
        return _heartX!!
    }

private var _heartX: ImageVector? = null
