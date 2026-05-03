package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorLightIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.41f, 173.4f),
                    PathNode.CurveTo(244.4103f, 171.32083f, 242.30702f, 169.99901f, 240.0f, 170.0f),
                    PathNode.LineTo(142.0f, 170.0f),
                    PathNode.LineTo(142.0f, 142.0f),
                    PathNode.LineTo(216.0f, 142.0f),
                    PathNode.CurveTo(218.36029f, 141.98738f, 220.4939f, 140.59212f, 221.45172f, 138.43488f),
                    PathNode.CurveTo(222.40953f, 136.27763f, 222.01358f, 133.75925f, 220.44f, 132.0f),
                    PathNode.LineTo(142.0f, 45.68f),
                    PathNode.LineTo(142.0f, 8.0f),
                    PathNode.CurveTo(142.00023f, 5.459149f, 140.4f, 3.193644f, 138.00525f, 2.344473f),
                    PathNode.CurveTo(135.61049f, 1.495303f, 132.9405f, 2.246606f, 131.34f, 4.22f),
                    PathNode.LineTo(27.34f, 132.22f),
                    PathNode.CurveTo(25.88225f, 134.01695f, 25.587706f, 136.492f, 26.583021f, 138.58089f),
                    PathNode.CurveTo(27.578339f, 140.66977f, 29.686111f, 142.00015f, 32.0f, 142.0f),
                    PathNode.LineTo(130.0f, 142.0f),
                    PathNode.LineTo(130.0f, 170.0f),
                    PathNode.LineTo(16.0f, 170.0f),
                    PathNode.CurveTo(13.692018f, 169.99759f, 11.587242f, 171.31923f, 10.586773f, 173.39911f),
                    PathNode.CurveTo(9.586303f, 175.47897f, 9.867509f, 177.94833f, 11.31f, 179.75f),
                    PathNode.LineTo(40.91f, 216.75f),
                    PathNode.CurveTo(43.567184f, 220.06882f, 47.588505f, 222.00038f, 51.84f, 222.0f),
                    PathNode.LineTo(204.16f, 222.0f),
                    PathNode.CurveTo(208.4115f, 222.00038f, 212.43282f, 220.06882f, 215.09f, 216.75f),
                    PathNode.LineTo(244.69f, 179.75f),
                    PathNode.CurveTo(246.13106f, 177.94788f, 246.411f, 175.47902f, 245.41f, 173.4f),
                    PathNode.Close,
                    PathNode.MoveTo(202.41f, 130.0f),
                    PathNode.LineTo(142.0f, 130.0f),
                    PathNode.LineTo(142.0f, 63.52f),
                    PathNode.Close,
                    PathNode.MoveTo(44.61f, 130.0f),
                    PathNode.LineTo(130.0f, 24.9f),
                    PathNode.LineTo(130.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.72f, 209.25f),
                    PathNode.CurveTo(205.34071f, 209.72372f, 204.76686f, 209.99962f, 204.16f, 210.0f),
                    PathNode.LineTo(51.84f, 210.0f),
                    PathNode.CurveTo(51.233143f, 209.99962f, 50.659283f, 209.72372f, 50.28f, 209.25f),
                    PathNode.LineTo(28.48f, 182.0f),
                    PathNode.LineTo(227.48f, 182.0f),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
