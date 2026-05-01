package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorThinIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(124.0f, 93.79086f, 125.79086f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(130.20914f, 92.0f, 132.0f, 93.79086f, 132.0f, 96.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(123.58172f, 164.0f, 120.0f, 167.58173f, 120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 176.41827f, 123.58172f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(132.41827f, 180.0f, 136.0f, 176.41827f, 136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 167.58173f, 132.41827f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 163.16f, 195.27f, 194.12f, 174.53f, 211.1f),
                    PathNode.CurveTo(152.13f, 229.42f, 129.98f, 235.6f, 129.05f, 235.86f),
                    PathNode.CurveTo(128.36249f, 236.04703f, 127.637505f, 236.04703f, 126.95f, 235.86f),
                    PathNode.CurveTo(126.02f, 235.6f, 103.87f, 229.42f, 81.47f, 211.1f),
                    PathNode.CurveTo(60.73f, 194.12f, 36.0f, 163.16f, 36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 49.37258f, 41.37258f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(214.62741f, 44.0f, 220.0f, 49.37258f, 220.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 53.79086f, 210.20914f, 52.0f, 208.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(45.79086f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 150.44f, 58.23f, 181.63f, 86.29f, 204.71f),
                    PathNode.CurveTo(98.678f, 214.87729f, 112.8111f, 222.70792f, 128.0f, 227.82f),
                    PathNode.CurveTo(143.18694f, 222.70343f, 157.31924f, 214.87323f, 169.71f, 204.71f),
                    PathNode.CurveTo(197.77f, 181.63f, 212.0f, 150.44f, 212.0f, 112.0f),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
