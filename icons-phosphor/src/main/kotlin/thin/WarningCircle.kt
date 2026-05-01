package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningCircle: ImageVector
    get() {
        if (_warningCircle != null) return _warningCircle!!
        _warningCircle = phosphorThinIcon(
            name = "WarningCircle",
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
                    PathNode.MoveTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(132.0f, 138.20914f, 130.20914f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(125.79086f, 140.0f, 124.0f, 138.20914f, 124.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 172.0f),
                    PathNode.CurveTo(136.0f, 176.41827f, 132.41827f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(123.58172f, 180.0f, 120.0f, 176.41827f, 120.0f, 172.0f),
                    PathNode.CurveTo(120.0f, 167.58173f, 123.58172f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(132.41827f, 164.0f, 136.0f, 167.58173f, 136.0f, 172.0f),
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
        return _warningCircle!!
    }

private var _warningCircle: ImageVector? = null
