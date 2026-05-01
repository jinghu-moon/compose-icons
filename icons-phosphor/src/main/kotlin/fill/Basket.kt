package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorFillIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 82.73f),
                    PathNode.CurveTo(236.48528f, 81.000015f, 234.2994f, 80.00544f, 232.0f, 80.0f),
                    PathNode.LineTo(187.63f, 80.0f),
                    PathNode.LineTo(134.0f, 18.73f),
                    PathNode.CurveTo(132.48134f, 17.007996f, 130.296f, 16.021503f, 128.0f, 16.021503f),
                    PathNode.CurveTo(125.703995f, 16.021503f, 123.51866f, 17.007996f, 122.0f, 18.73f),
                    PathNode.LineTo(68.37f, 80.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(21.693348f, 79.99985f, 19.498886f, 80.99533f, 17.979673f, 82.731026f),
                    PathNode.CurveTo(16.460463f, 84.46672f, 15.764369f, 86.77369f, 16.07f, 89.06f),
                    PathNode.LineTo(31.14f, 202.12f),
                    PathNode.CurveTo(32.226944f, 210.05367f, 38.992264f, 215.9744f, 47.0f, 216.0f),
                    PathNode.LineTo(209.0f, 216.0f),
                    PathNode.CurveTo(217.00775f, 215.9744f, 223.77306f, 210.05367f, 224.86f, 202.12f),
                    PathNode.LineTo(239.93f, 89.06f),
                    PathNode.CurveTo(240.23044f, 86.77033f, 239.5268f, 84.46255f, 238.0f, 82.73f),
                    PathNode.Close,
                    PathNode.MoveTo(81.6f, 184.0f),
                    PathNode.CurveTo(81.33021f, 184.01495f, 81.05979f, 184.01495f, 80.79f, 184.0f),
                    PathNode.CurveTo(76.666176f, 184.02066f, 73.20234f, 180.90321f, 72.79f, 176.8f),
                    PathNode.LineTo(67.19f, 120.8f),
                    PathNode.CurveTo(66.74817f, 116.40382f, 69.95381f, 112.48183f, 74.35f, 112.04f),
                    PathNode.CurveTo(78.746185f, 111.598175f, 82.668175f, 114.80381f, 83.11f, 119.2f),
                    PathNode.LineTo(88.71f, 175.2f),
                    PathNode.CurveTo(89.17654f, 179.59337f, 85.993355f, 183.53319f, 81.6f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(89.63f, 80.0f),
                    PathNode.LineTo(128.0f, 36.15f),
                    PathNode.LineTo(166.37f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.76f, 120.8f),
                    PathNode.LineTo(183.16f, 176.8f),
                    PathNode.CurveTo(182.74953f, 180.88412f, 179.3147f, 183.99492f, 175.21f, 184.0f),
                    PathNode.CurveTo(174.9402f, 184.01495f, 174.66978f, 184.01495f, 174.4f, 184.0f),
                    PathNode.CurveTo(172.28886f, 183.78786f, 170.34848f, 182.74574f, 169.0057f, 181.1029f),
                    PathNode.CurveTo(167.66295f, 179.46008f, 167.0278f, 177.35114f, 167.24f, 175.24f),
                    PathNode.LineTo(172.84f, 119.24f),
                    PathNode.CurveTo(173.28183f, 114.84381f, 177.20381f, 111.638176f, 181.6f, 112.08f),
                    PathNode.CurveTo(185.99619f, 112.52183f, 189.20183f, 116.44382f, 188.76f, 120.84f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _basket!!
    }

private var _basket: ImageVector? = null
