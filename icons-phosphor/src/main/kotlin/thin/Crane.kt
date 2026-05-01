package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorThinIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.06f, 20.57f),
                    PathNode.CurveTo(224.85536f, 19.847057f, 223.35976f, 19.809097f, 222.12f, 20.47f),
                    PathNode.LineTo(103.0f, 84.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.CurveTo(25.372583f, 84.0f, 20.0f, 89.37258f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 206.62741f, 25.372583f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(120.0f, 212.0f),
                    PathNode.CurveTo(126.62742f, 212.0f, 132.0f, 206.62741f, 132.0f, 200.0f),
                    PathNode.LineTo(132.0f, 168.0f),
                    PathNode.CurveTo(131.99893f, 167.61049f, 131.94168f, 167.22314f, 131.83f, 166.85f),
                    PathNode.LineTo(108.77f, 90.0f),
                    PathNode.LineTo(220.0f, 30.67f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 162.20914f, 218.20914f, 164.0f, 216.0f, 164.0f),
                    PathNode.LineTo(200.0f, 164.0f),
                    PathNode.CurveTo(197.79086f, 164.0f, 196.0f, 162.20914f, 196.0f, 160.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.CurveTo(196.0f, 149.79086f, 194.20914f, 148.0f, 192.0f, 148.0f),
                    PathNode.CurveTo(189.79086f, 148.0f, 188.0f, 149.79086f, 188.0f, 152.0f),
                    PathNode.LineTo(188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 166.62741f, 193.37259f, 172.0f, 200.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(222.62741f, 172.0f, 228.0f, 166.62741f, 228.0f, 160.0f),
                    PathNode.LineTo(228.0f, 24.0f),
                    PathNode.CurveTo(228.00044f, 22.595345f, 227.26405f, 21.293398f, 226.06f, 20.57f),
                    PathNode.Close,
                    PathNode.MoveTo(101.0f, 92.0f),
                    PathNode.LineTo(122.6f, 164.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 92.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.LineTo(28.0f, 96.0f),
                    PathNode.CurveTo(28.0f, 93.79086f, 29.790861f, 92.0f, 32.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(29.790861f, 204.0f, 28.0f, 202.20914f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 172.0f),
                    PathNode.LineTo(124.0f, 172.0f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 202.20914f, 122.20914f, 204.0f, 120.0f, 204.0f),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
