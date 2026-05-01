package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HourglassSimpleMedium: ImageVector
    get() {
        if (_hourglassSimpleMedium != null) return _hourglassSimpleMedium!!
        _hourglassSimpleMedium = phosphorThinIcon(
            name = "HourglassSimpleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(133.78f, 128.0f),
                    PathNode.LineTo(208.46f, 56.49f),
                    PathNode.CurveTo(211.8921f, 53.06172f, 212.92253f, 47.90424f, 211.07121f, 43.42037f),
                    PathNode.CurveTo(209.2199f, 38.9365f, 204.85101f, 36.008305f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(51.14352f, 35.996178f, 46.763542f, 38.91993f, 44.90453f, 43.406517f),
                    PathNode.CurveTo(43.04552f, 47.89311f, 44.07404f, 53.05786f, 47.51f, 56.49f),
                    PathNode.LineTo(47.58f, 56.55f),
                    PathNode.LineTo(122.22f, 128.0f),
                    PathNode.LineTo(47.61f, 199.45f),
                    PathNode.LineTo(47.54f, 199.51f),
                    PathNode.CurveTo(44.10789f, 202.93828f, 43.077465f, 208.09576f, 44.928783f, 212.57964f),
                    PathNode.CurveTo(46.7801f, 217.0635f, 51.14898f, 219.9917f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(204.87025f, 219.99997f, 209.25748f, 217.05634f, 211.104f, 212.5497f),
                    PathNode.CurveTo(212.95052f, 208.04305f, 211.89006f, 202.86732f, 208.42f, 199.45f),
                    PathNode.Close,
                    PathNode.MoveTo(87.84f, 84.0f),
                    PathNode.LineTo(168.16f, 84.0f),
                    PathNode.LineTo(128.0f, 122.46f),
                    PathNode.Close,
                    PathNode.MoveTo(52.33f, 46.47f),
                    PathNode.CurveTo(52.9298f, 44.970947f, 54.38543f, 43.991276f, 56.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(201.60376f, 43.998264f, 203.05351f, 44.95458f, 203.68315f, 46.42957f),
                    PathNode.CurveTo(204.3128f, 47.904556f, 204.00061f, 49.61302f, 202.89f, 50.77f),
                    PathNode.LineTo(176.51f, 76.0f),
                    PathNode.LineTo(79.51f, 76.0f),
                    PathNode.LineTo(53.17f, 50.8f),
                    PathNode.CurveTo(52.02753f, 49.666035f, 51.694416f, 47.948902f, 52.33f, 46.47f),
                    PathNode.Close,
                    PathNode.MoveTo(203.67f, 209.53f),
                    PathNode.CurveTo(203.0702f, 211.02905f, 201.61458f, 212.00874f, 200.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(54.388805f, 212.00139f, 52.934067f, 211.03595f, 52.309418f, 209.55078f),
                    PathNode.CurveTo(51.684765f, 208.0656f, 52.01216f, 206.35062f, 53.14f, 205.2f),
                    PathNode.LineTo(124.0f, 137.37f),
                    PathNode.LineTo(124.0f, 168.0f),
                    PathNode.CurveTo(124.0f, 170.20914f, 125.79086f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(130.20914f, 172.0f, 132.0f, 170.20914f, 132.0f, 168.0f),
                    PathNode.LineTo(132.0f, 137.37f),
                    PathNode.LineTo(202.8f, 205.17f),
                    PathNode.CurveTo(203.9632f, 206.30386f, 204.30894f, 208.03653f, 203.67f, 209.53f),
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
        return _hourglassSimpleMedium!!
    }

private var _hourglassSimpleMedium: ImageVector? = null
