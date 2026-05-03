package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorRegularIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 132.41827f, 204.41827f, 136.0f, 200.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 132.41827f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 51.581722f, 120.0f, 56.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(208.0f, 100.41828f, 204.41827f, 104.0f, 200.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(51.581722f, 104.0f, 48.0f, 100.41828f, 48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 91.58172f, 51.581722f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(204.41827f, 88.0f, 208.0f, 91.58172f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 160.0f),
                    PathNode.CurveTo(72.0f, 164.41827f, 68.41828f, 168.0f, 64.0f, 168.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(51.581722f, 168.0f, 48.0f, 164.41827f, 48.0f, 160.0f),
                    PathNode.CurveTo(48.0f, 155.58173f, 51.581722f, 152.0f, 56.0f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.CurveTo(68.41828f, 152.0f, 72.0f, 155.58173f, 72.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 164.41827f, 164.41827f, 168.0f, 160.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 164.41827f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 155.58173f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 155.58173f, 168.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.CurveTo(208.0f, 164.41827f, 204.41827f, 168.0f, 200.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(187.58173f, 168.0f, 184.0f, 164.41827f, 184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 155.58173f, 187.58173f, 152.0f, 192.0f, 152.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.CurveTo(204.41827f, 152.0f, 208.0f, 155.58173f, 208.0f, 160.0f),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
