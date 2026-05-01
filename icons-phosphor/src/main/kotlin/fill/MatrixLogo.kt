package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorFillIcon(
            name = "MatrixLogo",
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
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 59.581722f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(84.41828f, 56.0f, 88.0f, 59.581722f, 88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 68.41828f, 84.41828f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(84.41828f, 184.0f, 88.0f, 187.58173f, 88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 196.41827f, 84.41828f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.CurveTo(155.58173f, 160.0f, 152.0f, 156.41827f, 152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(152.0f, 115.58172f, 148.41827f, 112.0f, 144.0f, 112.0f),
                    PathNode.CurveTo(139.58173f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 156.41827f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 115.58172f, 116.41828f, 112.0f, 112.0f, 112.0f),
                    PathNode.CurveTo(107.58172f, 112.0f, 104.0f, 115.58172f, 104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 156.41827f, 100.41828f, 160.0f, 96.0f, 160.0f),
                    PathNode.CurveTo(91.58172f, 160.0f, 88.0f, 156.41827f, 88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.CurveTo(88.001495f, 100.76417f, 89.95215f, 97.847885f, 92.9423f, 96.61111f),
                    PathNode.CurveTo(95.93245f, 95.37434f, 99.37319f, 96.060646f, 101.66f, 98.35f),
                    PathNode.CurveTo(110.39616f, 94.164986f, 120.79335f, 95.65707f, 128.0f, 102.13f),
                    PathNode.CurveTo(135.05186f, 95.82262f, 145.15128f, 94.24672f, 153.7895f, 98.10585f),
                    PathNode.CurveTo(162.42773f, 101.96498f, 167.99269f, 110.53893f, 168.0f, 120.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 164.41827f, 160.0f, 160.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 196.41827f, 196.41827f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(171.58173f, 200.0f, 168.0f, 196.41827f, 168.0f, 192.0f),
                    PathNode.CurveTo(168.0f, 187.58173f, 171.58173f, 184.0f, 176.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(171.58173f, 72.0f, 168.0f, 68.41828f, 168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 59.581722f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 59.581722f, 200.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
