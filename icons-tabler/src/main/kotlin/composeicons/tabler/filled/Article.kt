package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = tablerFilledIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.588558f, 2.999912f, 21.901804f, 4.238179f, 21.995f, 5.824f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.000088f, 19.588558f, 20.761822f, 20.901804f, 19.176f, 20.995f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.411442f, 21.000088f, 2.098195f, 19.761822f, 2.005f, 18.176f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(1.999912f, 4.411443f, 3.238179f, 3.098195f, 4.824f, 3.005f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(6.883f, 15.007f),
                    PathNode.CurveTo(6.379949f, 15.066836f, 6.001115f, 15.493402f, 6.001115f, 16.0f),
                    PathNode.CurveTo(6.001115f, 16.506598f, 6.379949f, 16.933163f, 6.883f, 16.993f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(17.117f, 16.993f),
                    PathNode.CurveTo(17.62005f, 16.933163f, 17.998886f, 16.506598f, 17.998886f, 16.0f),
                    PathNode.CurveTo(17.998886f, 15.493402f, 17.62005f, 15.066836f, 17.117f, 15.007f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.LineTo(6.883f, 11.007f),
                    PathNode.CurveTo(6.379949f, 11.066836f, 6.001115f, 11.493402f, 6.001115f, 12.0f),
                    PathNode.CurveTo(6.001115f, 12.506598f, 6.379949f, 12.933164f, 6.883f, 12.993f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.LineTo(17.117f, 12.993f),
                    PathNode.CurveTo(17.62005f, 12.933164f, 17.998886f, 12.506598f, 17.998886f, 12.0f),
                    PathNode.CurveTo(17.998886f, 11.493402f, 17.62005f, 11.066836f, 17.117f, 11.007f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(6.883f, 7.007f),
                    PathNode.CurveTo(6.379949f, 7.066837f, 6.001115f, 7.493403f, 6.001115f, 8.0f),
                    PathNode.CurveTo(6.001115f, 8.506598f, 6.379949f, 8.933164f, 6.883f, 8.993f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.LineTo(17.117f, 8.993f),
                    PathNode.CurveTo(17.62005f, 8.933164f, 17.998886f, 8.506598f, 17.998886f, 8.0f),
                    PathNode.CurveTo(17.998886f, 7.493403f, 17.62005f, 7.066837f, 17.117f, 7.007f),
                    PathNode.LineTo(17.0f, 7.0f),
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
        return _article!!
    }

private var _article: ImageVector? = null
