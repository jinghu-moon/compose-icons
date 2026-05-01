package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorFillIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 204.41827f, 184.0f, 200.0f, 184.0f),
                    PathNode.CurveTo(195.58173f, 184.0f, 192.0f, 180.41827f, 192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 61.490334f, 170.50967f, 40.0f, 144.0f, 40.0f),
                    PathNode.CurveTo(117.49033f, 40.0f, 96.0f, 61.490334f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(139.23764f, 167.99745f, 142.15764f, 169.94662f, 143.39697f, 172.93768f),
                    PathNode.CurveTo(144.63632f, 175.92874f, 143.95064f, 179.3719f, 141.66f, 181.66f),
                    PathNode.LineTo(93.66f, 229.66f),
                    PathNode.CurveTo(92.159454f, 231.16223f, 90.123276f, 232.00629f, 88.0f, 232.00629f),
                    PathNode.CurveTo(85.876724f, 232.00629f, 83.840546f, 231.16223f, 82.34f, 229.66f),
                    PathNode.LineTo(34.34f, 181.66f),
                    PathNode.CurveTo(32.04936f, 179.3719f, 31.36368f, 175.92874f, 32.60302f, 172.93768f),
                    PathNode.CurveTo(33.84236f, 169.94662f, 36.76235f, 167.99745f, 40.0f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(80.0f, 52.653774f, 108.65378f, 24.0f, 144.0f, 24.0f),
                    PathNode.CurveTo(179.34622f, 24.0f, 208.0f, 52.653774f, 208.0f, 88.0f),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
