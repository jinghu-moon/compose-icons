package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorBoldIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 154.8f),
                    PathNode.LineTo(176.91f, 133.69f),
                    PathNode.LineTo(176.73f, 133.61f),
                    PathNode.CurveTo(170.51047f, 130.92868f, 163.35512f, 131.58772f, 157.73f, 135.36f),
                    PathNode.CurveTo(157.34193f, 135.61981f, 156.96806f, 135.9002f, 156.61f, 136.2f),
                    PathNode.LineTo(134.3f, 155.2f),
                    PathNode.CurveTo(121.3f, 148.15f, 107.87f, 134.83f, 100.81f, 121.99f),
                    PathNode.LineTo(119.87f, 99.33f),
                    PathNode.CurveTo(120.1764f, 98.964264f, 120.46026f, 98.58022f, 120.72f, 98.18f),
                    PathNode.CurveTo(124.391785f, 92.577385f, 125.01495f, 85.5086f, 122.38f, 79.35f),
                    PathNode.CurveTo(122.3492f, 79.29192f, 122.32247f, 79.23178f, 122.3f, 79.17f),
                    PathNode.LineTo(101.2f, 32.0f),
                    PathNode.CurveTo(97.64378f, 23.900322f, 89.20179f, 19.08619f, 80.42f, 20.15f),
                    PathNode.CurveTo(50.390602f, 24.094812f, 27.953066f, 49.712643f, 28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 161.61f, 94.39f, 228.0f, 176.0f, 228.0f),
                    PathNode.CurveTo(206.28735f, 228.04695f, 231.90518f, 205.60939f, 235.85f, 175.58f),
                    PathNode.CurveTo(236.9138f, 166.79822f, 232.09969f, 158.35622f, 224.0f, 154.8f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 204.0f),
                    PathNode.CurveTo(107.55096f, 203.91734f, 52.082653f, 148.44905f, 52.0f, 80.0f),
                    PathNode.CurveTo(51.952805f, 62.929398f, 63.809326f, 48.133728f, 80.48f, 44.46f),
                    PathNode.LineTo(99.3f, 86.46f),
                    PathNode.LineTo(80.14f, 109.28f),
                    PathNode.CurveTo(79.83031f, 109.649055f, 79.54312f, 110.03642f, 79.28f, 110.44f),
                    PathNode.CurveTo(75.438736f, 116.30923f, 74.953026f, 123.76185f, 78.0f, 130.08f),
                    PathNode.CurveTo(87.42f, 149.36f, 106.83f, 168.64f, 126.31f, 178.08f),
                    PathNode.CurveTo(132.67111f, 181.09567f, 140.14926f, 180.54495f, 146.0f, 176.63f),
                    PathNode.CurveTo(146.3867f, 176.36919f, 146.75739f, 176.08534f, 147.11f, 175.78f),
                    PathNode.LineTo(169.54f, 156.71f),
                    PathNode.LineTo(211.54f, 175.52f),
                    PathNode.CurveTo(207.86627f, 192.19067f, 193.0706f, 204.0472f, 176.0f, 204.0f),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
