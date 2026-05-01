package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorFillIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 196.41827f, 236.41827f, 200.0f, 232.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(83.58172f, 200.0f, 80.0f, 196.41827f, 80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(36.76235f, 104.00255f, 33.84236f, 102.05338f, 32.60302f, 99.062325f),
                    PathNode.CurveTo(31.36368f, 96.07126f, 32.04936f, 92.62809f, 34.34f, 90.34f),
                    PathNode.LineTo(82.34f, 42.34f),
                    PathNode.CurveTo(83.840546f, 40.837784f, 85.876724f, 39.993706f, 88.0f, 39.993706f),
                    PathNode.CurveTo(90.123276f, 39.993706f, 92.159454f, 40.837784f, 93.66f, 42.34f),
                    PathNode.LineTo(141.66f, 90.34f),
                    PathNode.CurveTo(143.95064f, 92.62809f, 144.63632f, 96.07126f, 143.39697f, 99.062325f),
                    PathNode.CurveTo(142.15764f, 102.05338f, 139.23764f, 104.00255f, 136.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 187.58173f, 240.0f, 192.0f),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
