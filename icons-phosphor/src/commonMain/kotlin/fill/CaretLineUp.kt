package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorFillIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 186.34f),
                    PathNode.CurveTo(215.95064f, 188.6281f, 216.63632f, 192.07126f, 215.39697f, 195.06232f),
                    PathNode.CurveTo(214.15764f, 198.05338f, 211.23764f, 200.00255f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(44.76235f, 200.00255f, 41.84236f, 198.05338f, 40.60302f, 195.06232f),
                    PathNode.CurveTo(39.363674f, 192.07126f, 40.04936f, 188.6281f, 42.34f, 186.34f),
                    PathNode.LineTo(122.34f, 106.34f),
                    PathNode.CurveTo(123.840546f, 104.83778f, 125.876724f, 103.993706f, 128.0f, 103.993706f),
                    PathNode.CurveTo(130.12328f, 103.993706f, 132.15945f, 104.83778f, 133.66f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(212.41827f, 80.0f, 216.0f, 76.41828f, 216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 67.58172f, 212.41827f, 64.0f, 208.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(43.581722f, 64.0f, 40.0f, 67.58172f, 40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 76.41828f, 43.581722f, 80.0f, 48.0f, 80.0f),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
