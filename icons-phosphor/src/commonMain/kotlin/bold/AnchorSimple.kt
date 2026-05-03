package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorBoldIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 108.0f),
                    PathNode.LineTo(200.0f, 108.0f),
                    PathNode.CurveTo(193.37259f, 108.0f, 188.0f, 113.37258f, 188.0f, 120.0f),
                    PathNode.CurveTo(188.0f, 126.62742f, 193.37259f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(211.15f, 132.0f),
                    PathNode.CurveTo(205.76353f, 168.83257f, 176.83333f, 197.75871f, 140.0f, 203.14f),
                    PathNode.LineTo(140.0f, 97.94f),
                    PathNode.CurveTo(156.53056f, 92.095566f, 166.44649f, 75.19201f, 163.48155f, 57.9112f),
                    PathNode.CurveTo(160.51665f, 40.6304f, 145.53331f, 27.998875f, 128.0f, 27.998875f),
                    PathNode.CurveTo(110.46669f, 27.998875f, 95.48337f, 40.6304f, 92.518456f, 57.9112f),
                    PathNode.CurveTo(89.553535f, 75.19201f, 99.46944f, 92.095566f, 116.0f, 97.94f),
                    PathNode.LineTo(116.0f, 203.14f),
                    PathNode.CurveTo(79.16667f, 197.75871f, 50.236465f, 168.83257f, 44.85f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(62.62742f, 132.0f, 68.0f, 126.62742f, 68.0f, 120.0f),
                    PathNode.CurveTo(68.0f, 113.37258f, 62.62742f, 108.0f, 56.0f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(25.372583f, 108.0f, 20.0f, 113.37258f, 20.0f, 120.0f),
                    PathNode.CurveTo(20.0f, 179.64676f, 68.35325f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(187.64676f, 228.0f, 236.0f, 179.64676f, 236.0f, 120.0f),
                    PathNode.CurveTo(236.0f, 113.37258f, 230.62741f, 108.0f, 224.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 52.0f),
                    PathNode.CurveTo(134.62741f, 52.0f, 140.0f, 57.37258f, 140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 70.62742f, 134.62741f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(121.37258f, 76.0f, 116.0f, 70.62742f, 116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 57.37258f, 121.37258f, 52.0f, 128.0f, 52.0f),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
