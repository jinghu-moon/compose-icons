package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = lucideOutlineIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.552f, 12.0f, 22.005f, 11.551f, 21.95f, 11.002f),
                    PathNode.CurveTo(21.474669f, 6.268585f, 17.730522f, 2.525275f, 12.997f, 2.051f),
                    PathNode.CurveTo(12.447f, 1.996f, 11.999f, 2.449f, 11.999f, 3.001f),
                    PathNode.LineTo(11.999f, 11.001f),
                    PathNode.CurveTo(11.999f, 11.553285f, 12.446715f, 12.001f, 12.999f, 12.001f),
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
                    PathNode.MoveTo(21.21f, 15.89f),
                    PathNode.CurveTo(19.459848f, 20.028881f, 15.163824f, 22.492043f, 10.707772f, 21.911535f),
                    PathNode.CurveTo(6.251722f, 21.331028f, 2.730143f, 17.849438f, 2.098787f, 13.400306f),
                    PathNode.CurveTo(1.467431f, 8.951174f, 3.881373f, 4.627301f, 8.0f, 2.83f)
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
