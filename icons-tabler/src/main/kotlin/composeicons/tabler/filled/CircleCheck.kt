package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCheck: ImageVector
    get() {
        if (_circleCheck != null) return _circleCheck!!
        _circleCheck = tablerFilledIcon(
            name = "CircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(15.707f, 9.293f),
                    PathNode.CurveTo(15.350732f, 8.936765f, 14.785086f, 8.901197f, 14.387f, 9.21f),
                    PathNode.LineTo(14.293f, 9.293f),
                    PathNode.LineTo(11.0f, 12.585f),
                    PathNode.LineTo(9.707f, 11.293f),
                    PathNode.LineTo(9.613f, 11.21f),
                    PathNode.CurveTo(9.214898f, 10.901423f, 8.649426f, 10.937099f, 8.293263f, 11.293262f),
                    PathNode.CurveTo(7.937099f, 11.649426f, 7.901423f, 12.214898f, 8.21f, 12.613f),
                    PathNode.LineTo(8.293f, 12.707f),
                    PathNode.LineTo(10.293f, 14.707f),
                    PathNode.LineTo(10.387f, 14.79f),
                    PathNode.CurveTo(10.747744f, 15.069889f, 11.252256f, 15.069889f, 11.613f, 14.79f),
                    PathNode.LineTo(11.707f, 14.707f),
                    PathNode.LineTo(15.707f, 10.707f),
                    PathNode.LineTo(15.79f, 10.613f),
                    PathNode.CurveTo(16.098803f, 10.214914f, 16.063234f, 9.649268f, 15.707f, 9.293f),
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
        return _circleCheck!!
    }

private var _circleCheck: ImageVector? = null
