package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorLightIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.CurveTo(196.6863f, 42.0f, 194.0f, 44.68629f, 194.0f, 48.0f),
                    PathNode.CurveTo(194.0f, 51.31371f, 196.6863f, 54.0f, 200.0f, 54.0f),
                    PathNode.CurveTo(209.94113f, 54.0f, 218.0f, 62.058876f, 218.0f, 72.0f),
                    PathNode.LineTo(218.0f, 134.65f),
                    PathNode.CurveTo(207.33855f, 123.763596f, 191.61719f, 119.50543f, 176.91893f, 123.52311f),
                    PathNode.CurveTo(162.22069f, 127.54078f, 150.85133f, 139.20403f, 147.21f, 154.0f),
                    PathNode.LineTo(108.79f, 154.0f),
                    PathNode.CurveTo(105.14867f, 139.20403f, 93.77931f, 127.54078f, 79.08107f, 123.52311f),
                    PathNode.CurveTo(64.38282f, 119.50543f, 48.66145f, 123.763596f, 38.0f, 134.65f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 62.058876f, 46.058876f, 54.0f, 56.0f, 54.0f),
                    PathNode.CurveTo(59.31371f, 54.0f, 62.0f, 51.31371f, 62.0f, 48.0f),
                    PathNode.CurveTo(62.0f, 44.68629f, 59.31371f, 42.0f, 56.0f, 42.0f),
                    PathNode.CurveTo(39.431458f, 42.0f, 26.0f, 55.431458f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 164.0f),
                    PathNode.CurveTo(25.447716f, 187.19595f, 43.80404f, 206.44771f, 67.0f, 207.0f),
                    PathNode.CurveTo(90.19596f, 207.55229f, 109.447716f, 189.19595f, 110.0f, 166.0f),
                    PathNode.LineTo(146.1f, 166.0f),
                    PathNode.CurveTo(147.59341f, 188.45085f, 166.5142f, 205.73663f, 189.0083f, 205.20044f),
                    PathNode.CurveTo(211.50238f, 204.66422f, 229.57803f, 186.49652f, 230.0f, 164.0f),
                    PathNode.LineTo(230.0f, 72.0f),
                    PathNode.CurveTo(230.0f, 55.431458f, 216.56854f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 194.0f),
                    PathNode.CurveTo(51.431458f, 194.0f, 38.0f, 180.56854f, 38.0f, 164.0f),
                    PathNode.CurveTo(38.0f, 147.43146f, 51.431458f, 134.0f, 68.0f, 134.0f),
                    PathNode.CurveTo(84.56854f, 134.0f, 98.0f, 147.43146f, 98.0f, 164.0f),
                    PathNode.CurveTo(98.0f, 180.56854f, 84.56854f, 194.0f, 68.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 194.0f),
                    PathNode.CurveTo(171.43146f, 194.0f, 158.0f, 180.56854f, 158.0f, 164.0f),
                    PathNode.CurveTo(158.0f, 147.43146f, 171.43146f, 134.0f, 188.0f, 134.0f),
                    PathNode.CurveTo(204.56854f, 134.0f, 218.0f, 147.43146f, 218.0f, 164.0f),
                    PathNode.CurveTo(218.0f, 180.56854f, 204.56854f, 194.0f, 188.0f, 194.0f),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
