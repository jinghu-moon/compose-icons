package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorThinIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.LineTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.61f),
                    PathNode.CurveTo(121.67f, 212.52f, 105.0f, 194.2f, 96.73f, 164.0f),
                    PathNode.LineTo(159.27f, 164.0f),
                    PathNode.CurveTo(151.0f, 194.2f, 134.33f, 212.52f, 128.0f, 218.61f),
                    PathNode.Close,
                    PathNode.MoveTo(94.82f, 156.0f),
                    PathNode.CurveTo(91.06008f, 137.52267f, 91.06008f, 118.47733f, 94.82f, 100.0f),
                    PathNode.LineTo(161.18f, 100.0f),
                    PathNode.CurveTo(164.93993f, 118.47733f, 164.93993f, 137.52267f, 161.18f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 37.39f),
                    PathNode.CurveTo(134.33f, 43.48f, 151.0f, 61.8f, 159.27f, 92.0f),
                    PathNode.LineTo(96.73f, 92.0f),
                    PathNode.CurveTo(105.0f, 61.8f, 121.67f, 43.48f, 128.0f, 37.39f),
                    PathNode.Close,
                    PathNode.MoveTo(169.41f, 100.0f),
                    PathNode.LineTo(215.64f, 100.0f),
                    PathNode.CurveTo(221.45322f, 118.21407f, 221.45322f, 137.78592f, 215.64f, 156.0f),
                    PathNode.LineTo(169.41f, 156.0f),
                    PathNode.CurveTo(172.86325f, 137.49304f, 172.86325f, 118.50696f, 169.41f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.66f, 92.0f),
                    PathNode.LineTo(167.66f, 92.0f),
                    PathNode.CurveTo(162.61273f, 71.4219f, 152.5892f, 52.398144f, 138.47f, 36.6f),
                    PathNode.CurveTo(171.3479f, 40.41984f, 199.65947f, 61.56099f, 212.66f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.54f, 36.6f),
                    PathNode.CurveTo(103.42079f, 52.398144f, 93.39727f, 71.4219f, 88.35f, 92.0f),
                    PathNode.LineTo(43.35f, 92.0f),
                    PathNode.CurveTo(56.350525f, 61.56099f, 84.66211f, 40.41984f, 117.54f, 36.6f),
                    PathNode.Close,
                    PathNode.MoveTo(40.36f, 100.0f),
                    PathNode.LineTo(86.59f, 100.0f),
                    PathNode.CurveTo(83.13675f, 118.50696f, 83.13675f, 137.49304f, 86.59f, 156.0f),
                    PathNode.LineTo(40.36f, 156.0f),
                    PathNode.CurveTo(34.546783f, 137.78592f, 34.546783f, 118.21407f, 40.36f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(43.36f, 164.0f),
                    PathNode.LineTo(88.36f, 164.0f),
                    PathNode.CurveTo(93.40727f, 184.57811f, 103.43079f, 203.60185f, 117.55f, 219.4f),
                    PathNode.CurveTo(84.66465f, 215.58694f, 56.344f, 194.44473f, 43.34f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.48f, 219.4f),
                    PathNode.CurveTo(152.592f, 203.59976f, 162.60855f, 184.57619f, 167.65f, 164.0f),
                    PathNode.LineTo(212.65f, 164.0f),
                    PathNode.CurveTo(199.64948f, 194.43901f, 171.33789f, 215.58015f, 138.46f, 219.4f),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
