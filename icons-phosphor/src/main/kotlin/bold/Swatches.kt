package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorBoldIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.79f, 149.32f),
                    PathNode.LineTo(223.7f, 97.11f),
                    PathNode.CurveTo(219.9042f, 86.77665f, 208.47134f, 81.45353f, 198.12f, 85.2f),
                    PathNode.LineTo(136.81f, 107.42f),
                    PathNode.LineTo(147.7f, 45.18f),
                    PathNode.CurveTo(149.62769f, 34.322304f, 142.40317f, 23.952997f, 131.55f, 22.0f),
                    PathNode.LineTo(76.87f, 12.31f),
                    PathNode.CurveTo(71.65074f, 11.389982f, 66.279945f, 12.585562f, 61.9438f, 15.632683f),
                    PathNode.CurveTo(57.60766f, 18.679804f, 54.662933f, 23.32776f, 53.76f, 28.55f),
                    PathNode.LineTo(28.76f, 171.68f),
                    PathNode.CurveTo(24.160372f, 197.68102f, 41.425163f, 222.51479f, 67.4f, 227.26f),
                    PathNode.CurveTo(70.27363f, 227.754f, 73.18422f, 228.00156f, 76.1f, 228.0f),
                    PathNode.LineTo(224.0f, 228.0f),
                    PathNode.CurveTo(235.0457f, 228.0f, 244.0f, 219.0457f, 244.0f, 208.0f),
                    PathNode.LineTo(244.0f, 156.19f),
                    PathNode.CurveTo(243.96909f, 153.8498f, 243.5605f, 151.52994f, 242.79f, 149.32f),
                    PathNode.Close,
                    PathNode.MoveTo(99.0f, 184.18f),
                    PathNode.CurveTo(97.93088f, 190.47826f, 94.3787f, 196.08391f, 89.14f, 199.74f),
                    PathNode.CurveTo(84.044136f, 203.3367f, 77.7181f, 204.73808f, 71.58f, 203.63f),
                    PathNode.CurveTo(58.615288f, 201.21498f, 50.027943f, 188.79169f, 52.35f, 175.81f),
                    PathNode.LineTo(76.71f, 36.66f),
                    PathNode.LineTo(123.37f, 45.0f),
                    PathNode.LineTo(99.0f, 184.18f),
                    PathNode.Close,
                    PathNode.MoveTo(122.64f, 188.31f),
                    PathNode.LineTo(132.03f, 134.67f),
                    PathNode.LineTo(202.52f, 109.13f),
                    PathNode.LineTo(218.82f, 153.72f),
                    PathNode.LineTo(122.59f, 188.59f),
                    PathNode.CurveTo(122.62f, 188.5f, 122.65f, 188.41f, 122.66f, 188.31f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 204.0f),
                    PathNode.LineTo(150.52f, 204.0f),
                    PathNode.LineTo(220.0f, 178.82f),
                    PathNode.Close,
                    PathNode.MoveTo(89.22f, 174.07f),
                    PathNode.LineTo(87.82f, 182.07f),
                    PathNode.CurveTo(86.81454f, 187.81139f, 81.82876f, 191.99994f, 76.0f, 192.0f),
                    PathNode.CurveTo(75.302826f, 191.99881f, 74.60701f, 191.9386f, 73.92f, 191.82f),
                    PathNode.CurveTo(67.39203f, 190.67673f, 63.026836f, 184.458f, 64.17f, 177.93f),
                    PathNode.LineTo(65.57f, 169.93f),
                    PathNode.CurveTo(66.737915f, 163.42691f, 72.94297f, 159.09132f, 79.45106f, 160.23108f),
                    PathNode.CurveTo(85.959145f, 161.37082f, 90.32155f, 167.55704f, 89.21f, 174.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _swatches!!
    }

private var _swatches: ImageVector? = null
