package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorBoldIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 68.0f),
                    PathNode.CurveTo(199.71089f, 67.97244f, 180.02756f, 48.28911f, 180.0f, 24.0f),
                    PathNode.CurveTo(180.0f, 17.372583f, 174.62741f, 12.0f, 168.0f, 12.0f),
                    PathNode.LineTo(128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.CurveTo(115.994804f, 163.92722f, 110.18578f, 170.65549f, 102.3441f, 171.81686f),
                    PathNode.CurveTo(94.50242f, 172.97826f, 86.99258f, 168.22256f, 84.689896f, 160.63716f),
                    PathNode.CurveTo(82.387215f, 153.05174f, 85.986015f, 144.92384f, 93.15f, 141.53f),
                    PathNode.CurveTo(97.33433f, 139.54182f, 100.0005f, 135.32265f, 100.0f, 130.69f),
                    PathNode.LineTo(100.0f, 88.0f),
                    PathNode.CurveTo(99.99857f, 84.45085f, 98.426125f, 81.08438f, 95.70529f, 78.80545f),
                    PathNode.CurveTo(92.98446f, 76.52651f, 89.39439f, 75.5689f, 85.9f, 76.19f),
                    PathNode.CurveTo(67.417336f, 79.57098f, 50.734085f, 89.40091f, 38.82f, 103.93f),
                    PathNode.CurveTo(26.687778f, 118.57308f, 20.033413f, 136.98396f, 20.0f, 156.0f),
                    PathNode.CurveTo(20.0f, 200.18279f, 55.81722f, 236.0f, 100.0f, 236.0f),
                    PathNode.CurveTo(144.18279f, 236.0f, 180.0f, 200.18279f, 180.0f, 156.0f),
                    PathNode.LineTo(180.0f, 122.67f),
                    PathNode.CurveTo(193.8444f, 128.8487f, 208.83942f, 132.02832f, 224.0f, 132.0f),
                    PathNode.CurveTo(230.62741f, 132.0f, 236.0f, 126.62742f, 236.0f, 120.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 107.15f),
                    PathNode.CurveTo(198.63849f, 105.25982f, 185.93883f, 100.1422f, 175.0f, 92.24f),
                    PathNode.CurveTo(171.34253f, 89.61325f, 166.52232f, 89.255196f, 162.51689f, 91.31273f),
                    PathNode.CurveTo(158.51146f, 93.370255f, 155.99504f, 97.49702f, 156.0f, 102.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.CurveTo(156.0f, 186.92795f, 130.92795f, 212.0f, 100.0f, 212.0f),
                    PathNode.CurveTo(69.07206f, 212.0f, 44.0f, 186.92795f, 44.0f, 156.0f),
                    PathNode.CurveTo(44.075382f, 134.14978f, 56.453407f, 114.20569f, 76.0f, 104.44f),
                    PathNode.LineTo(76.0f, 124.0f),
                    PathNode.CurveTo(60.951664f, 135.28625f, 55.8003f, 155.53264f, 63.624725f, 172.63849f),
                    PathNode.CurveTo(71.44915f, 189.74434f, 90.13503f, 199.08728f, 108.51437f, 195.08331f),
                    PathNode.CurveTo(126.89371f, 191.07935f, 140.0f, 174.81042f, 140.0f, 156.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(157.06f, 36.0f),
                    PathNode.CurveTo(162.13438f, 63.973225f, 184.02678f, 85.86562f, 212.0f, 90.94f),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
