package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorFillIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 194.34f),
                    PathNode.CurveTo(215.95064f, 196.6281f, 216.63632f, 200.07126f, 215.39697f, 203.06232f),
                    PathNode.CurveTo(214.15764f, 206.05338f, 211.23764f, 208.00255f, 208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(44.76235f, 208.00255f, 41.84236f, 206.05338f, 40.60302f, 203.06232f),
                    PathNode.CurveTo(39.363674f, 200.07126f, 40.04936f, 196.6281f, 42.34f, 194.34f),
                    PathNode.LineTo(108.69f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(44.76235f, 128.00255f, 41.84236f, 126.05338f, 40.60302f, 123.062325f),
                    PathNode.CurveTo(39.363674f, 120.07126f, 40.04936f, 116.62809f, 42.34f, 114.34f),
                    PathNode.LineTo(122.34f, 34.34f),
                    PathNode.CurveTo(123.840546f, 32.837784f, 125.876724f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(130.12328f, 31.993708f, 132.15945f, 32.837784f, 133.66f, 34.34f),
                    PathNode.LineTo(213.66f, 114.34f),
                    PathNode.CurveTo(215.95064f, 116.62809f, 216.63632f, 120.07126f, 215.39697f, 123.062325f),
                    PathNode.CurveTo(214.15764f, 126.05338f, 211.23764f, 128.00255f, 208.0f, 128.0f),
                    PathNode.LineTo(147.31f, 128.0f),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
