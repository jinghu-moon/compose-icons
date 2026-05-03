package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorLightIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 131.3137f, 163.3137f, 134.0f, 160.0f, 134.0f),
                    PathNode.LineTo(96.0f, 134.0f),
                    PathNode.CurveTo(92.686295f, 134.0f, 90.0f, 131.3137f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 124.686295f, 92.686295f, 122.0f, 96.0f, 122.0f),
                    PathNode.LineTo(160.0f, 122.0f),
                    PathNode.CurveTo(163.3137f, 122.0f, 166.0f, 124.686295f, 166.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.CurveTo(92.686295f, 154.0f, 90.0f, 156.6863f, 90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 163.3137f, 92.686295f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(160.0f, 166.0f),
                    PathNode.CurveTo(163.3137f, 166.0f, 166.0f, 163.3137f, 166.0f, 160.0f),
                    PathNode.CurveTo(166.0f, 156.6863f, 163.3137f, 154.0f, 160.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 40.0f),
                    PathNode.LineTo(214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 216.56854f, 200.56854f, 230.0f, 184.0f, 230.0f),
                    PathNode.LineTo(72.0f, 230.0f),
                    PathNode.CurveTo(55.431458f, 230.0f, 42.0f, 216.56854f, 42.0f, 200.0f),
                    PathNode.LineTo(42.0f, 40.0f),
                    PathNode.CurveTo(42.0f, 36.68629f, 44.68629f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(74.0f, 34.0f),
                    PathNode.LineTo(74.0f, 24.0f),
                    PathNode.CurveTo(74.0f, 20.68629f, 76.686295f, 18.0f, 80.0f, 18.0f),
                    PathNode.CurveTo(83.313705f, 18.0f, 86.0f, 20.68629f, 86.0f, 24.0f),
                    PathNode.LineTo(86.0f, 34.0f),
                    PathNode.LineTo(122.0f, 34.0f),
                    PathNode.LineTo(122.0f, 24.0f),
                    PathNode.CurveTo(122.0f, 20.68629f, 124.686295f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(131.3137f, 18.0f, 134.0f, 20.68629f, 134.0f, 24.0f),
                    PathNode.LineTo(134.0f, 34.0f),
                    PathNode.LineTo(170.0f, 34.0f),
                    PathNode.LineTo(170.0f, 24.0f),
                    PathNode.CurveTo(170.0f, 20.68629f, 172.6863f, 18.0f, 176.0f, 18.0f),
                    PathNode.CurveTo(179.3137f, 18.0f, 182.0f, 20.68629f, 182.0f, 24.0f),
                    PathNode.LineTo(182.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(211.3137f, 34.0f, 214.0f, 36.68629f, 214.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 46.0f),
                    PathNode.LineTo(182.0f, 46.0f),
                    PathNode.LineTo(182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 59.31371f, 179.3137f, 62.0f, 176.0f, 62.0f),
                    PathNode.CurveTo(172.6863f, 62.0f, 170.0f, 59.31371f, 170.0f, 56.0f),
                    PathNode.LineTo(170.0f, 46.0f),
                    PathNode.LineTo(134.0f, 46.0f),
                    PathNode.LineTo(134.0f, 56.0f),
                    PathNode.CurveTo(134.0f, 59.31371f, 131.3137f, 62.0f, 128.0f, 62.0f),
                    PathNode.CurveTo(124.686295f, 62.0f, 122.0f, 59.31371f, 122.0f, 56.0f),
                    PathNode.LineTo(122.0f, 46.0f),
                    PathNode.LineTo(86.0f, 46.0f),
                    PathNode.LineTo(86.0f, 56.0f),
                    PathNode.CurveTo(86.0f, 59.31371f, 83.313705f, 62.0f, 80.0f, 62.0f),
                    PathNode.CurveTo(76.686295f, 62.0f, 74.0f, 59.31371f, 74.0f, 56.0f),
                    PathNode.LineTo(74.0f, 46.0f),
                    PathNode.LineTo(54.0f, 46.0f),
                    PathNode.LineTo(54.0f, 200.0f),
                    PathNode.CurveTo(54.0f, 209.94113f, 62.058876f, 218.0f, 72.0f, 218.0f),
                    PathNode.LineTo(184.0f, 218.0f),
                    PathNode.CurveTo(193.94113f, 218.0f, 202.0f, 209.94113f, 202.0f, 200.0f),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
