package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorBoldIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 137.0f),
                    PathNode.LineTo(48.0f, 201.0f),
                    PathNode.CurveTo(43.02944f, 205.41827f, 35.418278f, 204.97057f, 31.0f, 200.0f),
                    PathNode.CurveTo(26.581722f, 195.02943f, 27.029438f, 187.41827f, 32.0f, 183.0f),
                    PathNode.LineTo(93.91f, 128.0f),
                    PathNode.LineTo(32.0f, 73.0f),
                    PathNode.CurveTo(27.029438f, 68.58172f, 26.581722f, 60.97056f, 31.0f, 56.0f),
                    PathNode.CurveTo(35.418278f, 51.02944f, 43.02944f, 50.581722f, 48.0f, 55.0f),
                    PathNode.LineTo(120.0f, 119.0f),
                    PathNode.CurveTo(122.58301f, 121.278f, 124.062744f, 124.55599f, 124.062744f, 128.0f),
                    PathNode.CurveTo(124.062744f, 131.444f, 122.58301f, 134.722f, 120.0f, 137.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(120.0f, 180.0f),
                    PathNode.CurveTo(113.37258f, 180.0f, 108.0f, 185.37259f, 108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 198.62741f, 113.37258f, 204.0f, 120.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 185.37259f, 222.62741f, 180.0f, 216.0f, 180.0f),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
