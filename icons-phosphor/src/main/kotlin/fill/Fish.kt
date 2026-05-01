package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorFillIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 76.0f),
                    PathNode.CurveTo(168.0f, 82.62742f, 162.62741f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(149.37259f, 88.0f, 144.0f, 82.62742f, 144.0f, 76.0f),
                    PathNode.CurveTo(144.0f, 69.37258f, 149.37259f, 64.0f, 156.0f, 64.0f),
                    PathNode.CurveTo(162.62741f, 64.0f, 168.0f, 69.37258f, 168.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.72f, 143.64f),
                    PathNode.CurveTo(197.35f, 178.54f, 161.28f, 197.4f, 109.48f, 199.74f),
                    PathNode.LineTo(87.48f, 251.15f),
                    PathNode.CurveTo(86.21596f, 254.10098f, 83.310295f, 256.01053f, 80.1f, 256.0f),
                    PathNode.LineTo(79.59f, 256.0f),
                    PathNode.CurveTo(76.21193f, 255.78833f, 73.33263f, 253.47366f, 72.4f, 250.22f),
                    PathNode.LineTo(57.6f, 198.39f),
                    PathNode.LineTo(5.8f, 183.56f),
                    PathNode.CurveTo(2.536971f, 182.6435f, 0.205588f, 179.77025f, -0.019119f, 176.38843f),
                    PathNode.CurveTo(-0.243826f, 173.00659f, 1.686915f, 169.85016f, 4.8f, 168.51f),
                    PathNode.LineTo(56.21f, 146.51f),
                    PathNode.CurveTo(58.56f, 94.73f, 77.42f, 58.67f, 112.3f, 39.29f),
                    PathNode.CurveTo(137.05f, 25.55f, 165.04f, 23.45f, 184.18f, 24.11f),
                    PathNode.CurveTo(202.82f, 24.75f, 220.18f, 28.38f, 223.04f, 30.11f),
                    PathNode.CurveTo(224.20787f, 30.79832f, 225.18169f, 31.772127f, 225.87f, 32.94f),
                    PathNode.CurveTo(227.56f, 35.79f, 231.2f, 53.15f, 231.87f, 71.79f),
                    PathNode.CurveTo(232.55f, 90.89f, 230.46f, 118.89f, 216.72f, 143.64f),
                    PathNode.Close,
                    PathNode.MoveTo(212.42f, 43.57f),
                    PathNode.CurveTo(198.27f, 40.57f, 148.32f, 32.57f, 112.12f, 58.32f),
                    PathNode.CurveTo(106.12837f, 62.595047f, 100.74576f, 67.6648f, 96.12f, 73.39f),
                    PathNode.CurveTo(95.3528f, 83.96402f, 99.285484f, 94.33861f, 106.86928f, 101.747025f),
                    PathNode.CurveTo(114.45307f, 109.15543f, 124.91682f, 112.84435f, 135.47f, 111.83f),
                    PathNode.CurveTo(137.84819f, 111.60098f, 140.20427f, 112.44689f, 141.89369f, 114.13631f),
                    PathNode.CurveTo(143.58311f, 115.82572f, 144.42903f, 118.18181f, 144.2f, 120.56f),
                    PathNode.CurveTo(143.1876f, 131.11713f, 146.88179f, 141.58353f, 154.29674f, 149.16618f),
                    PathNode.CurveTo(161.7117f, 156.74881f, 172.09288f, 160.67609f, 182.67f, 159.9f),
                    PathNode.CurveTo(188.37386f, 155.2731f, 193.42032f, 149.8902f, 197.67f, 143.9f),
                    PathNode.CurveTo(223.42f, 107.73f, 215.42f, 57.74f, 212.42f, 43.57f),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
