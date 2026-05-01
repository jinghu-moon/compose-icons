package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorThinIcon(
            name = "Volleyball",
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
                    PathNode.MoveTo(213.0f, 163.19f),
                    PathNode.CurveTo(182.5929f, 184.62877f, 142.26642f, 185.64305f, 110.82f, 165.76f),
                    PathNode.LineTo(130.31f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(219.4512f, 142.72113f, 217.1123f, 153.27829f, 213.0f, 163.19f),
                    PathNode.Close,
                    PathNode.MoveTo(85.52f, 46.42f),
                    PathNode.CurveTo(95.03311f, 41.438885f, 105.35189f, 38.178722f, 116.0f, 36.79f),
                    PathNode.CurveTo(149.7616f, 52.412308f, 170.79236f, 86.82951f, 169.29f, 124.0f),
                    PathNode.LineTo(130.29f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.91f, 124.0f),
                    PathNode.LineTo(177.29f, 124.0f),
                    PathNode.CurveTo(178.59477f, 88.61551f, 161.10127f, 55.17633f, 131.29f, 36.07f),
                    PathNode.CurveTo(179.21678f, 37.83922f, 217.76622f, 76.08851f, 219.91f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.59f, 50.42f),
                    PathNode.LineTo(99.89f, 87.31f),
                    PathNode.CurveTo(68.60356f, 103.86842f, 48.39015f, 135.72089f, 46.73f, 171.08f),
                    PathNode.CurveTo(24.237759f, 128.70825f, 38.111805f, 76.16454f, 78.59f, 50.42f),
                    PathNode.Close,
                    PathNode.MoveTo(55.0f, 183.94f),
                    PathNode.CurveTo(51.669815f, 146.91226f, 70.95243f, 111.51937f, 103.87f, 94.24f),
                    PathNode.LineTo(123.38f, 128.0f),
                    PathNode.LineTo(78.59f, 205.58f),
                    PathNode.CurveTo(69.53186f, 199.78844f, 61.54967f, 192.46606f, 55.0f, 183.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(113.205215f, 220.0171f, 98.62755f, 216.44133f, 85.52f, 209.58f),
                    PathNode.LineTo(106.82f, 172.69f),
                    PathNode.CurveTo(136.79405f, 191.50171f, 174.47482f, 193.08347f, 205.92f, 176.85f),
                    PathNode.CurveTo(189.10452f, 203.68573f, 159.66885f, 219.98642f, 128.0f, 220.0f),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
