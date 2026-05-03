package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Jetpack: ImageVector
    get() {
        if (_jetpack != null) return _jetpack!!
        _jetpack = tablerFilledIcon(
            name = "Jetpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(19.209139f, 2.0f, 21.0f, 3.790861f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(21.0f, 13.552285f, 20.552284f, 14.0f, 20.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(13.447715f, 14.0f, 13.0f, 13.552285f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 13.552285f, 10.552285f, 14.0f, 10.0f, 14.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.CurveTo(3.447715f, 14.0f, 3.0f, 13.552285f, 3.0f, 13.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 3.790861f, 4.790861f, 2.0f, 7.0f, 2.0f),
                    PathNode.CurveTo(9.209139f, 2.0f, 11.0f, 3.790861f, 11.0f, 6.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.CurveTo(13.0f, 3.790861f, 14.790861f, 2.0f, 17.0f, 2.0f),
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.552285f, 15.0f, 10.0f, 15.447715f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 18.623f, 9.213f, 20.59f, 7.6f, 21.8f),
                    PathNode.CurveTo(7.244445f, 22.066668f, 6.755556f, 22.066668f, 6.4f, 21.8f),
                    PathNode.CurveTo(4.787f, 20.59f, 4.0f, 18.623f, 4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 15.447715f, 4.447716f, 15.0f, 5.0f, 15.0f),
                    PathNode.CurveTo(5.552285f, 15.0f, 6.0f, 15.447715f, 6.0f, 16.0f),
                    PathNode.CurveTo(6.0f, 17.532f, 6.308f, 18.684f, 6.906f, 19.498f),
                    PathNode.LineTo(7.0f, 19.617f),
                    PathNode.LineTo(7.094f, 19.497f),
                    PathNode.CurveTo(7.652f, 18.738f, 7.958f, 17.684f, 7.996f, 16.301f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 15.447715f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.CurveTo(19.552284f, 15.0f, 20.0f, 15.447715f, 20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 18.623f, 19.213f, 20.59f, 17.6f, 21.8f),
                    PathNode.CurveTo(17.244444f, 22.066668f, 16.755556f, 22.066668f, 16.4f, 21.8f),
                    PathNode.CurveTo(14.787f, 20.59f, 14.0f, 18.623f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 15.447715f, 14.447715f, 15.0f, 15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 15.447715f, 16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.532f, 16.308f, 18.684f, 16.906f, 19.498f),
                    PathNode.LineTo(17.0f, 19.617f),
                    PathNode.LineTo(17.094f, 19.497f),
                    PathNode.CurveTo(17.652f, 18.738f, 17.958f, 17.684f, 17.996f, 16.301f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 15.447715f, 18.447716f, 15.0f, 19.0f, 15.0f)
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
        return _jetpack!!
    }

private var _jetpack: ImageVector? = null
