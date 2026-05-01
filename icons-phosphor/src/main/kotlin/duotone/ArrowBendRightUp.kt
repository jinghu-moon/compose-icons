package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorDuotoneIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.LineTo(152.0f, 32.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 74.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15945f, 24.837784f, 154.12328f, 23.993708f, 152.0f, 23.993708f),
                    PathNode.CurveTo(149.87672f, 23.993708f, 147.84055f, 24.837784f, 146.34f, 26.34f),
                    PathNode.LineTo(98.34f, 74.34f),
                    PathNode.CurveTo(96.04936f, 76.62809f, 95.36368f, 80.07126f, 96.60302f, 83.062325f),
                    PathNode.CurveTo(97.84236f, 86.05338f, 100.762344f, 88.00255f, 104.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(143.94489f, 176.57822f, 104.57822f, 215.94489f, 56.0f, 216.0f),
                    PathNode.CurveTo(51.581722f, 216.0f, 48.0f, 219.58173f, 48.0f, 224.0f),
                    PathNode.CurveTo(48.0f, 228.41827f, 51.581722f, 232.0f, 56.0f, 232.0f),
                    PathNode.CurveTo(113.41248f, 231.93938f, 159.93938f, 185.41248f, 160.0f, 128.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(203.23764f, 88.00255f, 206.15764f, 86.05338f, 207.39697f, 83.062325f),
                    PathNode.CurveTo(208.63632f, 80.07126f, 207.95064f, 76.62809f, 205.66f, 74.34f),
                    PathNode.Close,
                    PathNode.MoveTo(123.31f, 72.0f),
                    PathNode.LineTo(152.0f, 43.31f),
                    PathNode.LineTo(180.69f, 72.0f),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
