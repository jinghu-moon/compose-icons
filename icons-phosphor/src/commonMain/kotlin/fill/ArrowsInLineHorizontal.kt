package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorFillIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(101.66f, 122.34f),
                    PathNode.CurveTo(103.16222f, 123.840546f, 104.006294f, 125.876724f, 104.006294f, 128.0f),
                    PathNode.CurveTo(104.006294f, 130.12328f, 103.16222f, 132.15945f, 101.66f, 133.66f),
                    PathNode.LineTo(69.66f, 165.66f),
                    PathNode.CurveTo(67.37191f, 167.95064f, 63.928738f, 168.63632f, 60.93768f, 167.39697f),
                    PathNode.CurveTo(57.94662f, 166.15764f, 55.99745f, 163.23764f, 56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(11.581722f, 136.0f, 8.0f, 132.41827f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 123.58172f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.CurveTo(55.99745f, 92.762344f, 57.94662f, 89.84236f, 60.93768f, 88.60302f),
                    PathNode.CurveTo(63.928738f, 87.36368f, 67.37191f, 88.04936f, 69.66f, 90.34f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 120.0f),
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
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
