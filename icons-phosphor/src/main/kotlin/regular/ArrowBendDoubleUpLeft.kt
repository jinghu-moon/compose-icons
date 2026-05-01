package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorRegularIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(85.66f, 146.34f),
                    PathNode.CurveTo(88.785934f, 149.46593f, 88.785934f, 154.53407f, 85.66f, 157.66f),
                    PathNode.CurveTo(82.534065f, 160.78593f, 77.465935f, 160.78593f, 74.34f, 157.66f),
                    PathNode.LineTo(26.34f, 109.66f),
                    PathNode.CurveTo(24.837784f, 108.159454f, 23.993708f, 106.123276f, 23.993708f, 104.0f),
                    PathNode.CurveTo(23.993708f, 101.876724f, 24.837784f, 99.840546f, 26.34f, 98.34f),
                    PathNode.LineTo(74.34f, 50.34f),
                    PathNode.CurveTo(77.465935f, 47.21407f, 82.534065f, 47.21407f, 85.66f, 50.34f),
                    PathNode.CurveTo(88.785934f, 53.46593f, 88.785934f, 58.53407f, 85.66f, 61.66f),
                    PathNode.LineTo(43.31f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.LineTo(99.31f, 96.0f),
                    PathNode.LineTo(133.66f, 61.66f),
                    PathNode.CurveTo(136.78593f, 58.53407f, 136.78593f, 53.46593f, 133.66f, 50.34f),
                    PathNode.CurveTo(130.53407f, 47.21407f, 125.465935f, 47.21407f, 122.34f, 50.34f),
                    PathNode.LineTo(74.34f, 98.34f),
                    PathNode.CurveTo(72.83778f, 99.840546f, 71.993706f, 101.876724f, 71.993706f, 104.0f),
                    PathNode.CurveTo(71.993706f, 106.123276f, 72.83778f, 108.159454f, 74.34f, 109.66f),
                    PathNode.LineTo(122.34f, 157.66f),
                    PathNode.CurveTo(125.465935f, 160.78593f, 130.53407f, 160.78593f, 133.66f, 157.66f),
                    PathNode.CurveTo(136.78593f, 154.53407f, 136.78593f, 149.46593f, 133.66f, 146.34f),
                    PathNode.LineTo(99.31f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(176.57822f, 112.05511f, 215.94489f, 151.42178f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 204.41827f, 219.58173f, 208.0f, 224.0f, 208.0f),
                    PathNode.CurveTo(228.41827f, 208.0f, 232.0f, 204.41827f, 232.0f, 200.0f),
                    PathNode.CurveTo(231.93938f, 142.58752f, 185.41248f, 96.06063f, 128.0f, 96.0f),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
