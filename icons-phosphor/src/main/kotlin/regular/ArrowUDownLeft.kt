package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorRegularIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.CurveTo(231.96143f, 147.33023f, 203.33023f, 175.96143f, 168.0f, 176.0f),
                    PathNode.LineTo(51.31f, 176.0f),
                    PathNode.LineTo(85.66f, 210.34f),
                    PathNode.CurveTo(88.785934f, 213.46593f, 88.785934f, 218.53407f, 85.66f, 221.66f),
                    PathNode.CurveTo(82.534065f, 224.78593f, 77.465935f, 224.78593f, 74.34f, 221.66f),
                    PathNode.LineTo(26.34f, 173.66f),
                    PathNode.CurveTo(24.837784f, 172.15945f, 23.993708f, 170.12328f, 23.993708f, 168.0f),
                    PathNode.CurveTo(23.993708f, 165.87672f, 24.837784f, 163.84055f, 26.34f, 162.34f),
                    PathNode.LineTo(74.34f, 114.34f),
                    PathNode.CurveTo(77.465935f, 111.214066f, 82.534065f, 111.214066f, 85.66f, 114.34f),
                    PathNode.CurveTo(88.785934f, 117.465935f, 88.785934f, 122.534065f, 85.66f, 125.66f),
                    PathNode.LineTo(51.31f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.CurveTo(194.50967f, 160.0f, 216.0f, 138.50967f, 216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 85.49033f, 194.50967f, 64.0f, 168.0f, 64.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.CurveTo(75.58172f, 64.0f, 72.0f, 60.418278f, 72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 51.581722f, 75.58172f, 48.0f, 80.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(203.33023f, 48.03858f, 231.96143f, 76.66977f, 232.0f, 112.0f),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
