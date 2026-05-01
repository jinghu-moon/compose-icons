package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorRegularIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 144.0f),
                    PathNode.CurveTo(231.96143f, 179.33023f, 203.33023f, 207.96143f, 168.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(75.58172f, 208.0f, 72.0f, 204.41827f, 72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 195.58173f, 75.58172f, 192.0f, 80.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.CurveTo(194.50967f, 192.0f, 216.0f, 170.50967f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 117.49033f, 194.50967f, 96.0f, 168.0f, 96.0f),
                    PathNode.LineTo(51.31f, 96.0f),
                    PathNode.LineTo(85.66f, 130.34f),
                    PathNode.CurveTo(88.785934f, 133.46593f, 88.785934f, 138.53407f, 85.66f, 141.66f),
                    PathNode.CurveTo(82.534065f, 144.78593f, 77.465935f, 144.78593f, 74.34f, 141.66f),
                    PathNode.LineTo(26.34f, 93.66f),
                    PathNode.CurveTo(24.837784f, 92.159454f, 23.993708f, 90.123276f, 23.993708f, 88.0f),
                    PathNode.CurveTo(23.993708f, 85.876724f, 24.837784f, 83.840546f, 26.34f, 82.34f),
                    PathNode.LineTo(74.34f, 34.34f),
                    PathNode.CurveTo(77.465935f, 31.21407f, 82.534065f, 31.21407f, 85.66f, 34.34f),
                    PathNode.CurveTo(88.785934f, 37.46593f, 88.785934f, 42.53407f, 85.66f, 45.66f),
                    PathNode.LineTo(51.31f, 80.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.CurveTo(203.33023f, 80.03858f, 231.96143f, 108.66977f, 232.0f, 144.0f),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
