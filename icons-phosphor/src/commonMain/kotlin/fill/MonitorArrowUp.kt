package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorFillIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 164.41827f, 232.0f, 160.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(91.58172f, 232.0f, 88.0f, 228.41827f, 88.0f, 224.0f),
                    PathNode.CurveTo(88.0f, 219.58173f, 91.58172f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(164.41827f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 189.25484f, 221.25484f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(34.745167f, 200.0f, 24.0f, 189.25484f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 50.745167f, 34.745167f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(221.25484f, 40.0f, 232.0f, 50.745167f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.66f, 106.34f),
                    PathNode.LineTo(133.66f, 82.34f),
                    PathNode.CurveTo(132.15945f, 80.83778f, 130.12328f, 79.993706f, 128.0f, 79.993706f),
                    PathNode.CurveTo(125.876724f, 79.993706f, 123.840546f, 80.83778f, 122.34f, 82.34f),
                    PathNode.LineTo(98.34f, 106.34f),
                    PathNode.CurveTo(95.214066f, 109.465935f, 95.214066f, 114.534065f, 98.34f, 117.66f),
                    PathNode.CurveTo(101.465935f, 120.785934f, 106.534065f, 120.785934f, 109.66f, 117.66f),
                    PathNode.LineTo(120.0f, 107.31f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 156.41827f, 123.58172f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(132.41827f, 160.0f, 136.0f, 156.41827f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 107.31f),
                    PathNode.LineTo(146.34f, 117.66f),
                    PathNode.CurveTo(149.46593f, 120.785934f, 154.53407f, 120.785934f, 157.66f, 117.66f),
                    PathNode.CurveTo(160.78593f, 114.534065f, 160.78593f, 109.465935f, 157.66f, 106.34f),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
