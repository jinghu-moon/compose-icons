package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorDuotoneIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(128.0f, 48.0f),
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
                    PathNode.MoveTo(205.66f, 114.34f),
                    PathNode.LineTo(133.66f, 42.34f),
                    PathNode.CurveTo(132.15945f, 40.837784f, 130.12328f, 39.993706f, 128.0f, 39.993706f),
                    PathNode.CurveTo(125.876724f, 39.993706f, 123.840546f, 40.837784f, 122.34f, 42.34f),
                    PathNode.LineTo(50.34f, 114.34f),
                    PathNode.CurveTo(48.04936f, 116.62809f, 47.363674f, 120.07126f, 48.60302f, 123.062325f),
                    PathNode.CurveTo(49.84236f, 126.05338f, 52.76235f, 128.00255f, 56.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(203.23764f, 128.00255f, 206.15764f, 126.05338f, 207.39697f, 123.062325f),
                    PathNode.CurveTo(208.63632f, 120.07126f, 207.95064f, 116.62809f, 205.66f, 114.34f),
                    PathNode.Close,
                    PathNode.MoveTo(75.31f, 112.0f),
                    PathNode.LineTo(128.0f, 59.31f),
                    PathNode.LineTo(180.69f, 112.0f),
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
        return _control!!
    }

private var _control: ImageVector? = null
