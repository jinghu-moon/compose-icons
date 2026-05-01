package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorDuotoneIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 64.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 196.41827f, 236.41827f, 200.0f, 232.0f, 200.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(19.581722f, 200.0f, 16.0f, 196.41827f, 16.0f, 192.0f),
                    PathNode.LineTo(16.0f, 64.0f),
                    PathNode.CurveTo(16.0f, 59.581722f, 19.581722f, 56.0f, 24.0f, 56.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(236.41827f, 56.0f, 240.0f, 59.581722f, 240.0f, 64.0f),
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
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(15.163444f, 48.0f, 8.0f, 55.163445f, 8.0f, 64.0f),
                    PathNode.LineTo(8.0f, 192.0f),
                    PathNode.CurveTo(8.0f, 200.83656f, 15.163444f, 208.0f, 24.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(240.83656f, 208.0f, 248.0f, 200.83656f, 248.0f, 192.0f),
                    PathNode.LineTo(248.0f, 64.0f),
                    PathNode.CurveTo(248.0f, 55.163445f, 240.83656f, 48.0f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.CurveTo(128.0f, 156.41827f, 124.41828f, 160.0f, 120.0f, 160.0f),
                    PathNode.CurveTo(115.58172f, 160.0f, 112.0f, 156.41827f, 112.0f, 152.0f),
                    PathNode.LineTo(112.0f, 123.31f),
                    PathNode.LineTo(93.66f, 141.66f),
                    PathNode.CurveTo(92.159454f, 143.16223f, 90.123276f, 144.00629f, 88.0f, 144.00629f),
                    PathNode.CurveTo(85.876724f, 144.00629f, 83.840546f, 143.16223f, 82.34f, 141.66f),
                    PathNode.LineTo(64.0f, 123.31f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.CurveTo(64.0f, 156.41827f, 60.418278f, 160.0f, 56.0f, 160.0f),
                    PathNode.CurveTo(51.581722f, 160.0f, 48.0f, 156.41827f, 48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.CurveTo(47.99745f, 100.762344f, 49.94662f, 97.84236f, 52.93768f, 96.60302f),
                    PathNode.CurveTo(55.928738f, 95.36368f, 59.371906f, 96.04936f, 61.66f, 98.34f),
                    PathNode.LineTo(88.0f, 124.69f),
                    PathNode.LineTo(114.34f, 98.34f),
                    PathNode.CurveTo(116.62809f, 96.04936f, 120.07126f, 95.36368f, 123.062325f, 96.60302f),
                    PathNode.CurveTo(126.05338f, 97.84236f, 128.00255f, 100.762344f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.66f, 122.34f),
                    PathNode.CurveTo(207.16223f, 123.840546f, 208.00629f, 125.876724f, 208.00629f, 128.0f),
                    PathNode.CurveTo(208.00629f, 130.12328f, 207.16223f, 132.15945f, 205.66f, 133.66f),
                    PathNode.LineTo(181.66f, 157.66f),
                    PathNode.CurveTo(180.15945f, 159.16223f, 178.12328f, 160.00629f, 176.0f, 160.00629f),
                    PathNode.CurveTo(173.87672f, 160.00629f, 171.84055f, 159.16223f, 170.34f, 157.66f),
                    PathNode.LineTo(146.34f, 133.66f),
                    PathNode.CurveTo(143.21407f, 130.53407f, 143.21407f, 125.465935f, 146.34f, 122.34f),
                    PathNode.CurveTo(149.46593f, 119.214066f, 154.53407f, 119.214066f, 157.66f, 122.34f),
                    PathNode.LineTo(168.0f, 132.69f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 99.58172f, 171.58173f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 132.69f),
                    PathNode.LineTo(194.34f, 122.34f),
                    PathNode.CurveTo(195.84055f, 120.83778f, 197.87672f, 119.993706f, 200.0f, 119.993706f),
                    PathNode.CurveTo(202.12328f, 119.993706f, 204.15945f, 120.83778f, 205.66f, 122.34f),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
