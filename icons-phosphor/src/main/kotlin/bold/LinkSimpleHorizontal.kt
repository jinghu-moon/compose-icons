package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorBoldIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 116.0f),
                    PathNode.LineTo(176.0f, 116.0f),
                    PathNode.CurveTo(182.62741f, 116.0f, 188.0f, 121.37258f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 134.62741f, 182.62741f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(73.37258f, 140.0f, 68.0f, 134.62741f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 121.37258f, 73.37258f, 116.0f, 80.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 164.0f),
                    PathNode.LineTo(64.0f, 164.0f),
                    PathNode.CurveTo(44.11775f, 164.0f, 28.0f, 147.88223f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 108.11775f, 44.11775f, 92.0f, 64.0f, 92.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(110.62742f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 110.62742f, 68.0f, 104.0f, 68.0f),
                    PathNode.LineTo(64.0f, 68.0f),
                    PathNode.CurveTo(30.862917f, 68.0f, 4.0f, 94.862915f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 161.13708f, 30.862917f, 188.0f, 64.0f, 188.0f),
                    PathNode.LineTo(104.0f, 188.0f),
                    PathNode.CurveTo(110.62742f, 188.0f, 116.0f, 182.62741f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 169.37259f, 110.62742f, 164.0f, 104.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(145.37259f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 145.37259f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(192.0f, 92.0f),
                    PathNode.CurveTo(211.88223f, 92.0f, 228.0f, 108.11775f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 147.88223f, 211.88223f, 164.0f, 192.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(145.37259f, 164.0f, 140.0f, 169.37259f, 140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 182.62741f, 145.37259f, 188.0f, 152.0f, 188.0f),
                    PathNode.LineTo(192.0f, 188.0f),
                    PathNode.CurveTo(225.13708f, 188.0f, 252.0f, 161.13708f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 94.862915f, 225.13708f, 68.0f, 192.0f, 68.0f),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
