package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorLightIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.07f, 189.09f),
                    PathNode.LineTo(147.61f, 37.22f),
                    PathNode.CurveTo(143.52275f, 30.270311f, 136.06248f, 26.003014f, 128.0f, 26.003014f),
                    PathNode.CurveTo(119.93751f, 26.003014f, 112.47724f, 30.270311f, 108.39f, 37.22f),
                    PathNode.LineTo(20.93f, 189.09f),
                    PathNode.CurveTo(17.010473f, 195.79951f, 17.010473f, 204.10048f, 20.93f, 210.81f),
                    PathNode.CurveTo(24.96545f, 217.81334f, 32.467724f, 222.09216f, 40.55f, 222.0f),
                    PathNode.LineTo(215.45f, 222.0f),
                    PathNode.CurveTo(223.52515f, 222.0849f, 231.01807f, 217.80705f, 235.05f, 210.81f),
                    PathNode.CurveTo(238.97571f, 204.1041f, 238.98335f, 195.80313f, 235.07f, 189.09f),
                    PathNode.Close,
                    PathNode.MoveTo(224.66f, 204.8f),
                    PathNode.CurveTo(222.75702f, 208.0721f, 219.23474f, 210.06079f, 215.45f, 210.0f),
                    PathNode.LineTo(40.55f, 210.0f),
                    PathNode.CurveTo(36.765263f, 210.06079f, 33.24298f, 208.0721f, 31.34f, 204.8f),
                    PathNode.CurveTo(29.554806f, 201.80591f, 29.554806f, 198.0741f, 31.34f, 195.08f),
                    PathNode.LineTo(118.79f, 43.21f),
                    PathNode.CurveTo(120.7346f, 39.97964f, 124.22949f, 38.004223f, 128.0f, 38.004223f),
                    PathNode.CurveTo(131.77051f, 38.004223f, 135.2654f, 39.97964f, 137.21f, 43.21f),
                    PathNode.LineTo(224.67f, 195.08f),
                    PathNode.CurveTo(226.45212f, 198.07591f, 226.44827f, 201.80774f, 224.66f, 204.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _triangle!!
    }

private var _triangle: ImageVector? = null
