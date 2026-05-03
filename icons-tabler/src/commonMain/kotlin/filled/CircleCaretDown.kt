package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretDown: ImageVector
    get() {
        if (_circleCaretDown != null) return _circleCaretDown!!
        _circleCaretDown = tablerFilledIcon(
            name = "CircleCaretDown",
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
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.595422f, 9.999681f, 8.230514f, 10.243175f, 8.075513f, 10.616883f),
                    PathNode.CurveTo(7.920513f, 10.990592f, 8.005964f, 11.420877f, 8.292f, 11.707f),
                    PathNode.LineTo(11.292f, 14.707f),
                    PathNode.CurveTo(11.479568f, 14.894777f, 11.734091f, 15.000287f, 11.9995f, 15.000287f),
                    PathNode.CurveTo(12.264909f, 15.000287f, 12.519432f, 14.894777f, 12.707f, 14.707f),
                    PathNode.LineTo(15.707f, 11.707f),
                    PathNode.CurveTo(16.097382f, 11.3165f, 16.097382f, 10.6835f, 15.707f, 10.293f),
                    PathNode.LineTo(15.613f, 10.21f),
                    PathNode.CurveTo(15.437637f, 10.073904f, 15.221977f, 10.000024f, 15.0f, 10.0f)
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
        return _circleCaretDown!!
    }

private var _circleCaretDown: ImageVector? = null
