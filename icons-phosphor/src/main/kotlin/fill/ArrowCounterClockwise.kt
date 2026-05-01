package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorFillIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00475f, 180.51962f, 181.80487f, 223.29427f, 129.29f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(103.4824f, 224.06114f, 79.88283f, 214.67862f, 62.1f, 197.8f),
                    PathNode.CurveTo(58.888466f, 194.76244f, 58.747433f, 189.69653f, 61.785f, 186.485f),
                    PathNode.CurveTo(64.82256f, 183.27347f, 69.888466f, 183.13243f, 73.1f, 186.17f),
                    PathNode.CurveTo(105.020294f, 216.27332f, 155.23099f, 215.04926f, 185.64648f, 183.42627f),
                    PathNode.CurveTo(216.06197f, 151.80328f, 215.33128f, 101.58298f, 184.00867f, 70.85826f),
                    PathNode.CurveTo(152.68605f, 40.13354f, 102.46098f, 40.37077f, 71.43f, 71.39f),
                    PathNode.CurveTo(71.348305f, 71.478355f, 71.26149f, 71.56184f, 71.17f, 71.64f),
                    PathNode.LineTo(60.63f, 81.29f),
                    PathNode.LineTo(77.63f, 98.29f),
                    PathNode.CurveTo(79.95281f, 100.56933f, 80.66339f, 104.02858f, 79.42717f, 107.03899f),
                    PathNode.CurveTo(78.19095f, 110.04939f, 75.25433f, 112.01092f, 72.0f, 112.0f),
                    PathNode.LineTo(24.0f, 112.0f),
                    PathNode.CurveTo(19.581722f, 112.0f, 16.0f, 108.41828f, 16.0f, 104.0f),
                    PathNode.LineTo(16.0f, 56.0f),
                    PathNode.CurveTo(15.981168f, 52.75506f, 17.924374f, 49.820187f, 20.919106f, 48.570557f),
                    PathNode.CurveTo(23.913836f, 47.320927f, 27.366774f, 48.004112f, 29.66f, 50.3f),
                    PathNode.LineTo(49.31f, 70.0f),
                    PathNode.LineTo(60.25f, 60.0f),
                    PathNode.CurveTo(87.73327f, 32.62351f, 128.99176f, 24.477688f, 164.81732f, 39.35487f),
                    PathNode.CurveTo(200.6429f, 54.232056f, 223.99425f, 89.20822f, 224.0f, 128.0f),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
