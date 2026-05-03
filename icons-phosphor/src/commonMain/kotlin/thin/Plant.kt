package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorThinIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.63f, 48.12f),
                    PathNode.CurveTo(243.50684f, 46.09833f, 241.89198f, 44.487778f, 239.87f, 44.37f),
                    PathNode.CurveTo(189.62f, 41.37f, 149.43f, 56.47f, 132.35f, 84.66f),
                    PathNode.CurveTo(120.71f, 103.88f, 121.18f, 126.58f, 133.59f, 148.87f),
                    PathNode.CurveTo(124.83213f, 158.49052f, 119.04902f, 170.44229f, 116.94f, 183.28f),
                    PathNode.LineTo(93.45f, 159.79f),
                    PathNode.CurveTo(102.08f, 143.79f, 102.26f, 127.46f, 93.87f, 113.6f),
                    PathNode.CurveTo(81.45f, 93.09f, 52.35f, 82.13f, 16.0f, 84.26f),
                    PathNode.CurveTo(13.989384f, 84.38695f, 12.386947f, 85.98937f, 12.26f, 88.0f),
                    PathNode.CurveTo(10.13f, 124.33f, 21.09f, 153.43f, 41.6f, 165.85f),
                    PathNode.CurveTo(48.182663f, 169.89107f, 55.755898f, 172.03015f, 63.48f, 172.03f),
                    PathNode.CurveTo(72.00598f, 171.88504f, 80.3613f, 169.61662f, 87.79f, 165.43f),
                    PathNode.LineTo(116.0f, 193.67f),
                    PathNode.CurveTo(116.0f, 193.95f, 116.0f, 194.23f, 116.0f, 194.51f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 226.20914f, 117.79086f, 228.0f, 120.0f, 228.0f),
                    PathNode.CurveTo(122.20914f, 228.0f, 124.0f, 226.20914f, 124.0f, 224.0f),
                    PathNode.LineTo(124.0f, 194.51f),
                    PathNode.CurveTo(123.96238f, 179.74236f, 129.41142f, 165.48718f, 139.29f, 154.51f),
                    PathNode.CurveTo(150.78f, 160.87f, 162.36f, 164.07f, 173.53f, 164.07f),
                    PathNode.CurveTo(184.05244f, 164.07193f, 194.37007f, 161.16112f, 203.34f, 155.66f),
                    PathNode.CurveTo(231.52f, 138.57f, 246.59f, 98.38f, 243.63f, 48.12f),
                    PathNode.Close,
                    PathNode.MoveTo(45.74f, 159.0f),
                    PathNode.CurveTo(28.47f, 148.56f, 19.0f, 123.69f, 20.08f, 92.08f),
                    PathNode.CurveTo(51.69f, 90.99f, 76.56f, 100.47f, 87.08f, 117.74f),
                    PathNode.CurveTo(93.56f, 128.45f, 93.67f, 141.11f, 87.54f, 153.83f),
                    PathNode.LineTo(58.82f, 125.17f),
                    PathNode.CurveTo(57.239624f, 123.73805f, 54.813755f, 123.797775f, 53.305767f, 125.30576f),
                    PathNode.CurveTo(51.79778f, 126.81376f, 51.73805f, 129.23962f, 53.17f, 130.82f),
                    PathNode.LineTo(81.84f, 159.49f),
                    PathNode.CurveTo(69.11f, 165.62f, 56.45f, 165.51f, 45.74f, 159.0f),
                    PathNode.Close,
                    PathNode.MoveTo(199.19f, 148.8f),
                    PathNode.CurveTo(183.14f, 158.52f, 164.1f, 158.39f, 145.11f, 148.55f),
                    PathNode.LineTo(202.83f, 90.82f),
                    PathNode.CurveTo(204.32555f, 89.24867f, 204.29604f, 86.771645f, 202.76349f, 85.23638f),
                    PathNode.CurveTo(201.23094f, 83.70112f, 198.75397f, 83.66724f, 197.18f, 85.16f),
                    PathNode.LineTo(139.45f, 142.89f),
                    PathNode.CurveTo(129.61f, 123.89f, 129.45f, 104.89f, 139.2f, 88.81f),
                    PathNode.CurveTo(154.31f, 63.81f, 190.28f, 50.28f, 235.83f, 52.17f),
                    PathNode.CurveTo(237.73f, 97.72f, 224.15f, 133.69f, 199.19f, 148.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plant!!
    }

private var _plant: ImageVector? = null
