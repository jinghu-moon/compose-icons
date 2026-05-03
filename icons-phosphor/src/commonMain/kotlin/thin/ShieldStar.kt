package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorThinIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.71f, 118.51f),
                    PathNode.CurveTo(172.53172f, 120.55896f, 171.53815f, 122.88625f, 169.49f, 123.71f),
                    PathNode.LineTo(134.33f, 137.78f),
                    PathNode.LineTo(155.2f, 165.6f),
                    PathNode.CurveTo(156.52548f, 167.36731f, 156.16731f, 169.87451f, 154.4f, 171.2f),
                    PathNode.CurveTo(152.63269f, 172.52548f, 150.12549f, 172.16731f, 148.8f, 170.4f),
                    PathNode.LineTo(128.0f, 142.67f),
                    PathNode.LineTo(107.2f, 170.4f),
                    PathNode.CurveTo(105.87452f, 172.16731f, 103.36731f, 172.52548f, 101.6f, 171.2f),
                    PathNode.CurveTo(99.83269f, 169.87451f, 99.47452f, 167.36731f, 100.8f, 165.6f),
                    PathNode.LineTo(121.67f, 137.78f),
                    PathNode.LineTo(86.51f, 123.71f),
                    PathNode.CurveTo(84.46102f, 122.88158f, 83.47157f, 120.54897f, 84.3f, 118.5f),
                    PathNode.CurveTo(85.128426f, 116.45103f, 87.46102f, 115.46157f, 89.51f, 116.29f),
                    PathNode.LineTo(124.0f, 130.09f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(124.0f, 93.79086f, 125.79086f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(130.20914f, 92.0f, 132.0f, 93.79086f, 132.0f, 96.0f),
                    PathNode.LineTo(132.0f, 130.09f),
                    PathNode.LineTo(166.51f, 116.29f),
                    PathNode.CurveTo(168.55896f, 115.46828f, 170.88625f, 116.461845f, 171.71f, 118.51f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
