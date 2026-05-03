package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorBoldIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.9f, 152.0f),
                    PathNode.CurveTo(251.57f, 150.53f, 229.15f, 126.15f, 192.69f, 111.31f),
                    PathNode.CurveTo(190.54f, 93.03f, 183.59f, 76.41f, 172.59f, 63.6f),
                    PathNode.CurveTo(157.12f, 45.52f, 134.79f, 36.0f, 108.0f, 36.0f),
                    PathNode.CurveTo(54.44f, 36.0f, 19.69f, 83.79f, 18.24f, 85.82f),
                    PathNode.CurveTo(14.374007f, 91.21306f, 15.611939f, 98.71901f, 21.005f, 102.585f),
                    PathNode.CurveTo(26.39806f, 106.451f, 33.904007f, 105.21306f, 37.77f, 99.82f),
                    PathNode.CurveTo(38.05f, 99.38f, 66.65f, 60.0f, 108.0f, 60.0f),
                    PathNode.CurveTo(127.85f, 60.0f, 143.45f, 66.45f, 154.38f, 79.18f),
                    PathNode.CurveTo(160.24518f, 86.15932f, 164.48119f, 94.358055f, 166.78f, 103.18f),
                    PathNode.CurveTo(156.86383f, 101.0577f, 146.75073f, 99.99175f, 136.61f, 100.0f),
                    PathNode.CurveTo(109.61f, 100.0f, 86.82f, 107.13f, 70.76f, 120.63f),
                    PathNode.CurveTo(56.3f, 132.79f, 48.0f, 149.78f, 48.0f, 167.25f),
                    PathNode.CurveTo(48.0f, 193.46f, 67.44f, 220.0f, 104.61f, 220.0f),
                    PathNode.CurveTo(156.54f, 220.0f, 186.95f, 179.72f, 192.48f, 137.57f),
                    PathNode.CurveTo(208.29901f, 145.262f, 222.70769f, 155.56645f, 235.1f, 168.05f),
                    PathNode.CurveTo(237.8954f, 171.49467f, 242.3632f, 173.11612f, 246.71724f, 172.26607f),
                    PathNode.CurveTo(251.07124f, 171.41603f, 254.6011f, 168.23322f, 255.89561f, 163.99005f),
                    PathNode.CurveTo(257.19012f, 159.7469f, 256.03806f, 155.13573f, 252.9f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.37f, 173.74f),
                    PathNode.CurveTo(144.09f, 183.9f, 129.09f, 196.0f, 104.61f, 196.0f),
                    PathNode.CurveTo(82.08f, 196.0f, 72.0f, 181.56f, 72.0f, 167.25f),
                    PathNode.CurveTo(72.0f, 146.42f, 92.22f, 124.0f, 136.61f, 124.0f),
                    PathNode.CurveTo(147.65086f, 124.029205f, 158.63474f, 125.583916f, 169.25f, 128.62f),
                    PathNode.CurveTo(168.24f, 145.44f, 162.21f, 161.66f, 152.37f, 173.74f),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
