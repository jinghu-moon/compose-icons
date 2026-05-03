package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorThinIcon(
            name = "ArrowCircleDownLeft",
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
                    PathNode.MoveTo(162.83f, 93.17f),
                    PathNode.CurveTo(163.58112f, 93.92027f, 164.00314f, 94.93836f, 164.00314f, 96.0f),
                    PathNode.CurveTo(164.00314f, 97.06164f, 163.58112f, 98.07973f, 162.83f, 98.83f),
                    PathNode.LineTo(105.66f, 156.0f),
                    PathNode.LineTo(144.0f, 156.0f),
                    PathNode.CurveTo(146.20914f, 156.0f, 148.0f, 157.79086f, 148.0f, 160.0f),
                    PathNode.CurveTo(148.0f, 162.20914f, 146.20914f, 164.0f, 144.0f, 164.0f),
                    PathNode.LineTo(96.0f, 164.0f),
                    PathNode.CurveTo(93.79086f, 164.0f, 92.0f, 162.20914f, 92.0f, 160.0f),
                    PathNode.LineTo(92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 109.79086f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.CurveTo(98.20914f, 108.0f, 100.0f, 109.79086f, 100.0f, 112.0f),
                    PathNode.LineTo(100.0f, 150.34f),
                    PathNode.LineTo(157.17f, 93.17f),
                    PathNode.CurveTo(157.92027f, 92.418884f, 158.93837f, 91.99686f, 160.0f, 91.99686f),
                    PathNode.CurveTo(161.06163f, 91.99686f, 162.07973f, 92.418884f, 162.83f, 93.17f),
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
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
