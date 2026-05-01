package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorLightIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.49f, 50.5f),
                    PathNode.CurveTo(224.35434f, 49.52401f, 221.84561f, 49.883514f, 220.07f, 51.42f),
                    PathNode.CurveTo(191.07f, 76.53f, 166.79f, 64.5f, 138.66f, 50.58f),
                    PathNode.CurveTo(110.74f, 36.76f, 79.09f, 21.09f, 44.07f, 51.42f),
                    PathNode.CurveTo(42.74301f, 52.57018f, 41.986515f, 54.243973f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 224.0f),
                    PathNode.CurveTo(42.0f, 227.3137f, 44.68629f, 230.0f, 48.0f, 230.0f),
                    PathNode.CurveTo(51.31371f, 230.0f, 54.0f, 227.3137f, 54.0f, 224.0f),
                    PathNode.LineTo(54.0f, 178.78f),
                    PathNode.CurveTo(82.08f, 155.99f, 105.88f, 167.78f, 133.34f, 181.37f),
                    PathNode.CurveTo(161.26f, 195.19f, 192.92f, 210.85f, 227.93f, 180.52f),
                    PathNode.CurveTo(229.2411f, 179.38351f, 229.99602f, 177.73509f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.01616f, 53.63514f, 228.64168f, 51.481384f, 226.49f, 50.5f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 68.0f),
                    PathNode.LineTo(218.0f, 113.2f),
                    PathNode.CurveTo(202.47f, 125.8f, 188.25f, 127.85f, 174.0f, 124.85f),
                    PathNode.LineTo(174.0f, 76.88f),
                    PathNode.CurveTo(188.0f, 79.33f, 202.64f, 77.78f, 218.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 73.87f),
                    PathNode.LineTo(162.0f, 121.27f),
                    PathNode.CurveTo(154.4f, 118.42f, 146.69f, 114.61f, 138.66f, 110.63f),
                    PathNode.CurveTo(129.5f, 106.1f, 119.95f, 101.37f, 110.0f, 98.13f),
                    PathNode.LineTo(110.0f, 50.71f),
                    PathNode.CurveTo(117.95326f, 53.85987f, 125.743095f, 57.407684f, 133.34f, 61.34f),
                    PathNode.CurveTo(142.5f, 65.87f, 152.05f, 70.59f, 162.0f, 73.83f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 47.13f),
                    PathNode.LineTo(98.0f, 95.0f),
                    PathNode.CurveTo(84.0f, 92.55f, 69.36f, 94.11f, 54.0f, 103.93f),
                    PathNode.LineTo(54.0f, 58.75f),
                    PathNode.CurveTo(69.53f, 46.15f, 83.75f, 44.13f, 98.0f, 47.13f),
                    PathNode.Close,
                    PathNode.MoveTo(86.63f, 154.0f),
                    PathNode.CurveTo(76.13f, 154.0f, 65.24f, 156.79f, 54.0f, 164.0f),
                    PathNode.LineTo(54.0f, 118.79f),
                    PathNode.CurveTo(69.53f, 106.18f, 83.75f, 104.14f, 98.0f, 107.14f),
                    PathNode.LineTo(98.0f, 155.07f),
                    PathNode.CurveTo(94.24782f, 154.38707f, 90.44372f, 154.02908f, 86.63f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 158.11f),
                    PathNode.LineTo(110.0f, 110.72f),
                    PathNode.CurveTo(117.6f, 113.56f, 125.31f, 117.38f, 133.34f, 121.35f),
                    PathNode.CurveTo(142.5f, 125.88f, 152.05f, 130.61f, 162.0f, 133.85f),
                    PathNode.LineTo(162.0f, 181.24f),
                    PathNode.CurveTo(154.4f, 178.39f, 146.69f, 174.58f, 138.66f, 170.61f),
                    PathNode.CurveTo(129.5f, 166.07f, 120.0f, 161.35f, 110.0f, 158.11f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 184.81f),
                    PathNode.LineTo(174.0f, 136.89f),
                    PathNode.CurveTo(177.75423f, 137.54945f, 181.5583f, 137.88403f, 185.37f, 137.89f),
                    PathNode.CurveTo(195.87f, 137.89f, 206.76f, 135.11f, 218.0f, 127.89f),
                    PathNode.LineTo(218.0f, 173.13f),
                    PathNode.CurveTo(202.47f, 185.79f, 188.25f, 187.81f, 174.0f, 184.81f),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
