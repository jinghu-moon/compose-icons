package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowDown: ImageVector
    get() {
        if (_squareArrowDown != null) return _squareArrowDown!!
        _squareArrowDown = tablerFilledIcon(
            name = "SquareArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.447715f, 7.0f, 11.0f, 7.447716f, 11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 13.585f),
                    PathNode.LineTo(8.707f, 11.293f),
                    PathNode.LineTo(8.613f, 11.21f),
                    PathNode.CurveTo(8.195871f, 10.887465f, 7.599979f, 10.94423f, 7.251249f, 11.339722f),
                    PathNode.CurveTo(6.902519f, 11.735212f, 6.920789f, 12.333524f, 7.293f, 12.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(11.387f, 16.79f),
                    PathNode.LineTo(11.479f, 16.854f),
                    PathNode.LineTo(11.577f, 16.906f),
                    PathNode.LineTo(11.687f, 16.95f),
                    PathNode.LineTo(11.799f, 16.98f),
                    PathNode.LineTo(11.925f, 16.997f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.117f, 16.993f),
                    PathNode.LineTo(12.266f, 16.964f),
                    PathNode.LineTo(12.371f, 16.929f),
                    PathNode.LineTo(12.484f, 16.875f),
                    PathNode.LineTo(12.595f, 16.804f),
                    PathNode.CurveTo(12.63483f, 16.774668f, 12.67228f, 16.742233f, 12.707f, 16.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(16.79f, 12.613f),
                    PathNode.CurveTo(17.098803f, 12.214914f, 17.063234f, 11.649268f, 16.707f, 11.293f),
                    PathNode.LineTo(16.613f, 11.21f),
                    PathNode.CurveTo(16.214914f, 10.901197f, 15.649268f, 10.936765f, 15.293f, 11.293f),
                    PathNode.LineTo(13.0f, 13.585f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _squareArrowDown!!
    }

private var _squareArrowDown: ImageVector? = null
