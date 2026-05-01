package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorFillIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.00255f, 211.23764f, 166.05338f, 214.15764f, 163.06232f, 215.39697f),
                    PathNode.CurveTo(160.07126f, 216.63632f, 156.6281f, 215.95064f, 154.34f, 213.66f),
                    PathNode.LineTo(74.34f, 133.66f),
                    PathNode.CurveTo(72.83778f, 132.15945f, 71.993706f, 130.12328f, 71.993706f, 128.0f),
                    PathNode.CurveTo(71.993706f, 125.876724f, 72.83778f, 123.840546f, 74.34f, 122.34f),
                    PathNode.LineTo(154.34f, 42.34f),
                    PathNode.CurveTo(156.6281f, 40.04936f, 160.07126f, 39.363674f, 163.06232f, 40.60302f),
                    PathNode.CurveTo(166.05338f, 41.84236f, 168.00255f, 44.76235f, 168.0f, 48.0f),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
