package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = phosphorBoldIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.26f, 186.1f),
                    PathNode.LineTo(152.81f, 34.23f),
                    PathNode.LineTo(152.81f, 34.23f),
                    PathNode.CurveTo(147.65572f, 25.415071f, 138.21124f, 19.996946f, 128.0f, 19.996946f),
                    PathNode.CurveTo(117.78875f, 19.996946f, 108.34429f, 25.415071f, 103.19f, 34.23f),
                    PathNode.LineTo(15.74f, 186.1f),
                    PathNode.CurveTo(10.735822f, 194.65889f, 10.735822f, 205.25111f, 15.74f, 213.81f),
                    PathNode.CurveTo(20.840076f, 222.67387f, 30.324087f, 228.09822f, 40.55f, 228.0f),
                    PathNode.LineTo(215.45f, 228.0f),
                    PathNode.CurveTo(225.66878f, 228.09097f, 235.14343f, 222.66759f, 240.24f, 213.81f),
                    PathNode.CurveTo(245.25035f, 205.25473f, 245.258f, 194.66249f, 240.26f, 186.1f),
                    PathNode.Close,
                    PathNode.MoveTo(219.46f, 201.8f),
                    PathNode.CurveTo(218.63145f, 203.21185f, 217.09604f, 204.05632f, 215.46f, 204.0f),
                    PathNode.LineTo(40.55f, 204.0f),
                    PathNode.CurveTo(38.91396f, 204.05632f, 37.378548f, 203.21185f, 36.55f, 201.8f),
                    PathNode.CurveTo(35.846516f, 200.65617f, 35.846516f, 199.21382f, 36.55f, 198.07f),
                    PathNode.LineTo(124.0f, 46.2f),
                    PathNode.CurveTo(124.87323f, 44.836506f, 126.38085f, 44.011738f, 128.0f, 44.011738f),
                    PathNode.CurveTo(129.61914f, 44.011738f, 131.12677f, 44.836506f, 132.0f, 46.2f),
                    PathNode.LineTo(219.45f, 198.07f),
                    PathNode.CurveTo(220.15656f, 199.21194f, 220.16042f, 200.6543f, 219.46f, 201.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _triangle!!
    }

private var _triangle: ImageVector? = null
