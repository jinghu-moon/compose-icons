package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorLightIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 208.0f),
                    PathNode.CurveTo(230.0f, 211.3137f, 227.3137f, 214.0f, 224.0f, 214.0f),
                    PathNode.LineTo(32.0f, 214.0f),
                    PathNode.CurveTo(28.68629f, 214.0f, 26.0f, 211.3137f, 26.0f, 208.0f),
                    PathNode.LineTo(26.0f, 48.0f),
                    PathNode.CurveTo(26.0f, 44.68629f, 28.68629f, 42.0f, 32.0f, 42.0f),
                    PathNode.CurveTo(35.31371f, 42.0f, 38.0f, 44.68629f, 38.0f, 48.0f),
                    PathNode.LineTo(38.0f, 146.78f),
                    PathNode.LineTo(92.05f, 99.48f),
                    PathNode.CurveTo(94.18458f, 97.61497f, 97.333145f, 97.4982f, 99.6f, 99.2f),
                    PathNode.LineTo(159.71f, 144.28f),
                    PathNode.LineTo(220.05f, 91.48f),
                    PathNode.CurveTo(222.55708f, 89.548874f, 226.13297f, 89.89691f, 228.22061f, 92.27524f),
                    PathNode.CurveTo(230.30826f, 94.653564f, 230.18982f, 98.2444f, 227.95f, 100.48f),
                    PathNode.LineTo(163.95f, 156.48f),
                    PathNode.CurveTo(161.81543f, 158.34502f, 158.66685f, 158.46179f, 156.4f, 156.76f),
                    PathNode.LineTo(96.29f, 111.72f),
                    PathNode.LineTo(38.0f, 162.72f),
                    PathNode.LineTo(38.0f, 202.0f),
                    PathNode.LineTo(224.0f, 202.0f),
                    PathNode.CurveTo(227.3137f, 202.0f, 230.0f, 204.6863f, 230.0f, 208.0f),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
