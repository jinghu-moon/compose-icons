package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorThinIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 98.20914f, 178.20914f, 100.0f, 176.0f, 100.0f),
                    PathNode.LineTo(80.0f, 100.0f),
                    PathNode.CurveTo(77.79086f, 100.0f, 76.0f, 98.20914f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 93.79086f, 77.79086f, 92.0f, 80.0f, 92.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(178.20914f, 92.0f, 180.0f, 93.79086f, 180.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 130.20914f, 178.20914f, 132.0f, 176.0f, 132.0f),
                    PathNode.LineTo(80.0f, 132.0f),
                    PathNode.CurveTo(77.79086f, 132.0f, 76.0f, 130.20914f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 125.79086f, 77.79086f, 124.0f, 80.0f, 124.0f),
                    PathNode.LineTo(176.0f, 124.0f),
                    PathNode.CurveTo(178.20914f, 124.0f, 180.0f, 125.79086f, 180.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 160.0f),
                    PathNode.CurveTo(180.0f, 162.20914f, 178.20914f, 164.0f, 176.0f, 164.0f),
                    PathNode.LineTo(80.0f, 164.0f),
                    PathNode.CurveTo(77.79086f, 164.0f, 76.0f, 162.20914f, 76.0f, 160.0f),
                    PathNode.CurveTo(76.0f, 157.79086f, 77.79086f, 156.0f, 80.0f, 156.0f),
                    PathNode.LineTo(176.0f, 156.0f),
                    PathNode.CurveTo(178.20914f, 156.0f, 180.0f, 157.79086f, 180.0f, 160.0f),
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
        return _article!!
    }

private var _article: ImageVector? = null
