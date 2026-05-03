package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorDuotoneIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(88.0f, 32.0f),
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
                    PathNode.MoveTo(200.0f, 72.0f),
                    PathNode.CurveTo(195.58173f, 72.0f, 192.0f, 75.58172f, 192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 194.50967f, 170.50967f, 216.0f, 144.0f, 216.0f),
                    PathNode.CurveTo(117.49033f, 216.0f, 96.0f, 194.50967f, 96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(139.23764f, 88.00255f, 142.15764f, 86.05338f, 143.39697f, 83.062325f),
                    PathNode.CurveTo(144.63632f, 80.07126f, 143.95064f, 76.62809f, 141.66f, 74.34f),
                    PathNode.LineTo(93.66f, 26.34f),
                    PathNode.CurveTo(92.159454f, 24.837784f, 90.123276f, 23.993708f, 88.0f, 23.993708f),
                    PathNode.CurveTo(85.876724f, 23.993708f, 83.840546f, 24.837784f, 82.34f, 26.34f),
                    PathNode.LineTo(34.34f, 74.34f),
                    PathNode.CurveTo(32.04936f, 76.62809f, 31.36368f, 80.07126f, 32.60302f, 83.062325f),
                    PathNode.CurveTo(33.84236f, 86.05338f, 36.76235f, 88.00255f, 40.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(80.0f, 203.34622f, 108.65378f, 232.0f, 144.0f, 232.0f),
                    PathNode.CurveTo(179.34622f, 232.0f, 208.0f, 203.34622f, 208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(208.0f, 75.58172f, 204.41827f, 72.0f, 200.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 43.31f),
                    PathNode.LineTo(116.69f, 72.0f),
                    PathNode.LineTo(59.31f, 72.0f),
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
