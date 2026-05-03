package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorLightIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 34.0f),
                    PathNode.LineTo(162.83f, 34.0f),
                    PathNode.CurveTo(154.10817f, 23.843435f, 141.38754f, 17.999851f, 128.0f, 17.999851f),
                    PathNode.CurveTo(114.612465f, 17.999851f, 101.89183f, 23.843435f, 93.17f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(48.268013f, 34.0f, 42.0f, 40.268013f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 48.0f),
                    PathNode.CurveTo(214.0f, 40.268013f, 207.73198f, 34.0f, 200.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.0f),
                    PathNode.CurveTo(146.77768f, 30.0f, 162.0f, 45.222317f, 162.0f, 64.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(94.0f, 66.0f),
                    PathNode.LineTo(94.0f, 64.0f),
                    PathNode.CurveTo(94.0f, 45.222317f, 109.22232f, 30.0f, 128.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 48.0f),
                    PathNode.CurveTo(54.0f, 46.89543f, 54.89543f, 46.0f, 56.0f, 46.0f),
                    PathNode.LineTo(85.67f, 46.0f),
                    PathNode.CurveTo(83.24278f, 51.69032f, 81.9943f, 57.813633f, 82.0f, 64.0f),
                    PathNode.LineTo(82.0f, 72.0f),
                    PathNode.CurveTo(82.0f, 75.313705f, 84.686295f, 78.0f, 88.0f, 78.0f),
                    PathNode.LineTo(168.0f, 78.0f),
                    PathNode.CurveTo(171.3137f, 78.0f, 174.0f, 75.313705f, 174.0f, 72.0f),
                    PathNode.LineTo(174.0f, 64.0f),
                    PathNode.CurveTo(174.00569f, 57.813633f, 172.75722f, 51.69032f, 170.33f, 46.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(201.10457f, 46.0f, 202.0f, 46.89543f, 202.0f, 48.0f),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
