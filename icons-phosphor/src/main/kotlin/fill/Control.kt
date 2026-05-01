package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorFillIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.39f, 123.06f),
                    PathNode.CurveTo(206.15236f, 126.04962f, 203.23566f, 127.99934f, 200.0f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.CurveTo(52.76235f, 128.00255f, 49.84236f, 126.05338f, 48.60302f, 123.062325f),
                    PathNode.CurveTo(47.363674f, 120.07126f, 48.04936f, 116.62809f, 50.34f, 114.34f),
                    PathNode.LineTo(122.34f, 42.34f),
                    PathNode.CurveTo(123.840546f, 40.837784f, 125.876724f, 39.993706f, 128.0f, 39.993706f),
                    PathNode.CurveTo(130.12328f, 39.993706f, 132.15945f, 40.837784f, 133.66f, 42.34f),
                    PathNode.LineTo(205.66f, 114.34f),
                    PathNode.CurveTo(207.94725f, 116.62924f, 208.63007f, 120.07096f, 207.39f, 123.06f),
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
        return _control!!
    }

private var _control: ImageVector? = null
