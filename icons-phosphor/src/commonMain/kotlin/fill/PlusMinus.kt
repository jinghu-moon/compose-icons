package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorFillIcon(
            name = "PlusMinus",
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
                    PathNode.MoveTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 91.58172f, 59.581722f, 88.0f, 64.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 67.58172f, 83.58172f, 64.0f, 88.0f, 64.0f),
                    PathNode.CurveTo(92.41828f, 64.0f, 96.0f, 67.58172f, 96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(116.41828f, 88.0f, 120.0f, 91.58172f, 120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 100.41828f, 116.41828f, 104.0f, 112.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 124.41828f, 92.41828f, 128.0f, 88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 124.41828f, 80.0f, 120.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(59.581722f, 104.0f, 56.0f, 100.41828f, 56.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 192.0f),
                    PathNode.CurveTo(76.762344f, 192.00255f, 73.84236f, 190.05338f, 72.60302f, 187.06232f),
                    PathNode.CurveTo(71.36368f, 184.07126f, 72.04936f, 180.6281f, 74.34f, 178.34f),
                    PathNode.LineTo(170.34f, 82.34f),
                    PathNode.CurveTo(173.46593f, 79.214066f, 178.53407f, 79.214066f, 181.66f, 82.34f),
                    PathNode.CurveTo(184.78593f, 85.465935f, 184.78593f, 90.534065f, 181.66f, 93.66f),
                    PathNode.LineTo(85.66f, 189.66f),
                    PathNode.CurveTo(84.158424f, 191.15993f, 82.12237f, 192.00166f, 80.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(139.58173f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 171.58173f, 139.58173f, 168.0f, 144.0f, 168.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(196.41827f, 168.0f, 200.0f, 171.58173f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 180.41827f, 196.41827f, 184.0f, 192.0f, 184.0f),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
