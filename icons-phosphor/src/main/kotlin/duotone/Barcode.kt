package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorDuotoneIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
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
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 92.41828f, 228.41827f, 96.0f, 224.0f, 96.0f),
                    PathNode.CurveTo(219.58173f, 96.0f, 216.0f, 92.41828f, 216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(179.58173f, 56.0f, 176.0f, 52.418278f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 43.581722f, 179.58173f, 40.0f, 184.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 163.58173f, 36.418278f, 160.0f, 32.0f, 160.0f),
                    PathNode.CurveTo(27.581722f, 160.0f, 24.0f, 163.58173f, 24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(76.41828f, 216.0f, 80.0f, 212.41827f, 80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 203.58173f, 76.41828f, 200.0f, 72.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(219.58173f, 160.0f, 216.0f, 163.58173f, 216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(179.58173f, 200.0f, 176.0f, 203.58173f, 176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 163.58173f, 228.41827f, 160.0f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.CurveTo(36.418278f, 96.0f, 40.0f, 92.41828f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.CurveTo(76.41828f, 56.0f, 80.0f, 52.418278f, 80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 43.581722f, 76.41828f, 40.0f, 72.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(27.581722f, 40.0f, 24.0f, 43.581722f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 92.41828f, 27.581722f, 96.0f, 32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.CurveTo(75.58172f, 80.0f, 72.0f, 83.58172f, 72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 172.41827f, 75.58172f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(84.41828f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 83.58172f, 84.41828f, 80.0f, 80.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 83.58172f, 180.41827f, 80.0f, 176.0f, 80.0f),
                    PathNode.CurveTo(171.58173f, 80.0f, 168.0f, 83.58172f, 168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 171.58173f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(180.41827f, 176.0f, 184.0f, 172.41827f, 184.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 80.0f),
                    PathNode.CurveTo(139.58173f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(136.0f, 172.41827f, 139.58173f, 176.0f, 144.0f, 176.0f),
                    PathNode.CurveTo(148.41827f, 176.0f, 152.0f, 172.41827f, 152.0f, 168.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 83.58172f, 148.41827f, 80.0f, 144.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 80.0f),
                    PathNode.CurveTo(107.58172f, 80.0f, 104.0f, 83.58172f, 104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 172.41827f, 107.58172f, 176.0f, 112.0f, 176.0f),
                    PathNode.CurveTo(116.41828f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 116.41828f, 80.0f, 112.0f, 80.0f),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
