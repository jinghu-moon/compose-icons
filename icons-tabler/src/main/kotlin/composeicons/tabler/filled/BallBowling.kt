package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BallBowling: ImageVector
    get() {
        if (_ballBowling != null) return _ballBowling!!
        _ballBowling = tablerFilledIcon(
            name = "BallBowling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(20.119509f, 5.113616f, 22.049532f, 8.422732f, 22.05742f, 12.011183f),
                    PathNode.CurveTo(22.06531f, 15.599634f, 20.149853f, 18.917204f, 17.038174f, 20.70452f),
                    PathNode.CurveTo(13.926495f, 22.491833f, 10.095704f, 22.474844f, 7.0f, 20.66f),
                    PathNode.CurveTo(2.257864f, 17.879942f, 0.648714f, 11.79353f, 3.397255f, 7.033057f),
                    PathNode.CurveTo(6.145796f, 2.272585f, 12.2214f, 0.623097f, 17.0f, 3.34f),
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.CurveTo(13.447715f, 11.0f, 13.0f, 11.447715f, 13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 12.01f),
                    PathNode.CurveTo(13.0f, 12.562284f, 13.447715f, 13.01f, 14.0f, 13.01f),
                    PathNode.CurveTo(14.552285f, 13.01f, 15.0f, 12.562284f, 15.0f, 12.01f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 11.447715f, 14.552285f, 11.0f, 14.0f, 11.0f),
                    PathNode.MoveTo(11.0f, 8.0f),
                    PathNode.CurveTo(10.447715f, 8.0f, 10.0f, 8.447715f, 10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 9.01f),
                    PathNode.CurveTo(10.0f, 9.562284f, 10.447715f, 10.01f, 11.0f, 10.01f),
                    PathNode.CurveTo(11.552285f, 10.01f, 12.0f, 9.562284f, 12.0f, 9.01f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.0f, 8.447715f, 11.552285f, 8.0f, 11.0f, 8.0f),
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.CurveTo(14.447715f, 7.0f, 14.0f, 7.447716f, 14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.01f),
                    PathNode.CurveTo(14.0f, 8.562284f, 14.447715f, 9.01f, 15.0f, 9.01f),
                    PathNode.CurveTo(15.552285f, 9.01f, 16.0f, 8.562284f, 16.0f, 8.01f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 7.447716f, 15.552285f, 7.0f, 15.0f, 7.0f)
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
        return _ballBowling!!
    }

private var _ballBowling: ImageVector? = null
