package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pin: ImageVector
    get() {
        if (_pin != null) return _pin!!
        _pin = tablerFilledIcon(
            name = "Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.113f, 3.21f),
                    PathNode.LineTo(15.207f, 3.293f),
                    PathNode.LineTo(20.707f, 8.793f),
                    PathNode.CurveTo(21.055347f, 9.143207f, 21.09581f, 9.695291f, 20.802242f, 10.092543f),
                    PathNode.CurveTo(20.508677f, 10.489795f, 19.96904f, 10.61319f, 19.532f, 10.383f),
                    PathNode.LineTo(16.36f, 13.554f),
                    PathNode.LineTo(14.936f, 17.351f),
                    PathNode.CurveTo(14.898489f, 17.45119f, 14.845144f, 17.544712f, 14.778f, 17.628f),
                    PathNode.LineTo(14.708f, 17.708f),
                    PathNode.LineTo(13.208f, 19.208f),
                    PathNode.CurveTo(12.85147f, 19.563929f, 12.28584f, 19.599066f, 11.888f, 19.29f),
                    PathNode.LineTo(11.793f, 19.207f),
                    PathNode.LineTo(9.0f, 16.415f),
                    PathNode.LineTo(5.207f, 20.207f),
                    PathNode.CurveTo(4.833524f, 20.57921f, 4.235213f, 20.59748f, 3.839722f, 20.24875f),
                    PathNode.CurveTo(3.444231f, 19.900023f, 3.387465f, 19.304129f, 3.71f, 18.887f),
                    PathNode.LineTo(3.793f, 18.793f),
                    PathNode.LineTo(7.585f, 15.0f),
                    PathNode.LineTo(4.793f, 12.207f),
                    PathNode.CurveTo(4.436765f, 11.850732f, 4.401198f, 11.285086f, 4.71f, 10.887f),
                    PathNode.LineTo(4.793f, 10.793f),
                    PathNode.LineTo(6.293f, 9.293f),
                    PathNode.CurveTo(6.368453f, 9.217278f, 6.455558f, 9.154143f, 6.551f, 9.106f),
                    PathNode.LineTo(6.649f, 9.064f),
                    PathNode.LineTo(10.445f, 7.639f),
                    PathNode.LineTo(13.616f, 4.469f),
                    PathNode.CurveTo(13.393149f, 4.052344f, 13.492346f, 3.536568f, 13.853848f, 3.232297f),
                    PathNode.CurveTo(14.215351f, 2.928027f, 14.740489f, 2.91831f, 15.113f, 3.209f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pin!!
    }

private var _pin: ImageVector? = null
