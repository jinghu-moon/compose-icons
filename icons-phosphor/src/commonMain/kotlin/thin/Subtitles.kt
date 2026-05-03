package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorThinIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 133.79086f, 53.79086f, 132.0f, 56.0f, 132.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.CurveTo(74.20914f, 132.0f, 76.0f, 133.79086f, 76.0f, 136.0f),
                    PathNode.CurveTo(76.0f, 138.20914f, 74.20914f, 140.0f, 72.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(53.79086f, 140.0f, 52.0f, 138.20914f, 52.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 136.0f),
                    PathNode.CurveTo(204.0f, 138.20914f, 202.20914f, 140.0f, 200.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(101.79086f, 140.0f, 100.0f, 138.20914f, 100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 133.79086f, 101.79086f, 132.0f, 104.0f, 132.0f),
                    PathNode.LineTo(200.0f, 132.0f),
                    PathNode.CurveTo(202.20914f, 132.0f, 204.0f, 133.79086f, 204.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 170.20914f, 154.20914f, 172.0f, 152.0f, 172.0f),
                    PathNode.LineTo(56.0f, 172.0f),
                    PathNode.CurveTo(53.79086f, 172.0f, 52.0f, 170.20914f, 52.0f, 168.0f),
                    PathNode.CurveTo(52.0f, 165.79086f, 53.79086f, 164.0f, 56.0f, 164.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(154.20914f, 164.0f, 156.0f, 165.79086f, 156.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 170.20914f, 202.20914f, 172.0f, 200.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.CurveTo(181.79086f, 172.0f, 180.0f, 170.20914f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 165.79086f, 181.79086f, 164.0f, 184.0f, 164.0f),
                    PathNode.LineTo(200.0f, 164.0f),
                    PathNode.CurveTo(202.20914f, 164.0f, 204.0f, 165.79086f, 204.0f, 168.0f),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
