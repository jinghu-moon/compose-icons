package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronRight: ImageVector
    get() {
        if (_squareChevronRight != null) return _squareChevronRight!!
        _squareChevronRight = tablerFilledIcon(
            name = "SquareChevronRight",
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
                    PathNode.MoveTo(11.613f, 8.21f),
                    PathNode.CurveTo(11.214914f, 7.901198f, 10.649268f, 7.936765f, 10.293f, 8.293f),
                    PathNode.LineTo(10.21f, 8.387f),
                    PathNode.CurveTo(9.901197f, 8.785086f, 9.936765f, 9.350732f, 10.293f, 9.707f),
                    PathNode.LineTo(12.585f, 12.0f),
                    PathNode.LineTo(10.293f, 14.293f),
                    PathNode.LineTo(10.21f, 14.387f),
                    PathNode.CurveTo(9.887465f, 14.80413f, 9.94423f, 15.400022f, 10.339722f, 15.748752f),
                    PathNode.CurveTo(10.735212f, 16.09748f, 11.333524f, 16.07921f, 11.707f, 15.707f),
                    PathNode.LineTo(14.707f, 12.707f),
                    PathNode.LineTo(14.79f, 12.613f),
                    PathNode.CurveTo(15.098803f, 12.214914f, 15.063235f, 11.649268f, 14.707f, 11.293f),
                    PathNode.LineTo(11.707f, 8.293f),
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
        return _squareChevronRight!!
    }

private var _squareChevronRight: ImageVector? = null
