package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = tablerFilledIcon(
            name = "Gps",
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
                    PathNode.MoveTo(16.914f, 8.406f),
                    PathNode.CurveTo(17.286f, 7.569f, 16.431f, 6.714f, 15.594f, 7.086f),
                    PathNode.LineTo(6.594f, 11.086f),
                    PathNode.LineTo(6.486f, 11.141f),
                    PathNode.CurveTo(5.736f, 11.581f, 5.875f, 12.75f, 6.757f, 12.971f),
                    PathNode.LineTo(10.175f, 13.824f),
                    PathNode.LineTo(11.03f, 17.243f),
                    PathNode.CurveTo(11.26f, 18.165f, 12.528f, 18.275f, 12.914f, 17.406f),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
