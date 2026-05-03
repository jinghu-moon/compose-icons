package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorBoldIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 160.0f),
                    PathNode.CurveTo(179.99947f, 183.66083f, 166.09367f, 205.11192f, 144.49428f, 214.77118f),
                    PathNode.CurveTo(122.89489f, 224.43042f, 97.63574f, 220.49388f, 80.0f, 204.72f),
                    PathNode.CurveTo(76.69008f, 201.89265f, 75.170876f, 197.49454f, 76.030106f, 193.22708f),
                    PathNode.CurveTo(76.889336f, 188.95963f, 79.992226f, 185.49214f, 84.13843f, 184.16605f),
                    PathNode.CurveTo(88.28461f, 182.83995f, 92.82381f, 183.86322f, 96.0f, 186.84f),
                    PathNode.CurveTo(110.34549f, 199.66393f, 132.23929f, 198.93987f, 145.70616f, 185.19614f),
                    PathNode.CurveTo(159.17302f, 171.45244f, 159.45146f, 149.54843f, 146.3383f, 135.46683f),
                    PathNode.CurveTo(133.22516f, 121.38524f, 111.356834f, 120.10488f, 96.69f, 132.56f),
                    PathNode.CurveTo(92.79811f, 135.86804f, 87.23871f, 136.3499f, 82.83569f, 133.7608f),
                    PathNode.CurveTo(78.43268f, 131.17172f, 76.151146f, 126.07921f, 77.15f, 121.07f),
                    PathNode.LineTo(92.23f, 45.65f),
                    PathNode.CurveTo(93.35063f, 40.038445f, 98.27764f, 35.99888f, 104.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(174.62741f, 36.0f, 180.0f, 41.37258f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 54.62742f, 174.62741f, 60.0f, 168.0f, 60.0f),
                    PathNode.LineTo(113.84f, 60.0f),
                    PathNode.LineTo(105.48f, 101.79f),
                    PathNode.CurveTo(123.40018f, 97.320465f, 142.38023f, 101.35306f, 156.9352f, 112.72242f),
                    PathNode.CurveTo(171.49016f, 124.09178f, 179.99797f, 141.53085f, 180.0f, 160.0f),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
