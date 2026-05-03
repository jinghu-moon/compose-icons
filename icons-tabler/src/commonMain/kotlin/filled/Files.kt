package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = tablerFilledIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.001f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(14.000067f, 8.506975f, 14.379507f, 8.933684f, 14.883f, 8.993f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.0f, 16.656855f, 19.656855f, 18.0f, 18.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.656855f, 15.656855f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.343146f, 5.343146f, 6.0f, 7.0f, 6.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 3.343146f, 9.343145f, 2.0f, 11.0f, 2.0f),
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(7.0f, 8.0f),
                    PathNode.CurveTo(6.447716f, 8.0f, 6.0f, 8.447715f, 6.0f, 9.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(6.0f, 19.552284f, 6.447716f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.CurveTo(14.552285f, 20.0f, 15.0f, 19.552284f, 15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(9.343145f, 18.0f, 8.0f, 16.656855f, 8.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(20.415f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.LineTo(16.0f, 2.585f),
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
        return _files!!
    }

private var _files: ImageVector? = null
