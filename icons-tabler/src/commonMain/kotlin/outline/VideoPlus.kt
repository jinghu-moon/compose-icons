package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) return _videoPlus!!
        _videoPlus = tablerOutlineIcon(
            name = "VideoPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(19.553f, 7.724f),
                    PathNode.CurveTo(19.862902f, 7.569142f, 20.230879f, 7.585715f, 20.525606f, 7.767806f),
                    PathNode.CurveTo(20.820332f, 7.949897f, 20.999813f, 8.27156f, 21.0f, 8.618f),
                    PathNode.LineTo(21.0f, 15.382f),
                    PathNode.CurveTo(20.999813f, 15.72844f, 20.820332f, 16.050104f, 20.525606f, 16.232195f),
                    PathNode.CurveTo(20.230879f, 16.414286f, 19.862902f, 16.430859f, 19.553f, 16.276f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.895431f, 3.895431f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(14.104569f, 6.0f, 15.0f, 6.895431f, 15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(15.0f, 17.10457f, 14.104569f, 18.0f, 13.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(3.895431f, 18.0f, 3.0f, 17.10457f, 3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
