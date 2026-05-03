package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorFillIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.66f, 173.66f),
                    PathNode.CurveTo(74.534065f, 176.78593f, 69.465935f, 176.78593f, 66.34f, 173.66f),
                    PathNode.CurveTo(63.21407f, 170.53407f, 63.21407f, 165.46593f, 66.34f, 162.34f),
                    PathNode.LineTo(100.69f, 128.0f),
                    PathNode.LineTo(66.34f, 93.66f),
                    PathNode.CurveTo(63.21407f, 90.534065f, 63.21407f, 85.465935f, 66.34f, 82.34f),
                    PathNode.CurveTo(69.465935f, 79.214066f, 74.534065f, 79.214066f, 77.66f, 82.34f),
                    PathNode.LineTo(117.66f, 122.34f),
                    PathNode.CurveTo(119.16222f, 123.840546f, 120.006294f, 125.876724f, 120.006294f, 128.0f),
                    PathNode.CurveTo(120.006294f, 130.12328f, 119.16222f, 132.15945f, 117.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 172.41827f, 120.0f, 168.0f),
                    PathNode.CurveTo(120.0f, 163.58173f, 123.58172f, 160.0f, 128.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(196.41827f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 172.41827f, 196.41827f, 176.0f, 192.0f, 176.0f),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
