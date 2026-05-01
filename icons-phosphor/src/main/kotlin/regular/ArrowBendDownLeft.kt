package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorRegularIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.CurveTo(231.93938f, 113.41248f, 185.41248f, 159.93938f, 128.0f, 160.0f),
                    PathNode.LineTo(51.31f, 160.0f),
                    PathNode.LineTo(85.66f, 194.34f),
                    PathNode.CurveTo(88.785934f, 197.46593f, 88.785934f, 202.53407f, 85.66f, 205.66f),
                    PathNode.CurveTo(82.534065f, 208.78593f, 77.465935f, 208.78593f, 74.34f, 205.66f),
                    PathNode.LineTo(26.34f, 157.66f),
                    PathNode.CurveTo(24.837784f, 156.15945f, 23.993708f, 154.12328f, 23.993708f, 152.0f),
                    PathNode.CurveTo(23.993708f, 149.87672f, 24.837784f, 147.84055f, 26.34f, 146.34f),
                    PathNode.LineTo(74.34f, 98.34f),
                    PathNode.CurveTo(77.465935f, 95.214066f, 82.534065f, 95.214066f, 85.66f, 98.34f),
                    PathNode.CurveTo(88.785934f, 101.465935f, 88.785934f, 106.534065f, 85.66f, 109.66f),
                    PathNode.LineTo(51.31f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(176.57822f, 143.94489f, 215.94489f, 104.57822f, 216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 51.581722f, 219.58173f, 48.0f, 224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
