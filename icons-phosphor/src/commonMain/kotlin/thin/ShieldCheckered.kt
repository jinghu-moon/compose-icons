package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorThinIcon(
            name = "ShieldCheckered",
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
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 112.0f),
                    PathNode.QuadTo(212.0f, 118.12f, 211.51f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(210.20914f, 52.0f, 212.0f, 53.79086f, 212.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 45.79086f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.LineTo(44.49f, 124.0f),
                    PathNode.QuadTo(44.0f, 118.12f, 44.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.38f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 226.44f),
                    PathNode.CurveTo(110.33867f, 221.28134f, 97.6036f, 213.94289f, 86.29f, 204.71f),
                    PathNode.CurveTo(63.27f, 185.78f, 49.56f, 161.38f, 45.38f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(169.71f, 204.71f),
                    PathNode.CurveTo(158.39902f, 213.94669f, 145.6633f, 221.2855f, 132.0f, 226.44f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(210.62f, 132.0f),
                    PathNode.CurveTo(206.44f, 161.38f, 192.73f, 185.78f, 169.71f, 204.71f),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
