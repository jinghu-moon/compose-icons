package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsUp: ImageVector
    get() {
        if (_squareChevronsUp != null) return _squareChevronsUp!!
        _squareChevronsUp = tablerFilledIcon(
            name = "SquareChevronsUp",
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
                    PathNode.MoveTo(12.613f, 12.21f),
                    PathNode.CurveTo(12.214914f, 11.901197f, 11.649268f, 11.936765f, 11.293f, 12.293f),
                    PathNode.LineTo(8.293f, 15.293f),
                    PathNode.LineTo(8.21f, 15.387f),
                    PathNode.CurveTo(7.901198f, 15.785086f, 7.936765f, 16.35073f, 8.293f, 16.707f),
                    PathNode.LineTo(8.387f, 16.79f),
                    PathNode.CurveTo(8.785086f, 17.098803f, 9.350732f, 17.063234f, 9.707f, 16.707f),
                    PathNode.LineTo(12.0f, 14.415f),
                    PathNode.LineTo(14.293f, 16.707f),
                    PathNode.LineTo(14.387f, 16.79f),
                    PathNode.CurveTo(14.80413f, 17.112535f, 15.400022f, 17.055767f, 15.748752f, 16.660278f),
                    PathNode.CurveTo(16.09748f, 16.264788f, 16.07921f, 15.666476f, 15.707f, 15.293f),
                    PathNode.LineTo(12.707f, 12.293f),
                    PathNode.Close,
                    PathNode.MoveTo(12.613f, 7.21f),
                    PathNode.CurveTo(12.214914f, 6.901198f, 11.649268f, 6.936765f, 11.293f, 7.293f),
                    PathNode.LineTo(8.293f, 10.293f),
                    PathNode.LineTo(8.21f, 10.387f),
                    PathNode.CurveTo(7.901198f, 10.785086f, 7.936765f, 11.350732f, 8.293f, 11.707f),
                    PathNode.LineTo(8.387f, 11.79f),
                    PathNode.CurveTo(8.785086f, 12.098803f, 9.350732f, 12.063235f, 9.707f, 11.707f),
                    PathNode.LineTo(12.0f, 9.415f),
                    PathNode.LineTo(14.293f, 11.707f),
                    PathNode.LineTo(14.387f, 11.79f),
                    PathNode.CurveTo(14.80413f, 12.112535f, 15.400022f, 12.05577f, 15.748752f, 11.660278f),
                    PathNode.CurveTo(16.09748f, 11.264788f, 16.07921f, 10.666476f, 15.707f, 10.293f),
                    PathNode.LineTo(12.707f, 7.293f),
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
        return _squareChevronsUp!!
    }

private var _squareChevronsUp: ImageVector? = null
