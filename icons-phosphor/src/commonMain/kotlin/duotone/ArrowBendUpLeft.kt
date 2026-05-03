package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorDuotoneIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.00255f, 52.76235f, 86.05338f, 49.84236f, 83.062325f, 48.60302f),
                    PathNode.CurveTo(80.07126f, 47.363674f, 76.62809f, 48.04936f, 74.34f, 50.34f),
                    PathNode.LineTo(26.34f, 98.34f),
                    PathNode.CurveTo(24.837784f, 99.840546f, 23.993708f, 101.876724f, 23.993708f, 104.0f),
                    PathNode.CurveTo(23.993708f, 106.123276f, 24.837784f, 108.159454f, 26.34f, 109.66f),
                    PathNode.LineTo(74.34f, 157.66f),
                    PathNode.CurveTo(76.62809f, 159.95064f, 80.07126f, 160.63632f, 83.062325f, 159.39697f),
                    PathNode.CurveTo(86.05338f, 158.15764f, 88.00255f, 155.23764f, 88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(176.57822f, 112.05511f, 215.94489f, 151.42178f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 204.41827f, 219.58173f, 208.0f, 224.0f, 208.0f),
                    PathNode.CurveTo(228.41827f, 208.0f, 232.0f, 204.41827f, 232.0f, 200.0f),
                    PathNode.CurveTo(231.93938f, 142.58752f, 185.41248f, 96.06063f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 132.69f),
                    PathNode.LineTo(43.31f, 104.0f),
                    PathNode.LineTo(72.0f, 75.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
