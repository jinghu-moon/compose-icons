package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorThinIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 88.6f, 50.9f, 52.63f, 86.33f, 36.37f),
                    PathNode.CurveTo(88.337555f, 35.447685f, 90.712685f, 36.327442f, 91.635f, 38.335f),
                    PathNode.CurveTo(92.55731f, 40.342556f, 91.67755f, 42.717686f, 89.67f, 43.64f),
                    PathNode.CurveTo(57.07f, 58.6f, 36.0f, 91.71f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 178.8102f, 77.18981f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(178.8102f, 220.0f, 220.0f, 178.8102f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 91.71f, 198.93f, 58.6f, 166.33f, 43.64f),
                    PathNode.CurveTo(164.32245f, 42.717686f, 163.44269f, 40.342556f, 164.365f, 38.335f),
                    PathNode.CurveTo(165.28732f, 36.327442f, 167.66245f, 35.447685f, 169.67f, 36.37f),
                    PathNode.CurveTo(205.1f, 52.63f, 228.0f, 88.6f, 228.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
