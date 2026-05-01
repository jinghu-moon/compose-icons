package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) return _gitlabLogo!!
        _gitlabLogo = phosphorThinIcon(
            name = "GitlabLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.27f, 118.11f),
                    PathNode.LineTo(206.38f, 42.0f),
                    PathNode.CurveTo(205.52121f, 38.62125f, 202.55894f, 36.197895f, 199.07701f, 36.02564f),
                    PathNode.CurveTo(195.5951f, 35.85338f, 192.40808f, 37.97251f, 191.22f, 41.25f),
                    PathNode.LineTo(172.57f, 92.0f),
                    PathNode.LineTo(83.43f, 92.0f),
                    PathNode.LineTo(64.78f, 41.24f),
                    PathNode.CurveTo(63.59f, 37.962875f, 60.401382f, 35.845448f, 56.91926f, 36.02001f),
                    PathNode.CurveTo(53.43714f, 36.19458f, 50.47628f, 38.620293f, 49.62f, 42.0f),
                    PathNode.LineTo(29.73f, 118.11f),
                    PathNode.CurveTo(24.144773f, 139.4133f, 32.273655f, 161.95465f, 50.17f, 174.79f),
                    PathNode.LineTo(123.44f, 226.55f),
                    PathNode.CurveTo(126.17307f, 228.4819f, 129.82692f, 228.4819f, 132.56f, 226.55f),
                    PathNode.LineTo(205.83f, 174.79f),
                    PathNode.CurveTo(223.72635f, 161.95465f, 231.85522f, 139.4133f, 226.27f, 118.11f),
                    PathNode.Close,
                    PathNode.MoveTo(57.27f, 44.11f),
                    PathNode.LineTo(76.89f, 97.38f),
                    PathNode.CurveTo(77.46799f, 98.95247f, 78.96467f, 99.99815f, 80.64f, 100.0f),
                    PathNode.LineTo(175.36f, 100.0f),
                    PathNode.CurveTo(177.03532f, 99.99815f, 178.53201f, 98.95247f, 179.11f, 97.38f),
                    PathNode.LineTo(198.68f, 44.16f),
                    PathNode.LineTo(215.68f, 109.16f),
                    PathNode.LineTo(128.0f, 171.11f),
                    PathNode.LineTo(40.33f, 109.17f),
                    PathNode.Close,
                    PathNode.MoveTo(37.43f, 120.11f),
                    PathNode.LineTo(38.13f, 117.41f),
                    PathNode.LineTo(121.07f, 176.0f),
                    PathNode.LineTo(93.41f, 195.54f),
                    PathNode.LineTo(54.78f, 168.25f),
                    PathNode.CurveTo(39.601368f, 157.34724f, 32.717243f, 138.21408f, 37.47f, 120.14f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.LineTo(100.34f, 200.46f),
                    PathNode.LineTo(128.0f, 180.9f),
                    PathNode.LineTo(155.66f, 200.44f),
                    PathNode.Close,
                    PathNode.MoveTo(201.22f, 168.27f),
                    PathNode.LineTo(162.59f, 195.56f),
                    PathNode.LineTo(134.93f, 176.0f),
                    PathNode.LineTo(217.83f, 117.44f),
                    PathNode.LineTo(218.53f, 120.14f),
                    PathNode.CurveTo(223.28276f, 138.21408f, 216.39864f, 157.34724f, 201.22f, 168.25f),
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
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
