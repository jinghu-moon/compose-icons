package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorLightIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 106.0f),
                    PathNode.CurveTo(121.17035f, 105.99801f, 114.40291f, 107.297874f, 108.06f, 109.83f),
                    PathNode.LineTo(141.23f, 51.0f),
                    PathNode.CurveTo(142.85648f, 48.11155f, 141.83345f, 44.451477f, 138.945f, 42.825f),
                    PathNode.CurveTo(136.05655f, 41.19852f, 132.39648f, 42.221546f, 130.77f, 45.11f),
                    PathNode.LineTo(81.23f, 133.11f),
                    PathNode.CurveTo(69.06261f, 154.29945f, 72.63992f, 181.01888f, 89.95276f, 198.26135f),
                    PathNode.CurveTo(107.26559f, 215.50388f, 133.99934f, 218.9724f, 155.1391f, 206.71884f),
                    PathNode.CurveTo(176.27884f, 194.4653f, 186.55624f, 169.54343f, 180.19905f, 145.95055f),
                    PathNode.CurveTo(173.84186f, 122.357666f, 152.43436f, 105.97343f, 128.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(104.80404f, 202.0f, 86.0f, 183.19595f, 86.0f, 160.0f),
                    PathNode.CurveTo(86.0f, 136.80405f, 104.80404f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(151.19595f, 118.0f, 170.0f, 136.80405f, 170.0f, 160.0f),
                    PathNode.CurveTo(170.0f, 183.19595f, 151.19595f, 202.0f, 128.0f, 202.0f),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
