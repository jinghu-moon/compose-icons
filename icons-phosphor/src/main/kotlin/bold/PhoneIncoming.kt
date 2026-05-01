package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneIncoming: ImageVector
    get() {
        if (_phoneIncoming != null) return _phoneIncoming!!
        _phoneIncoming = phosphorBoldIcon(
            name = "PhoneIncoming",
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
                    PathNode.CurveTo(112.1764f, 106.964264f, 112.46026f, 106.58022f, 112.72f, 106.18f),
                    PathNode.CurveTo(116.391785f, 100.577385f, 117.01495f, 93.5086f, 114.38f, 87.35f),
                    PathNode.CurveTo(114.3492f, 87.29192f, 114.32247f, 87.23178f, 114.3f, 87.17f),
                    PathNode.LineTo(93.2f, 40.0f),
                    PathNode.CurveTo(89.64378f, 31.900322f, 81.20179f, 27.08619f, 72.42f, 28.15f),
                    PathNode.CurveTo(42.390602f, 32.094814f, 19.953066f, 57.712643f, 20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 169.61f, 86.39f, 236.0f, 168.0f, 236.0f),
                    PathNode.CurveTo(198.28735f, 236.04695f, 223.90518f, 213.60939f, 227.85f, 183.58f),
                    PathNode.CurveTo(228.9138f, 174.79822f, 224.09969f, 166.35622f, 216.0f, 162.8f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 212.0f),
                    PathNode.CurveTo(99.55096f, 211.91734f, 44.082653f, 156.44905f, 44.0f, 88.0f),
                    PathNode.CurveTo(43.952805f, 70.9294f, 55.809326f, 56.133728f, 72.48f, 52.46f),
                    PathNode.LineTo(91.3f, 94.46f),
                    PathNode.LineTo(72.14f, 117.28f),
                    PathNode.CurveTo(71.83031f, 117.649055f, 71.54312f, 118.03642f, 71.28f, 118.44f),
                    PathNode.CurveTo(67.438736f, 124.30923f, 66.953026f, 131.76184f, 70.0f, 138.08f),
                    PathNode.CurveTo(79.42f, 157.36f, 98.83f, 176.64f, 118.31f, 186.08f),
                    PathNode.CurveTo(124.67112f, 189.09567f, 132.14926f, 188.54495f, 138.0f, 184.63f),
                    PathNode.CurveTo(138.3867f, 184.36919f, 138.75739f, 184.08534f, 139.11f, 183.78f),
                    PathNode.LineTo(161.54f, 164.71f),
                    PathNode.LineTo(203.54f, 183.52f),
                    PathNode.CurveTo(199.86627f, 200.19067f, 185.0706f, 212.0472f, 168.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 57.37258f, 145.37259f, 52.0f, 152.0f, 52.0f),
                    PathNode.CurveTo(158.62741f, 52.0f, 164.0f, 57.37258f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 75.0f),
                    PathNode.LineTo(191.52f, 47.48f),
                    PathNode.CurveTo(196.21442f, 42.78558f, 203.82558f, 42.78558f, 208.52f, 47.48f),
                    PathNode.CurveTo(213.21442f, 52.17442f, 213.21442f, 59.78558f, 208.52f, 64.48f),
                    PathNode.LineTo(181.0f, 92.0f),
                    PathNode.LineTo(192.0f, 92.0f),
                    PathNode.CurveTo(198.62741f, 92.0f, 204.0f, 97.37258f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 110.62742f, 198.62741f, 116.0f, 192.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(145.37259f, 116.0f, 140.0f, 110.62742f, 140.0f, 104.0f),
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
        return _phoneIncoming!!
    }

private var _phoneIncoming: ImageVector? = null
