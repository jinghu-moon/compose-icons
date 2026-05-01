package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorFillIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(101.66f, 133.66f),
                    PathNode.LineTo(69.66f, 165.66f),
                    PathNode.CurveTo(67.37191f, 167.95064f, 63.928738f, 168.63632f, 60.93768f, 167.39697f),
                    PathNode.CurveTo(57.94662f, 166.15764f, 55.99745f, 163.23764f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 123.58172f, 19.581722f, 120.0f, 24.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(55.99745f, 92.762344f, 57.94662f, 89.84236f, 60.93768f, 88.60302f),
                    PathNode.CurveTo(63.928738f, 87.36368f, 67.37191f, 88.04936f, 69.66f, 90.34f),
                    PathNode.LineTo(101.66f, 122.34f),
                    PathNode.CurveTo(103.16222f, 123.840546f, 104.006294f, 125.876724f, 104.006294f, 128.0f),
                    PathNode.CurveTo(104.006294f, 130.12328f, 103.16222f, 132.15945f, 101.66f, 133.66f),
                    PathNode.Close,
                    PathNode.MoveTo(122.34f, 101.66f),
                    PathNode.CurveTo(123.840546f, 103.16222f, 125.876724f, 104.006294f, 128.0f, 104.006294f),
                    PathNode.CurveTo(130.12328f, 104.006294f, 132.15945f, 103.16222f, 133.66f, 101.66f),
                    PathNode.LineTo(165.66f, 69.66f),
                    PathNode.CurveTo(167.95064f, 67.37191f, 168.63632f, 63.928738f, 167.39697f, 60.93768f),
                    PathNode.CurveTo(166.15764f, 57.94662f, 163.23764f, 55.99745f, 160.0f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(92.762344f, 55.99745f, 89.84236f, 57.94662f, 88.60302f, 60.93768f),
                    PathNode.CurveTo(87.36368f, 63.928738f, 88.04936f, 67.37191f, 90.34f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 154.34f),
                    PathNode.CurveTo(132.15945f, 152.83777f, 130.12328f, 151.99371f, 128.0f, 151.99371f),
                    PathNode.CurveTo(125.876724f, 151.99371f, 123.840546f, 152.83777f, 122.34f, 154.34f),
                    PathNode.LineTo(90.34f, 186.34f),
                    PathNode.CurveTo(88.04936f, 188.6281f, 87.36368f, 192.07126f, 88.60302f, 195.06232f),
                    PathNode.CurveTo(89.84236f, 198.05338f, 92.762344f, 200.00255f, 96.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(163.23764f, 200.00255f, 166.15764f, 198.05338f, 167.39697f, 195.06232f),
                    PathNode.CurveTo(168.63632f, 192.07126f, 167.95064f, 188.6281f, 165.66f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.CurveTo(200.00255f, 92.762344f, 198.05338f, 89.84236f, 195.06232f, 88.60302f),
                    PathNode.CurveTo(192.07126f, 87.36368f, 188.6281f, 88.04936f, 186.34f, 90.34f),
                    PathNode.LineTo(154.34f, 122.34f),
                    PathNode.CurveTo(152.83777f, 123.840546f, 151.99371f, 125.876724f, 151.99371f, 128.0f),
                    PathNode.CurveTo(151.99371f, 130.12328f, 152.83777f, 132.15945f, 154.34f, 133.66f),
                    PathNode.LineTo(186.34f, 165.66f),
                    PathNode.CurveTo(188.6281f, 167.95064f, 192.07126f, 168.63632f, 195.06232f, 167.39697f),
                    PathNode.CurveTo(198.05338f, 166.15764f, 200.00255f, 163.23764f, 200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
