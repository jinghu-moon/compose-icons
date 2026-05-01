package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorThinIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 204.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.CurveTo(69.79086f, 204.0f, 68.0f, 202.20914f, 68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 197.79086f, 69.79086f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.CurveTo(122.20914f, 196.0f, 124.0f, 197.79086f, 124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 202.20914f, 122.20914f, 204.0f, 120.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(157.79086f, 196.0f, 156.0f, 197.79086f, 156.0f, 200.0f),
                    PathNode.CurveTo(156.0f, 202.20914f, 157.79086f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(184.0f, 204.0f),
                    PathNode.CurveTo(186.20914f, 204.0f, 188.0f, 202.20914f, 188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 197.79086f, 186.20914f, 196.0f, 184.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 228.0f),
                    PathNode.LineTo(104.0f, 228.0f),
                    PathNode.CurveTo(101.79086f, 228.0f, 100.0f, 229.79086f, 100.0f, 232.0f),
                    PathNode.CurveTo(100.0f, 234.20914f, 101.79086f, 236.0f, 104.0f, 236.0f),
                    PathNode.LineTo(160.0f, 236.0f),
                    PathNode.CurveTo(162.20914f, 236.0f, 164.0f, 234.20914f, 164.0f, 232.0f),
                    PathNode.CurveTo(164.0f, 229.79086f, 162.20914f, 228.0f, 160.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 100.0f),
                    PathNode.CurveTo(227.95592f, 139.74623f, 195.74623f, 171.95592f, 156.0f, 172.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.CurveTo(57.469707f, 171.98364f, 40.603817f, 161.30257f, 32.66753f, 144.55779f),
                    PathNode.CurveTo(24.731247f, 127.81302f, 27.142185f, 107.995575f, 38.8618f, 93.64209f),
                    PathNode.CurveTo(50.581413f, 79.288605f, 69.516304f, 72.96295f, 87.51f, 77.39f),
                    PathNode.CurveTo(98.64629f, 43.838753f, 132.47098f, 23.315283f, 167.37303f, 28.932302f),
                    PathNode.CurveTo(202.27505f, 34.549324f, 227.95262f, 64.64889f, 228.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 100.0f),
                    PathNode.CurveTo(219.92093f, 65.41196f, 192.39926f, 37.132507f, 157.82611f, 36.11422f),
                    PathNode.CurveTo(123.252975f, 35.095932f, 94.114624f, 61.706566f, 92.0f, 96.23f),
                    PathNode.CurveTo(91.87298f, 98.43914f, 89.97914f, 100.12702f, 87.77f, 100.0f),
                    PathNode.CurveTo(85.56086f, 99.87298f, 83.87298f, 97.97914f, 84.0f, 95.77f),
                    PathNode.CurveTo(84.20605f, 92.18945f, 84.68072f, 88.62945f, 85.42f, 85.12f),
                    PathNode.CurveTo(70.42769f, 81.49562f, 54.687275f, 86.81416f, 44.96583f, 98.7891f),
                    PathNode.CurveTo(35.24439f, 110.764046f, 33.27423f, 127.2615f, 39.902363f, 141.18893f),
                    PathNode.CurveTo(46.530495f, 155.11636f, 60.575813f, 163.99199f, 76.0f, 164.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.CurveTo(191.33023f, 163.96143f, 219.96143f, 135.33023f, 220.0f, 100.0f),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
