package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorBoldIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.14f, 113.86f),
                    PathNode.LineTo(230.14f, 97.86f),
                    PathNode.CurveTo(224.05821f, 91.78372f, 214.77373f, 90.27388f, 207.08f, 94.11f),
                    PathNode.LineTo(161.88f, 48.91f),
                    PathNode.CurveTo(165.71866f, 41.218353f, 164.21289f, 31.934134f, 158.14f, 25.85f),
                    PathNode.LineTo(142.14f, 9.85f),
                    PathNode.CurveTo(134.33f, 2.042361f, 121.67f, 2.042361f, 113.86f, 9.85f),
                    PathNode.LineTo(49.86f, 73.85f),
                    PathNode.CurveTo(42.05236f, 81.66f, 42.05236f, 94.32f, 49.86f, 102.13f),
                    PathNode.LineTo(65.86f, 118.13f),
                    PathNode.CurveTo(71.92195f, 124.19232f, 81.17344f, 125.716805f, 88.86f, 121.92f),
                    PathNode.LineTo(29.36f, 181.38f),
                    PathNode.CurveTo(16.861797f, 193.8782f, 16.861797f, 214.14178f, 29.36f, 226.64f),
                    PathNode.CurveTo(41.858204f, 239.1382f, 62.121796f, 239.1382f, 74.62f, 226.64f),
                    PathNode.LineTo(134.0f, 167.21f),
                    PathNode.CurveTo(130.2373f, 174.88516f, 131.7683f, 184.10321f, 137.81f, 190.15f),
                    PathNode.LineTo(153.81f, 206.15f),
                    PathNode.CurveTo(157.56096f, 209.90248f, 162.64926f, 212.01073f, 167.955f, 212.01073f),
                    PathNode.CurveTo(173.26073f, 212.01073f, 178.34904f, 209.90248f, 182.1f, 206.15f),
                    PathNode.LineTo(246.1f, 142.15f),
                    PathNode.CurveTo(249.85248f, 138.39903f, 251.96072f, 133.31073f, 251.96072f, 128.005f),
                    PathNode.CurveTo(251.96072f, 122.699265f, 249.85248f, 117.61096f, 246.1f, 113.86f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 98.34f),
                    PathNode.LineTo(69.64f, 88.0f),
                    PathNode.LineTo(128.0f, 29.65f),
                    PathNode.LineTo(138.34f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.64f, 209.67f),
                    PathNode.CurveTo(54.51407f, 212.79317f, 49.44817f, 212.79092f, 46.325f, 209.665f),
                    PathNode.CurveTo(43.201828f, 206.53906f, 43.204067f, 201.47318f, 46.33f, 198.35f),
                    PathNode.LineTo(105.85f, 138.83f),
                    PathNode.LineTo(117.16f, 150.15f),
                    PathNode.Close,
                    PathNode.MoveTo(150.34f, 149.38f),
                    PathNode.LineTo(106.62f, 105.66f),
                    PathNode.LineTo(145.62f, 66.66f),
                    PathNode.LineTo(189.34f, 110.38f),
                    PathNode.Close,
                    PathNode.MoveTo(167.99f, 186.38f),
                    PathNode.LineTo(157.65f, 176.0f),
                    PathNode.LineTo(216.0f, 117.66f),
                    PathNode.LineTo(226.34f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gavel!!
    }

private var _gavel: ImageVector? = null
