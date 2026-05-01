package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorThinIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 160.0f),
                    PathNode.CurveTo(108.0f, 162.20914f, 106.20914f, 164.0f, 104.0f, 164.0f),
                    PathNode.CurveTo(101.79086f, 164.0f, 100.0f, 162.20914f, 100.0f, 160.0f),
                    PathNode.LineTo(100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 93.79086f, 101.79086f, 92.0f, 104.0f, 92.0f),
                    PathNode.CurveTo(106.20914f, 92.0f, 108.0f, 93.79086f, 108.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 96.0f),
                    PathNode.LineTo(156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 162.20914f, 154.20914f, 164.0f, 152.0f, 164.0f),
                    PathNode.CurveTo(149.79086f, 164.0f, 148.0f, 162.20914f, 148.0f, 160.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.CurveTo(148.0f, 93.79086f, 149.79086f, 92.0f, 152.0f, 92.0f),
                    PathNode.CurveTo(154.20914f, 92.0f, 156.0f, 93.79086f, 156.0f, 96.0f),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
