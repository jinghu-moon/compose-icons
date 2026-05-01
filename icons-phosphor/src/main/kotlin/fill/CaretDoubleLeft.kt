package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorFillIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.00255f, 211.23764f, 206.05338f, 214.15764f, 203.06232f, 215.39697f),
                    PathNode.CurveTo(200.07126f, 216.63632f, 196.6281f, 215.95064f, 194.34f, 213.66f),
                    PathNode.LineTo(128.0f, 147.31f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.CurveTo(128.00255f, 211.23764f, 126.05338f, 214.15764f, 123.062325f, 215.39697f),
                    PathNode.CurveTo(120.07126f, 216.63632f, 116.62809f, 215.95064f, 114.34f, 213.66f),
                    PathNode.LineTo(34.34f, 133.66f),
                    PathNode.CurveTo(32.837784f, 132.15945f, 31.993708f, 130.12328f, 31.993708f, 128.0f),
                    PathNode.CurveTo(31.993708f, 125.876724f, 32.837784f, 123.840546f, 34.34f, 122.34f),
                    PathNode.LineTo(114.34f, 42.34f),
                    PathNode.CurveTo(116.62809f, 40.04936f, 120.07126f, 39.363674f, 123.062325f, 40.60302f),
                    PathNode.CurveTo(126.05338f, 41.84236f, 128.00255f, 44.76235f, 128.0f, 48.0f),
                    PathNode.LineTo(128.0f, 108.69f),
                    PathNode.LineTo(194.34f, 42.34f),
                    PathNode.CurveTo(196.6281f, 40.04936f, 200.07126f, 39.363674f, 203.06232f, 40.60302f),
                    PathNode.CurveTo(206.05338f, 41.84236f, 208.00255f, 44.76235f, 208.0f, 48.0f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
