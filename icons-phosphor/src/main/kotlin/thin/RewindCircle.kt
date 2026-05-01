package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorThinIcon(
            name = "RewindCircle",
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
                    PathNode.MoveTo(117.79f, 88.42f),
                    PathNode.CurveTo(116.434135f, 87.74261f, 114.811874f, 87.88973f, 113.6f, 88.8f),
                    PathNode.LineTo(65.6f, 124.8f),
                    PathNode.CurveTo(64.59277f, 125.55541f, 64.0f, 126.740974f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 129.25903f, 64.59277f, 130.44458f, 65.6f, 131.2f),
                    PathNode.LineTo(113.6f, 167.2f),
                    PathNode.CurveTo(114.29238f, 167.71928f, 115.13452f, 168.0f, 116.0f, 168.0f),
                    PathNode.CurveTo(116.62097f, 167.99908f, 117.23342f, 167.85538f, 117.79f, 167.58f),
                    PathNode.CurveTo(119.14543f, 166.90175f, 120.00108f, 165.51566f, 120.0f, 164.0f),
                    PathNode.LineTo(120.0f, 92.0f),
                    PathNode.CurveTo(120.00108f, 90.484344f, 119.14543f, 89.09826f, 117.79f, 88.42f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 156.0f),
                    PathNode.LineTo(74.67f, 128.0f),
                    PathNode.LineTo(112.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.79f, 88.42f),
                    PathNode.CurveTo(172.43414f, 87.74261f, 170.81187f, 87.88973f, 169.6f, 88.8f),
                    PathNode.LineTo(121.6f, 124.8f),
                    PathNode.CurveTo(120.59277f, 125.55541f, 120.0f, 126.740974f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 129.25903f, 120.59277f, 130.44458f, 121.6f, 131.2f),
                    PathNode.LineTo(169.6f, 167.2f),
                    PathNode.CurveTo(170.29239f, 167.71928f, 171.13452f, 168.0f, 172.0f, 168.0f),
                    PathNode.CurveTo(172.62097f, 167.99908f, 173.23343f, 167.85538f, 173.79f, 167.58f),
                    PathNode.CurveTo(175.14543f, 166.90175f, 176.00108f, 165.51566f, 176.0f, 164.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(176.00108f, 90.484344f, 175.14543f, 89.09826f, 173.79f, 88.42f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 156.0f),
                    PathNode.LineTo(130.67f, 128.0f),
                    PathNode.LineTo(168.0f, 100.0f),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
