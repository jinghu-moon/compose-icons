package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronUp: ImageVector
    get() {
        if (_circleChevronUp != null) return _circleChevronUp!!
        _circleChevronUp = tablerFilledIcon(
            name = "CircleChevronUp",
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
                    PathNode.MoveTo(12.707f, 9.293f),
                    PathNode.CurveTo(12.3165f, 8.902618f, 11.6835f, 8.902618f, 11.293f, 9.293f),
                    PathNode.LineTo(8.293f, 12.293f),
                    PathNode.CurveTo(7.902618f, 12.6835f, 7.902618f, 13.3165f, 8.293f, 13.707f),
                    PathNode.LineTo(8.387f, 13.79f),
                    PathNode.CurveTo(8.785086f, 14.098803f, 9.350732f, 14.063235f, 9.707f, 13.707f),
                    PathNode.LineTo(12.0f, 11.415f),
                    PathNode.LineTo(14.293f, 13.707f),
                    PathNode.CurveTo(14.685379f, 14.085972f, 15.309085f, 14.080552f, 15.694818f, 13.694818f),
                    PathNode.CurveTo(16.080553f, 13.309085f, 16.085972f, 12.685379f, 15.707f, 12.293f),
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
        return _circleChevronUp!!
    }

private var _circleChevronUp: ImageVector? = null
