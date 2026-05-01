package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorFillIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(188.64f, 136.0f),
                    PathNode.LineTo(159.0f, 188.0f),
                    PathNode.CurveTo(157.56705f, 190.48196f, 154.91591f, 192.0078f, 152.05f, 192.0f),
                    PathNode.LineTo(151.59f, 192.0f),
                    PathNode.CurveTo(148.5614f, 191.82356f, 145.89319f, 189.94923f, 144.7f, 187.16f),
                    PathNode.LineTo(103.0f, 89.92f),
                    PathNode.LineTo(79.0f, 132.0f),
                    PathNode.CurveTo(77.55819f, 134.49756f, 74.88374f, 136.02582f, 72.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(67.36f, 120.0f),
                    PathNode.LineTo(97.05f, 68.0f),
                    PathNode.CurveTo(98.55595f, 65.36465f, 101.42359f, 63.808533f, 104.453896f, 63.9823f),
                    PathNode.CurveTo(107.4842f, 64.15607f, 110.15517f, 66.02978f, 111.35f, 68.82f),
                    PathNode.LineTo(153.0f, 166.08f),
                    PathNode.LineTo(177.0f, 124.03f),
                    PathNode.CurveTo(178.43295f, 121.548035f, 181.08409f, 120.022194f, 183.95f, 120.03f),
                    PathNode.LineTo(207.95f, 120.03f),
                    PathNode.CurveTo(212.36827f, 120.03f, 215.95f, 123.611725f, 215.95f, 128.03f),
                    PathNode.CurveTo(215.95f, 132.44827f, 212.36827f, 136.03f, 207.95f, 136.03f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pulse!!
    }

private var _pulse: ImageVector? = null
