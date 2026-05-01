package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorThinIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 204.0f),
                    PathNode.CurveTo(136.0f, 208.41827f, 132.41827f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(123.58172f, 212.0f, 120.0f, 208.41827f, 120.0f, 204.0f),
                    PathNode.CurveTo(120.0f, 199.58173f, 123.58172f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(132.41827f, 196.0f, 136.0f, 199.58173f, 136.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.54f, 90.1f),
                    PathNode.CurveTo(172.59811f, 39.295986f, 83.401886f, 39.295986f, 21.46f, 90.1f),
                    PathNode.CurveTo(20.34892f, 91.00528f, 19.807083f, 92.435814f, 20.039623f, 93.85001f),
                    PathNode.CurveTo(20.272163f, 95.26421f, 21.24354f, 96.44592f, 22.585995f, 96.94776f),
                    PathNode.CurveTo(23.92845f, 97.4496f, 25.436802f, 97.19487f, 26.54f, 96.28f),
                    PathNode.CurveTo(85.52986f, 47.90252f, 170.47014f, 47.90252f, 229.46f, 96.28f),
                    PathNode.CurveTo(231.16739f, 97.67114f, 233.67813f, 97.42038f, 235.07664f, 95.719025f),
                    PathNode.CurveTo(236.47517f, 94.01767f, 236.23528f, 91.505875f, 234.54f, 90.1f),
                    PathNode.Close,
                    PathNode.MoveTo(202.48f, 125.91f),
                    PathNode.CurveTo(158.82858f, 91.34081f, 97.131424f, 91.34081f, 53.48f, 125.91f),
                    PathNode.CurveTo(51.74859f, 127.29071f, 51.464287f, 129.81358f, 52.845f, 131.545f),
                    PathNode.CurveTo(54.22571f, 133.27641f, 56.74859f, 133.56071f, 58.48f, 132.18f),
                    PathNode.CurveTo(99.20866f, 99.95061f, 156.75134f, 99.95061f, 197.48f, 132.18f),
                    PathNode.CurveTo(199.21141f, 133.56071f, 201.73428f, 133.27641f, 203.115f, 131.545f),
                    PathNode.CurveTo(204.49571f, 129.81358f, 204.21141f, 127.29071f, 202.48f, 125.91f),
                    PathNode.Close,
                    PathNode.MoveTo(170.35f, 161.77f),
                    PathNode.CurveTo(145.10248f, 143.40707f, 110.89753f, 143.40707f, 85.65f, 161.77f),
                    PathNode.CurveTo(84.40933f, 162.57605f, 83.71493f, 164.00108f, 83.84463f, 165.4749f),
                    PathNode.CurveTo(83.97432f, 166.9487f, 84.906944f, 168.23056f, 86.26931f, 168.80754f),
                    PathNode.CurveTo(87.631676f, 169.38452f, 89.201256f, 169.16237f, 90.35f, 168.23f),
                    PathNode.CurveTo(112.80176f, 151.92406f, 143.19824f, 151.92406f, 165.65f, 168.23f),
                    PathNode.CurveTo(167.43205f, 169.52676f, 169.9273f, 169.13773f, 171.23f, 167.36f),
                    PathNode.CurveTo(171.85495f, 166.50215f, 172.11336f, 165.43109f, 171.9483f, 164.38266f),
                    PathNode.CurveTo(171.78325f, 163.33421f, 171.20828f, 162.39435f, 170.35f, 161.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
