package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorLightIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.21f, 117.61f),
                    PathNode.LineTo(208.32f, 41.49f),
                    PathNode.CurveTo(207.25468f, 37.244076f, 203.53708f, 34.194897f, 199.1648f, 33.980885f),
                    PathNode.CurveTo(194.7925f, 33.766872f, 190.79488f, 36.43841f, 189.32f, 40.56f),
                    PathNode.LineTo(171.17f, 90.0f),
                    PathNode.LineTo(84.83f, 90.0f),
                    PathNode.LineTo(66.66f, 40.56f),
                    PathNode.CurveTo(65.18512f, 36.43841f, 61.187504f, 33.766872f, 56.81521f, 33.980885f),
                    PathNode.CurveTo(52.442913f, 34.194897f, 48.725315f, 37.244076f, 47.66f, 41.49f),
                    PathNode.LineTo(27.79f, 117.61f),
                    PathNode.CurveTo(22.001919f, 139.71397f, 30.435722f, 163.09879f, 49.0f, 176.42f),
                    PathNode.LineTo(122.27f, 228.19f),
                    PathNode.CurveTo(125.7012f, 230.6043f, 130.2788f, 230.6043f, 133.71f, 228.19f),
                    PathNode.LineTo(207.0f, 176.42f),
                    PathNode.CurveTo(225.56427f, 163.09879f, 233.99808f, 139.71397f, 228.21f, 117.61f),
                    PathNode.Close,
                    PathNode.MoveTo(57.65f, 50.82f),
                    PathNode.LineTo(75.0f, 98.07f),
                    PathNode.CurveTo(75.86887f, 100.43386f, 78.12151f, 102.00352f, 80.64f, 102.0f),
                    PathNode.LineTo(175.36f, 102.0f),
                    PathNode.CurveTo(177.87848f, 102.00352f, 180.13112f, 100.43386f, 181.0f, 98.07f),
                    PathNode.LineTo(198.36f, 50.82f),
                    PathNode.LineTo(213.36f, 108.34f),
                    PathNode.LineTo(128.0f, 168.66f),
                    PathNode.LineTo(42.62f, 108.34f),
                    PathNode.Close,
                    PathNode.MoveTo(39.38f, 120.74f),
                    PathNode.LineTo(117.6f, 176.0f),
                    PathNode.LineTo(93.41f, 193.1f),
                    PathNode.LineTo(55.94f, 166.62f),
                    PathNode.CurveTo(41.46467f, 156.22173f, 34.882732f, 137.98627f, 39.38f, 120.74f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 217.53f),
                    PathNode.LineTo(103.81f, 200.44f),
                    PathNode.LineTo(128.0f, 183.35f),
                    PathNode.LineTo(152.19f, 200.44f),
                    PathNode.Close,
                    PathNode.MoveTo(200.06f, 166.62f),
                    PathNode.LineTo(162.59f, 193.1f),
                    PathNode.LineTo(138.4f, 176.0f),
                    PathNode.LineTo(216.62f, 120.74f),
                    PathNode.CurveTo(221.11726f, 137.98627f, 214.53534f, 156.22173f, 200.06f, 166.62f),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
