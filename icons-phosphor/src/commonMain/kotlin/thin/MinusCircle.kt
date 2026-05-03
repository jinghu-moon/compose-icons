package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MinusCircle: ImageVector
    get() {
        if (_minusCircle != null) return _minusCircle!!
        _minusCircle = phosphorThinIcon(
            name = "MinusCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 130.20914f, 170.20914f, 132.0f, 168.0f, 132.0f),
                    PathNode.LineTo(88.0f, 132.0f),
                    PathNode.CurveTo(85.79086f, 132.0f, 84.0f, 130.20914f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 125.79086f, 85.79086f, 124.0f, 88.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 125.79086f, 172.0f, 128.0f),
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
        return _minusCircle!!
    }

private var _minusCircle: ImageVector? = null
