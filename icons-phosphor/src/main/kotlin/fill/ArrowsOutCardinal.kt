package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorFillIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(64.00255f, 163.23764f, 62.05338f, 166.15764f, 59.06232f, 167.39697f),
                    PathNode.CurveTo(56.071262f, 168.63632f, 52.628094f, 167.95064f, 50.34f, 165.66f),
                    PathNode.LineTo(18.34f, 133.66f),
                    PathNode.CurveTo(16.837784f, 132.15945f, 15.993707f, 130.12328f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 125.876724f, 16.837784f, 123.840546f, 18.34f, 122.34f),
                    PathNode.LineTo(50.34f, 90.34f),
                    PathNode.CurveTo(52.628094f, 88.04936f, 56.071262f, 87.36368f, 59.06232f, 88.60302f),
                    PathNode.CurveTo(62.05338f, 89.84236f, 64.00255f, 92.762344f, 64.0f, 96.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 132.41827f, 100.41828f, 136.0f, 96.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 100.41828f, 123.58172f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(132.41827f, 104.0f, 136.0f, 100.41828f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(163.23764f, 64.00255f, 166.15764f, 62.05338f, 167.39697f, 59.06232f),
                    PathNode.CurveTo(168.63632f, 56.071262f, 167.95064f, 52.628094f, 165.66f, 50.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(90.34f, 50.34f),
                    PathNode.CurveTo(88.04936f, 52.628094f, 87.36368f, 56.071262f, 88.60302f, 59.06232f),
                    PathNode.CurveTo(89.84236f, 62.05338f, 92.762344f, 64.00255f, 96.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 122.34f),
                    PathNode.LineTo(205.66f, 90.34f),
                    PathNode.CurveTo(203.3719f, 88.04936f, 199.92874f, 87.36368f, 196.93768f, 88.60302f),
                    PathNode.CurveTo(193.94662f, 89.84236f, 191.99745f, 92.762344f, 192.0f, 96.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(155.58173f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 155.58173f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(191.99745f, 163.23764f, 193.94662f, 166.15764f, 196.93768f, 167.39697f),
                    PathNode.CurveTo(199.92874f, 168.63632f, 203.3719f, 167.95064f, 205.66f, 165.66f),
                    PathNode.LineTo(237.66f, 133.66f),
                    PathNode.CurveTo(239.16223f, 132.15945f, 240.00629f, 130.12328f, 240.00629f, 128.0f),
                    PathNode.CurveTo(240.00629f, 125.876724f, 239.16223f, 123.840546f, 237.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 155.58173f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 155.58173f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(92.762344f, 191.99745f, 89.84236f, 193.94662f, 88.60302f, 196.93768f),
                    PathNode.CurveTo(87.36368f, 199.92874f, 88.04936f, 203.3719f, 90.34f, 205.66f),
                    PathNode.LineTo(122.34f, 237.66f),
                    PathNode.CurveTo(123.840546f, 239.16223f, 125.876724f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(130.12328f, 240.00629f, 132.15945f, 239.16223f, 133.66f, 237.66f),
                    PathNode.LineTo(165.66f, 205.66f),
                    PathNode.CurveTo(167.95064f, 203.3719f, 168.63632f, 199.92874f, 167.39697f, 196.93768f),
                    PathNode.CurveTo(166.15764f, 193.94662f, 163.23764f, 191.99745f, 160.0f, 192.0f),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
