package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorDuotoneIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(223.99657f, 190.0318f, 220.60124f, 195.54906f, 215.21812f, 198.27019f),
                    PathNode.CurveTo(209.83499f, 200.99133f, 203.37904f, 200.45384f, 198.52f, 196.88f),
                    PathNode.CurveTo(182.53f, 185.26f, 159.0f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(97.0f, 176.0f, 73.47f, 185.26f, 57.48f, 196.88f),
                    PathNode.CurveTo(52.620964f, 200.45384f, 46.165f, 200.99133f, 40.781883f, 198.27019f),
                    PathNode.CurveTo(35.39876f, 195.54906f, 32.00344f, 190.0318f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(88.888885f, 109.333336f, 167.11111f, 109.333336f, 224.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 136.87f),
                    PathNode.CurveTo(203.23956f, 128.97417f, 189.46745f, 122.84501f, 175.06f, 118.65f),
                    PathNode.CurveTo(171.96478f, 91.06491f, 162.04234f, 64.68641f, 146.19f, 41.9f),
                    PathNode.CurveTo(186.85086f, 50.548897f, 215.94292f, 86.429504f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.27f),
                    PathNode.CurveTo(143.9747f, 64.7808f, 154.43948f, 89.035675f, 158.4f, 114.73f),
                    PathNode.CurveTo(138.28333f, 111.09005f, 117.676674f, 111.09005f, 97.56f, 114.73f),
                    PathNode.CurveTo(101.56816f, 89.04223f, 112.0431f, 64.7957f, 128.0f, 44.27f),
                    PathNode.Close,
                    PathNode.MoveTo(109.81f, 41.9f),
                    PathNode.CurveTo(93.956116f, 64.689316f, 84.03359f, 91.07144f, 80.94f, 118.66f),
                    PathNode.CurveTo(66.532555f, 122.85501f, 52.760433f, 128.98418f, 40.0f, 136.88f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.057087f, 86.429504f, 69.14913f, 50.548897f, 109.81f, 41.9f),
                    PathNode.Close,
                    PathNode.MoveTo(211.66f, 191.11f),
                    PathNode.CurveTo(208.9456f, 192.5099f, 205.67097f, 192.2422f, 203.22f, 190.42f),
                    PathNode.CurveTo(189.16f, 180.2f, 164.7f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(91.3f, 168.0f, 66.84f, 180.2f, 52.78f, 190.42f),
                    PathNode.CurveTo(50.329018f, 192.2422f, 47.0544f, 192.5099f, 44.34f, 191.11f),
                    PathNode.CurveTo(41.637833f, 189.78119f, 39.946728f, 187.01074f, 40.0f, 184.0f),
                    PathNode.LineTo(40.0f, 156.07f),
                    PathNode.CurveTo(92.69987f, 118.65062f, 163.30014f, 118.65062f, 216.0f, 156.07f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(216.05327f, 187.01074f, 214.36217f, 189.78119f, 211.66f, 191.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
