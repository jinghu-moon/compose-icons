package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorDuotoneIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(120.0f, 128.0f),
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
                    PathNode.MoveTo(203.06f, 40.61f),
                    PathNode.CurveTo(200.07097f, 39.369938f, 196.62924f, 40.052757f, 194.34f, 42.34f),
                    PathNode.LineTo(114.34f, 122.34f),
                    PathNode.CurveTo(112.83778f, 123.840546f, 111.993706f, 125.876724f, 111.993706f, 128.0f),
                    PathNode.CurveTo(111.993706f, 130.12328f, 112.83778f, 132.15945f, 114.34f, 133.66f),
                    PathNode.LineTo(194.34f, 213.66f),
                    PathNode.CurveTo(196.6281f, 215.95064f, 200.07126f, 216.63632f, 203.06232f, 215.39697f),
                    PathNode.CurveTo(206.05338f, 214.15764f, 208.00255f, 211.23764f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(207.99933f, 44.764324f, 206.04962f, 41.847645f, 203.06f, 40.61f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 188.69f),
                    PathNode.LineTo(131.31f, 128.0f),
                    PathNode.LineTo(192.0f, 67.31f),
                    PathNode.Close,
                    PathNode.MoveTo(125.66f, 202.34f),
                    PathNode.CurveTo(128.78593f, 205.46593f, 128.78593f, 210.53407f, 125.66f, 213.66f),
                    PathNode.CurveTo(122.534065f, 216.78593f, 117.465935f, 216.78593f, 114.34f, 213.66f),
                    PathNode.LineTo(34.34f, 133.66f),
                    PathNode.CurveTo(32.837784f, 132.15945f, 31.993708f, 130.12328f, 31.993708f, 128.0f),
                    PathNode.CurveTo(31.993708f, 125.876724f, 32.837784f, 123.840546f, 34.34f, 122.34f),
                    PathNode.LineTo(114.34f, 42.34f),
                    PathNode.CurveTo(117.465935f, 39.21407f, 122.534065f, 39.21407f, 125.66f, 42.34f),
                    PathNode.CurveTo(128.78593f, 45.46593f, 128.78593f, 50.53407f, 125.66f, 53.66f),
                    PathNode.LineTo(51.31f, 128.0f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
