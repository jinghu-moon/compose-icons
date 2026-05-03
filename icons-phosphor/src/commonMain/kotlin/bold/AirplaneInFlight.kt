package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorBoldIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 222.62741f, 222.62741f, 228.0f, 216.0f, 228.0f),
                    PathNode.LineTo(72.0f, 228.0f),
                    PathNode.CurveTo(65.37258f, 228.0f, 60.0f, 222.62741f, 60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 209.37259f, 65.37258f, 204.0f, 72.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 209.37259f, 228.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 136.0f),
                    PathNode.LineTo(252.0f, 160.0f),
                    PathNode.CurveTo(252.0f, 166.62741f, 246.62741f, 172.0f, 240.0f, 172.0f),
                    PathNode.LineTo(61.07f, 172.0f),
                    PathNode.CurveTo(41.609287f, 172.09053f, 24.43155f, 159.3071f, 18.93f, 140.64f),
                    PathNode.LineTo(4.86f, 93.75f),
                    PathNode.CurveTo(3.043018f, 87.69689f, 4.193968f, 81.14113f, 7.964145f, 76.06892f),
                    PathNode.CurveTo(11.734322f, 70.99672f, 17.68007f, 68.00494f, 24.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(35.18009f, 68.000145f, 38.230087f, 69.26259f, 40.48f, 71.51f),
                    PathNode.LineTo(61.0f, 92.0f),
                    PathNode.LineTo(76.27f, 92.0f),
                    PathNode.LineTo(69.0f, 70.32f),
                    PathNode.CurveTo(66.967354f, 64.2172f, 67.99404f, 57.509224f, 71.758995f, 52.293774f),
                    PathNode.CurveTo(75.52395f, 47.078323f, 81.56761f, 43.992016f, 88.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(99.180084f, 44.00015f, 102.23009f, 45.26259f, 104.48f, 47.51f),
                    PathNode.LineTo(149.0f, 92.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.CurveTo(232.28911f, 92.02756f, 251.97244f, 111.71089f, 252.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 136.0f),
                    PathNode.CurveTo(228.0f, 124.95431f, 219.0457f, 116.0f, 208.0f, 116.0f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(140.81992f, 115.999855f, 137.76991f, 114.73741f, 135.52f, 112.49f),
                    PathNode.LineTo(94.83f, 71.79f),
                    PathNode.LineTo(104.3f, 100.21f),
                    PathNode.CurveTo(105.51823f, 103.86976f, 104.90298f, 107.89201f, 102.64644f, 111.02026f),
                    PathNode.CurveTo(100.3899f, 114.148506f, 96.76719f, 116.00136f, 92.91f, 116.0f),
                    PathNode.LineTo(56.0f, 116.0f),
                    PathNode.CurveTo(52.816444f, 116.0025f, 49.762363f, 114.73986f, 47.51f, 112.49f),
                    PathNode.LineTo(30.4f, 95.36f),
                    PathNode.LineTo(41.91f, 133.75f),
                    PathNode.CurveTo(44.417923f, 142.2317f, 52.225365f, 148.03839f, 61.07f, 148.0f),
                    PathNode.LineTo(228.0f, 148.0f),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
