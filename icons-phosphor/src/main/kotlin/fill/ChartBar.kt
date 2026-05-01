package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorFillIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 203.58173f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 131.58173f, 43.581722f, 128.0f, 48.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(76.41828f, 128.0f, 80.0f, 131.58173f, 80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 83.58172f, 99.58172f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(140.41827f, 80.0f, 144.0f, 83.58172f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 35.581722f, 163.58173f, 32.0f, 168.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(212.41827f, 32.0f, 216.0f, 35.581722f, 216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
