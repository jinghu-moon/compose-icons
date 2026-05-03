package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorBoldIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 92.0f),
                    PathNode.CurveTo(182.85039f, 91.93095f, 189.57666f, 93.82944f, 195.38f, 97.47f),
                    PathNode.CurveTo(200.3037f, 100.61865f, 206.55243f, 100.83222f, 211.67961f, 98.02706f),
                    PathNode.CurveTo(216.80678f, 95.22191f, 219.99655f, 89.84438f, 220.0f, 84.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 36.954304f, 211.0457f, 28.0f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(211.0457f, 228.0f, 220.0f, 219.0457f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.CurveTo(219.99554f, 166.16037f, 216.80997f, 160.78697f, 211.6888f, 157.98074f),
                    PathNode.CurveTo(206.56763f, 155.1745f, 200.32436f, 155.3812f, 195.4f, 158.52f),
                    PathNode.CurveTo(188.82f, 162.74f, 183.51f, 164.28f, 176.48f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(156.11777f, 164.0f, 140.0f, 147.88223f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 108.11775f, 156.11777f, 92.0f, 176.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.76f, 188.0f),
                    PathNode.CurveTo(182.63826f, 188.33974f, 189.51602f, 187.3203f, 196.0f, 185.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.LineTo(196.0f, 71.3f),
                    PathNode.CurveTo(189.56152f, 69.10224f, 182.80322f, 67.98712f, 176.0f, 68.0f),
                    PathNode.CurveTo(142.86292f, 67.93372f, 115.94627f, 94.74291f, 115.88f, 127.88f),
                    PathNode.CurveTo(115.81373f, 161.01709f, 142.62291f, 187.93373f, 175.76f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
