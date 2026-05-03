package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorLightIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 155.3137f, 163.3137f, 158.0f, 160.0f, 158.0f),
                    PathNode.LineTo(96.0f, 158.0f),
                    PathNode.CurveTo(92.686295f, 158.0f, 90.0f, 155.3137f, 90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 148.6863f, 92.686295f, 146.0f, 96.0f, 146.0f),
                    PathNode.LineTo(160.0f, 146.0f),
                    PathNode.CurveTo(163.3137f, 146.0f, 166.0f, 148.6863f, 166.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 114.0f),
                    PathNode.LineTo(96.0f, 114.0f),
                    PathNode.CurveTo(92.686295f, 114.0f, 90.0f, 116.686295f, 90.0f, 120.0f),
                    PathNode.CurveTo(90.0f, 123.313705f, 92.686295f, 126.0f, 96.0f, 126.0f),
                    PathNode.LineTo(160.0f, 126.0f),
                    PathNode.CurveTo(163.3137f, 126.0f, 166.0f, 123.313705f, 166.0f, 120.0f),
                    PathNode.CurveTo(166.0f, 116.686295f, 163.3137f, 114.0f, 160.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 48.0f),
                    PathNode.LineTo(214.0f, 216.0f),
                    PathNode.CurveTo(214.0f, 223.73198f, 207.73198f, 230.0f, 200.0f, 230.0f),
                    PathNode.LineTo(56.0f, 230.0f),
                    PathNode.CurveTo(48.268013f, 230.0f, 42.0f, 223.73198f, 42.0f, 216.0f),
                    PathNode.LineTo(42.0f, 48.0f),
                    PathNode.CurveTo(42.0f, 40.268013f, 48.268013f, 34.0f, 56.0f, 34.0f),
                    PathNode.LineTo(93.17f, 34.0f),
                    PathNode.CurveTo(101.89183f, 23.843435f, 114.612465f, 17.999851f, 128.0f, 17.999851f),
                    PathNode.CurveTo(141.38754f, 17.999851f, 154.10817f, 23.843435f, 162.83f, 34.0f),
                    PathNode.LineTo(200.0f, 34.0f),
                    PathNode.CurveTo(207.73198f, 34.0f, 214.0f, 40.268013f, 214.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 64.0f),
                    PathNode.LineTo(94.0f, 66.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(162.0f, 64.0f),
                    PathNode.CurveTo(162.0f, 45.222317f, 146.77768f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(109.22232f, 30.0f, 94.0f, 45.222317f, 94.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 48.0f),
                    PathNode.CurveTo(202.0f, 46.89543f, 201.10457f, 46.0f, 200.0f, 46.0f),
                    PathNode.LineTo(170.33f, 46.0f),
                    PathNode.CurveTo(172.75722f, 51.69032f, 174.00569f, 57.813633f, 174.0f, 64.0f),
                    PathNode.LineTo(174.0f, 72.0f),
                    PathNode.CurveTo(174.0f, 75.313705f, 171.3137f, 78.0f, 168.0f, 78.0f),
                    PathNode.LineTo(88.0f, 78.0f),
                    PathNode.CurveTo(84.686295f, 78.0f, 82.0f, 75.313705f, 82.0f, 72.0f),
                    PathNode.LineTo(82.0f, 64.0f),
                    PathNode.CurveTo(81.9943f, 57.813633f, 83.24278f, 51.69032f, 85.67f, 46.0f),
                    PathNode.LineTo(56.0f, 46.0f),
                    PathNode.CurveTo(54.89543f, 46.0f, 54.0f, 46.89543f, 54.0f, 48.0f),
                    PathNode.LineTo(54.0f, 216.0f),
                    PathNode.CurveTo(54.0f, 217.10457f, 54.89543f, 218.0f, 56.0f, 218.0f),
                    PathNode.LineTo(200.0f, 218.0f),
                    PathNode.CurveTo(201.10457f, 218.0f, 202.0f, 217.10457f, 202.0f, 216.0f),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
