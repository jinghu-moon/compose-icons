package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warning: ImageVector
    get() {
        if (_warning != null) return _warning!!
        _warning = phosphorLightIcon(
            name = "Warning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.07f, 189.09f),
                    PathNode.LineTo(147.61f, 37.22f),
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
                    PathNode.CurveTo(29.559174f, 201.8047f, 29.559174f, 198.0753f, 31.34f, 195.08f),
                    PathNode.LineTo(118.79f, 43.21f),
                    PathNode.CurveTo(120.7346f, 39.97964f, 124.22949f, 38.004223f, 128.0f, 38.004223f),
                    PathNode.CurveTo(131.77051f, 38.004223f, 135.2654f, 39.97964f, 137.21f, 43.21f),
                    PathNode.LineTo(224.67f, 195.08f),
                    PathNode.CurveTo(226.44774f, 198.07713f, 226.44391f, 201.80653f, 224.66f, 204.8f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 144.0f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(122.0f, 100.686295f, 124.686295f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(131.3137f, 98.0f, 134.0f, 100.686295f, 134.0f, 104.0f),
                    PathNode.LineTo(134.0f, 144.0f),
                    PathNode.CurveTo(134.0f, 147.3137f, 131.3137f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(124.686295f, 150.0f, 122.0f, 147.3137f, 122.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 180.0f),
                    PathNode.CurveTo(138.0f, 185.52284f, 133.52284f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(122.47715f, 190.0f, 118.0f, 185.52284f, 118.0f, 180.0f),
                    PathNode.CurveTo(118.0f, 174.47716f, 122.47715f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(133.52284f, 170.0f, 138.0f, 174.47716f, 138.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warning!!
    }

private var _warning: ImageVector? = null
