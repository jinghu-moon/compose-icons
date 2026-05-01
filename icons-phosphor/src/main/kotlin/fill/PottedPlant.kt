package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorFillIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.LineTo(123.3f, 144.0f),
                    PathNode.LineTo(145.71f, 121.59f),
                    PathNode.CurveTo(153.81201f, 125.67028f, 162.73914f, 127.84563f, 171.81f, 127.95f),
                    PathNode.CurveTo(180.9403f, 127.97411f, 189.89983f, 125.47555f, 197.7f, 120.73f),
                    PathNode.CurveTo(221.42f, 106.37f, 234.13f, 73.13f, 231.7f, 31.81f),
                    PathNode.CurveTo(231.46342f, 27.758856f, 228.23114f, 24.52658f, 224.18f, 24.29f),
                    PathNode.CurveTo(182.86f, 21.86f, 149.62f, 34.57f, 135.25f, 58.29f),
                    PathNode.CurveTo(125.9f, 73.74f, 125.66f, 92.4f, 134.39f, 110.29f),
                    PathNode.LineTo(120.0f, 124.68f),
                    PathNode.LineTo(107.79f, 112.47f),
                    PathNode.CurveTo(113.79f, 99.22f, 113.36f, 85.47f, 106.4f, 73.99f),
                    PathNode.CurveTo(95.53f, 56.0f, 70.61f, 46.41f, 39.73f, 48.22f),
                    PathNode.CurveTo(35.686344f, 48.46094f, 32.46094f, 51.686344f, 32.22f, 55.73f),
                    PathNode.CurveTo(30.4f, 86.6f, 40.0f, 111.52f, 58.0f, 122.4f),
                    PathNode.CurveTo(64.02196f, 126.07698f, 70.94423f, 128.01521f, 78.0f, 128.0f),
                    PathNode.CurveTo(84.401085f, 127.9365f, 90.71496f, 126.50803f, 96.52f, 123.81f),
                    PathNode.LineTo(108.69f, 136.0f),
                    PathNode.LineTo(100.69f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 147.58173f, 48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 156.41827f, 51.581722f, 160.0f, 56.0f, 160.0f),
                    PathNode.LineTo(65.59f, 160.0f),
                    PathNode.LineTo(78.8f, 219.47f),
                    PathNode.CurveTo(80.38887f, 226.81468f, 86.90554f, 232.0422f, 94.42f, 232.0f),
                    PathNode.LineTo(161.59f, 232.0f),
                    PathNode.CurveTo(169.10178f, 232.03453f, 175.61423f, 226.81041f, 177.21f, 219.47f),
                    PathNode.LineTo(190.42f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(204.41827f, 160.0f, 208.0f, 156.41827f, 208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 147.58173f, 204.41827f, 144.0f, 200.0f, 144.0f),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
