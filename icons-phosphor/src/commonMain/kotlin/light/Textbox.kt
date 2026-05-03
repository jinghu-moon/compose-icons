package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorLightIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 42.0f),
                    PathNode.CurveTo(108.686295f, 42.0f, 106.0f, 44.68629f, 106.0f, 48.0f),
                    PathNode.LineTo(106.0f, 66.0f),
                    PathNode.LineTo(24.0f, 66.0f),
                    PathNode.CurveTo(16.268013f, 66.0f, 10.0f, 72.26801f, 10.0f, 80.0f),
                    PathNode.LineTo(10.0f, 176.0f),
                    PathNode.CurveTo(10.0f, 183.73198f, 16.268013f, 190.0f, 24.0f, 190.0f),
                    PathNode.LineTo(106.0f, 190.0f),
                    PathNode.LineTo(106.0f, 208.0f),
                    PathNode.CurveTo(106.0f, 211.3137f, 108.686295f, 214.0f, 112.0f, 214.0f),
                    PathNode.CurveTo(115.313705f, 214.0f, 118.0f, 211.3137f, 118.0f, 208.0f),
                    PathNode.LineTo(118.0f, 48.0f),
                    PathNode.CurveTo(118.0f, 44.68629f, 115.313705f, 42.0f, 112.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 178.0f),
                    PathNode.CurveTo(22.89543f, 178.0f, 22.0f, 177.10457f, 22.0f, 176.0f),
                    PathNode.LineTo(22.0f, 80.0f),
                    PathNode.CurveTo(22.0f, 78.89543f, 22.89543f, 78.0f, 24.0f, 78.0f),
                    PathNode.LineTo(106.0f, 78.0f),
                    PathNode.LineTo(106.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 80.0f),
                    PathNode.LineTo(246.0f, 176.0f),
                    PathNode.CurveTo(246.0f, 183.73198f, 239.73198f, 190.0f, 232.0f, 190.0f),
                    PathNode.LineTo(144.0f, 190.0f),
                    PathNode.CurveTo(140.6863f, 190.0f, 138.0f, 187.3137f, 138.0f, 184.0f),
                    PathNode.CurveTo(138.0f, 180.6863f, 140.6863f, 178.0f, 144.0f, 178.0f),
                    PathNode.LineTo(232.0f, 178.0f),
                    PathNode.CurveTo(233.10457f, 178.0f, 234.0f, 177.10457f, 234.0f, 176.0f),
                    PathNode.LineTo(234.0f, 80.0f),
                    PathNode.CurveTo(234.0f, 78.89543f, 233.10457f, 78.0f, 232.0f, 78.0f),
                    PathNode.LineTo(144.0f, 78.0f),
                    PathNode.CurveTo(140.6863f, 78.0f, 138.0f, 75.313705f, 138.0f, 72.0f),
                    PathNode.CurveTo(138.0f, 68.686295f, 140.6863f, 66.0f, 144.0f, 66.0f),
                    PathNode.LineTo(232.0f, 66.0f),
                    PathNode.CurveTo(239.73198f, 66.0f, 246.0f, 72.26801f, 246.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 112.0f),
                    PathNode.CurveTo(86.0f, 115.313705f, 83.313705f, 118.0f, 80.0f, 118.0f),
                    PathNode.LineTo(70.0f, 118.0f),
                    PathNode.LineTo(70.0f, 144.0f),
                    PathNode.CurveTo(70.0f, 147.3137f, 67.313705f, 150.0f, 64.0f, 150.0f),
                    PathNode.CurveTo(60.68629f, 150.0f, 58.0f, 147.3137f, 58.0f, 144.0f),
                    PathNode.LineTo(58.0f, 118.0f),
                    PathNode.LineTo(48.0f, 118.0f),
                    PathNode.CurveTo(44.68629f, 118.0f, 42.0f, 115.313705f, 42.0f, 112.0f),
                    PathNode.CurveTo(42.0f, 108.686295f, 44.68629f, 106.0f, 48.0f, 106.0f),
                    PathNode.LineTo(80.0f, 106.0f),
                    PathNode.CurveTo(83.313705f, 106.0f, 86.0f, 108.686295f, 86.0f, 112.0f),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
