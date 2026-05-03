package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorThinIcon(
            name = "SkipForwardCircle",
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
                    PathNode.MoveTo(160.0f, 84.0f),
                    PathNode.CurveTo(157.79086f, 84.0f, 156.0f, 85.79086f, 156.0f, 88.0f),
                    PathNode.LineTo(156.0f, 120.78f),
                    PathNode.LineTo(98.12f, 84.61f),
                    PathNode.CurveTo(96.88723f, 83.839516f, 95.33348f, 83.79852f, 94.0618f, 84.50294f),
                    PathNode.CurveTo(92.790115f, 85.20735f, 92.000725f, 86.54626f, 92.0f, 88.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(91.99929f, 169.45442f, 92.78809f, 170.7946f, 94.06f, 171.5f),
                    PathNode.CurveTo(94.65475f, 171.8261f, 95.32172f, 171.998f, 96.0f, 172.0f),
                    PathNode.CurveTo(96.74988f, 171.9994f, 97.48448f, 171.78802f, 98.12f, 171.39f),
                    PathNode.LineTo(156.0f, 135.22f),
                    PathNode.LineTo(156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 170.20914f, 157.79086f, 172.0f, 160.0f, 172.0f),
                    PathNode.CurveTo(162.20914f, 172.0f, 164.0f, 170.20914f, 164.0f, 168.0f),
                    PathNode.LineTo(164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 85.79086f, 162.20914f, 84.0f, 160.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 160.78f),
                    PathNode.LineTo(100.0f, 95.22f),
                    PathNode.LineTo(152.45f, 128.0f),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
