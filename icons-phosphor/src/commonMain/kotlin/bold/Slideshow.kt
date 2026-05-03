package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorBoldIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(60.954304f, 44.0f, 52.0f, 52.954304f, 52.0f, 64.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 203.0457f, 60.954304f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(184.0f, 212.0f),
                    PathNode.CurveTo(195.0457f, 212.0f, 204.0f, 203.0457f, 204.0f, 192.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 52.954304f, 195.0457f, 44.0f, 184.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 188.0f),
                    PathNode.LineTo(76.0f, 188.0f),
                    PathNode.LineTo(76.0f, 68.0f),
                    PathNode.LineTo(180.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 56.0f),
                    PathNode.LineTo(244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 206.62741f, 238.62741f, 212.0f, 232.0f, 212.0f),
                    PathNode.CurveTo(225.37259f, 212.0f, 220.0f, 206.62741f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 225.37259f, 44.0f, 232.0f, 44.0f),
                    PathNode.CurveTo(238.62741f, 44.0f, 244.0f, 49.37258f, 244.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 30.627417f, 212.0f, 24.0f, 212.0f),
                    PathNode.CurveTo(17.372583f, 212.0f, 12.0f, 206.62741f, 12.0f, 200.0f),
                    PathNode.LineTo(12.0f, 56.0f),
                    PathNode.CurveTo(12.0f, 49.37258f, 17.372583f, 44.0f, 24.0f, 44.0f),
                    PathNode.CurveTo(30.627417f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
