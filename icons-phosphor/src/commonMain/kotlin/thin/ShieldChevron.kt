package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorThinIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.LineTo(48.0f, 44.0f),
                    PathNode.CurveTo(41.37258f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 163.16f, 60.73f, 194.12f, 81.47f, 211.1f),
                    PathNode.CurveTo(103.87f, 229.42f, 126.02f, 235.6f, 126.95f, 235.86f),
                    PathNode.CurveTo(127.637505f, 236.04703f, 128.36249f, 236.04703f, 129.05f, 235.86f),
                    PathNode.CurveTo(129.98f, 235.6f, 152.13f, 229.42f, 174.53f, 211.1f),
                    PathNode.CurveTo(195.27f, 194.1f, 220.0f, 163.16f, 220.0f, 112.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 214.62741f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.71f, 204.71f),
                    PathNode.CurveTo(157.31924f, 214.87323f, 143.18694f, 222.70343f, 128.0f, 227.82f),
                    PathNode.CurveTo(112.8111f, 222.70792f, 98.678f, 214.87729f, 86.29f, 204.71f),
                    PathNode.CurveTo(75.40764f, 195.87726f, 66.23034f, 185.13087f, 59.21f, 173.0f),
                    PathNode.LineTo(128.0f, 124.88f),
                    PathNode.LineTo(196.79f, 173.0f),
                    PathNode.CurveTo(189.76965f, 185.13087f, 180.59236f, 195.87726f, 169.71f, 204.71f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 132.0f, 208.15f, 150.0f, 200.54f, 165.89f),
                    PathNode.LineTo(130.29f, 116.72f),
                    PathNode.CurveTo(128.91441f, 115.75949f, 127.08559f, 115.75949f, 125.71f, 116.72f),
                    PathNode.LineTo(55.46f, 165.89f),
                    PathNode.CurveTo(47.85f, 150.0f, 44.0f, 132.0f, 44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 45.79086f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(210.20914f, 52.0f, 212.0f, 53.79086f, 212.0f, 56.0f),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
