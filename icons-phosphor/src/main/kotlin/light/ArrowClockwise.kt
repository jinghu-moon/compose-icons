package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorLightIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 56.0f),
                    PathNode.LineTo(238.0f, 104.0f),
                    PathNode.CurveTo(238.0f, 107.313705f, 235.3137f, 110.0f, 232.0f, 110.0f),
                    PathNode.LineTo(184.0f, 110.0f),
                    PathNode.CurveTo(180.6863f, 110.0f, 178.0f, 107.313705f, 178.0f, 104.0f),
                    PathNode.CurveTo(178.0f, 100.686295f, 180.6863f, 98.0f, 184.0f, 98.0f),
                    PathNode.LineTo(216.55f, 98.0f),
                    PathNode.LineTo(186.17f, 70.2f),
                    PathNode.CurveTo(186.11f, 70.14f, 186.05f, 70.07f, 185.98f, 70.01f),
                    PathNode.CurveTo(154.17001f, 38.2186f, 102.68939f, 37.980686f, 70.58693f, 69.476715f),
                    PathNode.CurveTo(38.484467f, 100.97275f, 37.740658f, 152.44855f, 68.91969f, 184.85898f),
                    PathNode.CurveTo(100.098724f, 217.26941f, 151.56474f, 218.51903f, 184.28f, 187.66f),
                    PathNode.CurveTo(186.69072f, 185.38458f, 190.4896f, 185.49428f, 192.765f, 187.905f),
                    PathNode.CurveTo(195.04042f, 190.31572f, 194.93073f, 194.1146f, 192.52f, 196.39f),
                    PathNode.CurveTo(175.09874f, 212.89326f, 151.99696f, 222.06306f, 128.0f, 222.0f),
                    PathNode.LineTo(126.72f, 222.0f),
                    PathNode.CurveTo(84.36797f, 221.40361f, 47.645966f, 192.55603f, 37.038815f, 151.54948f),
                    PathNode.CurveTo(26.431664f, 110.542915f, 44.559677f, 67.50731f, 81.3104f, 46.44944f),
                    PathNode.CurveTo(118.061134f, 25.391575f, 164.35597f, 31.513424f, 194.37f, 61.4f),
                    PathNode.LineTo(226.0f, 90.35f),
                    PathNode.LineTo(226.0f, 56.0f),
                    PathNode.CurveTo(226.0f, 52.68629f, 228.6863f, 50.0f, 232.0f, 50.0f),
                    PathNode.CurveTo(235.3137f, 50.0f, 238.0f, 52.68629f, 238.0f, 56.0f),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
