package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorBoldIcon(
            name = "NumberThree",
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
                    PathNode.CurveTo(107.96134f, 197.5321f, 125.55439f, 199.01863f, 139.14021f, 190.48515f),
                    PathNode.CurveTo(152.72603f, 181.95168f, 159.02536f, 165.45792f, 154.5869f, 150.04057f),
                    PathNode.CurveTo(150.14845f, 134.62321f, 136.04353f, 124.00358f, 120.0f, 124.0f),
                    PathNode.CurveTo(115.454735f, 124.0f, 111.299576f, 121.43197f, 109.26688f, 117.36656f),
                    PathNode.CurveTo(107.23417f, 113.301155f, 107.67284f, 108.43621f, 110.4f, 104.8f),
                    PathNode.LineTo(144.0f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(81.37258f, 60.0f, 76.0f, 54.62742f, 76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 41.37258f, 81.37258f, 36.0f, 88.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(172.54526f, 36.0f, 176.70044f, 38.568027f, 178.73312f, 42.63344f),
                    PathNode.CurveTo(180.76582f, 46.698845f, 180.32716f, 51.56379f, 177.6f, 55.2f),
                    PathNode.LineTo(141.12f, 103.84f),
                    PathNode.CurveTo(164.49036f, 112.66265f, 179.96837f, 135.01978f, 180.0f, 160.0f),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
