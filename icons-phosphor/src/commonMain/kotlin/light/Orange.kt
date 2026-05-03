package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorLightIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(161.15f, 72.65f),
                    PathNode.CurveTo(183.53592f, 62.692726f, 197.97162f, 40.500526f, 198.0f, 16.0f),
                    PathNode.CurveTo(198.0f, 12.686292f, 195.3137f, 10.0f, 192.0f, 10.0f),
                    PathNode.LineTo(184.0f, 10.0f),
                    PathNode.CurveTo(160.06624f, 10.024675f, 138.27824f, 23.805578f, 128.0f, 45.42f),
                    PathNode.CurveTo(117.72175f, 23.805578f, 95.93376f, 10.024675f, 72.0f, 10.0f),
                    PathNode.LineTo(64.0f, 10.0f),
                    PathNode.CurveTo(60.68629f, 10.0f, 58.0f, 12.686292f, 58.0f, 16.0f),
                    PathNode.CurveTo(58.0f, 19.31371f, 60.68629f, 22.0f, 64.0f, 22.0f),
                    PathNode.LineTo(72.0f, 22.0f),
                    PathNode.CurveTo(97.37959f, 22.031876f, 118.71951f, 41.051308f, 121.66f, 66.26f),
                    PathNode.CurveTo(78.2073f, 69.50085f, 44.054665f, 104.74507f, 42.182083f, 148.27821f),
                    PathNode.CurveTo(40.3095f, 191.81134f, 71.30952f, 229.85811f, 114.32342f, 236.81833f),
                    PathNode.CurveTo(157.33731f, 243.77853f, 198.75415f, 217.44975f, 210.70612f, 175.5476f),
                    PathNode.CurveTo(222.65808f, 133.64545f, 201.3632f, 89.429085f, 161.15f, 72.65f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 22.0f),
                    PathNode.LineTo(185.64f, 22.0f),
                    PathNode.CurveTo(182.57504f, 47.095795f, 161.28224f, 65.969345f, 136.0f, 66.0f),
                    PathNode.LineTo(134.36f, 66.0f),
                    PathNode.CurveTo(137.42496f, 40.904205f, 158.71776f, 22.030655f, 184.0f, 22.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(87.13093f, 226.0f, 54.0f, 192.86908f, 54.0f, 152.0f),
                    PathNode.CurveTo(54.0f, 111.13093f, 87.13093f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(168.86908f, 78.0f, 202.0f, 111.13093f, 202.0f, 152.0f),
                    PathNode.CurveTo(201.95041f, 192.84851f, 168.84851f, 225.95041f, 128.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.92f, 161.0f),
                    PathNode.CurveTo(177.84938f, 183.91235f, 159.91235f, 201.84938f, 137.0f, 205.92f),
                    PathNode.CurveTo(136.66911f, 205.97147f, 136.33485f, 205.99821f, 136.0f, 206.0f),
                    PathNode.CurveTo(132.87164f, 206.01239f, 130.25877f, 203.61908f, 129.99724f, 200.50165f),
                    PathNode.CurveTo(129.73572f, 197.38423f, 131.91331f, 194.589f, 135.0f, 194.08f),
                    PathNode.CurveTo(152.89848f, 190.9111f, 166.9111f, 176.89848f, 170.08f, 159.0f),
                    PathNode.CurveTo(170.63228f, 155.73047f, 173.73047f, 153.52771f, 177.0f, 154.08f),
                    PathNode.CurveTo(180.26953f, 154.63228f, 182.47229f, 157.73047f, 181.92f, 161.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _orange!!
    }

private var _orange: ImageVector? = null
