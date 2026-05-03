package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorLightIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(56.268013f, 34.0f, 50.0f, 40.268013f, 50.0f, 48.0f),
                    PathNode.LineTo(50.0f, 208.0f),
                    PathNode.CurveTo(50.0f, 215.73198f, 56.268013f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(104.0f, 222.0f),
                    PathNode.CurveTo(111.73199f, 222.0f, 118.0f, 215.73198f, 118.0f, 208.0f),
                    PathNode.LineTo(118.0f, 48.0f),
                    PathNode.CurveTo(118.0f, 40.268013f, 111.73199f, 34.0f, 104.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 208.0f),
                    PathNode.CurveTo(106.0f, 209.10457f, 105.10457f, 210.0f, 104.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(62.89543f, 210.0f, 62.0f, 209.10457f, 62.0f, 208.0f),
                    PathNode.LineTo(62.0f, 48.0f),
                    PathNode.CurveTo(62.0f, 46.89543f, 62.89543f, 46.0f, 64.0f, 46.0f),
                    PathNode.LineTo(104.0f, 46.0f),
                    PathNode.CurveTo(105.10457f, 46.0f, 106.0f, 46.89543f, 106.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 34.0f),
                    PathNode.LineTo(152.0f, 34.0f),
                    PathNode.CurveTo(144.26802f, 34.0f, 138.0f, 40.268013f, 138.0f, 48.0f),
                    PathNode.LineTo(138.0f, 208.0f),
                    PathNode.CurveTo(138.0f, 215.73198f, 144.26802f, 222.0f, 152.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(199.73198f, 222.0f, 206.0f, 215.73198f, 206.0f, 208.0f),
                    PathNode.LineTo(206.0f, 48.0f),
                    PathNode.CurveTo(206.0f, 40.268013f, 199.73198f, 34.0f, 192.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 208.0f),
                    PathNode.CurveTo(194.0f, 209.10457f, 193.10457f, 210.0f, 192.0f, 210.0f),
                    PathNode.LineTo(152.0f, 210.0f),
                    PathNode.CurveTo(150.89543f, 210.0f, 150.0f, 209.10457f, 150.0f, 208.0f),
                    PathNode.LineTo(150.0f, 48.0f),
                    PathNode.CurveTo(150.0f, 46.89543f, 150.89543f, 46.0f, 152.0f, 46.0f),
                    PathNode.LineTo(192.0f, 46.0f),
                    PathNode.CurveTo(193.10457f, 46.0f, 194.0f, 46.89543f, 194.0f, 48.0f),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
