package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowRightSquare: ImageVector
    get() {
        if (_arrowRightSquare != null) return _arrowRightSquare!!
        _arrowRightSquare = tablerFilledIcon(
            name = "ArrowRightSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.707f, 8.293f),
                    PathNode.LineTo(21.707f, 11.293f),
                    PathNode.QuadTo(21.761f, 11.346f, 21.804f, 11.405f),
                    PathNode.LineTo(21.875f, 11.515f),
                    PathNode.LineTo(21.929f, 11.629f),
                    PathNode.LineTo(21.964f, 11.734f),
                    PathNode.LineTo(21.994f, 11.882f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.997f, 12.075f),
                    PathNode.LineTo(21.98f, 12.201f),
                    PathNode.LineTo(21.95f, 12.312f),
                    PathNode.LineTo(21.906f, 12.423f),
                    PathNode.LineTo(21.854f, 12.521f),
                    PathNode.LineTo(21.78f, 12.625f),
                    PathNode.LineTo(21.707f, 12.707f),
                    PathNode.LineTo(18.707f, 15.707f),
                    PathNode.CurveTo(18.31462f, 16.085972f, 17.690916f, 16.080553f, 17.305182f, 15.694818f),
                    PathNode.CurveTo(16.919447f, 15.309085f, 16.914028f, 14.685379f, 17.293f, 14.293f),
                    PathNode.LineTo(18.585f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 14.552285f, 7.552285f, 15.0f, 7.0f, 15.0f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.CurveTo(2.447715f, 15.0f, 2.0f, 14.552285f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.CurveTo(2.0f, 9.447715f, 2.447715f, 9.0f, 3.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.552285f, 9.0f, 8.0f, 9.447715f, 8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(18.585f, 11.0f),
                    PathNode.LineTo(17.293f, 9.707f),
                    PathNode.CurveTo(16.936766f, 9.350732f, 16.901197f, 8.785086f, 17.21f, 8.387f),
                    PathNode.LineTo(17.293f, 8.293f),
                    PathNode.CurveTo(17.6835f, 7.902618f, 18.3165f, 7.902618f, 18.707f, 8.293f)
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
        return _arrowRightSquare!!
    }

private var _arrowRightSquare: ImageVector? = null
