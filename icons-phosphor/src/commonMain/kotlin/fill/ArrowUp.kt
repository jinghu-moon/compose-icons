package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorFillIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.39f, 115.06f),
                    PathNode.CurveTo(206.15236f, 118.04962f, 203.23566f, 119.99934f, 200.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(52.76235f, 120.00255f, 49.84236f, 118.05338f, 48.60302f, 115.062325f),
                    PathNode.CurveTo(47.363674f, 112.07126f, 48.04936f, 108.62809f, 50.34f, 106.34f),
                    PathNode.LineTo(122.34f, 34.34f),
                    PathNode.CurveTo(123.840546f, 32.837784f, 125.876724f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(130.12328f, 31.993708f, 132.15945f, 32.837784f, 133.66f, 34.34f),
                    PathNode.LineTo(205.66f, 106.34f),
                    PathNode.CurveTo(207.94725f, 108.62924f, 208.63007f, 112.07096f, 207.39f, 115.06f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
