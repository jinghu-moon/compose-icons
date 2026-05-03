package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorBoldIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.0f, 96.1f),
                    PathNode.LineTo(193.0f, 32.1f),
                    PathNode.CurveTo(190.72884f, 29.50316f, 187.44989f, 28.009417f, 184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(68.55012f, 28.009417f, 65.27117f, 29.50316f, 63.0f, 32.1f),
                    PathNode.LineTo(7.0f, 96.1f),
                    PathNode.CurveTo(2.944857f, 100.73538f, 3.057206f, 107.68806f, 7.26f, 112.19f),
                    PathNode.LineTo(119.26f, 232.19f),
                    PathNode.CurveTo(121.52938f, 234.61989f, 124.70518f, 235.99933f, 128.03f, 235.99933f),
                    PathNode.CurveTo(131.35483f, 235.99933f, 134.53062f, 234.61989f, 136.8f, 232.19f),
                    PathNode.LineTo(248.8f, 112.19f),
                    PathNode.CurveTo(252.98546f, 107.67255f, 253.07188f, 100.72009f, 249.0f, 96.1f),
                    PathNode.Close,
                    PathNode.MoveTo(213.55f, 92.0f),
                    PathNode.LineTo(182.0f, 92.0f),
                    PathNode.LineTo(152.0f, 52.0f),
                    PathNode.LineTo(178.55f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.88f, 116.0f),
                    PathNode.LineTo(93.07f, 169.0f),
                    PathNode.LineTo(43.61f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.28f, 116.0f),
                    PathNode.LineTo(128.0f, 191.69f),
                    PathNode.LineTo(97.72f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 92.0f),
                    PathNode.LineTo(128.0f, 60.0f),
                    PathNode.LineTo(152.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.12f, 116.0f),
                    PathNode.LineTo(212.39f, 116.0f),
                    PathNode.LineTo(162.93f, 169.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.45f, 52.0f),
                    PathNode.LineTo(104.0f, 52.0f),
                    PathNode.LineTo(74.0f, 92.0f),
                    PathNode.LineTo(42.45f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
