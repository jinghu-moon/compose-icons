package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorBoldIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(149.0f, 88.0f),
                    PathNode.LineTo(104.49f, 43.51f),
                    PathNode.CurveTo(102.23763f, 41.260136f, 99.183556f, 39.997498f, 96.0f, 40.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(81.565155f, 39.99094f, 75.519f, 43.07858f, 71.75355f, 48.29669f),
                    PathNode.CurveTo(67.988106f, 53.51481f, 66.96336f, 60.225952f, 69.0f, 66.33f),
                    PathNode.LineTo(76.27f, 88.0f),
                    PathNode.LineTo(61.0f, 88.0f),
                    PathNode.LineTo(40.49f, 67.51f),
                    PathNode.CurveTo(38.237637f, 65.26014f, 35.183556f, 63.997498f, 32.0f, 64.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(17.68007f, 64.00494f, 11.734322f, 66.99672f, 7.964145f, 72.06892f),
                    PathNode.CurveTo(4.193968f, 77.14113f, 3.043018f, 83.69689f, 4.86f, 89.75f),
                    PathNode.LineTo(18.93f, 136.64f),
                    PathNode.CurveTo(24.43155f, 155.3071f, 41.609287f, 168.09053f, 61.07f, 168.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(246.62741f, 168.0f, 252.0f, 162.62741f, 252.0f, 156.0f),
                    PathNode.LineTo(252.0f, 132.0f),
                    PathNode.CurveTo(251.97244f, 107.71089f, 232.28911f, 88.02756f, 208.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.LineTo(61.07f, 144.0f),
                    PathNode.CurveTo(52.225365f, 144.03839f, 44.417923f, 138.2317f, 41.91f, 129.75f),
                    PathNode.LineTo(30.4f, 91.36f),
                    PathNode.LineTo(47.52f, 108.49f),
                    PathNode.CurveTo(49.769913f, 110.73741f, 52.81991f, 111.999855f, 56.0f, 112.0f),
                    PathNode.LineTo(92.9f, 112.0f),
                    PathNode.CurveTo(96.75895f, 112.00458f, 100.38464f, 110.15306f, 102.64352f, 107.02432f),
                    PathNode.CurveTo(104.90239f, 103.895584f, 105.51879f, 99.87143f, 104.3f, 96.21f),
                    PathNode.LineTo(94.83f, 67.79f),
                    PathNode.LineTo(135.52f, 108.49f),
                    PathNode.CurveTo(137.76991f, 110.73741f, 140.81992f, 111.999855f, 144.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(219.0457f, 112.0f, 228.0f, 120.95431f, 228.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 204.0f),
                    PathNode.CurveTo(228.0f, 215.0457f, 219.0457f, 224.0f, 208.0f, 224.0f),
                    PathNode.CurveTo(196.9543f, 224.0f, 188.0f, 215.0457f, 188.0f, 204.0f),
                    PathNode.CurveTo(188.0f, 192.9543f, 196.9543f, 184.0f, 208.0f, 184.0f),
                    PathNode.CurveTo(219.0457f, 184.0f, 228.0f, 192.9543f, 228.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 204.0f),
                    PathNode.CurveTo(132.0f, 215.0457f, 123.04569f, 224.0f, 112.0f, 224.0f),
                    PathNode.CurveTo(100.95431f, 224.0f, 92.0f, 215.0457f, 92.0f, 204.0f),
                    PathNode.CurveTo(92.0f, 192.9543f, 100.95431f, 184.0f, 112.0f, 184.0f),
                    PathNode.CurveTo(123.04569f, 184.0f, 132.0f, 192.9543f, 132.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
