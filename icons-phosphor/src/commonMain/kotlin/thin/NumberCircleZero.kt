package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) return _numberCircleZero!!
        _numberCircleZero = phosphorThinIcon(
            name = "NumberCircleZero",
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
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(115.18f, 76.0f, 104.59f, 81.81f, 97.38f, 92.8f),
                    PathNode.CurveTo(91.33f, 102.0f, 88.0f, 114.52f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 141.48f, 91.33f, 154.0f, 97.38f, 163.2f),
                    PathNode.CurveTo(104.59f, 174.2f, 115.18f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(140.82f, 180.0f, 151.41f, 174.19f, 158.62f, 163.2f),
                    PathNode.CurveTo(164.62f, 153.98f, 168.0f, 141.48f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 114.52f, 164.67f, 102.0f, 158.62f, 92.81f),
                    PathNode.CurveTo(151.41f, 81.81f, 140.82f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(105.89f, 172.0f, 96.0f, 149.9f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 106.1f, 105.89f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(150.11f, 84.0f, 160.0f, 106.1f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 149.9f, 150.11f, 172.0f, 128.0f, 172.0f),
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
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
