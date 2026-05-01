package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorThinIcon(
            name = "Trademark",
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
                    PathNode.MoveTo(108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 106.20914f, 106.20914f, 108.0f, 104.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 154.20914f, 90.20914f, 156.0f, 88.0f, 156.0f),
                    PathNode.CurveTo(85.79086f, 156.0f, 84.0f, 154.20914f, 84.0f, 152.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.CurveTo(69.79086f, 108.0f, 68.0f, 106.20914f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 101.79086f, 69.79086f, 100.0f, 72.0f, 100.0f),
                    PathNode.LineTo(104.0f, 100.0f),
                    PathNode.CurveTo(106.20914f, 100.0f, 108.0f, 101.79086f, 108.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 104.0f),
                    PathNode.LineTo(188.0f, 152.0f),
                    PathNode.CurveTo(188.0f, 154.20914f, 186.20914f, 156.0f, 184.0f, 156.0f),
                    PathNode.CurveTo(181.79086f, 156.0f, 180.0f, 154.20914f, 180.0f, 152.0f),
                    PathNode.LineTo(180.0f, 114.65f),
                    PathNode.LineTo(159.0f, 138.65f),
                    PathNode.CurveTo(158.24066f, 139.511f, 157.148f, 140.00424f, 156.0f, 140.00424f),
                    PathNode.CurveTo(154.852f, 140.00424f, 153.75934f, 139.511f, 153.0f, 138.65f),
                    PathNode.LineTo(132.0f, 114.65f),
                    PathNode.LineTo(132.0f, 152.0f),
                    PathNode.CurveTo(132.0f, 154.20914f, 130.20914f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(125.79086f, 156.0f, 124.0f, 154.20914f, 124.0f, 152.0f),
                    PathNode.LineTo(124.0f, 104.0f),
                    PathNode.CurveTo(124.00652f, 102.3393f, 125.03852f, 100.85537f, 126.59314f, 100.27128f),
                    PathNode.CurveTo(128.14774f, 99.68719f, 129.90155f, 100.12445f, 131.0f, 101.37f),
                    PathNode.LineTo(156.0f, 129.93f),
                    PathNode.LineTo(181.0f, 101.37f),
                    PathNode.CurveTo(182.09845f, 100.12445f, 183.85226f, 99.68719f, 185.40688f, 100.27128f),
                    PathNode.CurveTo(186.96147f, 100.85537f, 187.99347f, 102.3393f, 188.0f, 104.0f),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
