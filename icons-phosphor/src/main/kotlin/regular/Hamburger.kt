package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorRegularIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.07f, 104.0f),
                    PathNode.LineTo(207.93f, 104.0f),
                    PathNode.CurveTo(212.781f, 104.0246f, 217.38121f, 101.84702f, 220.4372f, 98.079544f),
                    PathNode.CurveTo(223.49316f, 94.312065f, 224.67485f, 89.36157f, 223.65f, 84.62f),
                    PathNode.CurveTo(216.22f, 49.5f, 176.0f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(80.0f, 24.0f, 39.78f, 49.5f, 32.35f, 84.62f),
                    PathNode.CurveTo(31.32515f, 89.36157f, 32.50684f, 94.312065f, 35.562813f, 98.079544f),
                    PathNode.CurveTo(38.618786f, 101.84702f, 43.218994f, 104.0246f, 48.07f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(167.82f, 40.0f, 202.21f, 60.61f, 207.93f, 88.0f),
                    PathNode.LineTo(48.07f, 88.0f),
                    PathNode.LineTo(48.0f, 87.93f),
                    PathNode.CurveTo(53.79f, 60.61f, 88.18f, 40.0f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.26f, 152.48f),
                    PathNode.LineTo(188.13f, 167.48f),
                    PathNode.LineTo(151.0f, 152.57f),
                    PathNode.CurveTo(149.09337f, 151.80768f, 146.96663f, 151.80768f, 145.06f, 152.57f),
                    PathNode.LineTo(108.06f, 167.38f),
                    PathNode.LineTo(71.0f, 152.57f),
                    PathNode.CurveTo(69.175514f, 151.8411f, 67.14659f, 151.80905f, 65.3f, 152.48f),
                    PathNode.LineTo(21.3f, 168.48f),
                    PathNode.CurveTo(17.440695f, 170.17876f, 15.562498f, 174.58139f, 17.007109f, 178.54283f),
                    PathNode.CurveTo(18.45172f, 182.50429f, 22.723112f, 184.66437f, 26.77f, 183.48f),
                    PathNode.LineTo(40.0f, 178.69f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 206.09138f, 57.90861f, 224.0f, 80.0f, 224.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.CurveTo(198.09138f, 224.0f, 216.0f, 206.09138f, 216.0f, 184.0f),
                    PathNode.LineTo(216.0f, 174.33f),
                    PathNode.LineTo(234.73f, 167.52f),
                    PathNode.CurveTo(237.59222f, 166.68234f, 239.7509f, 164.32213f, 240.33046f, 161.3967f),
                    PathNode.CurveTo(240.91f, 158.47127f, 239.81421f, 155.46632f, 237.48752f, 153.60071f),
                    PathNode.CurveTo(235.16083f, 151.73508f, 231.98956f, 151.31853f, 229.26f, 152.52f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 197.25484f, 189.25484f, 208.0f, 176.0f, 208.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.CurveTo(66.74516f, 208.0f, 56.0f, 197.25484f, 56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 172.88f),
                    PathNode.LineTo(67.87f, 168.56f),
                    PathNode.LineTo(105.0f, 183.43f),
                    PathNode.CurveTo(106.906624f, 184.19232f, 109.03337f, 184.19232f, 110.94f, 183.43f),
                    PathNode.LineTo(147.94f, 168.62f),
                    PathNode.LineTo(184.94f, 183.43f),
                    PathNode.CurveTo(186.7645f, 184.1589f, 188.79341f, 184.19095f, 190.64f, 183.52f),
                    PathNode.LineTo(199.91f, 180.15f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 123.58172f, 19.581722f, 120.0f, 24.0f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(236.41827f, 120.0f, 240.0f, 123.58172f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 132.41827f, 236.41827f, 136.0f, 232.0f, 136.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
