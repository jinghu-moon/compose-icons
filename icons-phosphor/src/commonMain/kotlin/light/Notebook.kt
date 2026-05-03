package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorLightIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 112.0f),
                    PathNode.CurveTo(182.0f, 115.313705f, 179.3137f, 118.0f, 176.0f, 118.0f),
                    PathNode.LineTo(112.0f, 118.0f),
                    PathNode.CurveTo(108.686295f, 118.0f, 106.0f, 115.313705f, 106.0f, 112.0f),
                    PathNode.CurveTo(106.0f, 108.686295f, 108.686295f, 106.0f, 112.0f, 106.0f),
                    PathNode.LineTo(176.0f, 106.0f),
                    PathNode.CurveTo(179.3137f, 106.0f, 182.0f, 108.686295f, 182.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 138.0f),
                    PathNode.LineTo(112.0f, 138.0f),
                    PathNode.CurveTo(108.686295f, 138.0f, 106.0f, 140.6863f, 106.0f, 144.0f),
                    PathNode.CurveTo(106.0f, 147.3137f, 108.686295f, 150.0f, 112.0f, 150.0f),
                    PathNode.LineTo(176.0f, 150.0f),
                    PathNode.CurveTo(179.3137f, 150.0f, 182.0f, 147.3137f, 182.0f, 144.0f),
                    PathNode.CurveTo(182.0f, 140.6863f, 179.3137f, 138.0f, 176.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 215.73198f, 215.73198f, 222.0f, 208.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 40.268013f, 40.268013f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 210.0f),
                    PathNode.LineTo(74.0f, 210.0f),
                    PathNode.LineTo(74.0f, 46.0f),
                    PathNode.LineTo(48.0f, 46.0f),
                    PathNode.CurveTo(46.89543f, 46.0f, 46.0f, 46.89543f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(86.0f, 46.0f),
                    PathNode.LineTo(86.0f, 210.0f),
                    PathNode.LineTo(208.0f, 210.0f),
                    PathNode.CurveTo(209.10457f, 210.0f, 210.0f, 209.10457f, 210.0f, 208.0f),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
