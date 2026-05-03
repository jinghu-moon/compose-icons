package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) return _videoPlus!!
        _videoPlus = tablerFilledIcon(
            name = "VideoPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 5.0f),
                    PathNode.CurveTo(14.656855f, 5.0f, 16.0f, 6.343146f, 16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 8.381f),
                    PathNode.LineTo(19.106f, 6.829f),
                    PathNode.CurveTo(19.725964f, 6.519203f, 20.462124f, 6.552452f, 21.051636f, 6.916874f),
                    PathNode.CurveTo(21.64115f, 7.281297f, 21.999977f, 7.924942f, 22.0f, 8.618f),
                    PathNode.LineTo(22.0f, 15.383f),
                    PathNode.CurveTo(21.999285f, 16.075703f, 21.640179f, 16.718712f, 21.050785f, 17.082655f),
                    PathNode.CurveTo(20.461393f, 17.446592f, 19.725645f, 17.47964f, 19.106f, 17.17f),
                    PathNode.LineTo(16.0f, 15.618f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 17.656855f, 14.656855f, 19.0f, 13.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.343146f, 19.0f, 2.0f, 17.656855f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.343146f, 3.343146f, 5.0f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(8.447715f, 9.0f, 8.0f, 9.447715f, 8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(6.447716f, 11.0f, 6.0f, 11.447715f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 6.447716f, 13.0f, 7.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 14.552285f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.552285f, 15.0f, 10.0f, 14.552285f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.552285f, 13.0f, 12.0f, 12.552285f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 11.447715f, 11.552285f, 11.0f, 11.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 9.447715f, 9.552285f, 9.0f, 9.0f, 9.0f)
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
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
