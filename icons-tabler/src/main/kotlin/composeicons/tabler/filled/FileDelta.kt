package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileDelta: ImageVector
    get() {
        if (_fileDelta != null) return _fileDelta!!
        _fileDelta = tablerFilledIcon(
            name = "FileDelta",
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
                    PathNode.MoveTo(12.894f, 10.553f),
                    PathNode.CurveTo(12.724439f, 10.214685f, 12.378428f, 10.001067f, 12.0f, 10.001067f),
                    PathNode.CurveTo(11.621572f, 10.001067f, 11.275561f, 10.214685f, 11.106f, 10.553f),
                    PathNode.LineTo(8.106f, 16.553f),
                    PathNode.CurveTo(7.951142f, 16.862902f, 7.967715f, 17.230879f, 8.149805f, 17.525606f),
                    PathNode.CurveTo(8.331897f, 17.820332f, 8.65356f, 17.999813f, 9.0f, 18.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.34644f, 17.999813f, 15.668103f, 17.820332f, 15.850195f, 17.525606f),
                    PathNode.CurveTo(16.032286f, 17.230879f, 16.048859f, 16.862902f, 15.894f, 16.553f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 13.236f),
                    PathNode.LineTo(13.381f, 16.0f),
                    PathNode.LineTo(10.618f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.999f, 2.999f),
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
        return _fileDelta!!
    }

private var _fileDelta: ImageVector? = null
