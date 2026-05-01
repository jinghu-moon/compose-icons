package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorFillIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(16.0f, 48.0f),
                    PathNode.CurveTo(11.581722f, 48.0f, 8.0f, 51.581722f, 8.0f, 56.0f),
                    PathNode.LineTo(8.0f, 208.0f),
                    PathNode.CurveTo(8.0f, 212.41827f, 11.581722f, 216.0f, 16.0f, 216.0f),
                    PathNode.CurveTo(20.418278f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.CurveTo(52.418278f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(72.0f, 212.41827f, 75.58172f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(84.41828f, 216.0f, 88.0f, 212.41827f, 88.0f, 208.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.CurveTo(116.41828f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(240.83656f, 192.0f, 248.0f, 184.83656f, 248.0f, 176.0f),
                    PathNode.LineTo(248.0f, 64.0f),
                    PathNode.CurveTo(248.0f, 55.163445f, 240.83656f, 48.0f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 120.0f),
                    PathNode.CurveTo(212.00804f, 126.78145f, 210.09035f, 133.42578f, 206.47f, 139.16f),
                    PathNode.LineTo(156.84f, 89.53f),
                    PathNode.CurveTo(167.93259f, 82.556595f, 181.93799f, 82.16052f, 193.40694f, 88.49589f),
                    PathNode.CurveTo(204.8759f, 94.83126f, 211.99718f, 106.89757f, 212.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.00805f, 126.78145f, 114.09035f, 133.42578f, 110.47f, 139.16f),
                    PathNode.LineTo(60.84f, 89.53f),
                    PathNode.CurveTo(71.93258f, 82.556595f, 85.93799f, 82.16052f, 97.406944f, 88.49589f),
                    PathNode.CurveTo(108.87589f, 94.83126f, 115.99717f, 106.89757f, 116.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 156.0f),
                    PathNode.CurveTo(66.89757f, 155.99718f, 54.83126f, 148.8759f, 48.49589f, 137.40694f),
                    PathNode.CurveTo(42.160522f, 125.93799f, 42.556595f, 111.93258f, 49.53f, 100.84f),
                    PathNode.LineTo(99.16f, 150.47f),
                    PathNode.CurveTo(93.42579f, 154.09035f, 86.78145f, 156.00804f, 80.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 120.0f),
                    PathNode.CurveTo(139.99196f, 113.21855f, 141.90965f, 106.57421f, 145.53f, 100.84f),
                    PathNode.LineTo(195.16f, 150.47f),
                    PathNode.CurveTo(184.06741f, 157.4434f, 170.06201f, 157.83948f, 158.59306f, 151.5041f),
                    PathNode.CurveTo(147.1241f, 145.16875f, 140.00282f, 133.10243f, 140.0f, 120.0f),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
