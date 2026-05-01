package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) return _spotifyLogo!!
        _spotifyLogo = phosphorThinIcon(
            name = "SpotifyLogo",
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
                    PathNode.MoveTo(155.54f, 167.87f),
                    PathNode.CurveTo(155.04474f, 168.80957f, 154.19614f, 169.51358f, 153.1813f, 169.82686f),
                    PathNode.CurveTo(152.16646f, 170.14014f, 151.06866f, 170.03693f, 150.13f, 169.54f),
                    PathNode.CurveTo(136.31207f, 162.11026f, 119.687935f, 162.11026f, 105.87f, 169.54f),
                    PathNode.CurveTo(105.29244f, 169.84071f, 104.65115f, 169.99846f, 104.0f, 170.0f),
                    PathNode.CurveTo(102.15888f, 170.00352f, 100.55316f, 168.74986f, 100.10997f, 166.96288f),
                    PathNode.CurveTo(99.66678f, 165.1759f, 100.50061f, 163.3172f, 102.13f, 162.46f),
                    PathNode.CurveTo(118.317f, 153.90999f, 137.683f, 153.90999f, 153.87f, 162.46f),
                    PathNode.CurveTo(154.80957f, 162.95526f, 155.51358f, 163.80386f, 155.82686f, 164.8187f),
                    PathNode.CurveTo(156.14014f, 165.83354f, 156.03693f, 166.93134f, 155.54f, 167.87f),
                    PathNode.Close,
                    PathNode.MoveTo(187.54f, 111.87f),
                    PathNode.CurveTo(186.5015f, 113.8193f, 184.0796f, 114.557945f, 182.13f, 113.52f),
                    PathNode.CurveTo(148.31996f, 95.420235f, 107.700035f, 95.420235f, 73.89f, 113.52f),
                    PathNode.CurveTo(71.94644f, 114.51272f, 69.56587f, 113.76431f, 68.53999f, 111.83805f),
                    PathNode.CurveTo(67.51411f, 109.91179f, 68.2216f, 107.518745f, 70.13f, 106.46f),
                    PathNode.CurveTo(106.28959f, 87.105125f, 149.7304f, 87.105125f, 185.89f, 106.46f),
                    PathNode.CurveTo(187.83559f, 107.50205f, 188.56949f, 109.92304f, 187.53f, 111.87f),
                    PathNode.Close,
                    PathNode.MoveTo(171.54f, 139.87f),
                    PathNode.CurveTo(170.5015f, 141.81929f, 168.0796f, 142.55795f, 166.13f, 141.52f),
                    PathNode.CurveTo(142.30522f, 128.81244f, 113.714775f, 128.81244f, 89.89f, 141.52f),
                    PathNode.CurveTo(87.94644f, 142.51273f, 85.56587f, 141.76431f, 84.53999f, 139.83804f),
                    PathNode.CurveTo(83.51411f, 137.91179f, 84.2216f, 135.51875f, 86.13f, 134.46f),
                    PathNode.CurveTo(112.30522f, 120.50089f, 143.71478f, 120.50089f, 169.89f, 134.46f),
                    PathNode.CurveTo(170.82703f, 134.96045f, 171.5265f, 135.81306f, 171.83417f, 136.82985f),
                    PathNode.CurveTo(172.14182f, 137.84662f, 172.03238f, 138.944f, 171.53f, 139.88f),
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
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
