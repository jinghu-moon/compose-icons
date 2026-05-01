package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorDuotoneIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(128.0f, 120.0f),
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
                    PathNode.MoveTo(133.66f, 114.34f),
                    PathNode.CurveTo(132.15945f, 112.83778f, 130.12328f, 111.993706f, 128.0f, 111.993706f),
                    PathNode.CurveTo(125.876724f, 111.993706f, 123.840546f, 112.83778f, 122.34f, 114.34f),
                    PathNode.LineTo(42.34f, 194.34f),
                    PathNode.CurveTo(40.04936f, 196.6281f, 39.363674f, 200.07126f, 40.60302f, 203.06232f),
                    PathNode.CurveTo(41.84236f, 206.05338f, 44.76235f, 208.00255f, 48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(211.23764f, 208.00255f, 214.15764f, 206.05338f, 215.39697f, 203.06232f),
                    PathNode.CurveTo(216.63632f, 200.07126f, 215.95064f, 196.6281f, 213.66f, 194.34f),
                    PathNode.Close,
                    PathNode.MoveTo(67.31f, 192.0f),
                    PathNode.LineTo(128.0f, 131.31f),
                    PathNode.LineTo(188.69f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(42.31f, 125.66f),
                    PathNode.CurveTo(40.807785f, 124.159454f, 39.963707f, 122.123276f, 39.963707f, 120.0f),
                    PathNode.CurveTo(39.963707f, 117.876724f, 40.807785f, 115.840546f, 42.31f, 114.34f),
                    PathNode.LineTo(122.31f, 34.34f),
                    PathNode.CurveTo(123.81055f, 32.837784f, 125.846725f, 31.993708f, 127.97f, 31.993708f),
                    PathNode.CurveTo(130.09328f, 31.993708f, 132.12946f, 32.837784f, 133.63f, 34.34f),
                    PathNode.LineTo(213.63f, 114.34f),
                    PathNode.CurveTo(216.75594f, 117.465935f, 216.75594f, 122.534065f, 213.63f, 125.66f),
                    PathNode.CurveTo(210.50407f, 128.78593f, 205.43594f, 128.78593f, 202.31f, 125.66f),
                    PathNode.LineTo(128.0f, 51.31f),
                    PathNode.LineTo(53.66f, 125.66f),
                    PathNode.CurveTo(52.159454f, 127.16222f, 50.123276f, 128.00629f, 48.0f, 128.00629f),
                    PathNode.CurveTo(45.876724f, 128.00629f, 43.840546f, 127.16222f, 42.34f, 125.66f),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
