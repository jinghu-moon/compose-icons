package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCheck: ImageVector
    get() {
        if (_fileCheck != null) return _fileCheck!!
        _fileCheck = tablerFilledIcon(
            name = "FileCheck",
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
                    PathNode.MoveTo(15.707f, 12.293f),
                    PathNode.CurveTo(15.3165f, 11.902618f, 14.6835f, 11.902618f, 14.293f, 12.293f),
                    PathNode.LineTo(11.0f, 15.585f),
                    PathNode.LineTo(9.707f, 14.293f),
                    PathNode.CurveTo(9.455926f, 14.033044f, 9.084122f, 13.928787f, 8.734492f, 14.020303f),
                    PathNode.CurveTo(8.384863f, 14.111818f, 8.111819f, 14.384863f, 8.020303f, 14.734492f),
                    PathNode.CurveTo(7.928787f, 15.084122f, 8.033044f, 15.455926f, 8.293f, 15.707f),
                    PathNode.LineTo(10.293f, 17.707f),
                    PathNode.CurveTo(10.6835f, 18.097382f, 11.3165f, 18.097382f, 11.707f, 17.707f),
                    PathNode.LineTo(15.707f, 13.707f),
                    PathNode.CurveTo(16.097382f, 13.3165f, 16.097382f, 12.6835f, 15.707f, 12.293f),
                    PathNode.MoveTo(15.0f, 2.999f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
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
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
