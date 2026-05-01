package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorLightIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.6f, 63.47f),
                    PathNode.CurveTo(236.73027f, 59.846024f, 234.44267f, 56.722633f, 231.25f, 54.8f),
                    PathNode.CurveTo(167.77216f, 16.400177f, 88.22784f, 16.400177f, 24.75f, 54.8f),
                    PathNode.CurveTo(18.16111f, 58.81206f, 16.059307f, 67.39815f, 20.05f, 74.0f),
                    PathNode.LineTo(116.05f, 231.27f),
                    PathNode.CurveTo(118.581245f, 235.48224f, 123.13571f, 238.0589f, 128.05f, 238.0589f),
                    PathNode.CurveTo(132.96428f, 238.0589f, 137.51875f, 235.48224f, 140.05f, 231.27f),
                    PathNode.LineTo(236.0f, 74.0f),
                    PathNode.CurveTo(237.91986f, 70.84514f, 238.4961f, 67.05274f, 237.6f, 63.47f),
                    PathNode.Close,
                    PathNode.MoveTo(61.07f, 118.2f),
                    PathNode.CurveTo(68.58546f, 110.20069f, 80.31473f, 107.782486f, 90.38126f, 112.15696f),
                    PathNode.CurveTo(100.44779f, 116.53143f, 106.68299f, 126.756195f, 105.96291f, 137.70848f),
                    PathNode.CurveTo(105.24284f, 148.66077f, 97.72262f, 157.98117f, 87.17f, 161.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.07f, 188.52f),
                    PathNode.CurveTo(141.64688f, 180.39754f, 138.97418f, 165.7487f, 145.85728f, 154.46869f),
                    PathNode.CurveTo(152.7404f, 143.18867f, 166.98975f, 138.86574f, 178.98f, 144.42f),
                    PathNode.Close,
                    PathNode.MoveTo(185.27f, 134.12f),
                    PathNode.CurveTo(179.92409f, 131.38956f, 174.0028f, 129.97694f, 168.0f, 130.0f),
                    PathNode.CurveTo(151.52061f, 130.0029f, 136.9213f, 140.62723f, 131.85043f, 156.30702f),
                    PathNode.CurveTo(126.77956f, 171.98683f, 132.39304f, 189.148f, 145.75f, 198.8f),
                    PathNode.LineTo(129.75f, 225.04f),
                    PathNode.CurveTo(129.3922f, 225.6568f, 128.73306f, 226.03645f, 128.02f, 226.03645f),
                    PathNode.CurveTo(127.30693f, 226.03645f, 126.6478f, 225.6568f, 126.29f, 225.04f),
                    PathNode.LineTo(93.59f, 171.49f),
                    PathNode.CurveTo(107.832504f, 166.04855f, 117.44372f, 152.62137f, 118.00243f, 137.38504f),
                    PathNode.CurveTo(118.56115f, 122.1487f, 109.95917f, 108.05364f, 96.15345f, 101.58368f),
                    PathNode.CurveTo(82.34773f, 95.11372f, 66.01169f, 97.52172f, 54.66f, 107.7f),
                    PathNode.LineTo(46.05f, 93.59f),
                    PathNode.CurveTo(96.156334f, 62.136845f, 159.84367f, 62.136845f, 209.95f, 93.59f),
                    PathNode.Close,
                    PathNode.MoveTo(225.76f, 67.77f),
                    PathNode.LineTo(216.2f, 83.35f),
                    PathNode.CurveTo(162.25743f, 49.549595f, 93.74257f, 49.549595f, 39.8f, 83.35f),
                    PathNode.LineTo(30.29f, 67.77f),
                    PathNode.LineTo(30.29f, 67.77f),
                    PathNode.CurveTo(30.014444f, 67.33248f, 29.931253f, 66.80078f, 30.06f, 66.3f),
                    PathNode.CurveTo(30.193108f, 65.776726f, 30.532131f, 65.329506f, 31.0f, 65.06f),
                    PathNode.CurveTo(90.63881f, 28.997005f, 165.36119f, 28.997005f, 225.0f, 65.06f),
                    PathNode.CurveTo(225.46028f, 65.33353f, 225.79166f, 65.78018f, 225.92f, 66.3f),
                    PathNode.CurveTo(226.05467f, 66.79806f, 225.97874f, 67.329575f, 225.71f, 67.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pizza!!
    }

private var _pizza: ImageVector? = null
