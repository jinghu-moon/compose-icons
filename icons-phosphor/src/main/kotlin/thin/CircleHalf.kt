package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorThinIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 36.09f),
                    PathNode.CurveTo(140.15454f, 36.437492f, 148.22603f, 37.873543f, 156.0f, 40.36f),
                    PathNode.LineTo(156.0f, 215.64f),
                    PathNode.CurveTo(148.22603f, 218.12645f, 140.15454f, 219.56252f, 132.0f, 219.91f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 43.34f),
                    PathNode.CurveTo(172.72423f, 47.075176f, 180.81956f, 52.134754f, 188.0f, 58.34f),
                    PathNode.LineTo(188.0f, 197.69f),
                    PathNode.CurveTo(180.81956f, 203.89525f, 172.72423f, 208.95482f, 164.0f, 212.69f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.057865f, 78.76922f, 74.818214f, 38.286674f, 124.0f, 36.09f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(74.818214f, 217.71333f, 36.057865f, 177.23077f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 189.9f),
                    PathNode.LineTo(196.0f, 66.1f),
                    PathNode.CurveTo(227.99774f, 101.16399f, 227.99774f, 154.83601f, 196.0f, 189.9f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
