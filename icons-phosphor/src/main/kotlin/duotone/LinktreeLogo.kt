package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorDuotoneIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 148.18279f, 172.18279f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(83.81722f, 184.0f, 48.0f, 148.18279f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 59.81722f, 83.81722f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(172.18279f, 24.0f, 208.0f, 59.81722f, 208.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 155.58173f, 123.58172f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 155.58173f, 136.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(147.31f, 96.0f),
                    PathNode.LineTo(189.66f, 53.66f),
                    PathNode.CurveTo(192.78593f, 50.53407f, 192.78593f, 45.46593f, 189.66f, 42.34f),
                    PathNode.CurveTo(186.53407f, 39.21407f, 181.46593f, 39.21407f, 178.34f, 42.34f),
                    PathNode.LineTo(136.0f, 84.69f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 84.69f),
                    PathNode.LineTo(77.66f, 42.34f),
                    PathNode.CurveTo(74.534065f, 39.21407f, 69.465935f, 39.21407f, 66.34f, 42.34f),
                    PathNode.CurveTo(63.21407f, 45.46593f, 63.21407f, 50.53407f, 66.34f, 53.66f),
                    PathNode.LineTo(108.69f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(43.581722f, 96.0f, 40.0f, 99.58172f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 108.41828f, 43.581722f, 112.0f, 48.0f, 112.0f),
                    PathNode.LineTo(108.69f, 112.0f),
                    PathNode.LineTo(66.34f, 154.34f),
                    PathNode.CurveTo(63.21407f, 157.46593f, 63.21407f, 162.53407f, 66.34f, 165.66f),
                    PathNode.CurveTo(69.465935f, 168.78593f, 74.534065f, 168.78593f, 77.66f, 165.66f),
                    PathNode.LineTo(128.0f, 115.31f),
                    PathNode.LineTo(178.34f, 165.66f),
                    PathNode.CurveTo(181.46593f, 168.78593f, 186.53407f, 168.78593f, 189.66f, 165.66f),
                    PathNode.CurveTo(192.78593f, 162.53407f, 192.78593f, 157.46593f, 189.66f, 154.34f),
                    PathNode.LineTo(147.31f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(212.41827f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
