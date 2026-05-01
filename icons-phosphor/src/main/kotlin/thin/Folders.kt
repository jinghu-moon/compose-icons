package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorThinIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 68.0f),
                    PathNode.LineTo(153.33f, 68.0f),
                    PathNode.LineTo(124.53f, 46.4f),
                    PathNode.CurveTo(122.45116f, 44.845356f, 119.92586f, 44.00359f, 117.33f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(65.37258f, 44.0f, 60.0f, 49.37258f, 60.0f, 56.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 81.37258f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(192.89f, 212.0f),
                    PathNode.CurveTo(199.0236f, 211.99449f, 203.99449f, 207.0236f, 204.0f, 200.89f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(224.89f, 180.0f),
                    PathNode.CurveTo(231.0236f, 179.99449f, 235.99449f, 175.0236f, 236.0f, 168.89f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 200.89f),
                    PathNode.CurveTo(195.9945f, 202.60533f, 194.60533f, 203.9945f, 192.89f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.0f, 85.79086f, 37.79086f, 84.0f, 40.0f, 84.0f),
                    PathNode.LineTo(85.33f, 84.0f),
                    PathNode.CurveTo(86.19548f, 84.0f, 87.03761f, 84.28071f, 87.73f, 84.8f),
                    PathNode.LineTo(117.6f, 107.2f),
                    PathNode.CurveTo(118.29238f, 107.71929f, 119.13452f, 108.0f, 120.0f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(194.20914f, 108.0f, 196.0f, 109.79086f, 196.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 168.89f),
                    PathNode.CurveTo(227.9945f, 170.60533f, 226.60533f, 171.9945f, 224.89f, 172.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 105.37258f, 198.62741f, 100.0f, 192.0f, 100.0f),
                    PathNode.LineTo(121.33f, 100.0f),
                    PathNode.LineTo(92.53f, 78.4f),
                    PathNode.CurveTo(90.45116f, 76.84536f, 87.92586f, 76.003586f, 85.33f, 76.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.LineTo(68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 53.79086f, 69.79086f, 52.0f, 72.0f, 52.0f),
                    PathNode.LineTo(117.33f, 52.0f),
                    PathNode.CurveTo(118.19548f, 52.0f, 119.03761f, 52.280712f, 119.73f, 52.8f),
                    PathNode.LineTo(149.6f, 75.2f),
                    PathNode.CurveTo(150.29239f, 75.71929f, 151.13452f, 76.0f, 152.0f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(226.20914f, 76.0f, 228.0f, 77.79086f, 228.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folders!!
    }

private var _folders: ImageVector? = null
