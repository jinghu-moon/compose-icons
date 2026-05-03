package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = phosphorRegularIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 59.581722f, 35.581722f, 56.0f, 40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(35.581722f, 72.0f, 32.0f, 68.41828f, 32.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 108.41828f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 99.58172f, 172.41827f, 96.0f, 168.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(35.581722f, 96.0f, 32.0f, 99.58172f, 32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 108.41828f, 35.581722f, 112.0f, 40.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 139.58173f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 148.41827f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 148.41827f, 224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 139.58173f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(35.581722f, 176.0f, 32.0f, 179.58173f, 32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 188.41827f, 35.581722f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.CurveTo(172.41827f, 192.0f, 176.0f, 188.41827f, 176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 179.58173f, 172.41827f, 176.0f, 168.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
