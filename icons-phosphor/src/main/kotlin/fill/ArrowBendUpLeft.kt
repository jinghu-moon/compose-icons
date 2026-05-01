package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorFillIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 204.41827f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.CurveTo(219.58173f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.CurveTo(215.94489f, 151.42178f, 176.57822f, 112.05511f, 128.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.CurveTo(88.00255f, 155.23764f, 86.05338f, 158.15764f, 83.062325f, 159.39697f),
                    PathNode.CurveTo(80.07126f, 160.63632f, 76.62809f, 159.95064f, 74.34f, 157.66f),
                    PathNode.LineTo(26.34f, 109.66f),
                    PathNode.CurveTo(24.837784f, 108.159454f, 23.993708f, 106.123276f, 23.993708f, 104.0f),
                    PathNode.CurveTo(23.993708f, 101.876724f, 24.837784f, 99.840546f, 26.34f, 98.34f),
                    PathNode.LineTo(74.34f, 50.34f),
                    PathNode.CurveTo(76.62809f, 48.04936f, 80.07126f, 47.363674f, 83.062325f, 48.60302f),
                    PathNode.CurveTo(86.05338f, 49.84236f, 88.00255f, 52.76235f, 88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.CurveTo(185.41248f, 96.06063f, 231.93938f, 142.58752f, 232.0f, 200.0f),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
