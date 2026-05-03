package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorThinIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(203.99232f, 103.24586f, 191.91997f, 80.04902f, 171.65f, 65.84f),
                    PathNode.LineTo(165.13f, 29.84f),
                    PathNode.CurveTo(164.08662f, 24.138107f, 159.11656f, 19.9971f, 153.32f, 20.0f),
                    PathNode.LineTo(102.68f, 20.0f),
                    PathNode.CurveTo(96.87714f, 19.99886f, 91.90485f, 24.150156f, 90.87f, 29.86f),
                    PathNode.LineTo(84.35f, 65.86f),
                    PathNode.CurveTo(64.07214f, 80.06249f, 51.996494f, 103.26314f, 51.996494f, 128.02f),
                    PathNode.CurveTo(51.996494f, 152.77687f, 64.07214f, 175.97751f, 84.35f, 190.18f),
                    PathNode.LineTo(90.87f, 226.18f),
                    PathNode.CurveTo(91.9219f, 231.87395f, 96.88971f, 236.00467f, 102.68f, 236.0f),
                    PathNode.LineTo(153.32f, 236.0f),
                    PathNode.CurveTo(159.12286f, 236.00114f, 164.09515f, 231.84984f, 165.13f, 226.14f),
                    PathNode.LineTo(171.65f, 190.14f),
                    PathNode.CurveTo(191.91418f, 175.93503f, 203.9858f, 152.74707f, 204.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.74f, 31.29f),
                    PathNode.CurveTo(99.08374f, 29.384155f, 100.74341f, 27.998297f, 102.68f, 28.0f),
                    PathNode.LineTo(153.32f, 28.0f),
                    PathNode.CurveTo(155.25659f, 27.998297f, 156.91626f, 29.384155f, 157.26f, 31.29f),
                    PathNode.LineTo(162.52f, 60.29f),
                    PathNode.CurveTo(140.8576f, 49.19676f, 115.18239f, 49.19676f, 93.52f, 60.29f),
                    PathNode.Close,
                    PathNode.MoveTo(157.26f, 224.71f),
                    PathNode.CurveTo(156.91626f, 226.61584f, 155.25659f, 228.00171f, 153.32f, 228.0f),
                    PathNode.LineTo(102.68f, 228.0f),
                    PathNode.CurveTo(100.74341f, 228.00171f, 99.08374f, 226.61584f, 98.74f, 224.71f),
                    PathNode.LineTo(93.48f, 195.71f),
                    PathNode.CurveTo(115.14239f, 206.80324f, 140.81761f, 206.80324f, 162.48f, 195.71f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(90.44463f, 196.0f, 60.0f, 165.55536f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 90.44463f, 90.44463f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(165.55536f, 60.0f, 196.0f, 90.44463f, 196.0f, 128.0f),
                    PathNode.CurveTo(195.96141f, 165.53935f, 165.53935f, 195.96141f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 130.20914f, 170.20914f, 132.0f, 168.0f, 132.0f),
                    PathNode.LineTo(128.0f, 132.0f),
                    PathNode.CurveTo(125.79086f, 132.0f, 124.0f, 130.20914f, 124.0f, 128.0f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 85.79086f, 125.79086f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(130.20914f, 84.0f, 132.0f, 85.79086f, 132.0f, 88.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 125.79086f, 172.0f, 128.0f),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
