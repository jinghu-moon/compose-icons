package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlassWater: ImageVector
    get() {
        if (_glassWater != null) return _glassWater!!
        _glassWater = lucideOutlineIcon(
            name = "GlassWater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.116f, 4.104f),
                    PathNode.CurveTo(5.086546f, 3.82232f, 5.177914f, 3.541361f, 5.367417f, 3.330886f),
                    PathNode.CurveTo(5.556921f, 3.120412f, 5.826785f, 3.000164f, 6.11f, 3.0f),
                    PathNode.LineTo(17.89f, 3.0f),
                    PathNode.CurveTo(18.173409f, 3.000134f, 18.44345f, 3.120517f, 18.63299f, 3.331221f),
                    PathNode.CurveTo(18.822527f, 3.541925f, 18.913757f, 3.823158f, 18.884f, 4.105f),
                    PathNode.LineTo(17.19f, 20.21f),
                    PathNode.CurveTo(17.082514f, 21.22802f, 16.223679f, 22.00054f, 15.2f, 22.0f),
                    PathNode.LineTo(8.8f, 22.0f),
                    PathNode.CurveTo(7.772501f, 22.005678f, 6.907874f, 21.231836f, 6.8f, 20.21f),
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(7.777778f, 10.666667f, 10.222222f, 10.666667f, 12.0f, 12.0f),
                    PathNode.CurveTo(13.777778f, 13.333333f, 16.222221f, 13.333333f, 18.0f, 12.0f)
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
        return _glassWater!!
    }

private var _glassWater: ImageVector? = null
