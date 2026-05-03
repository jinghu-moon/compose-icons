package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileUpload: ImageVector
    get() {
        if (_fileUpload != null) return _fileUpload!!
        _fileUpload = tablerFilledIcon(
            name = "FileUpload",
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
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(11.91f, 11.004f),
                    PathNode.LineTo(11.852f, 11.011f),
                    PathNode.LineTo(11.734f, 11.036f),
                    PathNode.LineTo(11.629f, 11.071f),
                    PathNode.LineTo(11.516f, 11.125f),
                    PathNode.LineTo(11.405f, 11.196f),
                    PathNode.CurveTo(11.365319f, 11.225519f, 11.327884f, 11.257941f, 11.293f, 11.293f),
                    PathNode.LineTo(8.793f, 13.793f),
                    PathNode.CurveTo(8.402618f, 14.1835f, 8.402618f, 14.8165f, 8.793f, 15.207f),
                    PathNode.LineTo(8.887f, 15.29f),
                    PathNode.CurveTo(9.285086f, 15.598803f, 9.850732f, 15.563235f, 10.207f, 15.207f),
                    PathNode.LineTo(11.0f, 14.414f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 18.552284f, 11.447715f, 19.0f, 12.0f, 19.0f),
                    PathNode.CurveTo(12.552285f, 19.0f, 13.0f, 18.552284f, 13.0f, 18.0f),
                    PathNode.LineTo(13.0f, 14.415f),
                    PathNode.LineTo(13.793f, 15.207f),
                    PathNode.CurveTo(14.185379f, 15.585972f, 14.809085f, 15.580552f, 15.194818f, 15.194818f),
                    PathNode.CurveTo(15.580552f, 14.809085f, 15.585972f, 14.185379f, 15.207f, 13.793f),
                    PathNode.LineTo(12.707f, 11.293f),
                    PathNode.LineTo(12.625f, 11.22f),
                    PathNode.LineTo(12.521f, 11.146f),
                    PathNode.LineTo(12.423f, 11.094f),
                    PathNode.LineTo(12.313f, 11.05f),
                    PathNode.LineTo(12.201f, 11.02f),
                    PathNode.LineTo(12.075f, 11.003f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(14.999f, 2.999f),
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
        return _fileUpload!!
    }

private var _fileUpload: ImageVector? = null
