package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorThinIcon(
            name = "PlayCircle",
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
                    PathNode.MoveTo(174.12f, 124.61f),
                    PathNode.LineTo(110.12f, 84.61f),
                    PathNode.CurveTo(108.88723f, 83.839516f, 107.33348f, 83.79852f, 106.0618f, 84.50294f),
                    PathNode.CurveTo(104.790115f, 85.20735f, 104.000725f, 86.54626f, 104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(103.99929f, 169.45442f, 104.78809f, 170.7946f, 106.06f, 171.5f),
                    PathNode.CurveTo(106.65475f, 171.8261f, 107.32172f, 171.998f, 108.0f, 172.0f),
                    PathNode.CurveTo(108.74988f, 171.9994f, 109.48448f, 171.78802f, 110.12f, 171.39f),
                    PathNode.LineTo(174.12f, 131.39f),
                    PathNode.CurveTo(175.2877f, 130.65866f, 175.99681f, 129.37782f, 175.99681f, 128.0f),
                    PathNode.CurveTo(175.99681f, 126.62218f, 175.2877f, 125.34134f, 174.12f, 124.61f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 160.78f),
                    PathNode.LineTo(112.0f, 95.22f),
                    PathNode.LineTo(164.45f, 128.0f),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
