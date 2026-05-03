package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.City: ImageVector
    get() {
        if (_city != null) return _city!!
        _city = phosphorDuotoneIcon(
            name = "City",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 88.0f),
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
                    PathNode.MoveTo(240.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 83.58172f, 228.41827f, 80.0f, 224.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 128.0f),
                    PathNode.LineTo(104.0f, 128.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 100.41828f, 32.0f, 96.0f, 32.0f),
                    PathNode.LineTo(32.0f, 32.0f),
                    PathNode.CurveTo(27.581722f, 32.0f, 24.0f, 35.581722f, 24.0f, 40.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.LineTo(16.0f, 208.0f),
                    PathNode.CurveTo(11.581722f, 208.0f, 8.0f, 211.58173f, 8.0f, 216.0f),
                    PathNode.CurveTo(8.0f, 220.41827f, 11.581722f, 224.0f, 16.0f, 224.0f),
                    PathNode.LineTo(240.0f, 224.0f),
                    PathNode.CurveTo(244.41827f, 224.0f, 248.0f, 220.41827f, 248.0f, 216.0f),
                    PathNode.CurveTo(248.0f, 211.58173f, 244.41827f, 208.0f, 240.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(72.0f, 92.41828f, 68.41828f, 96.0f, 64.0f, 96.0f),
                    PathNode.CurveTo(59.581722f, 96.0f, 56.0f, 92.41828f, 56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(56.0f, 67.58172f, 59.581722f, 64.0f, 64.0f, 64.0f),
                    PathNode.CurveTo(68.41828f, 64.0f, 72.0f, 67.58172f, 72.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 120.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 140.41827f, 68.41828f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 140.41827f, 56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(56.0f, 115.58172f, 59.581722f, 112.0f, 64.0f, 112.0f),
                    PathNode.CurveTo(68.41828f, 112.0f, 72.0f, 115.58172f, 72.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(72.0f, 188.41827f, 68.41828f, 192.0f, 64.0f, 192.0f),
                    PathNode.CurveTo(59.581722f, 192.0f, 56.0f, 188.41827f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(68.41828f, 160.0f, 72.0f, 163.58173f, 72.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(120.0f, 163.58173f, 123.58172f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(132.41827f, 160.0f, 136.0f, 163.58173f, 136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 188.41827f, 132.41827f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(123.58172f, 192.0f, 120.0f, 188.41827f, 120.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 163.58173f, 187.58173f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 188.41827f, 196.41827f, 192.0f, 192.0f, 192.0f),
                    PathNode.CurveTo(187.58173f, 192.0f, 184.0f, 188.41827f, 184.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 136.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 115.58172f, 187.58173f, 112.0f, 192.0f, 112.0f),
                    PathNode.CurveTo(196.41827f, 112.0f, 200.0f, 115.58172f, 200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(200.0f, 140.41827f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.CurveTo(187.58173f, 144.0f, 184.0f, 140.41827f, 184.0f, 136.0f),
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
        return _city!!
    }

private var _city: ImageVector? = null
