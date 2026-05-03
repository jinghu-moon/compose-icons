package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileHorizontal: ImageVector
    get() {
        if (_fileHorizontal != null) return _fileHorizontal!!
        _fileHorizontal = tablerFilledIcon(
            name = "FileHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.LineTo(21.993f, 11.883f),
                    PathNode.CurveTo(21.938812f, 11.423509f, 21.57649f, 11.061188f, 21.117f, 11.007f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.LineTo(16.85f, 10.995f),
                    PathNode.CurveTo(15.866108f, 10.921061f, 15.083146f, 10.140646f, 15.006f, 9.157f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.LineTo(14.993f, 4.883f),
                    PathNode.CurveTo(14.938812f, 4.423509f, 14.576491f, 4.061188f, 14.117f, 4.007f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(3.411442f, 3.999912f, 2.098195f, 5.238179f, 2.005f, 6.824f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(1.999912f, 18.588558f, 3.238179f, 19.901804f, 4.824f, 19.995f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.CurveTo(20.588558f, 20.000088f, 21.901804f, 18.761822f, 21.995f, 17.176f),
                    PathNode.LineTo(22.0f, 17.0f),
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
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(17.0f, 9.0f),
                    PathNode.LineTo(21.001f, 9.001f),
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
        return _fileHorizontal!!
    }

private var _fileHorizontal: ImageVector? = null
