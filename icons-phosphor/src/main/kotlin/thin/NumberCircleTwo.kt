package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorThinIcon(
            name = "NumberCircleTwo",
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
                    PathNode.MoveTo(150.36f, 120.85f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(154.20914f, 172.0f, 156.0f, 173.79086f, 156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 178.20914f, 154.20914f, 180.0f, 152.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(102.48491f, 180.0f, 101.09986f, 179.144f, 100.422295f, 177.78885f),
                    PathNode.CurveTo(99.74472f, 176.43372f, 99.890945f, 174.81207f, 100.8f, 173.6f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(150.62741f, 107.163445f, 148.83656f, 94.62742f, 140.0f, 88.0f),
                    PathNode.CurveTo(131.16344f, 81.37258f, 118.62742f, 83.163445f, 112.0f, 92.0f),
                    PathNode.CurveTo(110.76889f, 93.63242f, 109.79432f, 95.443306f, 109.11f, 97.37f),
                    PathNode.CurveTo(108.37546f, 99.45487f, 106.089874f, 100.54954f, 104.005f, 99.815f),
                    PathNode.CurveTo(101.92013f, 99.08046f, 100.82546f, 96.79488f, 101.56f, 94.71f),
                    PathNode.CurveTo(102.50475f, 92.015205f, 103.85348f, 89.4796f, 105.56f, 87.19f),
                    PathNode.CurveTo(111.53258f, 79.06785f, 121.41047f, 74.78363f, 131.42175f, 75.97329f),
                    PathNode.CurveTo(141.43303f, 77.16296f, 150.0318f, 83.6428f, 153.93457f, 92.93846f),
                    PathNode.CurveTo(157.83736f, 102.23412f, 156.44148f, 112.91021f, 150.28f, 120.89f),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
