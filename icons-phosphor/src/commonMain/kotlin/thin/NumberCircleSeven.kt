package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorThinIcon(
            name = "NumberCircleSeven",
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
                    PathNode.MoveTo(155.28f, 85.71f),
                    PathNode.CurveTo(156.02702f, 86.778824f, 156.20615f, 88.14469f, 155.76f, 89.37f),
                    PathNode.LineTo(123.76f, 177.37f),
                    PathNode.CurveTo(123.18407f, 178.94984f, 121.68155f, 180.00081f, 120.0f, 180.0f),
                    PathNode.CurveTo(119.533035f, 179.99821f, 119.06976f, 179.91707f, 118.63f, 179.76f),
                    PathNode.CurveTo(117.632484f, 179.39705f, 116.82014f, 178.6525f, 116.371864f, 177.6903f),
                    PathNode.CurveTo(115.923584f, 176.72809f, 115.87615f, 175.62718f, 116.24f, 174.63f),
                    PathNode.LineTo(146.29f, 92.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(101.79086f, 92.0f, 100.0f, 90.20914f, 100.0f, 88.0f),
                    PathNode.CurveTo(100.0f, 85.79086f, 101.79086f, 84.0f, 104.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(153.30705f, 83.99988f, 154.53171f, 84.63834f, 155.28f, 85.71f),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
