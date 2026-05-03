package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorDuotoneIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.LineTo(112.0f, 128.0f),
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
                    PathNode.MoveTo(195.06f, 40.61f),
                    PathNode.CurveTo(192.07097f, 39.369938f, 188.62924f, 40.052757f, 186.34f, 42.34f),
                    PathNode.LineTo(106.34f, 122.34f),
                    PathNode.CurveTo(104.83778f, 123.840546f, 103.993706f, 125.876724f, 103.993706f, 128.0f),
                    PathNode.CurveTo(103.993706f, 130.12328f, 104.83778f, 132.15945f, 106.34f, 133.66f),
                    PathNode.LineTo(186.34f, 213.66f),
                    PathNode.CurveTo(188.6281f, 215.95064f, 192.07126f, 216.63632f, 195.06232f, 215.39697f),
                    PathNode.CurveTo(198.05338f, 214.15764f, 200.00255f, 211.23764f, 200.0f, 208.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(199.99933f, 44.764324f, 198.04962f, 41.847645f, 195.06f, 40.61f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 188.69f),
                    PathNode.LineTo(123.31f, 128.0f),
                    PathNode.LineTo(184.0f, 67.31f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 212.41827f, 76.41828f, 216.0f, 72.0f, 216.0f),
                    PathNode.CurveTo(67.58172f, 216.0f, 64.0f, 212.41827f, 64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 43.581722f, 67.58172f, 40.0f, 72.0f, 40.0f),
                    PathNode.CurveTo(76.41828f, 40.0f, 80.0f, 43.581722f, 80.0f, 48.0f),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
