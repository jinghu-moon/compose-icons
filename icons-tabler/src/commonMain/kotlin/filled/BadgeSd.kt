package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerFilledIcon(
            name = "BadgeSd",
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
                    PathNode.MoveTo(9.25f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(6.895431f, 8.0f, 6.0f, 8.895431f, 6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 12.104569f, 6.895431f, 13.0f, 8.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(7.967f, 14.0f),
                    PathNode.LineTo(7.942f, 13.913f),
                    PathNode.CurveTo(7.778611f, 13.454394f, 7.308696f, 13.180097f, 6.829022f, 13.263335f),
                    PathNode.CurveTo(6.349348f, 13.346574f, 5.999324f, 13.763158f, 6.0f, 14.25f),
                    PathNode.CurveTo(6.0f, 15.216f, 6.784f, 16.0f, 7.75f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(10.104569f, 16.0f, 11.0f, 15.104569f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 11.895431f, 10.104569f, 11.0f, 9.0f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(9.032f, 10.0f),
                    PathNode.LineTo(9.058f, 10.087f),
                    PathNode.CurveTo(9.221389f, 10.545606f, 9.691304f, 10.819903f, 10.170979f, 10.736665f),
                    PathNode.CurveTo(10.650652f, 10.653426f, 11.000677f, 10.236842f, 11.0f, 9.75f),
                    PathNode.CurveTo(11.0f, 8.783502f, 10.216498f, 8.0f, 9.25f, 8.0f),
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 10.447715f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(15.999933f, 13.506975f, 15.620493f, 13.933684f, 15.117f, 13.993f),
                    PathNode.LineTo(15.0f, 14.0f),
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
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
