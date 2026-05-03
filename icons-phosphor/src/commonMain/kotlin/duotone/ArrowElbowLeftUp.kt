package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorDuotoneIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(88.0f, 48.0f),
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
                    PathNode.MoveTo(232.0f, 184.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(139.23764f, 104.00255f, 142.15764f, 102.05338f, 143.39697f, 99.062325f),
                    PathNode.CurveTo(144.63632f, 96.07126f, 143.95064f, 92.62809f, 141.66f, 90.34f),
                    PathNode.LineTo(93.66f, 42.34f),
                    PathNode.CurveTo(92.159454f, 40.837784f, 90.123276f, 39.993706f, 88.0f, 39.993706f),
                    PathNode.CurveTo(85.876724f, 39.993706f, 83.840546f, 40.837784f, 82.34f, 42.34f),
                    PathNode.LineTo(34.34f, 90.34f),
                    PathNode.CurveTo(32.04936f, 92.62809f, 31.36368f, 96.07126f, 32.60302f, 99.062325f),
                    PathNode.CurveTo(33.84236f, 102.05338f, 36.76235f, 104.00255f, 40.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(80.0f, 196.41827f, 83.58172f, 200.0f, 88.0f, 200.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(236.41827f, 200.0f, 240.0f, 196.41827f, 240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 187.58173f, 236.41827f, 184.0f, 232.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 59.31f),
                    PathNode.LineTo(116.69f, 88.0f),
                    PathNode.LineTo(59.31f, 88.0f),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
