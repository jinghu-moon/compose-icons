package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorFillIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.39f, 163.06f),
                    PathNode.CurveTo(214.15236f, 166.04962f, 211.23566f, 167.99933f, 208.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(44.76235f, 168.00255f, 41.84236f, 166.05338f, 40.60302f, 163.06232f),
                    PathNode.CurveTo(39.363674f, 160.07126f, 40.04936f, 156.6281f, 42.34f, 154.34f),
                    PathNode.LineTo(122.34f, 74.34f),
                    PathNode.CurveTo(123.840546f, 72.83778f, 125.876724f, 71.993706f, 128.0f, 71.993706f),
                    PathNode.CurveTo(130.12328f, 71.993706f, 132.15945f, 72.83778f, 133.66f, 74.34f),
                    PathNode.LineTo(213.66f, 154.34f),
                    PathNode.CurveTo(215.94725f, 156.62924f, 216.63007f, 160.07097f, 215.39f, 163.06f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
