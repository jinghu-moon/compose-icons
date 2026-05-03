package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorThinIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.83f, 98.83f),
                    PathNode.LineTo(133.66f, 128.0f),
                    PathNode.LineTo(162.83f, 157.17f),
                    PathNode.CurveTo(164.39296f, 158.73297f, 164.39296f, 161.26703f, 162.83f, 162.83f),
                    PathNode.CurveTo(161.26703f, 164.39296f, 158.73297f, 164.39296f, 157.17f, 162.83f),
                    PathNode.LineTo(128.0f, 133.66f),
                    PathNode.LineTo(98.83f, 162.83f),
                    PathNode.CurveTo(97.26704f, 164.39296f, 94.73296f, 164.39296f, 93.17f, 162.83f),
                    PathNode.CurveTo(91.60703f, 161.26703f, 91.60703f, 158.73297f, 93.17f, 157.17f),
                    PathNode.LineTo(122.34f, 128.0f),
                    PathNode.LineTo(93.17f, 98.83f),
                    PathNode.CurveTo(91.60703f, 97.26704f, 91.60703f, 94.73296f, 93.17f, 93.17f),
                    PathNode.CurveTo(94.73296f, 91.60703f, 97.26704f, 91.60703f, 98.83f, 93.17f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(157.17f, 93.17f),
                    PathNode.CurveTo(158.73297f, 91.60703f, 161.26703f, 91.60703f, 162.83f, 93.17f),
                    PathNode.CurveTo(164.39296f, 94.73296f, 164.39296f, 97.26704f, 162.83f, 98.83f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
