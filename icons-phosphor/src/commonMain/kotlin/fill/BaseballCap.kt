package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorFillIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.5898f, 24.066128f, 24.066128f, 70.5898f, 24.0f, 128.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 197.25484f, 34.745167f, 208.0f, 48.0f, 208.0f),
                    PathNode.CurveTo(53.09837f, 207.99152f, 58.062817f, 206.36703f, 62.18f, 203.36f),
                    PathNode.CurveTo(74.33f, 194.53f, 95.6f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(160.4f, 184.0f, 181.67f, 194.52f, 193.81f, 203.35f),
                    PathNode.CurveTo(201.10262f, 208.69633f, 210.7812f, 209.48997f, 218.84732f, 205.40305f),
                    PathNode.CurveTo(226.91347f, 201.31612f, 231.99785f, 193.04243f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.CurveTo(231.93387f, 70.5898f, 185.4102f, 24.066128f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.057087f, 86.429504f, 69.14913f, 50.548897f, 109.81f, 41.9f),
                    PathNode.CurveTo(93.956116f, 64.689316f, 84.03359f, 91.07144f, 80.94f, 118.66f),
                    PathNode.CurveTo(66.532555f, 122.85501f, 52.760433f, 128.98418f, 40.0f, 136.88f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.CurveTo(216.04936f, 187.00716f, 214.35887f, 189.77274f, 211.66f, 191.1f),
                    PathNode.CurveTo(208.9456f, 192.49991f, 205.67097f, 192.2322f, 203.22f, 190.41f),
                    PathNode.CurveTo(189.16f, 180.2f, 164.7f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(91.3f, 168.0f, 66.84f, 180.2f, 52.78f, 190.42f),
                    PathNode.CurveTo(50.329018f, 192.2422f, 47.0544f, 192.5099f, 44.34f, 191.11f),
                    PathNode.CurveTo(41.637833f, 189.78119f, 39.946728f, 187.01074f, 40.0f, 184.0f),
                    PathNode.LineTo(40.0f, 156.07f),
                    PathNode.CurveTo(55.070587f, 145.3064f, 71.996994f, 137.41441f, 89.93f, 132.79f),
                    PathNode.CurveTo(90.26923f, 132.72787f, 90.60346f, 132.64098f, 90.93f, 132.53f),
                    PathNode.CurveTo(115.28442f, 126.489845f, 140.74559f, 126.489845f, 165.1f, 132.53f),
                    PathNode.CurveTo(165.42763f, 132.63992f, 165.76157f, 132.73009f, 166.1f, 132.8f),
                    PathNode.CurveTo(184.02283f, 137.422f, 200.93924f, 145.31067f, 216.0f, 156.07f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 136.87f),
                    PathNode.CurveTo(203.23956f, 128.97417f, 189.46745f, 122.84501f, 175.06f, 118.65f),
                    PathNode.CurveTo(171.96478f, 91.06491f, 162.04234f, 64.68641f, 146.19f, 41.9f),
                    PathNode.CurveTo(186.85086f, 50.548897f, 215.94292f, 86.429504f, 216.0f, 128.0f),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
