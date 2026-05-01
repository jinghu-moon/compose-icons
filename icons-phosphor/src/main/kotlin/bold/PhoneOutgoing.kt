package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorBoldIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(143.52f, 112.48f),
                    PathNode.CurveTo(141.26054f, 110.22838f, 139.99054f, 107.169815f, 139.99054f, 103.98f),
                    PathNode.CurveTo(139.99054f, 100.790184f, 141.26054f, 97.73162f, 143.52f, 95.48f),
                    PathNode.LineTo(171.0f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(153.37259f, 68.0f, 148.0f, 62.62742f, 148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 49.37258f, 153.37259f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(206.62741f, 44.0f, 212.0f, 49.37258f, 212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0f, 102.62742f, 206.62741f, 108.0f, 200.0f, 108.0f),
                    PathNode.CurveTo(193.37259f, 108.0f, 188.0f, 102.62742f, 188.0f, 96.0f),
                    PathNode.LineTo(188.0f, 85.0f),
                    PathNode.LineTo(160.49f, 112.51f),
                    PathNode.CurveTo(158.23837f, 114.769455f, 155.17982f, 116.03946f, 151.99f, 116.03946f),
                    PathNode.CurveTo(148.80019f, 116.03946f, 145.74162f, 114.769455f, 143.49f, 112.51f),
                    PathNode.Close,
                    PathNode.MoveTo(227.85f, 183.58f),
                    PathNode.CurveTo(223.90518f, 213.60939f, 198.28735f, 236.04695f, 168.0f, 236.0f),
                    PathNode.CurveTo(86.39f, 236.0f, 20.0f, 169.61f, 20.0f, 88.0f),
                    PathNode.CurveTo(19.953066f, 57.712643f, 42.390602f, 32.094814f, 72.42f, 28.15f),
                    PathNode.CurveTo(81.20247f, 27.082806f, 89.64635f, 31.898012f, 93.2f, 40.0f),
                    PathNode.LineTo(114.31f, 87.13f),
                    PathNode.CurveTo(114.332466f, 87.19179f, 114.3592f, 87.25192f, 114.39f, 87.31f),
                    PathNode.CurveTo(117.024956f, 93.4686f, 116.40179f, 100.537384f, 112.73f, 106.14f),
                    PathNode.CurveTo(112.4727f, 106.54191f, 112.18873f, 106.92611f, 111.88f, 107.29f),
                    PathNode.LineTo(92.82f, 130.0f),
                    PathNode.CurveTo(99.88f, 142.84f, 113.32f, 156.16f, 126.31f, 163.21f),
                    PathNode.LineTo(148.62f, 144.21f),
                    PathNode.CurveTo(148.97807f, 143.9102f, 149.35193f, 143.6298f, 149.74f, 143.37f),
                    PathNode.CurveTo(155.36496f, 139.5956f, 162.52304f, 138.94006f, 168.74f, 141.63f),
                    PathNode.LineTo(168.92f, 141.71f),
                    PathNode.LineTo(216.0f, 162.8f),
                    PathNode.CurveTo(224.09969f, 166.35622f, 228.9138f, 174.79822f, 227.85f, 183.58f),
                    PathNode.Close,
                    PathNode.MoveTo(203.54f, 183.52f),
                    PathNode.LineTo(161.54f, 164.71f),
                    PathNode.LineTo(139.11f, 183.78f),
                    PathNode.CurveTo(138.75739f, 184.08534f, 138.3867f, 184.36919f, 138.0f, 184.63f),
                    PathNode.CurveTo(132.1348f, 188.51903f, 124.657265f, 189.0393f, 118.31f, 186.0f),
                    PathNode.CurveTo(98.83f, 176.6f, 79.42f, 157.32f, 70.0f, 138.0f),
                    PathNode.CurveTo(66.953026f, 131.68184f, 67.438736f, 124.229225f, 71.28f, 118.36f),
                    PathNode.CurveTo(71.54072f, 117.95792f, 71.828026f, 117.57374f, 72.14f, 117.21f),
                    PathNode.LineTo(91.3f, 94.5f),
                    PathNode.LineTo(72.48f, 52.5f),
                    PathNode.CurveTo(55.824f, 56.170536f, 43.971638f, 70.944374f, 44.0f, 88.0f),
                    PathNode.CurveTo(44.082653f, 156.44905f, 99.55096f, 211.91734f, 168.0f, 212.0f),
                    PathNode.CurveTo(185.0706f, 212.0472f, 199.86627f, 200.19067f, 203.54f, 183.52f),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
