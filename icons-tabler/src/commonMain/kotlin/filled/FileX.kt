package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = tablerFilledIcon(
            name = "FileX",
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
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.511f, 11.14f),
                    PathNode.CurveTo(10.097892f, 10.894123f, 9.568286f, 10.976998f, 9.250038f, 11.33732f),
                    PathNode.CurveTo(8.931789f, 11.697643f, 8.914974f, 12.23343f, 9.21f, 12.613f),
                    PathNode.LineTo(9.293f, 12.707f),
                    PathNode.LineTo(10.585f, 14.0f),
                    PathNode.LineTo(9.293f, 15.293f),
                    PathNode.LineTo(9.21f, 15.387f),
                    PathNode.CurveTo(8.901423f, 15.785102f, 8.937099f, 16.350574f, 9.293262f, 16.706738f),
                    PathNode.CurveTo(9.649426f, 17.0629f, 10.214898f, 17.098577f, 10.613f, 16.79f),
                    PathNode.LineTo(10.707f, 16.707f),
                    PathNode.LineTo(12.0f, 15.415f),
                    PathNode.LineTo(13.293f, 16.707f),
                    PathNode.LineTo(13.387f, 16.79f),
                    PathNode.CurveTo(13.785102f, 17.098577f, 14.350574f, 17.0629f, 14.706738f, 16.706738f),
                    PathNode.CurveTo(15.062901f, 16.350574f, 15.098577f, 15.785102f, 14.79f, 15.387f),
                    PathNode.LineTo(14.707f, 15.293f),
                    PathNode.LineTo(13.415f, 14.0f),
                    PathNode.LineTo(14.707f, 12.707f),
                    PathNode.LineTo(14.79f, 12.613f),
                    PathNode.CurveTo(15.098577f, 12.214898f, 15.062901f, 11.649426f, 14.706738f, 11.293262f),
                    PathNode.CurveTo(14.350574f, 10.937099f, 13.785102f, 10.901423f, 13.387f, 11.21f),
                    PathNode.LineTo(13.293f, 11.293f),
                    PathNode.LineTo(12.0f, 12.585f),
                    PathNode.LineTo(10.707f, 11.293f),
                    PathNode.LineTo(10.613f, 11.21f),
                    PathNode.LineTo(10.511f, 11.14f),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
