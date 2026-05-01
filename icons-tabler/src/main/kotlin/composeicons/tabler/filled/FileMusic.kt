package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) return _fileMusic!!
        _fileMusic = tablerFilledIcon(
            name = "FileMusic",
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
                    PathNode.MoveTo(12.447f, 11.106f),
                    PathNode.CurveTo(12.137097f, 10.951141f, 11.769121f, 10.967714f, 11.474395f, 11.149805f),
                    PathNode.CurveTo(11.179667f, 11.331897f, 11.000185f, 11.65356f, 11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(9.953375f, 14.999669f, 9.083497f, 15.806323f, 9.005f, 16.85f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 9.895431f, 19.0f, 11.0f, 19.0f),
                    PathNode.CurveTo(12.104569f, 19.0f, 13.0f, 18.10457f, 13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 13.618f),
                    PathNode.LineTo(13.553f, 13.894f),
                    PathNode.CurveTo(14.043452f, 14.12056f, 14.625178f, 13.91661f, 14.866787f, 13.433393f),
                    PathNode.CurveTo(15.108395f, 12.950176f, 14.92252f, 12.362426f, 14.447f, 12.106f),
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
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
