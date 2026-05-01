package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmd: ImageVector
    get() {
        if (_brandAmd != null) return _brandAmd!!
        _brandAmd = tablerOutlineIcon(
            name = "BrandAmd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 8.434f, 15.566f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(3.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.566f, 3.0f, 21.0f, 3.434f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 21.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(11.293f, 20.707f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.447715f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(3.293f, 12.707f),
                    PathNode.CurveTo(3.105451f, 12.894493f, 3.000057f, 13.148806f, 3.0f, 13.414f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 20.552284f, 3.447715f, 21.0f, 4.0f, 21.0f),
                    PathNode.LineTo(10.586f, 21.0f),
                    PathNode.CurveTo(10.851194f, 20.999943f, 11.105507f, 20.89455f, 11.293f, 20.707f)
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
        return _brandAmd!!
    }

private var _brandAmd: ImageVector? = null
