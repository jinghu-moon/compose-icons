package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = tablerFilledIcon(
            name = "FileCode",
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
                    PathNode.MoveTo(10.447f, 13.106f),
                    PathNode.CurveTo(9.953238f, 12.859413f, 9.353058f, 13.059473f, 9.106f, 13.553f),
                    PathNode.LineTo(8.106f, 15.553f),
                    PathNode.CurveTo(7.965379f, 15.834411f, 7.965379f, 16.165588f, 8.106f, 16.447f),
                    PathNode.LineTo(9.106f, 18.447f),
                    PathNode.CurveTo(9.353058f, 18.940525f, 9.953238f, 19.140587f, 10.447f, 18.894f),
                    PathNode.LineTo(10.549f, 18.836f),
                    PathNode.CurveTo(10.972529f, 18.557568f, 11.120766f, 18.006298f, 10.894f, 17.553f),
                    PathNode.LineTo(10.118f, 16.0f),
                    PathNode.LineTo(10.894f, 14.447f),
                    PathNode.CurveTo(11.140587f, 13.953238f, 10.940527f, 13.353058f, 10.447f, 13.106f),
                    PathNode.MoveTo(14.894f, 13.553f),
                    PathNode.CurveTo(14.646942f, 13.059473f, 14.046762f, 12.859413f, 13.553f, 13.106f),
                    PathNode.LineTo(13.451f, 13.164f),
                    PathNode.CurveTo(13.027471f, 13.442433f, 12.879234f, 13.993702f, 13.106f, 14.447f),
                    PathNode.LineTo(13.88f, 16.0f),
                    PathNode.LineTo(13.105f, 17.553f),
                    PathNode.CurveTo(12.87844f, 18.043453f, 13.08239f, 18.625177f, 13.565607f, 18.866785f),
                    PathNode.CurveTo(14.048823f, 19.108395f, 14.636574f, 18.92252f, 14.893f, 18.447f),
                    PathNode.LineTo(15.893f, 16.447f),
                    PathNode.CurveTo(16.03362f, 16.165588f, 16.03362f, 15.834411f, 15.893f, 15.553f),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
