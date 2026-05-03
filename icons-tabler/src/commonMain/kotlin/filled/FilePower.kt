package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FilePower: ImageVector
    get() {
        if (_filePower != null) return _filePower!!
        _filePower = tablerFilledIcon(
            name = "FilePower",
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
                    PathNode.MoveTo(12.555f, 11.168f),
                    PathNode.CurveTo(12.33435f, 11.020772f, 12.064244f, 10.967243f, 11.804121f, 11.019193f),
                    PathNode.CurveTo(11.543999f, 11.071142f, 11.315173f, 11.224313f, 11.168f, 11.445f),
                    PathNode.LineTo(9.168f, 14.445f),
                    PathNode.LineTo(9.111f, 14.542f),
                    PathNode.CurveTo(8.951278f, 14.852013f, 8.964597f, 15.222842f, 9.14615f, 15.520597f),
                    PathNode.CurveTo(9.327703f, 15.818352f, 9.65126f, 16.000017f, 10.0f, 16.0f),
                    PathNode.LineTo(12.13f, 16.0f),
                    PathNode.LineTo(11.168f, 17.445f),
                    PathNode.CurveTo(10.861482f, 17.9045f, 10.985499f, 18.525482f, 11.445f, 18.832f),
                    PathNode.CurveTo(11.904501f, 19.138517f, 12.525482f, 19.014502f, 12.832f, 18.555f),
                    PathNode.LineTo(14.832f, 15.555f),
                    PathNode.LineTo(14.889f, 15.458f),
                    PathNode.CurveTo(15.048722f, 15.147987f, 15.035403f, 14.777158f, 14.85385f, 14.479403f),
                    PathNode.CurveTo(14.672297f, 14.181648f, 14.34874f, 13.999984f, 14.0f, 14.0f),
                    PathNode.LineTo(11.868f, 14.0f),
                    PathNode.LineTo(12.832f, 12.555f),
                    PathNode.CurveTo(12.979228f, 12.33435f, 13.032757f, 12.064244f, 12.980807f, 11.804121f),
                    PathNode.CurveTo(12.928858f, 11.543999f, 12.775687f, 11.315173f, 12.555f, 11.168f)
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
        return _filePower!!
    }

private var _filePower: ImageVector? = null
