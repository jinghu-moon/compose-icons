package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileTime: ImageVector
    get() {
        if (_fileTime != null) return _fileTime!!
        _fileTime = tablerFilledIcon(
            name = "FileTime",
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
                    PathNode.CurveTo(9.323082f, 10.000154f, 7.121178f, 12.108604f, 7.005f, 14.783f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(7.0f, 17.761423f, 9.238576f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(14.761424f, 20.0f, 17.0f, 17.761423f, 17.0f, 15.0f),
                    PathNode.CurveTo(17.0f, 12.238576f, 14.761424f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.CurveTo(13.656855f, 12.0f, 15.0f, 13.343145f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 16.656855f, 13.656855f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(10.343145f, 18.0f, 9.0f, 16.656855f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.343145f, 10.343145f, 12.0f, 12.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 12.496f),
                    PathNode.CurveTo(11.447715f, 12.496f, 11.0f, 12.943715f, 11.0f, 13.496f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(11.000056f, 15.265195f, 11.105451f, 15.519507f, 11.293f, 15.707f),
                    PathNode.LineTo(12.293f, 16.707f),
                    PathNode.CurveTo(12.6835f, 17.097382f, 13.3165f, 17.097382f, 13.707f, 16.707f),
                    PathNode.LineTo(13.79f, 16.613f),
                    PathNode.CurveTo(14.098803f, 16.214914f, 14.063235f, 15.649268f, 13.707f, 15.293f),
                    PathNode.LineTo(13.0f, 14.585f),
                    PathNode.LineTo(13.0f, 13.496f),
                    PathNode.CurveTo(13.0f, 12.943715f, 12.552285f, 12.496f, 12.0f, 12.496f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(14.999f, 2.999f),
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
        return _fileTime!!
    }

private var _fileTime: ImageVector? = null
