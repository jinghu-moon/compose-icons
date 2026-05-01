package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorDuotoneIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.LineTo(80.0f, 104.0f),
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
                    PathNode.MoveTo(85.66f, 146.34f),
                    PathNode.CurveTo(88.785934f, 149.46593f, 88.785934f, 154.53407f, 85.66f, 157.66f),
                    PathNode.CurveTo(82.534065f, 160.78593f, 77.465935f, 160.78593f, 74.34f, 157.66f),
                    PathNode.LineTo(26.34f, 109.66f),
                    PathNode.CurveTo(24.837784f, 108.159454f, 23.993708f, 106.123276f, 23.993708f, 104.0f),
                    PathNode.CurveTo(23.993708f, 101.876724f, 24.837784f, 99.840546f, 26.34f, 98.34f),
                    PathNode.LineTo(74.34f, 50.34f),
                    PathNode.CurveTo(77.465935f, 47.21407f, 82.534065f, 47.21407f, 85.66f, 50.34f),
                    PathNode.CurveTo(88.785934f, 53.46593f, 88.785934f, 58.53407f, 85.66f, 61.66f),
                    PathNode.LineTo(43.31f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 204.41827f, 228.41827f, 208.0f, 224.0f, 208.0f),
                    PathNode.CurveTo(219.58173f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.CurveTo(215.9453f, 154.52103f, 181.28595f, 116.55604f, 136.0f, 112.37f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.00255f, 155.23764f, 134.05338f, 158.15764f, 131.06232f, 159.39697f),
                    PathNode.CurveTo(128.07126f, 160.63632f, 124.62809f, 159.95064f, 122.34f, 157.66f),
                    PathNode.LineTo(74.34f, 109.66f),
                    PathNode.CurveTo(72.83778f, 108.159454f, 71.993706f, 106.123276f, 71.993706f, 104.0f),
                    PathNode.CurveTo(71.993706f, 101.876724f, 72.83778f, 99.840546f, 74.34f, 98.34f),
                    PathNode.LineTo(122.34f, 50.34f),
                    PathNode.CurveTo(124.62809f, 48.04936f, 128.07126f, 47.363674f, 131.06232f, 48.60302f),
                    PathNode.CurveTo(134.05338f, 49.84236f, 136.00255f, 52.76235f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 96.3f),
                    PathNode.CurveTo(190.14294f, 100.54981f, 231.93188f, 145.69057f, 232.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 75.31f),
                    PathNode.LineTo(91.31f, 104.0f),
                    PathNode.LineTo(120.0f, 132.69f),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
