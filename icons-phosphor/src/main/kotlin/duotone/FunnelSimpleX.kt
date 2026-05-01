package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FunnelSimpleX: ImageVector
    get() {
        if (_funnelSimpleX != null) return _funnelSimpleX!!
        _funnelSimpleX = phosphorDuotoneIcon(
            name = "FunnelSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
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
                    PathNode.MoveTo(192.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 140.41827f, 56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 131.58173f, 59.581722f, 128.0f, 64.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(196.41827f, 128.0f, 200.0f, 131.58173f, 200.0f, 136.0f),
                    PathNode.CurveTo(200.0f, 140.41827f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(19.581722f, 80.0f, 16.0f, 83.58172f, 16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 92.41828f, 19.581722f, 96.0f, 24.0f, 96.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(236.41827f, 96.0f, 240.0f, 92.41828f, 240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 83.58172f, 236.41827f, 80.0f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.CurveTo(99.58172f, 176.0f, 96.0f, 179.58173f, 96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 188.41827f, 99.58172f, 192.0f, 104.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.CurveTo(132.41827f, 192.0f, 136.0f, 188.41827f, 136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 179.58173f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.66f, 170.34f),
                    PathNode.CurveTo(220.15945f, 168.83777f, 218.12328f, 167.99371f, 216.0f, 167.99371f),
                    PathNode.CurveTo(213.87672f, 167.99371f, 211.84055f, 168.83777f, 210.34f, 170.34f),
                    PathNode.LineTo(192.0f, 188.69f),
                    PathNode.LineTo(173.66f, 170.34f),
                    PathNode.CurveTo(170.53407f, 167.21407f, 165.46593f, 167.21407f, 162.34f, 170.34f),
                    PathNode.CurveTo(159.21407f, 173.46593f, 159.21407f, 178.53407f, 162.34f, 181.66f),
                    PathNode.LineTo(180.69f, 200.0f),
                    PathNode.LineTo(162.34f, 218.34f),
                    PathNode.CurveTo(159.21407f, 221.46593f, 159.21407f, 226.53407f, 162.34f, 229.66f),
                    PathNode.CurveTo(165.46593f, 232.78593f, 170.53407f, 232.78593f, 173.66f, 229.66f),
                    PathNode.LineTo(192.0f, 211.31f),
                    PathNode.LineTo(210.34f, 229.66f),
                    PathNode.CurveTo(213.46593f, 232.78593f, 218.53407f, 232.78593f, 221.66f, 229.66f),
                    PathNode.CurveTo(224.78593f, 226.53407f, 224.78593f, 221.46593f, 221.66f, 218.34f),
                    PathNode.LineTo(203.31f, 200.0f),
                    PathNode.LineTo(221.66f, 181.66f),
                    PathNode.CurveTo(223.16223f, 180.15945f, 224.00629f, 178.12328f, 224.00629f, 176.0f),
                    PathNode.CurveTo(224.00629f, 173.87672f, 223.16223f, 171.84055f, 221.66f, 170.34f),
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
        return _funnelSimpleX!!
    }

private var _funnelSimpleX: ImageVector? = null
