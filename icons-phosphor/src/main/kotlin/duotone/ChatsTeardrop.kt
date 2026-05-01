package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorDuotoneIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 216.0f),
                    PathNode.CurveTo(232.0f, 220.41827f, 228.41827f, 224.0f, 224.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(129.48111f, 224.00752f, 102.272964f, 204.77348f, 92.1f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(135.7645f, 176.0f, 168.0f, 143.7645f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.00504f, 95.86699f, 166.6288f, 87.79218f, 163.93f, 80.12f),
                    PathNode.LineTo(163.93f, 80.12f),
                    PathNode.CurveTo(202.10564f, 82.20686f, 231.99327f, 113.76738f, 232.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(169.57f, 72.59f),
                    PathNode.CurveTo(154.64432f, 37.645718f, 117.19701f, 18.022135f, 79.9693f, 25.636396f),
                    PathNode.CurveTo(42.7416f, 33.250656f, 16.006552f, 66.001595f, 16.0f, 104.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 176.83656f, 23.163445f, 184.0f, 32.0f, 184.0f),
                    PathNode.LineTo(86.67f, 184.0f),
                    PathNode.CurveTo(99.42623f, 213.13083f, 128.19867f, 231.96454f, 160.0f, 232.0f),
                    PathNode.LineTo(224.0f, 232.0f),
                    PathNode.CurveTo(232.83656f, 232.0f, 240.0f, 224.83656f, 240.0f, 216.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(239.99214f, 111.52458f, 209.75479f, 77.43187f, 169.57f, 72.59f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 68.65378f, 60.653774f, 40.0f, 96.0f, 40.0f),
                    PathNode.CurveTo(131.34622f, 40.0f, 160.0f, 68.65378f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 139.34622f, 131.34622f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(136.96284f, 215.97371f, 115.70927f, 203.59488f, 104.32f, 183.57f),
                    PathNode.CurveTo(126.471f, 181.2714f, 146.6587f, 169.8357f, 160.01886f, 152.01837f),
                    PathNode.CurveTo(173.37901f, 134.20103f, 178.70009f, 111.61776f, 174.7f, 89.71f),
                    PathNode.CurveTo(203.59016f, 96.52799f, 224.0005f, 122.31623f, 224.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
