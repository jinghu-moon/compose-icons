package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorFillIcon(
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
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(36.76235f, 88.00255f, 33.84236f, 86.05338f, 32.60302f, 83.062325f),
                    PathNode.CurveTo(31.36368f, 80.07126f, 32.04936f, 76.62809f, 34.34f, 74.34f),
                    PathNode.LineTo(82.34f, 26.34f),
                    PathNode.CurveTo(83.840546f, 24.837784f, 85.876724f, 23.993708f, 88.0f, 23.993708f),
                    PathNode.CurveTo(90.123276f, 23.993708f, 92.159454f, 24.837784f, 93.66f, 26.34f),
                    PathNode.LineTo(141.66f, 74.34f),
                    PathNode.CurveTo(143.95064f, 76.62809f, 144.63632f, 80.07126f, 143.39697f, 83.062325f),
                    PathNode.CurveTo(142.15764f, 86.05338f, 139.23764f, 88.00255f, 136.0f, 88.0f),
                    PathNode.LineTo(96.0f, 88.0f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
