package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareX: ImageVector
    get() {
        if (_squareX != null) return _squareX!!
        _squareX = tablerFilledIcon(
            name = "SquareX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.LineTo(5.0f, 2.0f),
                    PathNode.CurveTo(3.343146f, 2.0f, 2.0f, 3.343146f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 20.656855f, 3.343146f, 22.0f, 5.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.CurveTo(20.656855f, 22.0f, 22.0f, 20.656855f, 22.0f, 19.0f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 3.343146f, 20.656855f, 2.0f, 19.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.613f, 8.21f),
                    PathNode.LineTo(9.707f, 8.293f),
                    PathNode.LineTo(12.0f, 10.585f),
                    PathNode.LineTo(14.293f, 8.293f),
                    PathNode.CurveTo(14.666476f, 7.920789f, 15.264788f, 7.902519f, 15.660278f, 8.251249f),
                    PathNode.CurveTo(16.055769f, 8.599978f, 16.112535f, 9.19587f, 15.79f, 9.613f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.LineTo(13.415f, 12.0f),
                    PathNode.LineTo(15.707f, 14.293f),
                    PathNode.CurveTo(16.07921f, 14.666476f, 16.09748f, 15.264788f, 15.748752f, 15.660278f),
                    PathNode.CurveTo(15.400022f, 16.055769f, 14.80413f, 16.112535f, 14.387f, 15.79f),
                    PathNode.LineTo(14.293f, 15.707f),
                    PathNode.LineTo(12.0f, 13.415f),
                    PathNode.LineTo(9.707f, 15.707f),
                    PathNode.CurveTo(9.333524f, 16.07921f, 8.735212f, 16.09748f, 8.339722f, 15.748752f),
                    PathNode.CurveTo(7.944231f, 15.400022f, 7.887466f, 14.80413f, 8.21f, 14.387f),
                    PathNode.LineTo(8.293f, 14.293f),
                    PathNode.LineTo(10.585f, 12.0f),
                    PathNode.LineTo(8.293f, 9.707f),
                    PathNode.CurveTo(7.920789f, 9.333524f, 7.902519f, 8.735212f, 8.251249f, 8.339722f),
                    PathNode.CurveTo(8.599978f, 7.944231f, 9.19587f, 7.887466f, 9.613f, 8.21f),
                    PathNode.Close
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
        return _squareX!!
    }

private var _squareX: ImageVector? = null
