package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorThinIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(155.33f, 194.22f),
                    PathNode.LineTo(123.33f, 242.22f),
                    PathNode.CurveTo(122.10393f, 244.05911f, 119.61911f, 244.55608f, 117.78f, 243.33f),
                    PathNode.CurveTo(115.940895f, 242.10393f, 115.44393f, 239.61911f, 116.67f, 237.78f),
                    PathNode.LineTo(148.67f, 189.78f),
                    PathNode.CurveTo(149.89607f, 187.94089f, 152.38089f, 187.44392f, 154.22f, 188.67f),
                    PathNode.CurveTo(156.05911f, 189.89607f, 156.55608f, 192.38089f, 155.33f, 194.22f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 92.0f),
                    PathNode.CurveTo(227.95592f, 131.74623f, 195.74623f, 163.95592f, 156.0f, 164.0f),
                    PathNode.LineTo(130.14f, 164.0f),
                    PathNode.LineTo(99.33f, 210.22f),
                    PathNode.CurveTo(98.10393f, 212.05911f, 95.61911f, 212.55608f, 93.78f, 211.33f),
                    PathNode.CurveTo(91.940895f, 210.10393f, 91.44393f, 207.61911f, 92.67f, 205.78f),
                    PathNode.LineTo(120.53f, 164.0f),
                    PathNode.LineTo(76.0f, 164.0f),
                    PathNode.CurveTo(57.469707f, 163.98364f, 40.603817f, 153.30257f, 32.66753f, 136.55779f),
                    PathNode.CurveTo(24.731247f, 119.81302f, 27.142185f, 99.995575f, 38.8618f, 85.64209f),
                    PathNode.CurveTo(50.581413f, 71.288605f, 69.516304f, 64.96295f, 87.51f, 69.39f),
                    PathNode.CurveTo(98.64629f, 35.838753f, 132.47098f, 15.315284f, 167.37303f, 20.932302f),
                    PathNode.CurveTo(202.27505f, 26.549322f, 227.95262f, 56.64889f, 228.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 92.0f),
                    PathNode.CurveTo(219.92093f, 57.411953f, 192.39926f, 29.132505f, 157.82611f, 28.11422f),
                    PathNode.CurveTo(123.252975f, 27.095932f, 94.114624f, 53.706566f, 92.0f, 88.23f),
                    PathNode.CurveTo(91.87298f, 90.43914f, 89.97914f, 92.12702f, 87.77f, 92.0f),
                    PathNode.CurveTo(85.56086f, 91.87298f, 83.87298f, 89.97914f, 84.0f, 87.77f),
                    PathNode.CurveTo(84.20605f, 84.18945f, 84.68072f, 80.62945f, 85.42f, 77.12f),
                    PathNode.CurveTo(70.42769f, 73.49562f, 54.687275f, 78.81416f, 44.96583f, 90.7891f),
                    PathNode.CurveTo(35.24439f, 102.764046f, 33.27423f, 119.2615f, 39.902363f, 133.18893f),
                    PathNode.CurveTo(46.530495f, 147.11636f, 60.575813f, 155.99199f, 76.0f, 156.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.CurveTo(191.33023f, 155.96143f, 219.96143f, 127.33023f, 220.0f, 92.0f),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
