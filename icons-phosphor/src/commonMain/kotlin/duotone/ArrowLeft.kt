package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorDuotoneIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 56.0f),
                    PathNode.LineTo(112.0f, 200.0f),
                    PathNode.LineTo(40.0f, 128.0f),
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
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.CurveTo(120.00255f, 52.76235f, 118.05338f, 49.84236f, 115.062325f, 48.60302f),
                    PathNode.CurveTo(112.07126f, 47.363674f, 108.62809f, 48.04936f, 106.34f, 50.34f),
                    PathNode.LineTo(34.34f, 122.34f),
                    PathNode.CurveTo(32.837784f, 123.840546f, 31.993708f, 125.876724f, 31.993708f, 128.0f),
                    PathNode.CurveTo(31.993708f, 130.12328f, 32.837784f, 132.15945f, 34.34f, 133.66f),
                    PathNode.LineTo(106.34f, 205.66f),
                    PathNode.CurveTo(108.62809f, 207.95064f, 112.07126f, 208.63632f, 115.062325f, 207.39697f),
                    PathNode.CurveTo(118.05338f, 206.15764f, 120.00255f, 203.23764f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 180.69f),
                    PathNode.LineTo(51.31f, 128.0f),
                    PathNode.LineTo(104.0f, 75.31f),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
