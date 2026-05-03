package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorFillIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.CurveTo(231.93938f, 113.41248f, 185.41248f, 159.93938f, 128.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(88.00255f, 203.23764f, 86.05338f, 206.15764f, 83.062325f, 207.39697f),
                    PathNode.CurveTo(80.07126f, 208.63632f, 76.62809f, 207.95064f, 74.34f, 205.66f),
                    PathNode.LineTo(26.34f, 157.66f),
                    PathNode.CurveTo(24.837784f, 156.15945f, 23.993708f, 154.12328f, 23.993708f, 152.0f),
                    PathNode.CurveTo(23.993708f, 149.87672f, 24.837784f, 147.84055f, 26.34f, 146.34f),
                    PathNode.LineTo(74.34f, 98.34f),
                    PathNode.CurveTo(76.62809f, 96.04936f, 80.07126f, 95.36368f, 83.062325f, 96.60302f),
                    PathNode.CurveTo(86.05338f, 97.84236f, 88.00255f, 100.762344f, 88.0f, 104.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(176.57822f, 143.94489f, 215.94489f, 104.57822f, 216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 51.581722f, 219.58173f, 48.0f, 224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
