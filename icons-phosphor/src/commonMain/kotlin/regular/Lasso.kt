package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorRegularIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.73f, 59.93f),
                    PathNode.CurveTo(184.85f, 47.08f, 157.24f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(98.76f, 40.0f, 71.15f, 47.08f, 50.27f, 59.93f),
                    PathNode.CurveTo(28.17f, 73.52f, 16.0f, 92.0f, 16.0f, 112.0f),
                    PathNode.CurveTo(16.0f, 132.0f, 28.17f, 150.44f, 50.27f, 164.0f),
                    PathNode.CurveTo(69.27f, 175.67f, 93.76f, 182.56f, 120.0f, 183.73f),
                    PathNode.LineTo(120.0f, 183.73f),
                    PathNode.CurveTo(120.25599f, 197.28714f, 113.144356f, 209.91814f, 101.42f, 216.73f),
                    PathNode.CurveTo(86.78f, 225.59f, 66.8f, 226.25f, 51.7f, 218.37f),
                    PathNode.CurveTo(49.15814f, 216.9596f, 46.05124f, 217.03902f, 43.58475f, 218.57744f),
                    PathNode.CurveTo(41.11826f, 220.11584f, 39.68038f, 222.87114f, 39.82899f, 225.77428f),
                    PathNode.CurveTo(39.9776f, 228.67741f, 41.689312f, 231.27148f, 44.3f, 232.55f),
                    PathNode.CurveTo(53.784966f, 237.46696f, 64.31634f, 240.02263f, 75.0f, 240.0f),
                    PathNode.CurveTo(87.22794f, 240.04768f, 99.2379f, 236.76344f, 109.74f, 230.5f),
                    PathNode.CurveTo(126.74f, 220.23f, 136.03f, 203.64f, 136.03f, 183.8f),
                    PathNode.LineTo(136.03f, 183.8f),
                    PathNode.CurveTo(162.27f, 182.63f, 186.79f, 175.74f, 205.76f, 164.07f),
                    PathNode.CurveTo(227.83f, 150.44f, 240.0f, 132.0f, 240.0f, 112.0f),
                    PathNode.CurveTo(240.0f, 92.0f, 227.83f, 73.52f, 205.73f, 59.93f),
                    PathNode.Close,
                    PathNode.MoveTo(67.41f, 155.18f),
                    PathNode.CurveTo(72.65f, 145.63f, 82.85f, 143.18f, 90.94f, 144.18f),
                    PathNode.CurveTo(101.84f, 145.6f, 112.8f, 153.31f, 117.55f, 167.6f),
                    PathNode.CurveTo(99.11f, 166.45f, 81.85f, 162.16f, 67.41f, 155.18f),
                    PathNode.Close,
                    PathNode.MoveTo(197.35f, 150.41f),
                    PathNode.CurveTo(180.4f, 160.84f, 158.18f, 166.94f, 134.22f, 167.84f),
                    PathNode.CurveTo(132.32372f, 159.3495f, 128.4177f, 151.438f, 122.83f, 144.77f),
                    PathNode.CurveTo(115.27791f, 135.7735f, 104.64093f, 129.91833f, 93.0f, 128.35f),
                    PathNode.CurveTo(76.0f, 126.15f, 61.28f, 133.46f, 53.62f, 147.05f),
                    PathNode.CurveTo(39.64f, 137.0f, 32.0f, 124.73f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 97.79f, 41.47f, 84.14f, 58.65f, 73.57f),
                    PathNode.CurveTo(77.05f, 62.23f, 101.68f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(154.32f, 56.0f, 179.0f, 62.23f, 197.35f, 73.55f),
                    PathNode.CurveTo(214.53f, 84.12f, 224.0f, 97.77f, 224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 126.23f, 214.53f, 139.84f, 197.35f, 150.41f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lasso!!
    }

private var _lasso: ImageVector? = null
