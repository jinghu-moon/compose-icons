package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretUp: ImageVector
    get() {
        if (_circleCaretUp != null) return _circleCaretUp!!
        _circleCaretUp = tablerFilledIcon(
            name = "CircleCaretUp",
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
                    PathNode.CurveTo(8.007093f, 12.578994f, 7.921578f, 13.009037f, 8.076322f, 13.382654f),
                    PathNode.CurveTo(8.231066f, 13.756272f, 8.595604f, 13.999913f, 9.0f, 14.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.CurveTo(15.217f, 14.0f, 15.433f, 13.93f, 15.613f, 13.79f),
                    PathNode.LineTo(15.707f, 13.707f),
                    PathNode.CurveTo(16.097382f, 13.3165f, 16.097382f, 12.6835f, 15.707f, 12.293f),
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
        return _circleCaretUp!!
    }

private var _circleCaretUp: ImageVector? = null
