package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmartHome: ImageVector
    get() {
        if (_smartHome != null) return _smartHome!!
        _smartHome = tablerOutlineIcon(
            name = "SmartHome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 8.71f),
                    PathNode.LineTo(13.667f, 4.562f),
                    PathNode.CurveTo(12.704188f, 3.812974f, 11.355812f, 3.812974f, 10.393f, 4.562f),
                    PathNode.LineTo(5.059f, 8.71f),
                    PathNode.CurveTo(4.409404f, 9.215167f, 4.029612f, 9.992097f, 4.03f, 10.815f),
                    PathNode.LineTo(4.03f, 18.015f),
                    PathNode.CurveTo(4.03f, 19.11957f, 4.925431f, 20.015f, 6.03f, 20.015f),
                    PathNode.LineTo(18.03f, 20.015f),
                    PathNode.CurveTo(19.13457f, 20.015f, 20.03f, 19.11957f, 20.03f, 18.015f),
                    PathNode.LineTo(20.03f, 10.815f),
                    PathNode.CurveTo(20.03f, 9.992f, 19.65f, 9.215f, 19.0f, 8.71f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 15.0f),
                    PathNode.CurveTo(13.79f, 16.333f, 10.208f, 16.333f, 8.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
