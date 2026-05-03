package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorDuotoneIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 180.41827f, 236.41827f, 184.0f, 232.0f, 184.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(19.581722f, 184.0f, 16.0f, 180.41827f, 16.0f, 176.0f),
                    PathNode.LineTo(16.0f, 80.0f),
                    PathNode.CurveTo(16.0f, 75.58172f, 19.581722f, 72.0f, 24.0f, 72.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(236.41827f, 72.0f, 240.0f, 75.58172f, 240.0f, 80.0f),
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
                    PathNode.MoveTo(112.0f, 40.0f),
                    PathNode.CurveTo(107.58172f, 40.0f, 104.0f, 43.581722f, 104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(15.163444f, 64.0f, 8.0f, 71.163445f, 8.0f, 80.0f),
                    PathNode.LineTo(8.0f, 176.0f),
                    PathNode.CurveTo(8.0f, 184.83656f, 15.163444f, 192.0f, 24.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(116.41828f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 43.581722f, 116.41828f, 40.0f, 112.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 80.0f),
                    PathNode.LineTo(248.0f, 176.0f),
                    PathNode.CurveTo(248.0f, 184.83656f, 240.83656f, 192.0f, 232.0f, 192.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(139.58173f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 179.58173f, 139.58173f, 176.0f, 144.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 139.58173f, 64.0f, 144.0f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(240.83656f, 64.0f, 248.0f, 71.163445f, 248.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 116.41828f, 84.41828f, 120.0f, 80.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 148.41827f, 68.41828f, 152.0f, 64.0f, 152.0f),
                    PathNode.CurveTo(59.581722f, 152.0f, 56.0f, 148.41827f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 116.41828f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 107.58172f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(84.41828f, 104.0f, 88.0f, 107.58172f, 88.0f, 112.0f),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
