package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorLightIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 66.0f),
                    PathNode.LineTo(198.48f, 66.0f),
                    PathNode.LineTo(228.24f, 36.24f),
                    PathNode.CurveTo(229.84523f, 34.744236f, 230.506f, 32.491554f, 229.96309f, 30.365688f),
                    PathNode.CurveTo(229.42018f, 28.239822f, 227.76018f, 26.579824f, 225.63431f, 26.036915f),
                    PathNode.CurveTo(223.50844f, 25.494007f, 221.25575f, 26.154774f, 219.76f, 27.76f),
                    PathNode.LineTo(190.0f, 57.52f),
                    PathNode.LineTo(190.0f, 24.0f),
                    PathNode.CurveTo(190.0f, 20.68629f, 187.3137f, 18.0f, 184.0f, 18.0f),
                    PathNode.CurveTo(180.6863f, 18.0f, 178.0f, 20.68629f, 178.0f, 24.0f),
                    PathNode.LineTo(178.0f, 60.15f),
                    PathNode.CurveTo(153.44339f, 44.060486f, 120.96847f, 47.399807f, 100.2f, 68.15f),
                    PathNode.LineTo(100.2f, 68.15f),
                    PathNode.LineTo(100.2f, 68.15f),
                    PathNode.CurveTo(60.17f, 107.4f, 30.05f, 201.45f, 27.38f, 210.0f),
                    PathNode.CurveTo(24.819279f, 215.35477f, 25.913546f, 221.74231f, 30.110619f, 225.93938f),
                    PathNode.CurveTo(34.307693f, 230.13646f, 40.69523f, 231.23074f, 46.05f, 228.67f),
                    PathNode.CurveTo(54.55f, 226.0f, 148.67f, 195.86f, 187.84f, 155.9f),
                    PathNode.CurveTo(208.61131f, 135.12543f, 211.9515f, 102.625206f, 195.84f, 78.06f),
                    PathNode.LineTo(232.0f, 78.06f),
                    PathNode.CurveTo(235.3137f, 78.06f, 238.0f, 75.37371f, 238.0f, 72.06f),
                    PathNode.CurveTo(238.0f, 68.7463f, 235.3137f, 66.06f, 232.0f, 66.06f),
                    PathNode.Close,
                    PathNode.MoveTo(179.31f, 147.41f),
                    PathNode.CurveTo(170.0f, 157.0f, 157.0f, 166.0f, 142.69f, 174.24f),
                    PathNode.LineTo(116.23f, 147.77f),
                    PathNode.CurveTo(113.88555f, 145.42555f, 110.08445f, 145.42555f, 107.74f, 147.77f),
                    PathNode.CurveTo(105.39555f, 150.11447f, 105.39555f, 153.91556f, 107.74f, 156.26f),
                    PathNode.LineTo(131.74f, 180.26f),
                    PathNode.CurveTo(90.05f, 202.26f, 42.74f, 217.08f, 42.01f, 217.26f),
                    PathNode.CurveTo(41.64451f, 217.37547f, 41.28982f, 217.52269f, 40.95f, 217.7f),
                    PathNode.CurveTo(40.175007f, 218.10632f, 39.22585f, 217.96165f, 38.607094f, 217.34291f),
                    PathNode.CurveTo(37.98834f, 216.72415f, 37.843674f, 215.775f, 38.25f, 215.0f),
                    PathNode.CurveTo(38.427605f, 214.6798f, 38.57813f, 214.34529f, 38.7f, 214.0f),
                    PathNode.CurveTo(39.0f, 213.0f, 67.55f, 121.72f, 104.48f, 81.0f),
                    PathNode.LineTo(139.75f, 116.26f),
                    PathNode.CurveTo(141.24576f, 117.86523f, 143.49844f, 118.52599f, 145.62431f, 117.983086f),
                    PathNode.CurveTo(147.75018f, 117.44018f, 149.41017f, 115.78018f, 149.95308f, 113.65431f),
                    PathNode.CurveTo(150.49599f, 111.52844f, 149.83522f, 109.275764f, 148.23f, 107.78f),
                    PathNode.LineTo(113.13f, 72.68f),
                    PathNode.CurveTo(133.94643f, 56.314228f, 163.9126f, 59.015484f, 181.4667f, 78.84011f),
                    PathNode.CurveTo(199.02081f, 98.664734f, 198.07507f, 128.73755f, 179.31f, 147.42f),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
