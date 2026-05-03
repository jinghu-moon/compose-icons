package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Layers2: ImageVector
    get() {
        if (_layers2 != null) return _layers2!!
        _layers2 = lucideOutlineIcon(
            name = "Layers2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 13.74f),
                    PathNode.CurveTo(12.381198f, 14.097265f, 11.618802f, 14.097265f, 11.0f, 13.74f),
                    PathNode.LineTo(2.5f, 8.87f),
                    PathNode.CurveTo(2.18669f, 8.692439f, 1.993052f, 8.360127f, 1.993052f, 8.0f),
                    PathNode.CurveTo(1.993052f, 7.639873f, 2.18669f, 7.307562f, 2.5f, 7.13f),
                    PathNode.LineTo(11.0f, 2.26f),
                    PathNode.CurveTo(11.618802f, 1.902734f, 12.381198f, 1.902734f, 13.0f, 2.26f),
                    PathNode.LineTo(21.5f, 7.13f),
                    PathNode.CurveTo(21.81331f, 7.307562f, 22.006948f, 7.639873f, 22.006948f, 8.0f),
                    PathNode.CurveTo(22.006948f, 8.360127f, 21.81331f, 8.692439f, 21.5f, 8.87f),
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
                    PathNode.MoveTo(20.0f, 14.285f),
                    PathNode.LineTo(21.5f, 15.13f),
                    PathNode.CurveTo(21.81331f, 15.307561f, 22.006948f, 15.639874f, 22.006948f, 16.0f),
                    PathNode.CurveTo(22.006948f, 16.360126f, 21.81331f, 16.692438f, 21.5f, 16.87f),
                    PathNode.LineTo(13.0f, 21.74f),
                    PathNode.CurveTo(12.381198f, 22.097265f, 11.618802f, 22.097265f, 11.0f, 21.74f),
                    PathNode.LineTo(2.5f, 16.87f),
                    PathNode.CurveTo(2.18669f, 16.692438f, 1.993052f, 16.360126f, 1.993052f, 16.0f),
                    PathNode.CurveTo(1.993052f, 15.639874f, 2.18669f, 15.307561f, 2.5f, 15.13f),
                    PathNode.LineTo(4.0f, 14.285f)
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
        return _layers2!!
    }

private var _layers2: ImageVector? = null
