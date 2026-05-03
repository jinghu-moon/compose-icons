package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PictureInPictureTop: ImageVector
    get() {
        if (_pictureInPictureTop != null) return _pictureInPictureTop!!
        _pictureInPictureTop = tablerFilledIcon(
            name = "PictureInPictureTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.552285f, 4.0f, 12.0f, 4.447716f, 12.0f, 5.0f),
                    PathNode.CurveTo(12.0f, 5.552285f, 11.552285f, 6.0f, 11.0f, 6.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(4.447716f, 6.0f, 4.0f, 6.447716f, 4.0f, 7.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 17.552284f, 4.447716f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.552284f, 18.0f, 20.0f, 17.552284f, 20.0f, 17.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 12.447715f, 20.447716f, 12.0f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.552284f, 12.0f, 22.0f, 12.447715f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
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
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.CurveTo(21.10457f, 4.0f, 22.0f, 4.895431f, 22.0f, 6.0f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 10.104569f, 21.10457f, 11.0f, 20.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(13.895431f, 11.0f, 13.0f, 10.104569f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 4.895431f, 13.895431f, 4.0f, 15.0f, 4.0f),
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
        return _pictureInPictureTop!!
    }

private var _pictureInPictureTop: ImageVector? = null
