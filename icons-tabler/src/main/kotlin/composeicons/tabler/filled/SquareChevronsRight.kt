package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsRight: ImageVector
    get() {
        if (_squareChevronsRight != null) return _squareChevronsRight!!
        _squareChevronsRight = tablerFilledIcon(
            name = "SquareChevronsRight",
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
                    PathNode.MoveTo(8.613f, 8.21f),
                    PathNode.CurveTo(8.214915f, 7.901198f, 7.649269f, 7.936765f, 7.293f, 8.293f),
                    PathNode.LineTo(7.21f, 8.387f),
                    PathNode.CurveTo(6.901198f, 8.785086f, 6.936765f, 9.350732f, 7.293f, 9.707f),
                    PathNode.LineTo(9.585f, 12.0f),
                    PathNode.LineTo(7.293f, 14.293f),
                    PathNode.LineTo(7.21f, 14.387f),
                    PathNode.CurveTo(6.887466f, 14.80413f, 6.944231f, 15.400022f, 7.339721f, 15.748752f),
                    PathNode.CurveTo(7.735213f, 16.09748f, 8.333524f, 16.07921f, 8.707f, 15.707f),
                    PathNode.LineTo(11.707f, 12.707f),
                    PathNode.LineTo(11.79f, 12.613f),
                    PathNode.CurveTo(12.098803f, 12.214914f, 12.063235f, 11.649268f, 11.707f, 11.293f),
                    PathNode.LineTo(8.707f, 8.293f),
                    PathNode.Close,
                    PathNode.MoveTo(13.613f, 8.21f),
                    PathNode.CurveTo(13.214914f, 7.901198f, 12.649268f, 7.936765f, 12.293f, 8.293f),
                    PathNode.LineTo(12.21f, 8.387f),
                    PathNode.CurveTo(11.901197f, 8.785086f, 11.936765f, 9.350732f, 12.293f, 9.707f),
                    PathNode.LineTo(14.585f, 12.0f),
                    PathNode.LineTo(12.293f, 14.293f),
                    PathNode.LineTo(12.21f, 14.387f),
                    PathNode.CurveTo(11.887465f, 14.80413f, 11.94423f, 15.400022f, 12.339722f, 15.748752f),
                    PathNode.CurveTo(12.735212f, 16.09748f, 13.333524f, 16.07921f, 13.707f, 15.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(16.79f, 12.613f),
                    PathNode.CurveTo(17.098803f, 12.214914f, 17.063234f, 11.649268f, 16.707f, 11.293f),
                    PathNode.LineTo(13.707f, 8.293f),
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
        return _squareChevronsRight!!
    }

private var _squareChevronsRight: ImageVector? = null
