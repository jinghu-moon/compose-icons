package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = tablerFilledIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.5f, 5.134f),
                    PathNode.CurveTo(21.773071f, 5.291663f, 21.955786f, 5.568886f, 21.993f, 5.882f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(21.99999f, 19.357262f, 21.80939f, 19.68738f, 21.499989f, 19.866007f),
                    PathNode.CurveTo(21.19059f, 20.044634f, 20.809397f, 20.04463f, 20.5f, 19.866f),
                    PathNode.CurveTo(18.19926f, 18.537477f, 15.389077f, 18.437807f, 13.0f, 19.6f),
                    PathNode.LineTo(13.0f, 4.426f),
                    PathNode.CurveTo(15.796953f, 3.381239f, 18.914434f, 3.640907f, 21.5f, 5.134f),
                    PathNode.MoveTo(11.0f, 4.427f),
                    PathNode.LineTo(11.001f, 19.601f),
                    PathNode.CurveTo(8.708771f, 18.485119f, 6.021945f, 18.528574f, 3.767f, 19.718f),
                    PathNode.LineTo(3.44f, 19.898f),
                    PathNode.LineTo(3.337f, 19.942f),
                    PathNode.LineTo(3.288f, 19.958f),
                    PathNode.LineTo(3.178f, 19.984f),
                    PathNode.LineTo(3.117f, 19.994f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.LineTo(2.958f, 20.0f),
                    PathNode.LineTo(2.848f, 19.988f),
                    PathNode.LineTo(2.771f, 19.974f),
                    PathNode.LineTo(2.663f, 19.942f),
                    PathNode.LineTo(2.537f, 19.886f),
                    PathNode.LineTo(2.442f, 19.83f),
                    PathNode.LineTo(2.353f, 19.763f),
                    PathNode.LineTo(2.293f, 19.707f),
                    PathNode.LineTo(2.22f, 19.625f),
                    PathNode.LineTo(2.156f, 19.536f),
                    PathNode.LineTo(2.134f, 19.5f),
                    PathNode.LineTo(2.102f, 19.44f),
                    PathNode.LineTo(2.058f, 19.337f),
                    PathNode.LineTo(2.042f, 19.288f),
                    PathNode.LineTo(2.016f, 19.178f),
                    PathNode.LineTo(2.006f, 19.117f),
                    PathNode.LineTo(2.002f, 19.068f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.000009f, 5.642744f, 2.190607f, 5.312629f, 2.5f, 5.134f),
                    PathNode.CurveTo(5.085718f, 3.641237f, 8.203195f, 3.381936f, 11.0f, 4.427f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _book!!
    }

private var _book: ImageVector? = null
