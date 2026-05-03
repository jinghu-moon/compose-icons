package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorRegularIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.84f, 119.2f),
                    PathNode.LineTo(167.24f, 175.2f),
                    PathNode.CurveTo(167.0165f, 177.31761f, 167.64645f, 179.43695f, 168.99036f, 181.08867f),
                    PathNode.CurveTo(170.33424f, 182.74039f, 172.28119f, 183.78818f, 174.4f, 184.0f),
                    PathNode.CurveTo(174.66978f, 184.01495f, 174.9402f, 184.01495f, 175.21f, 184.0f),
                    PathNode.CurveTo(179.3147f, 183.99492f, 182.74953f, 180.88412f, 183.16f, 176.8f),
                    PathNode.LineTo(188.76f, 120.8f),
                    PathNode.CurveTo(189.20183f, 116.40382f, 185.99619f, 112.48183f, 181.6f, 112.04f),
                    PathNode.CurveTo(177.20381f, 111.598175f, 173.28183f, 114.80381f, 172.84f, 119.2f),
                    PathNode.Close,
                    PathNode.MoveTo(83.16f, 119.2f),
                    PathNode.CurveTo(82.71817f, 114.80381f, 78.79619f, 111.598175f, 74.4f, 112.04f),
                    PathNode.CurveTo(70.003815f, 112.48183f, 66.79817f, 116.40382f, 67.24f, 120.8f),
                    PathNode.LineTo(72.84f, 176.8f),
                    PathNode.CurveTo(73.252335f, 180.90321f, 76.71618f, 184.02066f, 80.84f, 184.0f),
                    PathNode.CurveTo(81.109795f, 184.01495f, 81.3802f, 184.01495f, 81.65f, 184.0f),
                    PathNode.CurveTo(83.76113f, 183.78786f, 85.70152f, 182.74574f, 87.04429f, 181.1029f),
                    PathNode.CurveTo(88.387054f, 179.46008f, 89.0222f, 177.35114f, 88.81f, 175.24f),
                    PathNode.Close,
                    PathNode.MoveTo(239.93f, 89.06f),
                    PathNode.LineTo(224.86f, 202.12f),
                    PathNode.CurveTo(223.77306f, 210.05367f, 217.00775f, 215.9744f, 209.0f, 216.0f),
                    PathNode.LineTo(47.0f, 216.0f),
                    PathNode.CurveTo(38.992264f, 215.9744f, 32.226944f, 210.05367f, 31.14f, 202.12f),
                    PathNode.LineTo(16.07f, 89.06f),
                    PathNode.CurveTo(15.764369f, 86.77369f, 16.460463f, 84.46672f, 17.979673f, 82.731026f),
                    PathNode.CurveTo(19.498886f, 80.99533f, 21.693348f, 79.99985f, 24.0f, 80.0f),
                    PathNode.LineTo(68.37f, 80.0f),
                    PathNode.LineTo(122.0f, 18.73f),
                    PathNode.CurveTo(123.51866f, 17.007996f, 125.703995f, 16.021503f, 128.0f, 16.021503f),
                    PathNode.CurveTo(130.296f, 16.021503f, 132.48134f, 17.007996f, 134.0f, 18.73f),
                    PathNode.LineTo(187.63f, 80.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(234.30666f, 79.99985f, 236.50111f, 80.99533f, 238.02032f, 82.731026f),
                    PathNode.CurveTo(239.53954f, 84.46672f, 240.23563f, 86.77369f, 239.93f, 89.06f),
                    PathNode.Close,
                    PathNode.MoveTo(89.63f, 80.0f),
                    PathNode.LineTo(166.37f, 80.0f),
                    PathNode.LineTo(128.0f, 36.15f),
                    PathNode.Close,
                    PathNode.MoveTo(222.86f, 96.0f),
                    PathNode.LineTo(33.14f, 96.0f),
                    PathNode.LineTo(47.0f, 200.0f),
                    PathNode.LineTo(209.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _basket!!
    }

private var _basket: ImageVector? = null
