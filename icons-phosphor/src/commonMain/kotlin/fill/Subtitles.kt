package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorFillIcon(
            name = "Subtitles",
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
                    PathNode.MoveTo(56.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(76.41828f, 128.0f, 80.0f, 131.58173f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 140.41827f, 76.41828f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 140.41827f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 131.58173f, 51.581722f, 128.0f, 56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(51.581722f, 176.0f, 48.0f, 172.41827f, 48.0f, 168.0f),
                    PathNode.CurveTo(48.0f, 163.58173f, 51.581722f, 160.0f, 56.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(156.41827f, 160.0f, 160.0f, 163.58173f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 172.41827f, 156.41827f, 176.0f, 152.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(179.58173f, 176.0f, 176.0f, 172.41827f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 163.58173f, 179.58173f, 160.0f, 184.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(204.41827f, 160.0f, 208.0f, 163.58173f, 208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 172.41827f, 204.41827f, 176.0f, 200.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(99.58172f, 144.0f, 96.0f, 140.41827f, 96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 131.58173f, 99.58172f, 128.0f, 104.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(204.41827f, 128.0f, 208.0f, 131.58173f, 208.0f, 136.0f),
                    PathNode.CurveTo(208.0f, 140.41827f, 204.41827f, 144.0f, 200.0f, 144.0f),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
