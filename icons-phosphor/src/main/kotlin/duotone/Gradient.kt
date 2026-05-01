package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorDuotoneIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 64.0f),
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
                    PathNode.MoveTo(24.0f, 104.0f),
                    PathNode.CurveTo(24.0f, 99.58172f, 27.581722f, 96.0f, 32.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(116.41828f, 96.0f, 120.0f, 99.58172f, 120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 108.41828f, 116.41828f, 112.0f, 112.0f, 112.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(27.581722f, 112.0f, 24.0f, 108.41828f, 24.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.CurveTo(139.58173f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 108.41828f, 139.58173f, 112.0f, 144.0f, 112.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(228.41827f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 99.58172f, 228.41827f, 96.0f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(27.581722f, 136.0f, 24.0f, 139.58173f, 24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 148.41827f, 27.581722f, 152.0f, 32.0f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.CurveTo(76.41828f, 152.0f, 80.0f, 148.41827f, 80.0f, 144.0f),
                    PathNode.CurveTo(80.0f, 139.58173f, 76.41828f, 136.0f, 72.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(179.58173f, 136.0f, 176.0f, 139.58173f, 176.0f, 144.0f),
                    PathNode.CurveTo(176.0f, 148.41827f, 179.58173f, 152.0f, 184.0f, 152.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(228.41827f, 152.0f, 232.0f, 148.41827f, 232.0f, 144.0f),
                    PathNode.CurveTo(232.0f, 139.58173f, 228.41827f, 136.0f, 224.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.CurveTo(96.0f, 148.41827f, 99.58172f, 152.0f, 104.0f, 152.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(156.41827f, 152.0f, 160.0f, 148.41827f, 160.0f, 144.0f),
                    PathNode.CurveTo(160.0f, 139.58173f, 156.41827f, 136.0f, 152.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(99.58172f, 136.0f, 96.0f, 139.58173f, 96.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 179.58173f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 188.41827f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.CurveTo(60.418278f, 192.0f, 64.0f, 188.41827f, 64.0f, 184.0f),
                    PathNode.CurveTo(64.0f, 179.58173f, 60.418278f, 176.0f, 56.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.CurveTo(83.58172f, 176.0f, 80.0f, 179.58173f, 80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 188.41827f, 83.58172f, 192.0f, 88.0f, 192.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.CurveTo(116.41828f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 179.58173f, 116.41828f, 176.0f, 112.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 176.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(139.58173f, 176.0f, 136.0f, 179.58173f, 136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 139.58173f, 192.0f, 144.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.CurveTo(172.41827f, 192.0f, 176.0f, 188.41827f, 176.0f, 184.0f),
                    PathNode.CurveTo(176.0f, 179.58173f, 172.41827f, 176.0f, 168.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(195.58173f, 176.0f, 192.0f, 179.58173f, 192.0f, 184.0f),
                    PathNode.CurveTo(192.0f, 188.41827f, 195.58173f, 192.0f, 200.0f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(228.41827f, 192.0f, 232.0f, 188.41827f, 232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 179.58173f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(228.41827f, 72.0f, 232.0f, 68.41828f, 232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 59.581722f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(27.581722f, 56.0f, 24.0f, 59.581722f, 24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 68.41828f, 27.581722f, 72.0f, 32.0f, 72.0f),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
