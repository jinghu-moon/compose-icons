package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeAd: ImageVector
    get() {
        if (_badgeAd != null) return _badgeAd!!
        _badgeAd = tablerFilledIcon(
            name = "BadgeAd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 15.552285f, 13.447715f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(16.656855f, 16.0f, 18.0f, 14.656855f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 9.343145f, 16.656855f, 8.0f, 15.0f, 8.0f),
                    PathNode.MoveTo(8.5f, 8.0f),
                    PathNode.CurveTo(7.119288f, 8.0f, 6.0f, 9.119288f, 6.0f, 10.5f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 15.552285f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.CurveTo(7.552285f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.000067f, 15.506975f, 9.379507f, 15.933684f, 9.883f, 15.993f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.552285f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 10.5f),
                    PathNode.CurveTo(11.0f, 9.119288f, 9.880712f, 8.0f, 8.5f, 8.0f),
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 10.447715f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(15.999933f, 13.506975f, 15.620493f, 13.933684f, 15.117f, 13.993f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.5f, 10.0f),
                    PathNode.CurveTo(8.776142f, 10.0f, 9.0f, 10.223858f, 9.0f, 10.5f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 10.5f),
                    PathNode.CurveTo(7.99992f, 10.258508f, 8.172452f, 10.051469f, 8.41f, 10.008f),
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
        return _badgeAd!!
    }

private var _badgeAd: ImageVector? = null
