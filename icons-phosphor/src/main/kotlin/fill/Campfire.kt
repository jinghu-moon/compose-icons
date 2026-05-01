package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorFillIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.19f, 25.19f),
                    PathNode.CurveTo(129.6201f, 23.609968f, 126.3799f, 23.609968f, 123.81f, 25.19f),
                    PathNode.CurveTo(113.77552f, 31.710693f, 104.52468f, 39.36436f, 96.24f, 48.0f),
                    PathNode.CurveTo(77.77f, 67.13f, 68.0f, 87.9f, 68.0f, 108.0f),
                    PathNode.CurveTo(68.0f, 141.13708f, 94.862915f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(161.13708f, 168.0f, 188.0f, 141.13708f, 188.0f, 108.0f),
                    PathNode.CurveTo(188.0f, 60.08f, 134.47f, 26.59f, 132.19f, 25.19f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 104.0f, 128.0f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(128.0f, 88.0f, 152.0f, 104.0f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.62f, 226.42f),
                    PathNode.CurveTo(222.97716f, 228.44249f, 221.55704f, 230.12668f, 219.67221f, 231.10191f),
                    PathNode.CurveTo(217.78737f, 232.07715f, 215.59227f, 232.26352f, 213.57f, 231.62f),
                    PathNode.LineTo(128.0f, 204.39f),
                    PathNode.LineTo(42.43f, 231.62f),
                    PathNode.CurveTo(38.21883f, 232.95929f, 33.71929f, 230.63116f, 32.38f, 226.42f),
                    PathNode.CurveTo(31.040709f, 222.20883f, 33.368828f, 217.70929f, 37.58f, 216.37f),
                    PathNode.LineTo(101.58f, 196.0f),
                    PathNode.LineTo(37.58f, 175.62f),
                    PathNode.CurveTo(34.778465f, 174.81807f, 32.63458f, 172.55623f, 31.98369f, 169.71579f),
                    PathNode.CurveTo(31.3328f, 166.87537f, 32.277874f, 163.90569f, 34.450672f, 161.96387f),
                    PathNode.CurveTo(36.62347f, 160.02206f, 39.680267f, 159.4153f, 42.43f, 160.38f),
                    PathNode.LineTo(128.0f, 187.6f),
                    PathNode.LineTo(213.57f, 160.38f),
                    PathNode.CurveTo(216.31973f, 159.4153f, 219.37653f, 160.02206f, 221.54933f, 161.96387f),
                    PathNode.CurveTo(223.72212f, 163.90569f, 224.6672f, 166.87537f, 224.0163f, 169.71579f),
                    PathNode.CurveTo(223.36542f, 172.55623f, 221.22153f, 174.81807f, 218.42f, 175.62f),
                    PathNode.LineTo(154.42f, 196.0f),
                    PathNode.LineTo(218.42f, 216.37f),
                    PathNode.CurveTo(220.44249f, 217.01285f, 222.12668f, 218.43295f, 223.10191f, 220.3178f),
                    PathNode.CurveTo(224.07715f, 222.20262f, 224.26352f, 224.39774f, 223.62f, 226.42f),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
