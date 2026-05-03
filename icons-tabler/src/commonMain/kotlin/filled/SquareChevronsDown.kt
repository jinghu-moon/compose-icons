package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsDown: ImageVector
    get() {
        if (_squareChevronsDown != null) return _squareChevronsDown!!
        _squareChevronsDown = tablerFilledIcon(
            name = "SquareChevronsDown",
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
                    PathNode.MoveTo(9.613f, 12.21f),
                    PathNode.CurveTo(9.19587f, 11.887465f, 8.599978f, 11.94423f, 8.251249f, 12.339722f),
                    PathNode.CurveTo(7.902519f, 12.735212f, 7.920789f, 13.333524f, 8.293f, 13.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(11.387f, 16.79f),
                    PathNode.CurveTo(11.785086f, 17.098803f, 12.350732f, 17.063234f, 12.707f, 16.707f),
                    PathNode.LineTo(15.707f, 13.707f),
                    PathNode.LineTo(15.79f, 13.613f),
                    PathNode.CurveTo(16.098803f, 13.214914f, 16.063234f, 12.649268f, 15.707f, 12.293f),
                    PathNode.LineTo(15.613f, 12.21f),
                    PathNode.CurveTo(15.214914f, 11.901197f, 14.649268f, 11.936765f, 14.293f, 12.293f),
                    PathNode.LineTo(12.0f, 14.585f),
                    PathNode.LineTo(9.707f, 12.293f),
                    PathNode.Close,
                    PathNode.MoveTo(9.613f, 7.21f),
                    PathNode.CurveTo(9.19587f, 6.887466f, 8.599978f, 6.944231f, 8.251249f, 7.339721f),
                    PathNode.CurveTo(7.902519f, 7.735213f, 7.920789f, 8.333524f, 8.293f, 8.707f),
                    PathNode.LineTo(11.293f, 11.707f),
                    PathNode.LineTo(11.387f, 11.79f),
                    PathNode.CurveTo(11.785086f, 12.098803f, 12.350732f, 12.063235f, 12.707f, 11.707f),
                    PathNode.LineTo(15.707f, 8.707f),
                    PathNode.LineTo(15.79f, 8.613f),
                    PathNode.CurveTo(16.098803f, 8.214915f, 16.063234f, 7.649269f, 15.707f, 7.293f),
                    PathNode.LineTo(15.613f, 7.21f),
                    PathNode.CurveTo(15.214914f, 6.901198f, 14.649268f, 6.936765f, 14.293f, 7.293f),
                    PathNode.LineTo(12.0f, 9.585f),
                    PathNode.LineTo(9.707f, 7.293f),
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
        return _squareChevronsDown!!
    }

private var _squareChevronsDown: ImageVector? = null
