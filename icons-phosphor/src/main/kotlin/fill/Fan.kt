package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorFillIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.0f, 135.0f),
                    PathNode.CurveTo(228.08742f, 116.64991f, 214.77527f, 101.710175f, 197.11072f, 94.72281f),
                    PathNode.CurveTo(179.44618f, 87.735435f, 159.51624f, 89.525955f, 143.38f, 99.55f),
                    PathNode.LineTo(159.77f, 34.11f),
                    PathNode.CurveTo(160.60379f, 30.775976f, 159.21503f, 27.281946f, 156.32f, 25.43f),
                    PathNode.CurveTo(137.793f, 13.731156f, 114.362f, 13.062069f, 95.197586f, 23.684608f),
                    PathNode.CurveTo(76.033165f, 34.307148f, 64.1833f, 54.531864f, 64.285835f, 76.443115f),
                    PathNode.CurveTo(64.38837f, 98.35436f, 76.427f, 118.467285f, 95.69f, 128.91f),
                    PathNode.LineTo(30.82f, 147.44f),
                    PathNode.CurveTo(27.515253f, 148.38118f, 25.180662f, 151.3276f, 25.02f, 154.76f),
                    PathNode.CurveTo(23.751572f, 182.90025f, 42.229748f, 208.13406f, 69.44f, 215.42f),
                    PathNode.CurveTo(74.53422f, 216.78773f, 79.78538f, 217.48363f, 85.06f, 217.49f),
                    PathNode.CurveTo(101.29866f, 217.44702f, 116.82814f, 210.83144f, 128.10922f, 199.15097f),
                    PathNode.CurveTo(139.3903f, 187.47049f, 145.46179f, 171.72034f, 144.94f, 155.49f),
                    PathNode.LineTo(193.42f, 202.41f),
                    PathNode.CurveTo(195.89236f, 204.802f, 199.61711f, 205.34561f, 202.67f, 203.76f),
                    PathNode.CurveTo(227.65965f, 190.79417f, 240.27377f, 162.1972f, 233.0f, 135.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.44f, 147.85f),
                    PathNode.CurveTo(122.41111f, 148.83717f, 114.57814f, 144.89058f, 110.5937f, 137.85057f),
                    PathNode.CurveTo(106.60925f, 130.81055f, 107.25801f, 122.06355f, 112.23745f, 115.688385f),
                    PathNode.CurveTo(117.216896f, 109.31321f, 125.54637f, 106.565384f, 133.34178f, 108.72623f),
                    PathNode.CurveTo(141.13718f, 110.88708f, 146.86331f, 117.53105f, 147.85f, 125.56f),
                    PathNode.CurveTo(149.19724f, 136.52275f, 141.40268f, 146.50212f, 130.44f, 147.85f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _fan!!
    }

private var _fan: ImageVector? = null
