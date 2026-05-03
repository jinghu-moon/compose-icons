package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorLightIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.88f, 30.12f),
                    PathNode.CurveTo(222.31686f, 26.502056f, 217.0576f, 25.127739f, 212.18f, 26.54f),
                    PathNode.LineTo(212.07f, 26.54f),
                    PathNode.LineTo(20.14f, 84.77f),
                    PathNode.CurveTo(14.559168f, 86.38632f, 10.556683f, 91.28173f, 10.081524f, 97.07245f),
                    PathNode.CurveTo(9.606366f, 102.86317f, 12.757298f, 108.34555f, 18.0f, 110.85f),
                    PathNode.LineTo(103.56f, 152.49f),
                    PathNode.LineTo(145.12f, 238.0f),
                    PathNode.CurveTo(147.40648f, 242.89503f, 152.32732f, 246.01689f, 157.73f, 246.0f),
                    PathNode.CurveTo(158.13f, 246.0f, 158.54f, 246.0f, 158.94f, 245.95f),
                    PathNode.CurveTo(164.7459f, 245.49341f, 169.65161f, 241.46587f, 171.23f, 235.86f),
                    PathNode.LineTo(229.43f, 43.93f),
                    PathNode.LineTo(229.43f, 43.82f),
                    PathNode.CurveTo(230.84984f, 38.947884f, 229.48724f, 33.689476f, 225.88f, 30.12f),
                    PathNode.Close,
                    PathNode.MoveTo(217.88f, 40.52f),
                    PathNode.LineTo(159.73f, 232.43f),
                    PathNode.LineTo(159.73f, 232.54f),
                    PathNode.CurveTo(159.50223f, 233.3551f, 158.78606f, 233.9386f, 157.94176f, 233.99698f),
                    PathNode.CurveTo(157.09744f, 234.05536f, 156.30779f, 233.57599f, 155.97f, 232.8f),
                    PathNode.LineTo(115.29f, 149.22f),
                    PathNode.LineTo(164.29f, 100.22f),
                    PathNode.CurveTo(166.63445f, 97.87555f, 166.63445f, 94.07445f, 164.29f, 91.73f),
                    PathNode.CurveTo(161.94556f, 89.38555f, 158.14445f, 89.38555f, 155.8f, 91.73f),
                    PathNode.LineTo(106.8f, 140.73f),
                    PathNode.LineTo(23.15f, 100.0f),
                    PathNode.CurveTo(22.39076f, 99.64619f, 21.93243f, 98.856735f, 22.001621f, 98.021965f),
                    PathNode.CurveTo(22.070814f, 97.187195f, 22.652868f, 96.48398f, 23.46f, 96.26f),
                    PathNode.LineTo(23.57f, 96.26f),
                    PathNode.LineTo(215.48f, 38.08f),
                    PathNode.CurveTo(216.16693f, 37.88707f, 216.90433f, 38.08678f, 217.4f, 38.6f),
                    PathNode.CurveTo(217.90187f, 39.10231f, 218.0998f, 39.83307f, 217.92f, 40.52f),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
