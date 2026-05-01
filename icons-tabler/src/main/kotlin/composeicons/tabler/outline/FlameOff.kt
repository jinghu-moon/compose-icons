package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlameOff: ImageVector
    get() {
        if (_flameOff != null) return _flameOff!!
        _flameOff = tablerOutlineIcon(
            name = "FlameOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.973f, 8.974f),
                    PathNode.CurveTo(8.638f, 9.352f, 8.303001f, 9.69f, 8.0f, 10.0f),
                    PathNode.CurveTo(6.774f, 11.26f, 6.0f, 13.24f, 6.0f, 15.0f),
                    PathNode.CurveTo(5.997707f, 17.829603f, 7.972641f, 20.276205f, 10.739053f, 20.870869f),
                    PathNode.CurveTo(13.505465f, 21.46553f, 16.311327f, 20.0466f, 17.472f, 17.466f),
                    PathNode.MoveTo(17.855f, 13.869f),
                    PathNode.CurveTo(17.535f, 12.46f, 16.733f, 10.824f, 16.0f, 10.0f),
                    PathNode.CurveTo(15.719f, 10.472f, 15.457f, 10.87f, 15.21f, 11.202f),
                    PathNode.MoveTo(12.852f, 8.852f),
                    PathNode.CurveTo(12.784f, 6.695f, 11.67f, 4.668f, 11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 4.968f, 10.82f, 5.801f, 10.535f, 6.527f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flameOff!!
    }

private var _flameOff: ImageVector? = null
