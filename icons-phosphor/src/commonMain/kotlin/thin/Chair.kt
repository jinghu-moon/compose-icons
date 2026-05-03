package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorThinIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 140.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.LineTo(172.0f, 100.0f),
                    PathNode.LineTo(192.0f, 100.0f),
                    PathNode.CurveTo(198.62741f, 100.0f, 204.0f, 94.62742f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 94.62742f, 57.37258f, 100.0f, 64.0f, 100.0f),
                    PathNode.LineTo(84.0f, 100.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(41.37258f, 140.0f, 36.0f, 145.37259f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 168.0f),
                    PathNode.CurveTo(36.0f, 174.62741f, 41.37258f, 180.0f, 48.0f, 180.0f),
                    PathNode.LineTo(60.0f, 180.0f),
                    PathNode.LineTo(60.0f, 224.0f),
                    PathNode.CurveTo(60.0f, 226.20914f, 61.79086f, 228.0f, 64.0f, 228.0f),
                    PathNode.CurveTo(66.20914f, 228.0f, 68.0f, 226.20914f, 68.0f, 224.0f),
                    PathNode.LineTo(68.0f, 180.0f),
                    PathNode.LineTo(188.0f, 180.0f),
                    PathNode.LineTo(188.0f, 224.0f),
                    PathNode.CurveTo(188.0f, 226.20914f, 189.79086f, 228.0f, 192.0f, 228.0f),
                    PathNode.CurveTo(194.20914f, 228.0f, 196.0f, 226.20914f, 196.0f, 224.0f),
                    PathNode.LineTo(196.0f, 180.0f),
                    PathNode.LineTo(208.0f, 180.0f),
                    PathNode.CurveTo(214.62741f, 180.0f, 220.0f, 174.62741f, 220.0f, 168.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 145.37259f, 214.62741f, 140.0f, 208.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 88.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 61.79086f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(194.20914f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 90.20914f, 194.20914f, 92.0f, 192.0f, 92.0f),
                    PathNode.LineTo(64.0f, 92.0f),
                    PathNode.CurveTo(61.79086f, 92.0f, 60.0f, 90.20914f, 60.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 100.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 170.20914f, 210.20914f, 172.0f, 208.0f, 172.0f),
                    PathNode.LineTo(48.0f, 172.0f),
                    PathNode.CurveTo(45.79086f, 172.0f, 44.0f, 170.20914f, 44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 149.79086f, 45.79086f, 148.0f, 48.0f, 148.0f),
                    PathNode.LineTo(208.0f, 148.0f),
                    PathNode.CurveTo(210.20914f, 148.0f, 212.0f, 149.79086f, 212.0f, 152.0f),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
