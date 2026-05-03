package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorDuotoneIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 196.41827f, 220.41827f, 200.0f, 216.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.LineTo(168.0f, 104.0f),
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
                    PathNode.MoveTo(28.0f, 128.0f),
                    PathNode.CurveTo(23.581722f, 128.0f, 20.0f, 124.41828f, 20.0f, 120.0f),
                    PathNode.CurveTo(20.0f, 115.58172f, 23.581722f, 112.0f, 28.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(60.418278f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 60.418278f, 96.0f, 56.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(26.745167f, 96.0f, 16.0f, 85.25484f, 16.0f, 72.0f),
                    PathNode.CurveTo(16.0f, 58.745167f, 26.745167f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(40.0f, 43.581722f, 43.581722f, 40.0f, 48.0f, 40.0f),
                    PathNode.CurveTo(52.418278f, 40.0f, 56.0f, 43.581722f, 56.0f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(68.41828f, 48.0f, 72.0f, 51.581722f, 72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 60.418278f, 68.41828f, 64.0f, 64.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(35.581722f, 64.0f, 32.0f, 67.58172f, 32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 76.41828f, 35.581722f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.CurveTo(69.25484f, 80.0f, 80.0f, 90.74516f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 117.25484f, 69.25484f, 128.0f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 132.41827f, 52.418278f, 136.0f, 48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(232.0f, 200.83656f, 224.83656f, 208.0f, 216.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(31.163445f, 208.0f, 24.0f, 200.83656f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 147.58173f, 27.581722f, 144.0f, 32.0f, 144.0f),
                    PathNode.CurveTo(36.418278f, 144.0f, 40.0f, 147.58173f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.CurveTo(75.58172f, 160.0f, 72.0f, 156.41827f, 72.0f, 152.0f),
                    PathNode.CurveTo(72.0f, 147.58173f, 75.58172f, 144.0f, 80.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(99.58172f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 99.58172f, 99.58172f, 96.0f, 104.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(91.58172f, 64.0f, 88.0f, 60.418278f, 88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 51.581722f, 91.58172f, 48.0f, 96.0f, 48.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.LineTo(176.0f, 192.0f),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
