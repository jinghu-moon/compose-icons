package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = tablerFilledIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.219798f, 2.999982f, 9.43348f, 3.072381f, 9.608f, 3.206f),
                    PathNode.LineTo(9.708f, 3.293f),
                    PathNode.LineTo(12.414f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.588558f, 5.999912f, 21.901804f, 7.238179f, 21.995f, 8.824f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.000088f, 18.588558f, 20.761822f, 19.901804f, 19.176f, 19.995f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.411442f, 20.000088f, 2.098195f, 18.761822f, 2.005f, 17.176f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(1.999912f, 4.411443f, 3.238179f, 3.098195f, 4.824f, 3.005f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
