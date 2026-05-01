package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorFillIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.34f, 69.66f),
                    PathNode.CurveTo(88.04936f, 67.37191f, 87.36368f, 63.928738f, 88.60302f, 60.93768f),
                    PathNode.CurveTo(89.84236f, 57.94662f, 92.762344f, 55.99745f, 96.0f, 56.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 11.581722f, 123.58172f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(132.41827f, 8.0f, 136.0f, 11.581722f, 136.0f, 16.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(163.23764f, 55.99745f, 166.15764f, 57.94662f, 167.39697f, 60.93768f),
                    PathNode.CurveTo(168.63632f, 63.928738f, 167.95064f, 67.37191f, 165.66f, 69.66f),
                    PathNode.LineTo(133.66f, 101.66f),
                    PathNode.CurveTo(132.15945f, 103.16222f, 130.12328f, 104.006294f, 128.0f, 104.006294f),
                    PathNode.CurveTo(125.876724f, 104.006294f, 123.840546f, 103.16222f, 122.34f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 154.34f),
                    PathNode.CurveTo(132.15945f, 152.83777f, 130.12328f, 151.99371f, 128.0f, 151.99371f),
                    PathNode.CurveTo(125.876724f, 151.99371f, 123.840546f, 152.83777f, 122.34f, 154.34f),
                    PathNode.LineTo(90.34f, 186.34f),
                    PathNode.CurveTo(88.04936f, 188.6281f, 87.36368f, 192.07126f, 88.60302f, 195.06232f),
                    PathNode.CurveTo(89.84236f, 198.05338f, 92.762344f, 200.00255f, 96.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.CurveTo(163.23764f, 200.00255f, 166.15764f, 198.05338f, 167.39697f, 195.06232f),
                    PathNode.CurveTo(168.63632f, 192.07126f, 167.95064f, 188.6281f, 165.66f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
