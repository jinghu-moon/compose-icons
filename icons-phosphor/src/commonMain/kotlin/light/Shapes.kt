package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorLightIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(69.69f, 62.1f),
                    PathNode.CurveTo(68.87138f, 59.653164f, 66.58014f, 58.003654f, 64.0f, 58.003654f),
                    PathNode.CurveTo(61.419857f, 58.003654f, 59.128616f, 59.653164f, 58.31f, 62.1f),
                    PathNode.LineTo(18.31f, 182.1f),
                    PathNode.CurveTo(17.699171f, 183.92969f, 18.005253f, 185.94144f, 19.132599f, 187.50664f),
                    PathNode.CurveTo(20.259947f, 189.07185f, 22.071066f, 189.9996f, 24.0f, 190.0f),
                    PathNode.LineTo(104.0f, 190.0f),
                    PathNode.CurveTo(105.92893f, 189.9996f, 107.74005f, 189.07185f, 108.8674f, 187.50664f),
                    PathNode.CurveTo(109.99474f, 185.94144f, 110.30083f, 183.92969f, 109.69f, 182.1f),
                    PathNode.Close,
                    PathNode.MoveTo(32.32f, 178.0f),
                    PathNode.LineTo(64.0f, 83.0f),
                    PathNode.LineTo(95.68f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 76.0f),
                    PathNode.CurveTo(206.0f, 48.38576f, 183.61424f, 26.0f, 156.0f, 26.0f),
                    PathNode.CurveTo(128.38576f, 26.0f, 106.0f, 48.38576f, 106.0f, 76.0f),
                    PathNode.CurveTo(106.0f, 103.614235f, 128.38576f, 126.0f, 156.0f, 126.0f),
                    PathNode.CurveTo(183.60052f, 125.96694f, 205.96693f, 103.60053f, 206.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 76.0f),
                    PathNode.CurveTo(118.0f, 55.01318f, 135.01318f, 38.0f, 156.0f, 38.0f),
                    PathNode.CurveTo(176.98682f, 38.0f, 194.0f, 55.01318f, 194.0f, 76.0f),
                    PathNode.CurveTo(194.0f, 96.986824f, 176.98682f, 114.0f, 156.0f, 114.0f),
                    PathNode.CurveTo(135.01318f, 114.0f, 118.0f, 96.986824f, 118.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 146.0f),
                    PathNode.LineTo(136.0f, 146.0f),
                    PathNode.CurveTo(132.6863f, 146.0f, 130.0f, 148.6863f, 130.0f, 152.0f),
                    PathNode.LineTo(130.0f, 208.0f),
                    PathNode.CurveTo(130.0f, 211.3137f, 132.6863f, 214.0f, 136.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.LineTo(230.0f, 152.0f),
                    PathNode.CurveTo(230.0f, 148.6863f, 227.3137f, 146.0f, 224.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 202.0f),
                    PathNode.LineTo(142.0f, 202.0f),
                    PathNode.LineTo(142.0f, 158.0f),
                    PathNode.LineTo(218.0f, 158.0f),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
