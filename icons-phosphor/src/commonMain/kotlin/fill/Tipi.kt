package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorFillIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.74f, 211.69f),
                    PathNode.LineTo(137.5f, 53.5f),
                    PathNode.LineTo(158.74f, 20.31f),
                    PathNode.CurveTo(161.12035f, 16.5876f, 160.0324f, 11.640347f, 156.31f, 9.26f),
                    PathNode.CurveTo(152.5876f, 6.879653f, 147.64035f, 7.967601f, 145.26f, 11.69f),
                    PathNode.LineTo(128.0f, 38.66f),
                    PathNode.LineTo(110.74f, 11.66f),
                    PathNode.CurveTo(108.35965f, 7.937601f, 103.4124f, 6.849653f, 99.69f, 9.23f),
                    PathNode.CurveTo(95.9676f, 11.610348f, 94.879654f, 16.5576f, 97.26f, 20.28f),
                    PathNode.LineTo(118.5f, 53.5f),
                    PathNode.LineTo(17.26f, 211.69f),
                    PathNode.CurveTo(15.685187f, 214.1526f, 15.578859f, 217.27806f, 16.98267f, 219.842f),
                    PathNode.CurveTo(18.38648f, 222.40593f, 21.076914f, 224.0001f, 24.0f, 224.0f),
                    PathNode.LineTo(232.0f, 224.0f),
                    PathNode.CurveTo(234.92308f, 224.0001f, 237.61353f, 222.40593f, 239.01733f, 219.842f),
                    PathNode.CurveTo(240.42114f, 217.27806f, 240.31482f, 214.1526f, 238.74f, 211.69f),
                    PathNode.Close,
                    PathNode.MoveTo(188.74f, 208.0f),
                    PathNode.LineTo(134.74f, 123.69f),
                    PathNode.CurveTo(133.26987f, 121.39076f, 130.72906f, 119.99957f, 128.0f, 119.99957f),
                    PathNode.CurveTo(125.270935f, 119.99957f, 122.73014f, 121.39076f, 121.26f, 123.69f),
                    PathNode.LineTo(67.3f, 208.0f),
                    PathNode.LineTo(38.62f, 208.0f),
                    PathNode.LineTo(128.0f, 68.34f),
                    PathNode.LineTo(217.38f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _tipi!!
    }

private var _tipi: ImageVector? = null
