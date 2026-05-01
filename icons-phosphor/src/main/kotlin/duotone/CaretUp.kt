package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorDuotoneIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(128.0f, 80.0f),
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
                    PathNode.MoveTo(213.66f, 154.34f),
                    PathNode.LineTo(133.66f, 74.34f),
                    PathNode.CurveTo(132.15945f, 72.83778f, 130.12328f, 71.993706f, 128.0f, 71.993706f),
                    PathNode.CurveTo(125.876724f, 71.993706f, 123.840546f, 72.83778f, 122.34f, 74.34f),
                    PathNode.LineTo(42.34f, 154.34f),
                    PathNode.CurveTo(40.04936f, 156.6281f, 39.363674f, 160.07126f, 40.60302f, 163.06232f),
                    PathNode.CurveTo(41.84236f, 166.05338f, 44.76235f, 168.00255f, 48.0f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(211.23764f, 168.00255f, 214.15764f, 166.05338f, 215.39697f, 163.06232f),
                    PathNode.CurveTo(216.63632f, 160.07126f, 215.95064f, 156.6281f, 213.66f, 154.34f),
                    PathNode.Close,
                    PathNode.MoveTo(67.31f, 152.0f),
                    PathNode.LineTo(128.0f, 91.31f),
                    PathNode.LineTo(188.69f, 152.0f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
