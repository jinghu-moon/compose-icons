package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = tablerFilledIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.265195f, 2.000057f, 12.519507f, 2.105451f, 12.707f, 2.293f),
                    PathNode.LineTo(14.415f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.588558f, 3.999912f, 21.901804f, 5.238179f, 21.995f, 6.824f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.656855f, 20.656855f, 17.0f, 19.0f, 17.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.656855f, 16.656855f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.343146f, 21.0f, 2.0f, 19.656855f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.343146f, 3.343146f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.343146f, 7.343146f, 2.0f, 9.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(5.0f, 8.0f),
                    PathNode.CurveTo(4.447716f, 8.0f, 4.0f, 8.447715f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 18.552284f, 4.447716f, 19.0f, 5.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.552285f, 19.0f, 16.0f, 18.552284f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(7.343146f, 17.0f, 6.0f, 15.656855f, 6.0f, 14.0f),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
