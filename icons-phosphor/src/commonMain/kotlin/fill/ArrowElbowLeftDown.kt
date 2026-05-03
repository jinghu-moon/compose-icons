package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorFillIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.CurveTo(240.0f, 76.41828f, 236.41827f, 80.0f, 232.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(139.23764f, 159.99745f, 142.15764f, 161.94662f, 143.39697f, 164.93768f),
                    PathNode.CurveTo(144.63632f, 167.92874f, 143.95064f, 171.3719f, 141.66f, 173.66f),
                    PathNode.LineTo(93.66f, 221.66f),
                    PathNode.CurveTo(92.159454f, 223.16223f, 90.123276f, 224.00629f, 88.0f, 224.00629f),
                    PathNode.CurveTo(85.876724f, 224.00629f, 83.840546f, 223.16223f, 82.34f, 221.66f),
                    PathNode.LineTo(34.34f, 173.66f),
                    PathNode.CurveTo(32.04936f, 171.3719f, 31.36368f, 167.92874f, 32.60302f, 164.93768f),
                    PathNode.CurveTo(33.84236f, 161.94662f, 36.76235f, 159.99745f, 40.0f, 160.0f),
                    PathNode.LineTo(80.0f, 160.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 67.58172f, 83.58172f, 64.0f, 88.0f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(236.41827f, 64.0f, 240.0f, 67.58172f, 240.0f, 72.0f),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
