package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ExclamationCircle: ImageVector
    get() {
        if (_exclamationCircle != null) return _exclamationCircle!!
        _exclamationCircle = tablerFilledIcon(
            name = "ExclamationCircle",
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 15.447715f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.01f),
                    PathNode.CurveTo(11.0f, 16.562284f, 11.447715f, 17.01f, 12.0f, 17.01f),
                    PathNode.CurveTo(12.552285f, 17.01f, 13.0f, 16.562284f, 13.0f, 16.01f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 15.447715f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(11.447715f, 8.0f, 11.0f, 8.447715f, 11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 13.552285f, 11.447715f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.552285f, 14.0f, 13.0f, 13.552285f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.0f, 8.447715f, 12.552285f, 8.0f, 12.0f, 8.0f)
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
        return _exclamationCircle!!
    }

private var _exclamationCircle: ImageVector? = null
