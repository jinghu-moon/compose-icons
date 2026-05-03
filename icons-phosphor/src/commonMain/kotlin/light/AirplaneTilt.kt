package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorLightIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.0f, 113.65f),
                    PathNode.LineTo(213.1f, 85.33f),
                    PathNode.LineTo(213.23f, 85.2f),
                    PathNode.CurveTo(224.94672f, 73.48328f, 224.94672f, 54.48672f, 213.23f, 42.77f),
                    PathNode.CurveTo(201.51328f, 31.05328f, 182.51672f, 31.05328f, 170.8f, 42.77f),
                    PathNode.LineTo(170.67f, 42.9f),
                    PathNode.LineTo(142.35f, 73.0f),
                    PathNode.LineTo(58.05f, 42.35f),
                    PathNode.CurveTo(55.861267f, 41.553123f, 53.409115f, 42.095013f, 51.76f, 43.74f),
                    PathNode.LineTo(27.76f, 67.74f),
                    PathNode.CurveTo(26.479088f, 69.01078f, 25.838076f, 70.79056f, 26.014542f, 72.58624f),
                    PathNode.CurveTo(26.191008f, 74.381935f, 27.166214f, 76.00287f, 28.67f, 77.0f),
                    PathNode.LineTo(94.59f, 120.94f),
                    PathNode.LineTo(77.52f, 138.0f),
                    PathNode.LineTo(56.0f, 138.0f),
                    PathNode.CurveTo(54.409237f, 138.0014f, 52.88414f, 138.63446f, 51.76f, 139.76f),
                    PathNode.LineTo(27.76f, 163.76f),
                    PathNode.CurveTo(26.330133f, 165.18399f, 25.711868f, 167.2314f, 26.114595f, 169.20879f),
                    PathNode.CurveTo(26.517324f, 171.18617f, 27.887094f, 172.82867f, 29.76f, 173.58f),
                    PathNode.LineTo(67.38f, 188.58f),
                    PathNode.LineTo(82.38f, 226.14f),
                    PathNode.LineTo(82.38f, 226.26f),
                    PathNode.CurveTo(83.63917f, 229.31421f, 87.13038f, 230.77596f, 90.19f, 229.53f),
                    PathNode.CurveTo(90.972374f, 229.21246f, 91.678055f, 228.73178f, 92.26f, 228.12f),
                    PathNode.LineTo(116.17f, 204.21f),
                    PathNode.CurveTo(117.31394f, 203.10472f, 117.972176f, 201.59042f, 118.0f, 200.0f),
                    PathNode.LineTo(118.0f, 178.48f),
                    PathNode.LineTo(135.07f, 161.41f),
                    PathNode.LineTo(179.0f, 227.33f),
                    PathNode.CurveTo(179.99797f, 228.8233f, 181.61244f, 229.79102f, 183.39986f, 229.96724f),
                    PathNode.CurveTo(185.18727f, 230.14343f, 186.95963f, 229.50966f, 188.23f, 228.24f),
                    PathNode.LineTo(212.23f, 204.24f),
                    PathNode.CurveTo(213.87498f, 202.59088f, 214.41689f, 200.13873f, 213.62f, 197.95f),
                    PathNode.Close,
                    PathNode.MoveTo(184.94f, 214.58f),
                    PathNode.LineTo(141.0f, 148.66f),
                    PathNode.CurveTo(140.00258f, 147.1656f, 138.38795f, 146.19682f, 136.6f, 146.02f),
                    PathNode.LineTo(136.01f, 146.02f),
                    PathNode.CurveTo(134.41924f, 146.0214f, 132.89413f, 146.65446f, 131.77f, 147.78f),
                    PathNode.LineTo(107.77f, 171.78f),
                    PathNode.CurveTo(106.645676f, 172.8976f, 106.00934f, 174.41473f, 106.0f, 176.0f),
                    PathNode.LineTo(106.0f, 197.52f),
                    PathNode.LineTo(90.2f, 213.32f),
                    PathNode.LineTo(77.57f, 181.77f),
                    PathNode.CurveTo(76.962425f, 180.24304f, 75.755135f, 179.03214f, 74.23f, 178.42f),
                    PathNode.LineTo(42.68f, 165.8f),
                    PathNode.LineTo(58.49f, 150.0f),
                    PathNode.LineTo(80.0f, 150.0f),
                    PathNode.CurveTo(81.59423f, 150.00125f, 83.12341f, 149.368f, 84.25f, 148.24f),
                    PathNode.LineTo(108.25f, 124.24f),
                    PathNode.CurveTo(109.51866f, 122.96823f, 110.15076f, 121.19495f, 109.97259f, 119.40745f),
                    PathNode.CurveTo(109.79442f, 117.61996f, 108.82473f, 116.006325f, 107.33f, 115.01f),
                    PathNode.LineTo(41.42f, 71.06f),
                    PathNode.LineTo(57.54f, 54.93f),
                    PathNode.LineTo(142.0f, 85.63f),
                    PathNode.CurveTo(144.25348f, 86.44848f, 146.77788f, 85.84686f, 148.42f, 84.1f),
                    PathNode.LineTo(179.42f, 51.2f),
                    PathNode.CurveTo(186.54654f, 44.81239f, 197.42545f, 45.118156f, 204.18196f, 51.895966f),
                    PathNode.CurveTo(210.93848f, 58.67378f, 211.21f, 69.5536f, 204.8f, 76.66f),
                    PathNode.LineTo(171.9f, 107.66f),
                    PathNode.CurveTo(170.15314f, 109.30212f, 169.55153f, 111.826515f, 170.37f, 114.08f),
                    PathNode.LineTo(201.07f, 198.49f),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
