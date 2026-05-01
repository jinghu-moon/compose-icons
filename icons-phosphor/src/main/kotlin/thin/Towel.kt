package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorThinIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(60.954304f, 28.0f, 52.0f, 36.954304f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 222.62741f, 57.37258f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(176.0f, 228.0f),
                    PathNode.CurveTo(182.62741f, 228.0f, 188.0f, 222.62741f, 188.0f, 216.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 41.37258f, 193.37259f, 36.0f, 200.0f, 36.0f),
                    PathNode.CurveTo(206.62741f, 36.0f, 212.0f, 41.37258f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 154.20914f, 213.79086f, 156.0f, 216.0f, 156.0f),
                    PathNode.CurveTo(218.20914f, 156.0f, 220.0f, 154.20914f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 36.954304f, 211.0457f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(181.39442f, 39.457134f, 179.98982f, 43.67095f, 180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 188.0f),
                    PathNode.LineTo(60.0f, 188.0f),
                    PathNode.LineTo(60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 41.37258f, 65.37258f, 36.0f, 72.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(61.79086f, 220.0f, 60.0f, 218.20914f, 60.0f, 216.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 178.20914f, 220.0f, 176.0f, 220.0f),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
