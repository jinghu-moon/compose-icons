package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorFillIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(61.490334f, 96.0f, 40.0f, 117.49033f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 170.50967f, 61.490334f, 192.0f, 88.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(180.41827f, 192.0f, 184.0f, 195.58173f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 180.41827f, 208.0f, 176.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(52.653774f, 208.0f, 24.0f, 179.34622f, 24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 108.65378f, 52.653774f, 80.0f, 88.0f, 80.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(167.99745f, 36.76235f, 169.94662f, 33.84236f, 172.93768f, 32.60302f),
                    PathNode.CurveTo(175.92874f, 31.36368f, 179.3719f, 32.04936f, 181.66f, 34.34f),
                    PathNode.LineTo(229.66f, 82.34f),
                    PathNode.CurveTo(231.16223f, 83.840546f, 232.00629f, 85.876724f, 232.00629f, 88.0f),
                    PathNode.CurveTo(232.00629f, 90.123276f, 231.16223f, 92.159454f, 229.66f, 93.66f),
                    PathNode.LineTo(181.66f, 141.66f),
                    PathNode.CurveTo(179.3719f, 143.95064f, 175.92874f, 144.63632f, 172.93768f, 143.39697f),
                    PathNode.CurveTo(169.94662f, 142.15764f, 167.99745f, 139.23764f, 168.0f, 136.0f),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
