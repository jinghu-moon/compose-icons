package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorRegularIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 35.581722f, 212.41827f, 32.0f, 208.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(147.58173f, 32.0f, 144.0f, 35.581722f, 144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 83.58172f, 88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(43.581722f, 128.0f, 40.0f, 131.58173f, 40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 144.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
