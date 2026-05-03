package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorLightIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.CurveTo(196.6863f, 42.0f, 194.0f, 44.68629f, 194.0f, 48.0f),
                    PathNode.CurveTo(194.0f, 51.31371f, 196.6863f, 54.0f, 200.0f, 54.0f),
                    PathNode.CurveTo(209.94113f, 54.0f, 218.0f, 62.058876f, 218.0f, 72.0f),
                    PathNode.LineTo(218.0f, 130.0f),
                    PathNode.LineTo(38.0f, 130.0f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 62.058876f, 46.058876f, 54.0f, 56.0f, 54.0f),
                    PathNode.CurveTo(59.31371f, 54.0f, 62.0f, 51.31371f, 62.0f, 48.0f),
                    PathNode.CurveTo(62.0f, 44.68629f, 59.31371f, 42.0f, 56.0f, 42.0f),
                    PathNode.CurveTo(39.431458f, 42.0f, 26.0f, 55.431458f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 164.0f),
                    PathNode.CurveTo(26.0f, 187.19595f, 44.80404f, 206.0f, 68.0f, 206.0f),
                    PathNode.CurveTo(91.19596f, 206.0f, 110.0f, 187.19595f, 110.0f, 164.0f),
                    PathNode.LineTo(110.0f, 142.0f),
                    PathNode.LineTo(146.0f, 142.0f),
                    PathNode.LineTo(146.0f, 164.0f),
                    PathNode.CurveTo(146.0f, 187.19595f, 164.80405f, 206.0f, 188.0f, 206.0f),
                    PathNode.CurveTo(211.19595f, 206.0f, 230.0f, 187.19595f, 230.0f, 164.0f),
                    PathNode.LineTo(230.0f, 72.0f),
                    PathNode.CurveTo(230.0f, 55.431458f, 216.56854f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 164.0f),
                    PathNode.LineTo(38.0f, 142.48f),
                    PathNode.LineTo(84.53f, 189.0f),
                    PathNode.CurveTo(75.32236f, 195.07956f, 63.52062f, 195.61412f, 53.801037f, 190.39192f),
                    PathNode.CurveTo(44.081455f, 185.16971f, 38.012924f, 175.03366f, 38.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 164.0f),
                    PathNode.CurveTo(97.99965f, 169.88248f, 96.26006f, 175.63353f, 93.0f, 180.53f),
                    PathNode.LineTo(54.48f, 142.0f),
                    PathNode.LineTo(98.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 164.0f),
                    PathNode.LineTo(158.0f, 142.48f),
                    PathNode.LineTo(204.53f, 189.0f),
                    PathNode.CurveTo(195.32236f, 195.07956f, 183.52061f, 195.61412f, 173.80104f, 190.39192f),
                    PathNode.CurveTo(164.08145f, 185.16971f, 158.01292f, 175.03366f, 158.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.0f, 180.53f),
                    PathNode.LineTo(174.48f, 142.0f),
                    PathNode.LineTo(218.0f, 142.0f),
                    PathNode.LineTo(218.0f, 164.0f),
                    PathNode.CurveTo(217.99965f, 169.88248f, 216.26007f, 175.63353f, 213.0f, 180.53f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
