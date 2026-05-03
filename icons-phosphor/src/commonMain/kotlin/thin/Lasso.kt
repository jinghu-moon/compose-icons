package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorThinIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.64f, 63.34f),
                    PathNode.CurveTo(183.37f, 50.87f, 156.51f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(99.49f, 44.0f, 72.63f, 50.87f, 52.36f, 63.34f),
                    PathNode.CurveTo(31.49f, 76.19f, 20.0f, 93.48f, 20.0f, 112.0f),
                    PathNode.CurveTo(20.0f, 130.52f, 31.49f, 147.83f, 52.36f, 160.68f),
                    PathNode.CurveTo(71.65f, 172.55f, 96.91f, 179.33f, 123.87f, 179.96f),
                    PathNode.CurveTo(123.95f, 181.23f, 124.0f, 182.52f, 124.0f, 183.86f),
                    PathNode.CurveTo(124.0f, 199.35f, 116.72f, 212.3f, 103.49f, 220.32f),
                    PathNode.CurveTo(87.7f, 229.89f, 66.15f, 230.6f, 49.85f, 222.09f),
                    PathNode.CurveTo(48.579067f, 221.3848f, 47.02562f, 221.42451f, 45.792374f, 222.19371f),
                    PathNode.CurveTo(44.55913f, 222.96292f, 43.84019f, 224.34058f, 43.914494f, 225.79214f),
                    PathNode.CurveTo(43.9888f, 227.24371f, 44.844658f, 228.54074f, 46.15f, 229.18f),
                    PathNode.CurveTo(55.05105f, 233.72675f, 64.91514f, 236.06587f, 74.91f, 236.0f),
                    PathNode.CurveTo(86.41727f, 236.07709f, 97.72959f, 233.02867f, 107.64f, 227.18f),
                    PathNode.CurveTo(123.35f, 217.66f, 132.0f, 202.28f, 132.0f, 183.88f),
                    PathNode.CurveTo(132.0f, 182.56f, 131.95f, 181.27f, 131.88f, 179.98f),
                    PathNode.CurveTo(158.94f, 179.39f, 184.29f, 172.6f, 203.64f, 160.7f),
                    PathNode.CurveTo(224.51f, 147.85f, 236.0f, 130.56f, 236.0f, 112.0f),
                    PathNode.CurveTo(236.0f, 93.44f, 224.51f, 76.19f, 203.64f, 63.34f),
                    PathNode.Close,
                    PathNode.MoveTo(62.16f, 157.15f),
                    PathNode.CurveTo(67.46f, 142.66f, 80.99f, 138.93f, 91.46f, 140.3f),
                    PathNode.CurveTo(105.1f, 142.08f, 118.84f, 152.49f, 122.84f, 171.96f),
                    PathNode.CurveTo(99.66f, 171.25f, 78.55f, 165.78f, 62.16f, 157.15f),
                    PathNode.Close,
                    PathNode.MoveTo(131.0f, 172.0f),
                    PathNode.CurveTo(129.53464f, 162.95247f, 125.67441f, 154.46202f, 119.82f, 147.41f),
                    PathNode.CurveTo(112.90698f, 139.17273f, 103.17495f, 133.80408f, 92.52f, 132.35f),
                    PathNode.CurveTo(75.7f, 130.16f, 61.28f, 138.35f, 55.19f, 153.09f),
                    PathNode.CurveTo(38.33f, 142.35f, 28.0f, 127.9f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 78.91f, 72.86f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(183.14f, 52.0f, 228.0f, 78.93f, 228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 144.52f, 184.74f, 171.06f, 131.0f, 172.0f),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
