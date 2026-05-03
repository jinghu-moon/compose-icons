package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorBoldIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(20.954306f, 44.0f, 12.0f, 52.954304f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 192.0f),
                    PathNode.CurveTo(12.0f, 203.0457f, 20.954306f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(99.183556f, 212.0025f, 102.23763f, 210.73987f, 104.49f, 208.49f),
                    PathNode.LineTo(128.0f, 185.0f),
                    PathNode.LineTo(151.51f, 208.52f),
                    PathNode.CurveTo(153.76727f, 210.75887f, 156.82074f, 212.01047f, 160.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(235.0457f, 212.0f, 244.0f, 203.0457f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 52.954304f, 235.0457f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(165.0f, 188.0f),
                    PathNode.LineTo(142.17f, 165.17f),
                    PathNode.CurveTo(134.36f, 157.36237f, 121.7f, 157.36237f, 113.89f, 165.17f),
                    PathNode.LineTo(91.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 68.0f),
                    PathNode.LineTo(220.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 160.0f),
                    PathNode.CurveTo(100.77768f, 160.0f, 116.0f, 144.77768f, 116.0f, 126.0f),
                    PathNode.CurveTo(116.0f, 107.22232f, 100.77768f, 92.0f, 82.0f, 92.0f),
                    PathNode.CurveTo(63.222317f, 92.0f, 48.0f, 107.22232f, 48.0f, 126.0f),
                    PathNode.CurveTo(48.0f, 144.77768f, 63.222317f, 160.0f, 82.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 116.0f),
                    PathNode.CurveTo(87.52285f, 116.0f, 92.0f, 120.47715f, 92.0f, 126.0f),
                    PathNode.CurveTo(92.0f, 131.52284f, 87.52285f, 136.0f, 82.0f, 136.0f),
                    PathNode.CurveTo(76.47715f, 136.0f, 72.0f, 131.52284f, 72.0f, 126.0f),
                    PathNode.CurveTo(72.0f, 120.47715f, 76.47715f, 116.0f, 82.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 160.0f),
                    PathNode.CurveTo(192.77768f, 160.0f, 208.0f, 144.77768f, 208.0f, 126.0f),
                    PathNode.CurveTo(208.0f, 107.22232f, 192.77768f, 92.0f, 174.0f, 92.0f),
                    PathNode.CurveTo(155.22232f, 92.0f, 140.0f, 107.22232f, 140.0f, 126.0f),
                    PathNode.CurveTo(140.0f, 144.77768f, 155.22232f, 160.0f, 174.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 116.0f),
                    PathNode.CurveTo(179.52284f, 116.0f, 184.0f, 120.47715f, 184.0f, 126.0f),
                    PathNode.CurveTo(184.0f, 131.52284f, 179.52284f, 136.0f, 174.0f, 136.0f),
                    PathNode.CurveTo(168.47716f, 136.0f, 164.0f, 131.52284f, 164.0f, 126.0f),
                    PathNode.CurveTo(164.0f, 120.47715f, 168.47716f, 116.0f, 174.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
