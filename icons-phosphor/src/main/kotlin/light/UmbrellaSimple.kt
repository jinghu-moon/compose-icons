package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorLightIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 126.79f),
                    PathNode.CurveTo(234.33965f, 84.83105f, 207.13046f, 48.607944f, 167.85223f, 33.40354f),
                    PathNode.CurveTo(128.57402f, 18.199139f, 84.06736f, 26.66139f, 53.11f, 55.22f),
                    PathNode.CurveTo(32.84915f, 73.82649f, 20.3329f, 99.37665f, 18.05f, 126.79f),
                    PathNode.CurveTo(17.71087f, 130.69913f, 19.027796f, 134.57117f, 21.679989f, 137.4629f),
                    PathNode.CurveTo(24.332182f, 140.35466f, 28.076185f, 142.00067f, 32.0f, 142.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.LineTo(122.0f, 200.0f),
                    PathNode.CurveTo(122.0f, 216.56854f, 135.43146f, 230.0f, 152.0f, 230.0f),
                    PathNode.CurveTo(168.56854f, 230.0f, 182.0f, 216.56854f, 182.0f, 200.0f),
                    PathNode.CurveTo(182.0f, 196.6863f, 179.3137f, 194.0f, 176.0f, 194.0f),
                    PathNode.CurveTo(172.6863f, 194.0f, 170.0f, 196.6863f, 170.0f, 200.0f),
                    PathNode.CurveTo(170.0f, 209.94113f, 161.94113f, 218.0f, 152.0f, 218.0f),
                    PathNode.CurveTo(142.05887f, 218.0f, 134.0f, 209.94113f, 134.0f, 200.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.LineTo(224.0f, 142.0f),
                    PathNode.CurveTo(227.93251f, 142.01472f, 231.68988f, 140.37482f, 234.35313f, 137.4814f),
                    PathNode.CurveTo(237.01639f, 134.58795f, 238.3399f, 130.70782f, 238.0f, 126.79f),
                    PathNode.Close,
                    PathNode.MoveTo(225.51f, 129.35f),
                    PathNode.CurveTo(225.1231f, 129.77307f, 224.57323f, 130.00978f, 224.0f, 130.0f),
                    PathNode.LineTo(32.0f, 130.0f),
                    PathNode.CurveTo(31.433708f, 130.00406f, 30.892242f, 129.76784f, 30.51f, 129.35f),
                    PathNode.CurveTo(30.117407f, 128.9303f, 29.924328f, 128.362f, 29.98f, 127.79f),
                    PathNode.CurveTo(33.26601f, 90.40759f, 57.52212f, 58.146152f, 92.521454f, 44.607746f),
                    PathNode.CurveTo(127.5208f, 31.069347f, 167.17305f, 38.60984f, 194.76f, 64.05f),
                    PathNode.CurveTo(212.81238f, 80.6166f, 223.96555f, 103.37276f, 226.0f, 127.79f),
                    PathNode.CurveTo(226.05301f, 128.3635f, 225.85622f, 128.932f, 225.46f, 129.35f),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
