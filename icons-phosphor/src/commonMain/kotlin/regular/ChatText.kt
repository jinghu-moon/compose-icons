package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorRegularIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 224.0f),
                    PathNode.CurveTo(23.963074f, 230.22911f, 27.57827f, 235.90231f, 33.24f, 238.5f),
                    PathNode.CurveTo(35.358177f, 239.48347f, 37.664646f, 239.99527f, 40.0f, 240.0f),
                    PathNode.CurveTo(43.75604f, 239.99104f, 47.38747f, 238.65184f, 50.25f, 236.22f),
                    PathNode.LineTo(50.34f, 236.15f),
                    PathNode.LineTo(83.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(78.079094f, 192.00102f, 76.22269f, 192.69319f, 74.77f, 193.95f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(164.41827f, 104.0f, 168.0f, 107.58172f, 168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 116.41828f, 164.41827f, 120.0f, 160.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(164.41827f, 136.0f, 168.0f, 139.58173f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 148.41827f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
