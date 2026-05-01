package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Equalizer: ImageVector
    get() {
        if (_equalizer != null) return _equalizer!!
        _equalizer = phosphorFillIcon(
            name = "Equalizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 100.41828f, 76.41828f, 104.0f, 72.0f, 104.0f),
                    PathNode.LineTo(24.0f, 104.0f),
                    PathNode.CurveTo(19.581722f, 104.0f, 16.0f, 100.41828f, 16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 91.58172f, 19.581722f, 88.0f, 24.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(76.41828f, 88.0f, 80.0f, 91.58172f, 80.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.CurveTo(99.58172f, 120.0f, 96.0f, 123.58172f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 132.41827f, 99.58172f, 136.0f, 104.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(156.41827f, 136.0f, 160.0f, 132.41827f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 123.58172f, 156.41827f, 120.0f, 152.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 72.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(236.41827f, 72.0f, 240.0f, 68.41828f, 240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 59.581722f, 236.41827f, 56.0f, 232.0f, 56.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(179.58173f, 56.0f, 176.0f, 59.581722f, 176.0f, 64.0f),
                    PathNode.CurveTo(176.0f, 68.41828f, 179.58173f, 72.0f, 184.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 196.41827f, 19.581722f, 200.0f, 24.0f, 200.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(76.41828f, 200.0f, 80.0f, 196.41827f, 80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 76.41828f, 120.0f, 72.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(179.58173f, 88.0f, 176.0f, 91.58172f, 176.0f, 96.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 179.58173f, 200.0f, 184.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 196.41827f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 91.58172f, 236.41827f, 88.0f, 232.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.CurveTo(99.58172f, 152.0f, 96.0f, 155.58173f, 96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 99.58172f, 200.0f, 104.0f, 200.0f),
                    PathNode.LineTo(152.0f, 200.0f),
                    PathNode.CurveTo(156.41827f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 155.58173f, 156.41827f, 152.0f, 152.0f, 152.0f),
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
        return _equalizer!!
    }

private var _equalizer: ImageVector? = null
