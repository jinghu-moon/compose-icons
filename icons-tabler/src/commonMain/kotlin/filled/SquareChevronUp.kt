package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronUp: ImageVector
    get() {
        if (_squareChevronUp != null) return _squareChevronUp!!
        _squareChevronUp = tablerFilledIcon(
            name = "SquareChevronUp",
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
                    PathNode.MoveTo(12.613f, 9.21f),
                    PathNode.CurveTo(12.214914f, 8.901197f, 11.649268f, 8.936765f, 11.293f, 9.293f),
                    PathNode.LineTo(8.293f, 12.293f),
                    PathNode.LineTo(8.21f, 12.387f),
                    PathNode.CurveTo(7.901198f, 12.785086f, 7.936765f, 13.350732f, 8.293f, 13.707f),
                    PathNode.LineTo(8.387f, 13.79f),
                    PathNode.CurveTo(8.785086f, 14.098803f, 9.350732f, 14.063235f, 9.707f, 13.707f),
                    PathNode.LineTo(12.0f, 11.415f),
                    PathNode.LineTo(14.293f, 13.707f),
                    PathNode.LineTo(14.387f, 13.79f),
                    PathNode.CurveTo(14.80413f, 14.112535f, 15.400022f, 14.05577f, 15.748752f, 13.660278f),
                    PathNode.CurveTo(16.09748f, 13.264788f, 16.07921f, 12.666476f, 15.707f, 12.293f),
                    PathNode.LineTo(12.707f, 9.293f),
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
        return _squareChevronUp!!
    }

private var _squareChevronUp: ImageVector? = null
