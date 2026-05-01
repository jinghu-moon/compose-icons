package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorBoldIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.049603f, 81.62865f, 81.62865f, 44.049603f, 128.0f, 44.0f),
                    PathNode.CurveTo(147.88223f, 44.0f, 164.0f, 60.11775f, 164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 99.88225f, 147.88223f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(110.00031f, 115.99943f, 92.95125f, 124.07979f, 81.555176f, 138.01242f),
                    PathNode.CurveTo(70.159096f, 151.94504f, 65.62006f, 170.25789f, 69.19f, 187.9f),
                    PathNode.CurveTo(53.071926f, 172.1386f, 43.990494f, 150.5436f, 44.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(108.11775f, 212.0f, 92.0f, 195.88223f, 92.0f, 176.0f),
                    PathNode.CurveTo(92.0f, 156.11777f, 108.11775f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(145.99968f, 140.00058f, 163.04875f, 131.92021f, 174.44484f, 117.98759f),
                    PathNode.CurveTo(185.8409f, 104.054955f, 190.37993f, 85.74211f, 186.81f, 68.1f),
                    PathNode.CurveTo(211.18225f, 91.977486f, 218.67642f, 128.23187f, 205.7686f, 159.81555f),
                    PathNode.CurveTo(192.86076f, 191.39923f, 162.1195f, 212.02731f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 184.83656f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 184.83656f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 167.16344f, 119.163445f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.83656f, 160.0f, 144.0f, 167.16344f, 144.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
