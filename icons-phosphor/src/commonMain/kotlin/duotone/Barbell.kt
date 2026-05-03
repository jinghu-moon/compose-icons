package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorDuotoneIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 92.41828f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 59.581722f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(92.41828f, 56.0f, 96.0f, 59.581722f, 96.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(163.58173f, 56.0f, 160.0f, 59.581722f, 160.0f, 64.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(160.0f, 196.41827f, 163.58173f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(196.41827f, 200.0f, 200.0f, 196.41827f, 200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(200.0f, 59.581722f, 196.41827f, 56.0f, 192.0f, 56.0f),
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
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 79.163445f, 232.83656f, 72.0f, 224.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 55.163445f, 200.83656f, 48.0f, 192.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(159.16344f, 48.0f, 152.0f, 55.163445f, 152.0f, 64.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(104.0f, 55.163445f, 96.836555f, 48.0f, 88.0f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(55.163445f, 48.0f, 48.0f, 55.163445f, 48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(23.163445f, 72.0f, 16.0f, 79.163445f, 16.0f, 88.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(3.581722f, 120.0f, 0f, 123.58172f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 132.41827f, 3.581722f, 136.0f, 8.0f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 176.83656f, 23.163445f, 184.0f, 32.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(48.0f, 200.83656f, 55.163445f, 208.0f, 64.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(96.836555f, 208.0f, 104.0f, 200.83656f, 104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(152.0f, 200.83656f, 159.16344f, 208.0f, 168.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(200.83656f, 208.0f, 208.0f, 200.83656f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(232.83656f, 184.0f, 240.0f, 176.83656f, 240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(252.41827f, 136.0f, 256.0f, 132.41827f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 123.58172f, 252.41827f, 120.0f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 168.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 175.83f),
                    PathNode.CurveTo(192.0f, 175.89f, 192.0f, 175.94f, 192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 176.06f, 192.0f, 176.12f, 192.0f, 176.17f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
