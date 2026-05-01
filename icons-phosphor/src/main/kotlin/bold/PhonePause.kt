package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorBoldIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 162.8f),
                    PathNode.LineTo(168.91f, 141.7f),
                    PathNode.LineTo(168.73f, 141.62f),
                    PathNode.CurveTo(162.51366f, 138.92628f, 155.35367f, 139.58199f, 149.73f, 143.36f),
                    PathNode.CurveTo(149.34193f, 143.61981f, 148.96806f, 143.9002f, 148.61f, 144.2f),
                    PathNode.LineTo(126.3f, 163.2f),
                    PathNode.CurveTo(113.3f, 156.15f, 99.87f, 142.83f, 92.81f, 129.99f),
                    PathNode.LineTo(111.87f, 107.33f),
                    PathNode.CurveTo(112.178734f, 106.9661f, 112.46269f, 106.58191f, 112.72f, 106.18f),
                    PathNode.CurveTo(116.391785f, 100.577385f, 117.01495f, 93.5086f, 114.38f, 87.35f),
                    PathNode.LineTo(114.3f, 87.17f),
                    PathNode.LineTo(93.2f, 40.0f),
                    PathNode.CurveTo(89.64378f, 31.900322f, 81.20179f, 27.08619f, 72.42f, 28.15f),
                    PathNode.CurveTo(42.390602f, 32.094814f, 19.953066f, 57.712643f, 20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 169.61f, 86.39f, 236.0f, 168.0f, 236.0f),
                    PathNode.CurveTo(198.28735f, 236.04695f, 223.90518f, 213.60939f, 227.85f, 183.58f),
                    PathNode.CurveTo(228.9138f, 174.79822f, 224.09969f, 166.35622f, 216.0f, 162.8f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 212.0f),
                    PathNode.CurveTo(99.55096f, 211.91734f, 44.082653f, 156.44905f, 44.0f, 88.0f),
                    PathNode.CurveTo(43.949924f, 70.93049f, 55.80875f, 56.1361f, 72.48f, 52.47f),
                    PathNode.LineTo(91.3f, 94.47f),
                    PathNode.LineTo(72.14f, 117.27f),
                    PathNode.CurveTo(71.828026f, 117.633736f, 71.54072f, 118.01793f, 71.28f, 118.42f),
                    PathNode.CurveTo(67.43128f, 124.29411f, 66.945435f, 131.75644f, 70.0f, 138.08f),
                    PathNode.CurveTo(79.42f, 157.36f, 98.83f, 176.64f, 118.31f, 186.08f),
                    PathNode.CurveTo(124.67112f, 189.09567f, 132.14926f, 188.54495f, 138.0f, 184.63f),
                    PathNode.CurveTo(138.3867f, 184.36919f, 138.75739f, 184.08534f, 139.11f, 183.78f),
                    PathNode.LineTo(161.54f, 164.71f),
                    PathNode.LineTo(203.54f, 183.52f),
                    PathNode.CurveTo(199.86627f, 200.19067f, 185.0706f, 212.0472f, 168.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 104.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 41.37258f, 193.37259f, 36.0f, 200.0f, 36.0f),
                    PathNode.CurveTo(206.62741f, 36.0f, 212.0f, 41.37258f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 110.62742f, 206.62741f, 116.0f, 200.0f, 116.0f),
                    PathNode.CurveTo(193.37259f, 116.0f, 188.0f, 110.62742f, 188.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 104.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 41.37258f, 153.37259f, 36.0f, 160.0f, 36.0f),
                    PathNode.CurveTo(166.62741f, 36.0f, 172.0f, 41.37258f, 172.0f, 48.0f),
                    PathNode.LineTo(172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 110.62742f, 166.62741f, 116.0f, 160.0f, 116.0f),
                    PathNode.CurveTo(153.37259f, 116.0f, 148.0f, 110.62742f, 148.0f, 104.0f),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
