package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerOutlineIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 14.127f),
                    PathNode.CurveTo(19.0f, 17.2f, 15.498f, 20.0f, 11.0f, 20.0f),
                    PathNode.CurveTo(6.874f, 20.0f, 3.0f, 17.776f, 3.0f, 14.435f),
                    PathNode.CurveTo(3.0f, 12.655f, 3.984f, 10.698f, 5.7f, 8.868f),
                    PathNode.CurveTo(8.062001f, 6.358f, 10.893f, 5.181f, 12.251f, 6.63f),
                    PathNode.CurveTo(12.666f, 7.07f, 13.003f, 8.020001f, 13.0f, 8.692f),
                    PathNode.CurveTo(15.0f, 7.077f, 17.308f, 9.079f, 16.5f, 11.385f),
                    PathNode.CurveTo(17.76f, 11.942f, 19.0f, 11.923f, 19.0f, 14.127f)
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
                    PathNode.MoveTo(15.0f, 4.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(18.761423f, 4.0f, 21.0f, 6.238577f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 10.0f)
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
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
