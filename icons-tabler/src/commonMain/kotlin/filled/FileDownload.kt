package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDownload: ImageVector
    get() {
        if (_fileDownload != null) return _fileDownload!!
        _fileDownload = tablerFilledIcon(
            name = "FileDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.117f, 2.007f),
                    PathNode.CurveTo(12.576491f, 2.061188f, 12.938812f, 2.423509f, 12.993f, 2.883f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.005f, 7.15f),
                    PathNode.CurveTo(13.078939f, 8.133892f, 13.859354f, 8.916854f, 14.843f, 8.994f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.117f, 9.007f),
                    PathNode.CurveTo(19.57649f, 9.061188f, 19.938812f, 9.423509f, 19.993f, 9.883f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.000088f, 20.588558f, 18.761822f, 21.901804f, 17.176f, 21.995f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.411443f, 22.000088f, 4.098196f, 20.761822f, 4.005f, 19.176f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(3.999912f, 3.411442f, 5.238179f, 2.098195f, 6.824f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(11.447715f, 10.0f, 11.0f, 10.447715f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 14.585f),
                    PathNode.LineTo(10.207f, 13.793f),
                    PathNode.CurveTo(9.850732f, 13.436765f, 9.285086f, 13.401197f, 8.887f, 13.71f),
                    PathNode.LineTo(8.793f, 13.793f),
                    PathNode.CurveTo(8.402618f, 14.1835f, 8.402618f, 14.8165f, 8.793f, 15.207f),
                    PathNode.LineTo(11.293f, 17.707f),
                    PathNode.LineTo(11.337f, 17.749f),
                    PathNode.LineTo(11.405f, 17.804f),
                    PathNode.LineTo(11.515f, 17.875f),
                    PathNode.LineTo(11.629f, 17.929f),
                    PathNode.LineTo(11.734f, 17.964f),
                    PathNode.LineTo(11.884f, 17.994f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(12.117f, 17.993f),
                    PathNode.LineTo(12.234f, 17.973f),
                    PathNode.LineTo(12.342f, 17.94f),
                    PathNode.LineTo(12.423f, 17.906f),
                    PathNode.LineTo(12.521f, 17.854f),
                    PathNode.LineTo(12.613f, 17.79f),
                    PathNode.LineTo(12.707f, 17.707f),
                    PathNode.LineTo(15.207f, 15.207f),
                    PathNode.CurveTo(15.597382f, 14.8165f, 15.597382f, 14.1835f, 15.207f, 13.793f),
                    PathNode.LineTo(15.113f, 13.71f),
                    PathNode.CurveTo(14.714914f, 13.401197f, 14.149268f, 13.436765f, 13.793f, 13.793f),
                    PathNode.LineTo(13.0f, 14.584f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(12.999933f, 10.493025f, 12.620493f, 10.066316f, 12.117f, 10.007f),
                    PathNode.Close,
                    PathNode.MoveTo(14.999f, 2.999f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
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
        return _fileDownload!!
    }

private var _fileDownload: ImageVector? = null
