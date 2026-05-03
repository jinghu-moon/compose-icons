package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodSad: ImageVector
    get() {
        if (_moodSad != null) return _moodSad!!
        _moodSad = tablerFilledIcon(
            name = "MoodSad",
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
                    PathNode.MoveTo(12.0f, 13.2f),
                    PathNode.CurveTo(10.790799f, 13.199904f, 9.632441f, 13.686459f, 8.786f, 14.55f),
                    PathNode.CurveTo(8.529853f, 14.803912f, 8.430281f, 15.176084f, 8.525418f, 15.523979f),
                    PathNode.CurveTo(8.620556f, 15.871875f, 8.89566f, 16.141584f, 9.245372f, 16.229816f),
                    PathNode.CurveTo(9.595083f, 16.318047f, 9.96521f, 16.211124f, 10.214f, 15.95f),
                    PathNode.CurveTo(10.684243f, 15.469903f, 11.327972f, 15.199344f, 12.0f, 15.199344f),
                    PathNode.CurveTo(12.672028f, 15.199344f, 13.315757f, 15.469903f, 13.786f, 15.95f),
                    PathNode.CurveTo(14.174276f, 16.334888f, 14.799678f, 16.336613f, 15.190072f, 15.953874f),
                    PathNode.CurveTo(15.580466f, 15.571135f, 15.591125f, 14.945821f, 15.214f, 14.55f),
                    PathNode.CurveTo(14.367559f, 13.686459f, 13.209201f, 13.199904f, 12.0f, 13.2f),
                    PathNode.Close,
                    PathNode.MoveTo(9.01f, 9.0f),
                    PathNode.LineTo(8.883f, 9.007f),
                    PathNode.CurveTo(8.37995f, 9.066836f, 8.001114f, 9.493402f, 8.001114f, 10.0f),
                    PathNode.CurveTo(8.001114f, 10.506598f, 8.37995f, 10.933164f, 8.883f, 10.993f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.127f, 10.993f),
                    PathNode.CurveTo(9.630051f, 10.933164f, 10.008885f, 10.506598f, 10.008885f, 10.0f),
                    PathNode.CurveTo(10.008885f, 9.493402f, 9.630051f, 9.066836f, 9.127f, 9.007f),
                    PathNode.LineTo(9.01f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.01f, 9.0f),
                    PathNode.LineTo(14.883f, 9.007f),
                    PathNode.CurveTo(14.37995f, 9.066836f, 14.001114f, 9.493402f, 14.001114f, 10.0f),
                    PathNode.CurveTo(14.001114f, 10.506598f, 14.37995f, 10.933164f, 14.883f, 10.993f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.127f, 10.993f),
                    PathNode.CurveTo(15.630051f, 10.933164f, 16.008886f, 10.506598f, 16.008886f, 10.0f),
                    PathNode.CurveTo(16.008886f, 9.493402f, 15.630051f, 9.066836f, 15.127f, 9.007f),
                    PathNode.LineTo(15.01f, 9.0f),
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
        return _moodSad!!
    }

private var _moodSad: ImageVector? = null
