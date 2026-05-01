package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorRegularIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 228.41827f, 204.41827f, 232.0f, 200.0f, 232.0f),
                    PathNode.CurveTo(142.58752f, 231.93938f, 96.06063f, 185.41248f, 96.0f, 128.0f),
                    PathNode.LineTo(96.0f, 51.31f),
                    PathNode.LineTo(61.66f, 85.66f),
                    PathNode.CurveTo(58.53407f, 88.785934f, 53.46593f, 88.785934f, 50.34f, 85.66f),
                    PathNode.CurveTo(47.21407f, 82.534065f, 47.21407f, 77.465935f, 50.34f, 74.34f),
                    PathNode.LineTo(98.34f, 26.34f),
                    PathNode.CurveTo(99.840546f, 24.837784f, 101.876724f, 23.993708f, 104.0f, 23.993708f),
                    PathNode.CurveTo(106.123276f, 23.993708f, 108.159454f, 24.837784f, 109.66f, 26.34f),
                    PathNode.LineTo(157.66f, 74.34f),
                    PathNode.CurveTo(160.78593f, 77.465935f, 160.78593f, 82.534065f, 157.66f, 85.66f),
                    PathNode.CurveTo(154.53407f, 88.785934f, 149.46593f, 88.785934f, 146.34f, 85.66f),
                    PathNode.LineTo(112.0f, 51.31f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.05511f, 176.57822f, 151.42178f, 215.94489f, 200.0f, 216.0f),
                    PathNode.CurveTo(204.41827f, 216.0f, 208.0f, 219.58173f, 208.0f, 224.0f),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
