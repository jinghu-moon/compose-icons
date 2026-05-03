package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextAlignRight: ImageVector
    get() {
        if (_textAlignRight != null) return _textAlignRight!!
        _textAlignRight = phosphorDuotoneIcon(
            name = "TextAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.CurveTo(47.163445f, 184.0f, 40.0f, 176.83656f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(83.58172f, 96.0f, 80.0f, 99.58172f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 108.41828f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(220.41827f, 112.0f, 224.0f, 108.41828f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 99.58172f, 220.41827f, 96.0f, 216.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 139.58173f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 148.41827f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 148.41827f, 224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 139.58173f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(83.58172f, 176.0f, 80.0f, 179.58173f, 80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 188.41827f, 83.58172f, 192.0f, 88.0f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(220.41827f, 192.0f, 224.0f, 188.41827f, 224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 179.58173f, 220.41827f, 176.0f, 216.0f, 176.0f),
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
        return _textAlignRight!!
    }

private var _textAlignRight: ImageVector? = null
