package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorThinIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 80.0f),
                    PathNode.CurveTo(180.0f, 77.79086f, 181.79086f, 76.0f, 184.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 77.79086f, 220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 82.20914f, 218.20914f, 84.0f, 216.0f, 84.0f),
                    PathNode.LineTo(184.0f, 84.0f),
                    PathNode.CurveTo(181.79086f, 84.0f, 180.0f, 82.20914f, 180.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.LineTo(148.0f, 84.0f),
                    PathNode.LineTo(148.0f, 104.0f),
                    PathNode.CurveTo(148.0f, 106.20914f, 149.79086f, 108.0f, 152.0f, 108.0f),
                    PathNode.CurveTo(154.20914f, 108.0f, 156.0f, 106.20914f, 156.0f, 104.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 53.79086f, 154.20914f, 52.0f, 152.0f, 52.0f),
                    PathNode.CurveTo(149.79086f, 52.0f, 148.0f, 53.79086f, 148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(37.79086f, 76.0f, 36.0f, 77.79086f, 36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 82.20914f, 37.79086f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.LineTo(120.0f, 172.0f),
                    PathNode.CurveTo(117.79086f, 172.0f, 116.0f, 173.79086f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 178.20914f, 117.79086f, 180.0f, 120.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(218.20914f, 180.0f, 220.0f, 178.20914f, 220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 173.79086f, 218.20914f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 148.0f),
                    PathNode.CurveTo(85.79086f, 148.0f, 84.0f, 149.79086f, 84.0f, 152.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(37.79086f, 172.0f, 36.0f, 173.79086f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(84.0f, 180.0f),
                    PathNode.LineTo(84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 202.20914f, 85.79086f, 204.0f, 88.0f, 204.0f),
                    PathNode.CurveTo(90.20914f, 204.0f, 92.0f, 202.20914f, 92.0f, 200.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 149.79086f, 90.20914f, 148.0f, 88.0f, 148.0f),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
