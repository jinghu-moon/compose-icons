package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorThinIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(202.20914f, 36.0f, 204.0f, 37.79086f, 204.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 80.0f),
                    PathNode.CurveTo(92.0f, 84.41828f, 88.41828f, 88.0f, 84.0f, 88.0f),
                    PathNode.CurveTo(79.58172f, 88.0f, 76.0f, 84.41828f, 76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 75.58172f, 79.58172f, 72.0f, 84.0f, 72.0f),
                    PathNode.CurveTo(88.41828f, 72.0f, 92.0f, 75.58172f, 92.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 176.0f),
                    PathNode.CurveTo(92.0f, 180.41827f, 88.41828f, 184.0f, 84.0f, 184.0f),
                    PathNode.CurveTo(79.58172f, 184.0f, 76.0f, 180.41827f, 76.0f, 176.0f),
                    PathNode.CurveTo(76.0f, 171.58173f, 79.58172f, 168.0f, 84.0f, 168.0f),
                    PathNode.CurveTo(88.41828f, 168.0f, 92.0f, 171.58173f, 92.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 132.41827f, 88.41828f, 136.0f, 84.0f, 136.0f),
                    PathNode.CurveTo(79.58172f, 136.0f, 76.0f, 132.41827f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 123.58172f, 79.58172f, 120.0f, 84.0f, 120.0f),
                    PathNode.CurveTo(88.41828f, 120.0f, 92.0f, 123.58172f, 92.0f, 128.0f),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
