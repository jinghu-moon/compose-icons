package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorDuotoneIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.LineTo(104.0f, 32.0f),
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
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.CurveTo(151.42178f, 215.94489f, 112.05511f, 176.57822f, 112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(155.23764f, 88.00255f, 158.15764f, 86.05338f, 159.39697f, 83.062325f),
                    PathNode.CurveTo(160.63632f, 80.07126f, 159.95064f, 76.62809f, 157.66f, 74.34f),
                    PathNode.LineTo(109.66f, 26.34f),
                    PathNode.CurveTo(108.159454f, 24.837784f, 106.123276f, 23.993708f, 104.0f, 23.993708f),
                    PathNode.CurveTo(101.876724f, 23.993708f, 99.840546f, 24.837784f, 98.34f, 26.34f),
                    PathNode.LineTo(50.34f, 74.34f),
                    PathNode.CurveTo(48.04936f, 76.62809f, 47.363674f, 80.07126f, 48.60302f, 83.062325f),
                    PathNode.CurveTo(49.84236f, 86.05338f, 52.76235f, 88.00255f, 56.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(96.06063f, 185.41248f, 142.58752f, 231.93938f, 200.0f, 232.0f),
                    PathNode.CurveTo(204.41827f, 232.0f, 208.0f, 228.41827f, 208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 219.58173f, 204.41827f, 216.0f, 200.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 43.31f),
                    PathNode.LineTo(132.69f, 72.0f),
                    PathNode.LineTo(75.31f, 72.0f),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
