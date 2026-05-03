package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileLambda: ImageVector
    get() {
        if (_fileLambda != null) return _fileLambda!!
        _fileLambda = tablerFilledIcon(
            name = "FileLambda",
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.470906f, 10.000587f, 9.033835f, 10.413211f, 9.002828f, 10.941395f),
                    PathNode.CurveTo(8.971821f, 11.469579f, 9.35761f, 11.93051f, 9.883f, 11.993f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.342f, 12.0f, 10.662f, 12.362f, 11.166f, 13.445f),
                    PathNode.LineTo(9.168f, 16.445f),
                    PathNode.CurveTo(8.861482f, 16.9045f, 8.985499f, 17.525482f, 9.445f, 17.832f),
                    PathNode.CurveTo(9.904501f, 18.138517f, 10.525482f, 18.014502f, 10.832f, 17.555f),
                    PathNode.LineTo(12.122f, 15.621f),
                    PathNode.CurveTo(12.947f, 17.359f, 13.63f, 18.0f, 15.0f, 18.0f),
                    PathNode.CurveTo(15.529094f, 17.999413f, 15.966165f, 17.58679f, 15.997172f, 17.058605f),
                    PathNode.CurveTo(16.02818f, 16.53042f, 15.64239f, 16.06949f, 15.117f, 16.007f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(14.61f, 16.0f, 14.25f, 15.53f, 13.613f, 14.062f),
                    PathNode.LineTo(13.198f, 13.086f),
                    PathNode.CurveTo(12.213f, 10.812f, 11.542f, 10.0f, 10.0f, 10.0f),
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
        return _fileLambda!!
    }

private var _fileLambda: ImageVector? = null
