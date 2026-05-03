package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorRegularIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 203.34622f, 179.34622f, 232.0f, 144.0f, 232.0f),
                    PathNode.CurveTo(108.65378f, 232.0f, 80.0f, 203.34622f, 80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 51.31f),
                    PathNode.LineTo(45.66f, 85.66f),
                    PathNode.CurveTo(42.53407f, 88.785934f, 37.46593f, 88.785934f, 34.34f, 85.66f),
                    PathNode.CurveTo(31.21407f, 82.534065f, 31.21407f, 77.465935f, 34.34f, 74.34f),
                    PathNode.LineTo(82.34f, 26.34f),
                    PathNode.CurveTo(83.840546f, 24.837784f, 85.876724f, 23.993708f, 88.0f, 23.993708f),
                    PathNode.CurveTo(90.123276f, 23.993708f, 92.159454f, 24.837784f, 93.66f, 26.34f),
                    PathNode.LineTo(141.66f, 74.34f),
                    PathNode.CurveTo(144.78593f, 77.465935f, 144.78593f, 82.534065f, 141.66f, 85.66f),
                    PathNode.CurveTo(138.53407f, 88.785934f, 133.46593f, 88.785934f, 130.34f, 85.66f),
                    PathNode.LineTo(96.0f, 51.31f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 194.50967f, 117.49033f, 216.0f, 144.0f, 216.0f),
                    PathNode.CurveTo(170.50967f, 216.0f, 192.0f, 194.50967f, 192.0f, 168.0f),
                    PathNode.LineTo(192.0f, 80.0f),
                    PathNode.CurveTo(192.0f, 75.58172f, 195.58173f, 72.0f, 200.0f, 72.0f),
                    PathNode.CurveTo(204.41827f, 72.0f, 208.0f, 75.58172f, 208.0f, 80.0f),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
