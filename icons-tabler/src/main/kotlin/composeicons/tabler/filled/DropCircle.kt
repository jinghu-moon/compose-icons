package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropCircle: ImageVector
    get() {
        if (_dropCircle != null) return _dropCircle!!
        _dropCircle = tablerFilledIcon(
            name = "DropCircle",
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
                    PathNode.MoveTo(12.823f, 7.432f),
                    PathNode.CurveTo(12.636314f, 7.161524f, 12.328648f, 7.000042f, 12.0f, 7.000042f),
                    PathNode.CurveTo(11.671352f, 7.000042f, 11.363686f, 7.161524f, 11.177f, 7.432f),
                    PathNode.LineTo(8.575f, 11.196f),
                    PathNode.CurveTo(7.553f, 12.866f, 7.941f, 14.932f, 9.45f, 16.125f),
                    PathNode.CurveTo(10.947737f, 17.292356f, 13.047263f, 17.292356f, 14.545f, 16.125f),
                    PathNode.CurveTo(16.055f, 14.934f, 16.442f, 12.865f, 15.449f, 11.243f),
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
        return _dropCircle!!
    }

private var _dropCircle: ImageVector? = null
