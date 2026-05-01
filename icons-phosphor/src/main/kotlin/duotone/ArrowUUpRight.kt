package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorDuotoneIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.94f, 143.39f),
                    PathNode.CurveTo(175.92903f, 144.63007f, 179.37076f, 143.94725f, 181.66f, 141.66f),
                    PathNode.LineTo(229.66f, 93.66f),
                    PathNode.CurveTo(231.16223f, 92.159454f, 232.00629f, 90.123276f, 232.00629f, 88.0f),
                    PathNode.CurveTo(232.00629f, 85.876724f, 231.16223f, 83.840546f, 229.66f, 82.34f),
                    PathNode.LineTo(181.66f, 34.34f),
                    PathNode.CurveTo(179.3719f, 32.04936f, 175.92874f, 31.36368f, 172.93768f, 32.60302f),
                    PathNode.CurveTo(169.94662f, 33.84236f, 167.99745f, 36.76235f, 168.0f, 40.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.CurveTo(52.653774f, 80.0f, 24.0f, 108.65378f, 24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 179.34622f, 52.653774f, 208.0f, 88.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(180.41827f, 208.0f, 184.0f, 204.41827f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 195.58173f, 180.41827f, 192.0f, 176.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(61.490334f, 192.0f, 40.0f, 170.50967f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 117.49033f, 61.490334f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.CurveTo(168.00067f, 139.23566f, 169.95038f, 142.15236f, 172.94f, 143.39f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 59.31f),
                    PathNode.LineTo(212.69f, 88.0f),
                    PathNode.LineTo(184.0f, 116.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
