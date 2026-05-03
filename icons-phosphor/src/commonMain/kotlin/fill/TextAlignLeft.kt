package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = phosphorFillIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 171.58173f, 59.581722f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(164.41827f, 168.0f, 168.0f, 171.58173f, 168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 180.41827f, 164.41827f, 184.0f, 160.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.CurveTo(59.581722f, 152.0f, 56.0f, 148.41827f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 139.58173f, 59.581722f, 136.0f, 64.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(196.41827f, 136.0f, 200.0f, 139.58173f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 148.41827f, 196.41827f, 152.0f, 192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 107.58172f, 59.581722f, 104.0f, 64.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(164.41827f, 104.0f, 168.0f, 107.58172f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 116.41828f, 164.41827f, 120.0f, 160.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(59.581722f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(59.581722f, 88.0f, 56.0f, 84.41828f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 75.58172f, 59.581722f, 72.0f, 64.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 84.41828f, 196.41827f, 88.0f, 192.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
