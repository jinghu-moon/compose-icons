package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorFillIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.39f, 83.06f),
                    PathNode.CurveTo(206.15236f, 86.04962f, 203.23566f, 87.99934f, 200.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(159.93938f, 185.41248f, 113.41248f, 231.93938f, 56.0f, 232.0f),
                    PathNode.CurveTo(51.581722f, 232.0f, 48.0f, 228.41827f, 48.0f, 224.0f),
                    PathNode.CurveTo(48.0f, 219.58173f, 51.581722f, 216.0f, 56.0f, 216.0f),
                    PathNode.CurveTo(104.57822f, 215.94489f, 143.94489f, 176.57822f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(100.762344f, 88.00255f, 97.84236f, 86.05338f, 96.60302f, 83.062325f),
                    PathNode.CurveTo(95.36368f, 80.07126f, 96.04936f, 76.62809f, 98.34f, 74.34f),
                    PathNode.LineTo(146.34f, 26.34f),
                    PathNode.CurveTo(147.84055f, 24.837784f, 149.87672f, 23.993708f, 152.0f, 23.993708f),
                    PathNode.CurveTo(154.12328f, 23.993708f, 156.15945f, 24.837784f, 157.66f, 26.34f),
                    PathNode.LineTo(205.66f, 74.34f),
                    PathNode.CurveTo(207.94725f, 76.62924f, 208.63007f, 80.07096f, 207.39f, 83.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
