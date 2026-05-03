package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorLightIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 96.0f),
                    PathNode.CurveTo(214.02925f, 55.92931f, 186.38058f, 21.14839f, 147.33585f, 12.13909f),
                    PathNode.CurveTo(108.29108f, 3.129789f, 68.19824f, 22.279844f, 50.66728f, 58.312138f),
                    PathNode.CurveTo(33.13631f, 94.34444f, 42.81345f, 137.70934f, 74.0f, 162.87f),
                    PathNode.LineTo(74.0f, 240.0f),
                    PathNode.CurveTo(74.00229f, 242.07895f, 75.080605f, 244.00856f, 76.85f, 245.1f),
                    PathNode.CurveTo(77.794655f, 245.68983f, 78.88632f, 246.00174f, 80.0f, 246.0f),
                    PathNode.CurveTo(80.930084f, 246.00056f, 81.84757f, 245.78488f, 82.68f, 245.37f),
                    PathNode.LineTo(128.0f, 222.71f),
                    PathNode.LineTo(173.33f, 245.37f),
                    PathNode.CurveTo(175.18935f, 246.29393f, 177.39423f, 246.19092f, 179.15935f, 245.09767f),
                    PathNode.CurveTo(180.92445f, 244.00438f, 181.9989f, 242.07626f, 182.0f, 240.0f),
                    PathNode.LineTo(182.0f, 162.87f),
                    PathNode.CurveTo(202.23442f, 146.56946f, 213.99982f, 121.983444f, 214.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 96.0f),
                    PathNode.CurveTo(54.0f, 55.130928f, 87.13093f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(168.86908f, 22.0f, 202.0f, 55.130928f, 202.0f, 96.0f),
                    PathNode.CurveTo(202.0f, 136.86908f, 168.86908f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(87.15149f, 169.95041f, 54.04959f, 136.84851f, 54.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 230.29f),
                    PathNode.LineTo(130.67f, 210.63f),
                    PathNode.CurveTo(128.98264f, 209.7876f, 126.99737f, 209.7876f, 125.31f, 210.63f),
                    PathNode.LineTo(86.0f, 230.29f),
                    PathNode.LineTo(86.0f, 171.0f),
                    PathNode.CurveTo(112.08287f, 185.65329f, 143.91713f, 185.65329f, 170.0f, 171.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 150.0f),
                    PathNode.CurveTo(157.82338f, 150.0f, 182.0f, 125.82338f, 182.0f, 96.0f),
                    PathNode.CurveTo(182.0f, 66.17662f, 157.82338f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(98.17662f, 42.0f, 74.0f, 66.17662f, 74.0f, 96.0f),
                    PathNode.CurveTo(74.033066f, 125.80967f, 98.19033f, 149.96693f, 128.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 54.0f),
                    PathNode.CurveTo(151.19595f, 54.0f, 170.0f, 72.80404f, 170.0f, 96.0f),
                    PathNode.CurveTo(170.0f, 119.19596f, 151.19595f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(104.80404f, 138.0f, 86.0f, 119.19596f, 86.0f, 96.0f),
                    PathNode.CurveTo(86.0f, 72.80404f, 104.80404f, 54.0f, 128.0f, 54.0f),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
