package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorThinIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 100.0f),
                    PathNode.LineTo(180.0f, 100.0f),
                    PathNode.LineTo(180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 53.79086f, 178.20914f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 50.20914f, 36.0f, 48.0f, 36.0f),
                    PathNode.CurveTo(45.79086f, 36.0f, 44.0f, 37.79086f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 218.20914f, 45.79086f, 220.0f, 48.0f, 220.0f),
                    PathNode.CurveTo(50.20914f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(144.0f, 204.0f),
                    PathNode.CurveTo(146.20914f, 204.0f, 148.0f, 202.20914f, 148.0f, 200.0f),
                    PathNode.LineTo(148.0f, 156.0f),
                    PathNode.LineTo(224.0f, 156.0f),
                    PathNode.CurveTo(226.20914f, 156.0f, 228.0f, 154.20914f, 228.0f, 152.0f),
                    PathNode.LineTo(228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 101.79086f, 226.20914f, 100.0f, 224.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 60.0f),
                    PathNode.LineTo(172.0f, 100.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 196.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(52.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 148.0f),
                    PathNode.LineTo(52.0f, 148.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(220.0f, 108.0f),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
