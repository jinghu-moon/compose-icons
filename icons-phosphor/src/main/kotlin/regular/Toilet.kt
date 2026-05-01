package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorRegularIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 68.41828f, 116.41828f, 72.0f, 112.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(91.58172f, 72.0f, 88.0f, 68.41828f, 88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 59.581722f, 91.58172f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(116.41828f, 56.0f, 120.0f, 59.581722f, 120.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.32f, 197.14f),
                    PathNode.LineTo(175.84f, 221.74f),
                    PathNode.CurveTo(176.4951f, 226.33134f, 175.12572f, 230.98105f, 172.08664f, 234.48444f),
                    PathNode.CurveTo(169.04756f, 237.98781f, 164.63783f, 240.00012f, 160.0f, 240.0f),
                    PathNode.LineTo(96.0f, 240.0f),
                    PathNode.CurveTo(91.36215f, 240.00012f, 86.95244f, 237.98781f, 83.91336f, 234.48444f),
                    PathNode.CurveTo(80.87429f, 230.98105f, 79.504906f, 226.33134f, 80.16f, 221.74f),
                    PathNode.LineTo(83.68f, 197.14f),
                    PathNode.CurveTo(51.94193f, 180.59901f, 32.026726f, 147.7898f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 107.58172f, 35.581722f, 104.0f, 40.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 31.163445f, 63.163445f, 24.0f, 72.0f, 24.0f),
                    PathNode.LineTo(184.0f, 24.0f),
                    PathNode.CurveTo(192.83656f, 24.0f, 200.0f, 31.163445f, 200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(220.41827f, 104.0f, 224.0f, 107.58172f, 224.0f, 112.0f),
                    PathNode.CurveTo(223.97328f, 147.7898f, 204.05807f, 180.59901f, 172.32f, 197.14f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 104.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.07f, 203.5f),
                    PathNode.CurveTo(138.15436f, 209.49974f, 117.84564f, 209.49974f, 98.93f, 203.5f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.6f, 120.0f),
                    PathNode.LineTo(48.4f, 120.0f),
                    PathNode.CurveTo(52.50373f, 160.88326f, 86.91131f, 192.01001f, 128.0f, 192.01001f),
                    PathNode.CurveTo(169.08868f, 192.01001f, 203.49628f, 160.88326f, 207.6f, 120.0f),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
