package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorThinIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 138.20914f, 180.0f, 136.0f, 180.0f),
                    PathNode.CurveTo(129.37259f, 180.0f, 124.0f, 174.62741f, 124.0f, 168.0f),
                    PathNode.LineTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 125.79086f, 122.20914f, 124.0f, 120.0f, 124.0f),
                    PathNode.CurveTo(117.79086f, 124.0f, 116.0f, 122.20914f, 116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 117.79086f, 117.79086f, 116.0f, 120.0f, 116.0f),
                    PathNode.CurveTo(126.62742f, 116.0f, 132.0f, 121.37258f, 132.0f, 128.0f),
                    PathNode.LineTo(132.0f, 168.0f),
                    PathNode.CurveTo(132.0f, 170.20914f, 133.79086f, 172.0f, 136.0f, 172.0f),
                    PathNode.CurveTo(138.20914f, 172.0f, 140.0f, 173.79086f, 140.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 92.0f),
                    PathNode.CurveTo(128.41827f, 92.0f, 132.0f, 88.41828f, 132.0f, 84.0f),
                    PathNode.CurveTo(132.0f, 79.58172f, 128.41827f, 76.0f, 124.0f, 76.0f),
                    PathNode.CurveTo(119.58172f, 76.0f, 116.0f, 79.58172f, 116.0f, 84.0f),
                    PathNode.CurveTo(116.0f, 88.41828f, 119.58172f, 92.0f, 124.0f, 92.0f),
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
        return _info!!
    }

private var _info: ImageVector? = null
