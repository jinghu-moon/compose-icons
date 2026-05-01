package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clock: ImageVector
    get() {
        if (_clock != null) return _clock!!
        _clock = tablerFilledIcon(
            name = "Clock",
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.493025f, 6.000067f, 11.066316f, 6.379507f, 11.007f, 6.883f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.009f, 12.131f),
                    PathNode.CurveTo(11.0318f, 12.304498f, 11.09973f, 12.468975f, 11.206f, 12.608f),
                    PathNode.LineTo(11.293f, 12.708f),
                    PathNode.LineTo(14.293f, 15.708f),
                    PathNode.LineTo(14.387f, 15.79f),
                    PathNode.CurveTo(14.747744f, 16.06989f, 15.252256f, 16.06989f, 15.613f, 15.79f),
                    PathNode.LineTo(15.707f, 15.707f),
                    PathNode.LineTo(15.79f, 15.613f),
                    PathNode.CurveTo(16.06989f, 15.252256f, 16.06989f, 14.747744f, 15.79f, 14.387f),
                    PathNode.LineTo(15.707f, 14.293f),
                    PathNode.LineTo(13.0f, 11.585f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(12.993f, 6.883f),
                    PathNode.CurveTo(12.933684f, 6.379507f, 12.506975f, 6.000067f, 12.0f, 6.0f),
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
        return _clock!!
    }

private var _clock: ImageVector? = null
