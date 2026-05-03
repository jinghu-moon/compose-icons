package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewX: ImageVector
    get() {
        if (_skewX != null) return _skewX!!
        _skewX = tablerOutlineIcon(
            name = "SkewX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.205f),
                    PathNode.LineTo(4.0f, 18.795f),
                    PathNode.CurveTo(3.999978f, 19.092445f, 4.132371f, 19.374464f, 4.361223f, 19.564466f),
                    PathNode.CurveTo(4.590076f, 19.754469f, 4.891633f, 19.83273f, 5.184f, 19.778f),
                    PathNode.LineTo(19.184f, 17.153f),
                    PathNode.CurveTo(19.657137f, 17.06443f, 20.000036f, 16.651354f, 20.0f, 16.17f),
                    PathNode.LineTo(20.0f, 7.83f),
                    PathNode.CurveTo(20.000036f, 7.348647f, 19.657137f, 6.935569f, 19.184f, 6.847f),
                    PathNode.LineTo(5.184f, 4.222f),
                    PathNode.CurveTo(4.891633f, 4.16727f, 4.590076f, 4.245533f, 4.361223f, 4.435535f),
                    PathNode.CurveTo(4.132371f, 4.625536f, 3.999978f, 4.907554f, 4.0f, 5.205f)
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
        return _skewX!!
    }

private var _skewX: ImageVector? = null
