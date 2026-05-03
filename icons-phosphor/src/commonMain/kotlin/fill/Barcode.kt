package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barcode: ImageVector
    get() {
        if (_barcode != null) return _barcode!!
        _barcode = phosphorFillIcon(
            name = "Barcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(27.581722f, 40.0f, 24.0f, 43.581722f, 24.0f, 48.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 43.581722f, 228.41827f, 40.0f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 64.0f),
                    PathNode.CurveTo(40.0f, 59.581722f, 43.581722f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(84.41828f, 56.0f, 88.0f, 59.581722f, 88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 68.41828f, 84.41828f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 100.41828f, 52.418278f, 104.0f, 48.0f, 104.0f),
                    PathNode.CurveTo(43.581722f, 104.0f, 40.0f, 100.41828f, 40.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 155.58173f, 43.581722f, 152.0f, 48.0f, 152.0f),
                    PathNode.CurveTo(52.418278f, 152.0f, 56.0f, 155.58173f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(84.41828f, 184.0f, 88.0f, 187.58173f, 88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 196.41827f, 84.41828f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 156.41827f, 100.41828f, 160.0f, 96.0f, 160.0f),
                    PathNode.CurveTo(91.58172f, 160.0f, 88.0f, 156.41827f, 88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 99.58172f, 91.58172f, 96.0f, 96.0f, 96.0f),
                    PathNode.CurveTo(100.41828f, 96.0f, 104.0f, 99.58172f, 104.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 156.41827f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.CurveTo(155.58173f, 160.0f, 152.0f, 156.41827f, 152.0f, 152.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 99.58172f, 155.58173f, 96.0f, 160.0f, 96.0f),
                    PathNode.CurveTo(164.41827f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 164.41827f, 160.0f, 160.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(171.58173f, 200.0f, 168.0f, 196.41827f, 168.0f, 192.0f),
                    PathNode.CurveTo(168.0f, 187.58173f, 171.58173f, 184.0f, 176.0f, 184.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 155.58173f, 203.58173f, 152.0f, 208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 155.58173f, 216.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 100.41828f, 212.41827f, 104.0f, 208.0f, 104.0f),
                    PathNode.CurveTo(203.58173f, 104.0f, 200.0f, 100.41828f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(171.58173f, 72.0f, 168.0f, 68.41828f, 168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 59.581722f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(212.41827f, 56.0f, 216.0f, 59.581722f, 216.0f, 64.0f),
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
        return _barcode!!
    }

private var _barcode: ImageVector? = null
