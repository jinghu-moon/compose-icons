package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = phosphorThinIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.LineTo(96.0f, 28.0f),
                    PathNode.CurveTo(89.37258f, 28.0f, 84.0f, 33.37258f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(57.37258f, 60.0f, 52.0f, 65.37258f, 52.0f, 72.0f),
                    PathNode.LineTo(52.0f, 224.0f),
                    PathNode.CurveTo(52.000496f, 225.49922f, 52.83931f, 226.8723f, 54.173023f, 227.55707f),
                    PathNode.CurveTo(55.506733f, 228.24184f, 57.11138f, 228.1233f, 58.33f, 227.25f),
                    PathNode.LineTo(112.0f, 188.92f),
                    PathNode.LineTo(165.69f, 227.25f),
                    PathNode.CurveTo(166.36182f, 227.737f, 167.17024f, 227.99948f, 168.0f, 228.0f),
                    PathNode.CurveTo(168.63596f, 227.99796f, 169.26263f, 227.84729f, 169.83f, 227.56f),
                    PathNode.CurveTo(171.16348f, 226.87393f, 172.00119f, 225.49962f, 172.0f, 224.0f),
                    PathNode.LineTo(172.0f, 176.92f),
                    PathNode.LineTo(197.68f, 195.25f),
                    PathNode.CurveTo(198.35457f, 195.73901f, 199.16684f, 196.00159f, 200.0f, 196.0f),
                    PathNode.CurveTo(200.63596f, 195.99796f, 201.26263f, 195.84729f, 201.83f, 195.56f),
                    PathNode.CurveTo(203.16348f, 194.87393f, 204.00119f, 193.49962f, 204.0f, 192.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 216.23f),
                    PathNode.LineTo(114.32f, 180.75f),
                    PathNode.CurveTo(112.92919f, 179.75653f, 111.060814f, 179.75653f, 109.67f, 180.75f),
                    PathNode.LineTo(60.0f, 216.23f),
                    PathNode.LineTo(60.0f, 72.0f),
                    PathNode.CurveTo(60.0f, 69.79086f, 61.79086f, 68.0f, 64.0f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(162.20914f, 68.0f, 164.0f, 69.79086f, 164.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 184.23f),
                    PathNode.LineTo(172.0f, 167.09f),
                    PathNode.LineTo(172.0f, 72.0f),
                    PathNode.CurveTo(172.0f, 65.37258f, 166.62741f, 60.0f, 160.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 40.0f),
                    PathNode.CurveTo(92.0f, 37.79086f, 93.79086f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(194.20914f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
