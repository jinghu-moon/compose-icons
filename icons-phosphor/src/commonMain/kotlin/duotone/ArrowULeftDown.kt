package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorDuotoneIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.LineTo(40.0f, 176.0f),
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
                    PathNode.MoveTo(144.0f, 24.0f),
                    PathNode.CurveTo(108.66977f, 24.03858f, 80.03858f, 52.66977f, 80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(36.76235f, 167.99745f, 33.84236f, 169.94662f, 32.60302f, 172.93768f),
                    PathNode.CurveTo(31.36368f, 175.92874f, 32.04936f, 179.3719f, 34.34f, 181.66f),
                    PathNode.LineTo(82.34f, 229.66f),
                    PathNode.CurveTo(83.840546f, 231.16223f, 85.876724f, 232.00629f, 88.0f, 232.00629f),
                    PathNode.CurveTo(90.123276f, 232.00629f, 92.159454f, 231.16223f, 93.66f, 229.66f),
                    PathNode.LineTo(141.66f, 181.66f),
                    PathNode.CurveTo(143.95064f, 179.3719f, 144.63632f, 175.92874f, 143.39697f, 172.93768f),
                    PathNode.CurveTo(142.15764f, 169.94662f, 139.23764f, 167.99745f, 136.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.CurveTo(96.0f, 61.490334f, 117.49033f, 40.0f, 144.0f, 40.0f),
                    PathNode.CurveTo(170.50967f, 40.0f, 192.0f, 61.490334f, 192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 180.41827f, 195.58173f, 184.0f, 200.0f, 184.0f),
                    PathNode.CurveTo(204.41827f, 184.0f, 208.0f, 180.41827f, 208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(207.96143f, 52.66977f, 179.33023f, 24.03858f, 144.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 212.69f),
                    PathNode.LineTo(59.31f, 184.0f),
                    PathNode.LineTo(116.69f, 184.0f),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
