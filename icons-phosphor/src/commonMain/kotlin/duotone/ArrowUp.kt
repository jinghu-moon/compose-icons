package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorDuotoneIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.LineTo(128.0f, 40.0f),
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
                    PathNode.MoveTo(205.66f, 106.34f),
                    PathNode.LineTo(133.66f, 34.34f),
                    PathNode.CurveTo(132.15945f, 32.837784f, 130.12328f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(125.876724f, 31.993708f, 123.840546f, 32.837784f, 122.34f, 34.34f),
                    PathNode.LineTo(50.34f, 106.34f),
                    PathNode.CurveTo(48.04936f, 108.62809f, 47.363674f, 112.07126f, 48.60302f, 115.062325f),
                    PathNode.CurveTo(49.84236f, 118.05338f, 52.76235f, 120.00255f, 56.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(203.23764f, 120.00255f, 206.15764f, 118.05338f, 207.39697f, 115.062325f),
                    PathNode.CurveTo(208.63632f, 112.07126f, 207.95064f, 108.62809f, 205.66f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(75.31f, 104.0f),
                    PathNode.LineTo(128.0f, 51.31f),
                    PathNode.LineTo(180.69f, 104.0f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
