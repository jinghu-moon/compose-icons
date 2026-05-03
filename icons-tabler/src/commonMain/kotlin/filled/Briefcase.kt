package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = tablerFilledIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 13.478f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.656855f, 20.656855f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.343146f, 21.0f, 2.0f, 19.656855f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 13.478f),
                    PathNode.LineTo(2.553f, 13.755f),
                    PathNode.CurveTo(8.496461f, 16.748724f, 15.507173f, 16.747982f, 21.45f, 13.753f),
                    PathNode.LineTo(22.0f, 13.478f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.656855f, 2.0f, 17.0f, 3.343146f, 17.0f, 5.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.656855f, 6.0f, 22.0f, 7.343146f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 11.242f),
                    PathNode.LineTo(20.553f, 11.966f),
                    PathNode.CurveTo(15.306263f, 14.610558f, 9.131249f, 14.679226f, 3.827f, 12.152f),
                    PathNode.LineTo(3.18f, 11.832f),
                    PathNode.LineTo(2.0f, 11.242f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.343146f, 3.343146f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.343146f, 8.343146f, 2.0f, 10.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(11.447715f, 10.0f, 11.0f, 10.447715f, 11.0f, 11.0f),
                    PathNode.CurveTo(10.997238f, 11.552285f, 11.442716f, 12.002238f, 11.995f, 12.005f),
                    PathNode.CurveTo(12.547285f, 12.007761f, 12.997238f, 11.562284f, 13.0f, 11.01f),
                    PathNode.CurveTo(13.0f, 10.448f, 12.552f, 10.0f, 12.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.447715f, 4.0f, 9.0f, 4.447716f, 9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 4.447716f, 14.552285f, 4.0f, 14.0f, 4.0f),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
