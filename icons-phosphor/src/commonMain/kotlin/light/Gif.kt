package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorLightIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(142.0f, 72.0f),
                    PathNode.LineTo(142.0f, 184.0f),
                    PathNode.CurveTo(142.0f, 187.3137f, 139.3137f, 190.0f, 136.0f, 190.0f),
                    PathNode.CurveTo(132.6863f, 190.0f, 130.0f, 187.3137f, 130.0f, 184.0f),
                    PathNode.LineTo(130.0f, 72.0f),
                    PathNode.CurveTo(130.0f, 68.686295f, 132.6863f, 66.0f, 136.0f, 66.0f),
                    PathNode.CurveTo(139.3137f, 66.0f, 142.0f, 68.686295f, 142.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 66.0f),
                    PathNode.LineTo(176.0f, 66.0f),
                    PathNode.CurveTo(172.6863f, 66.0f, 170.0f, 68.686295f, 170.0f, 72.0f),
                    PathNode.LineTo(170.0f, 184.0f),
                    PathNode.CurveTo(170.0f, 187.3137f, 172.6863f, 190.0f, 176.0f, 190.0f),
                    PathNode.CurveTo(179.3137f, 190.0f, 182.0f, 187.3137f, 182.0f, 184.0f),
                    PathNode.LineTo(182.0f, 134.0f),
                    PathNode.LineTo(224.0f, 134.0f),
                    PathNode.CurveTo(227.3137f, 134.0f, 230.0f, 131.3137f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 124.686295f, 227.3137f, 122.0f, 224.0f, 122.0f),
                    PathNode.LineTo(182.0f, 122.0f),
                    PathNode.LineTo(182.0f, 78.0f),
                    PathNode.LineTo(232.0f, 78.0f),
                    PathNode.CurveTo(235.3137f, 78.0f, 238.0f, 75.313705f, 238.0f, 72.0f),
                    PathNode.CurveTo(238.0f, 68.686295f, 235.3137f, 66.0f, 232.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 122.0f),
                    PathNode.LineTo(72.0f, 122.0f),
                    PathNode.CurveTo(68.686295f, 122.0f, 66.0f, 124.686295f, 66.0f, 128.0f),
                    PathNode.CurveTo(66.0f, 131.3137f, 68.686295f, 134.0f, 72.0f, 134.0f),
                    PathNode.LineTo(90.0f, 134.0f),
                    PathNode.LineTo(90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 166.3594f, 78.359406f, 178.0f, 64.0f, 178.0f),
                    PathNode.CurveTo(49.6406f, 178.0f, 38.0f, 166.3594f, 38.0f, 152.0f),
                    PathNode.LineTo(38.0f, 104.0f),
                    PathNode.CurveTo(38.0f, 89.640594f, 49.6406f, 78.0f, 64.0f, 78.0f),
                    PathNode.CurveTo(76.07f, 78.0f, 87.33f, 86.38f, 90.19f, 97.5f),
                    PathNode.CurveTo(91.018425f, 100.70877f, 94.29123f, 102.63843f, 97.5f, 101.81f),
                    PathNode.CurveTo(100.70877f, 100.981575f, 102.63843f, 97.70877f, 101.81f, 94.5f),
                    PathNode.CurveTo(97.56f, 78.0f, 81.66f, 66.0f, 64.0f, 66.0f),
                    PathNode.CurveTo(43.01318f, 66.0f, 26.0f, 83.013176f, 26.0f, 104.0f),
                    PathNode.LineTo(26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 172.98682f, 43.01318f, 190.0f, 64.0f, 190.0f),
                    PathNode.CurveTo(84.986824f, 190.0f, 102.0f, 172.98682f, 102.0f, 152.0f),
                    PathNode.LineTo(102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 124.686295f, 99.313705f, 122.0f, 96.0f, 122.0f),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
