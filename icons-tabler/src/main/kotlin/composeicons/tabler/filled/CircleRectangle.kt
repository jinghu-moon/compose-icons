package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleRectangle: ImageVector
    get() {
        if (_circleRectangle != null) return _circleRectangle!!
        _circleRectangle = tablerFilledIcon(
            name = "CircleRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.202793f, 5.766485f, 23.05675f, 10.86025f, 21.396896f, 15.420535f),
                    PathNode.CurveTo(19.737045f, 19.98082f, 15.042578f, 22.691092f, 10.263351f, 21.848303f),
                    PathNode.CurveTo(5.484125f, 21.005512f, 1.999877f, 16.852968f, 2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.CurveTo(6.447716f, 9.0f, 6.0f, 9.447715f, 6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.CurveTo(6.0f, 14.552285f, 6.447716f, 15.0f, 7.0f, 15.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.552284f, 15.0f, 18.0f, 14.552285f, 18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 9.447715f, 17.552284f, 9.0f, 17.0f, 9.0f)
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
        return _circleRectangle!!
    }

private var _circleRectangle: ImageVector? = null
