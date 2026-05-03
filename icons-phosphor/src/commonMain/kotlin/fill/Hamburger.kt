package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorFillIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(35.58f, 98.06f),
                    PathNode.CurveTo(32.523872f, 94.30016f, 31.33613f, 89.35797f, 32.35f, 84.62f),
                    PathNode.CurveTo(39.78f, 49.5f, 80.0f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(176.0f, 24.0f, 216.22f, 49.5f, 223.65f, 84.62f),
                    PathNode.CurveTo(224.67485f, 89.36157f, 223.49316f, 94.312065f, 220.4372f, 98.079544f),
                    PathNode.CurveTo(217.38121f, 101.84702f, 212.781f, 104.0246f, 207.93f, 104.0f),
                    PathNode.LineTo(48.07f, 104.0f),
                    PathNode.CurveTo(43.221733f, 104.01461f, 38.628338f, 101.830086f, 35.58f, 98.06f),
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
                    PathNode.MoveTo(24.0f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
