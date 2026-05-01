package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorLightIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 83.013176f, 148.98682f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(107.013176f, 66.0f, 90.0f, 83.013176f, 90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 124.986824f, 107.013176f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(148.98682f, 142.0f, 166.0f, 124.986824f, 166.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 104.0f),
                    PathNode.CurveTo(102.0f, 89.640594f, 113.640594f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(142.3594f, 78.0f, 154.0f, 89.640594f, 154.0f, 104.0f),
                    PathNode.CurveTo(154.0f, 118.359406f, 142.3594f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(113.640594f, 130.0f, 102.0f, 118.359406f, 102.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 202.0f),
                    PathNode.LineTo(134.0f, 202.0f),
                    PathNode.LineTo(134.0f, 181.75f),
                    PathNode.CurveTo(175.78592f, 178.52615f, 207.55533f, 142.85793f, 205.94218f, 100.97889f),
                    PathNode.CurveTo(204.32907f, 59.099846f, 169.9101f, 25.981112f, 128.0f, 25.981112f),
                    PathNode.CurveTo(86.0899f, 25.981112f, 51.67092f, 59.099846f, 50.0578f, 100.97889f),
                    PathNode.CurveTo(48.444675f, 142.85793f, 80.21408f, 178.52615f, 122.0f, 181.75f),
                    PathNode.LineTo(122.0f, 202.0f),
                    PathNode.LineTo(32.0f, 202.0f),
                    PathNode.CurveTo(28.68629f, 202.0f, 26.0f, 204.6863f, 26.0f, 208.0f),
                    PathNode.CurveTo(26.0f, 211.3137f, 28.68629f, 214.0f, 32.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(227.3137f, 214.0f, 230.0f, 211.3137f, 230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 204.6863f, 227.3137f, 202.0f, 224.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 104.0f),
                    PathNode.CurveTo(62.0f, 67.54921f, 91.54921f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(164.45079f, 38.0f, 194.0f, 67.54921f, 194.0f, 104.0f),
                    PathNode.CurveTo(194.0f, 140.45079f, 164.45079f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(91.56748f, 169.95592f, 62.04408f, 140.43253f, 62.0f, 104.0f),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
