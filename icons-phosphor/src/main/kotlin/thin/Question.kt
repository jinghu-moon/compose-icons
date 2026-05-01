package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorThinIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 180.0f),
                    PathNode.CurveTo(136.0f, 184.41827f, 132.41827f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(123.58172f, 188.0f, 120.0f, 184.41827f, 120.0f, 180.0f),
                    PathNode.CurveTo(120.0f, 175.58173f, 123.58172f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(132.41827f, 172.0f, 136.0f, 175.58173f, 136.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(108.15f, 76.0f, 92.0f, 90.36f, 92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 114.20914f, 93.79086f, 116.0f, 96.0f, 116.0f),
                    PathNode.CurveTo(98.20914f, 116.0f, 100.0f, 114.20914f, 100.0f, 112.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 94.77f, 112.56f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(143.44f, 84.0f, 156.0f, 94.77f, 156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 121.23f, 143.44f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(125.79086f, 132.0f, 124.0f, 133.79086f, 124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 146.20914f, 125.79086f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(130.20914f, 148.0f, 132.0f, 146.20914f, 132.0f, 144.0f),
                    PathNode.LineTo(132.0f, 139.8f),
                    PathNode.CurveTo(150.0f, 138.03f, 164.0f, 124.44f, 164.0f, 108.0f),
                    PathNode.CurveTo(164.0f, 90.36f, 147.85f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 183.22847f, 183.22847f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(72.77152f, 228.0f, 28.0f, 183.22847f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 72.77152f, 72.77152f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(183.20334f, 28.060623f, 227.93938f, 72.79665f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 77.18981f, 178.8102f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(77.18981f, 36.0f, 36.0f, 77.18981f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 178.8102f, 77.18981f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(178.78735f, 219.94489f, 219.94489f, 178.78735f, 220.0f, 128.0f),
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
        return _question!!
    }

private var _question: ImageVector? = null
