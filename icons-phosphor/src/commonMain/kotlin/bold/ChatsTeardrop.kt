package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) return _chatsTeardrop!!
        _chatsTeardrop = phosphorBoldIcon(
            name = "ChatsTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.29f, 68.9f),
                    PathNode.CurveTo(155.78096f, 33.07308f, 116.566154f, 13.5605f, 78.031586f, 21.998728f),
                    PathNode.CurveTo(39.497013f, 30.436954f, 12.025557f, 64.55236f, 12.0f, 104.0f),
                    PathNode.LineTo(12.0f, 168.0f),
                    PathNode.CurveTo(12.0f, 179.0457f, 20.954306f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(84.1f, 188.0f),
                    PathNode.CurveTo(98.04011f, 217.28601f, 127.56552f, 235.9582f, 160.0f, 236.0f),
                    PathNode.LineTo(224.0f, 236.0f),
                    PathNode.CurveTo(235.0457f, 236.0f, 244.0f, 227.0457f, 244.0f, 216.0f),
                    PathNode.LineTo(244.0f, 152.0f),
                    PathNode.CurveTo(244.00195f, 110.35338f, 213.48846f, 74.99329f, 172.29f, 68.9f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 70.862915f, 62.862915f, 44.0f, 96.0f, 44.0f),
                    PathNode.CurveTo(129.13708f, 44.0f, 156.0f, 70.862915f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 137.13708f, 129.13708f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(36.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(140.52202f, 211.97731f, 122.26121f, 202.52269f, 111.0f, 186.63f),
                    PathNode.CurveTo(154.24757f, 178.81766f, 184.14569f, 138.96658f, 179.55f, 95.26f),
                    PathNode.CurveTo(203.75984f, 103.603714f, 220.00613f, 126.3927f, 220.0f, 152.0f),
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
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
