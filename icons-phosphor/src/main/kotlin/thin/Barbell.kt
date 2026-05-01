package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorThinIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 124.0f),
                    PathNode.LineTo(236.0f, 124.0f),
                    PathNode.LineTo(236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 81.37258f, 230.62741f, 76.0f, 224.0f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 64.0f),
                    PathNode.CurveTo(204.0f, 57.37258f, 198.62741f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(168.0f, 52.0f),
                    PathNode.CurveTo(161.37259f, 52.0f, 156.0f, 57.37258f, 156.0f, 64.0f),
                    PathNode.LineTo(156.0f, 124.0f),
                    PathNode.LineTo(100.0f, 124.0f),
                    PathNode.LineTo(100.0f, 64.0f),
                    PathNode.CurveTo(100.0f, 57.37258f, 94.62742f, 52.0f, 88.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(57.37258f, 52.0f, 52.0f, 57.37258f, 52.0f, 64.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(25.372583f, 76.0f, 20.0f, 81.37258f, 20.0f, 88.0f),
                    PathNode.LineTo(20.0f, 124.0f),
                    PathNode.LineTo(8.0f, 124.0f),
                    PathNode.CurveTo(5.790861f, 124.0f, 4.0f, 125.79086f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 130.20914f, 5.790861f, 132.0f, 8.0f, 132.0f),
                    PathNode.LineTo(20.0f, 132.0f),
                    PathNode.LineTo(20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 174.62741f, 25.372583f, 180.0f, 32.0f, 180.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.LineTo(52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 198.62741f, 57.37258f, 204.0f, 64.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(94.62742f, 204.0f, 100.0f, 198.62741f, 100.0f, 192.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(156.0f, 132.0f),
                    PathNode.LineTo(156.0f, 192.0f),
                    PathNode.CurveTo(156.0f, 198.62741f, 161.37259f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(198.62741f, 204.0f, 204.0f, 198.62741f, 204.0f, 192.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(230.62741f, 180.0f, 236.0f, 174.62741f, 236.0f, 168.0f),
                    PathNode.LineTo(236.0f, 132.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(250.20914f, 132.0f, 252.0f, 130.20914f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 125.79086f, 250.20914f, 124.0f, 248.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 172.0f),
                    PathNode.CurveTo(29.790861f, 172.0f, 28.0f, 170.20914f, 28.0f, 168.0f),
                    PathNode.LineTo(28.0f, 88.0f),
                    PathNode.CurveTo(28.0f, 85.79086f, 29.790861f, 84.0f, 32.0f, 84.0f),
                    PathNode.LineTo(52.0f, 84.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 194.20914f, 90.20914f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(64.0f, 196.0f),
                    PathNode.CurveTo(61.79086f, 196.0f, 60.0f, 194.20914f, 60.0f, 192.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 61.79086f, 61.79086f, 60.0f, 64.0f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(90.20914f, 60.0f, 92.0f, 61.79086f, 92.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 194.20914f, 194.20914f, 196.0f, 192.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(165.79086f, 196.0f, 164.0f, 194.20914f, 164.0f, 192.0f),
                    PathNode.LineTo(164.0f, 64.0f),
                    PathNode.CurveTo(164.0f, 61.79086f, 165.79086f, 60.0f, 168.0f, 60.0f),
                    PathNode.LineTo(192.0f, 60.0f),
                    PathNode.CurveTo(194.20914f, 60.0f, 196.0f, 61.79086f, 196.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 170.20914f, 226.20914f, 172.0f, 224.0f, 172.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(204.0f, 84.0f),
                    PathNode.LineTo(224.0f, 84.0f),
                    PathNode.CurveTo(226.20914f, 84.0f, 228.0f, 85.79086f, 228.0f, 88.0f),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
