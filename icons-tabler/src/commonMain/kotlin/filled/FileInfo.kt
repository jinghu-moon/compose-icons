package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileInfo: ImageVector
    get() {
        if (_fileInfo != null) return _fileInfo!!
        _fileInfo = tablerFilledIcon(
            name = "FileInfo",
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
                    PathNode.MoveTo(12.0f, 14.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.CurveTo(10.447715f, 14.0f, 10.0f, 14.447715f, 10.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 15.552285f, 10.447715f, 16.0f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 19.552284f, 11.447715f, 20.0f, 12.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.CurveTo(13.552285f, 20.0f, 14.0f, 19.552284f, 14.0f, 19.0f),
                    PathNode.LineTo(13.993f, 18.883f),
                    PathNode.CurveTo(13.938812f, 18.42351f, 13.576491f, 18.061188f, 13.117f, 18.007f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 14.447715f, 12.552285f, 14.0f, 12.0f, 14.0f),
                    PathNode.MoveTo(12.01f, 11.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.CurveTo(11.470906f, 11.000587f, 11.033835f, 11.413211f, 11.002828f, 11.941395f),
                    PathNode.CurveTo(10.971821f, 12.469579f, 11.35761f, 12.93051f, 11.883f, 12.993f),
                    PathNode.LineTo(12.01f, 13.0f),
                    PathNode.CurveTo(12.562284f, 13.0f, 13.01f, 12.552285f, 13.01f, 12.0f),
                    PathNode.CurveTo(13.01f, 11.447715f, 12.562284f, 11.0f, 12.01f, 11.0f)
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
        return _fileInfo!!
    }

private var _fileInfo: ImageVector? = null
