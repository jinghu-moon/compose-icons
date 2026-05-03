package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorFillIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 228.41827f, 204.41827f, 232.0f, 200.0f, 232.0f),
                    PathNode.CurveTo(142.58752f, 231.93938f, 96.06063f, 185.41248f, 96.0f, 128.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(52.76235f, 88.00255f, 49.84236f, 86.05338f, 48.60302f, 83.062325f),
                    PathNode.CurveTo(47.363674f, 80.07126f, 48.04936f, 76.62809f, 50.34f, 74.34f),
                    PathNode.LineTo(98.34f, 26.34f),
                    PathNode.CurveTo(99.840546f, 24.837784f, 101.876724f, 23.993708f, 104.0f, 23.993708f),
                    PathNode.CurveTo(106.123276f, 23.993708f, 108.159454f, 24.837784f, 109.66f, 26.34f),
                    PathNode.LineTo(157.66f, 74.34f),
                    PathNode.CurveTo(159.95064f, 76.62809f, 160.63632f, 80.07126f, 159.39697f, 83.062325f),
                    PathNode.CurveTo(158.15764f, 86.05338f, 155.23764f, 88.00255f, 152.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.05511f, 176.57822f, 151.42178f, 215.94489f, 200.0f, 216.0f),
                    PathNode.CurveTo(204.41827f, 216.0f, 208.0f, 219.58173f, 208.0f, 224.0f),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
