package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = phosphorBoldIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 70.62742f, 28.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(174.62741f, 116.0f, 180.0f, 110.62742f, 180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 97.37258f, 174.62741f, 92.0f, 168.0f, 92.0f),
                    PathNode.LineTo(40.0f, 92.0f),
                    PathNode.CurveTo(33.37258f, 92.0f, 28.0f, 97.37258f, 28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 110.62742f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(33.37258f, 132.0f, 28.0f, 137.37259f, 28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 150.62741f, 33.37258f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(222.62741f, 156.0f, 228.0f, 150.62741f, 228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 137.37259f, 222.62741f, 132.0f, 216.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(33.37258f, 172.0f, 28.0f, 177.37259f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 190.62741f, 33.37258f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(174.62741f, 196.0f, 180.0f, 190.62741f, 180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 177.37259f, 174.62741f, 172.0f, 168.0f, 172.0f),
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
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
