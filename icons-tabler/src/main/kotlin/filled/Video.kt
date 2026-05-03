package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = tablerFilledIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.117 7.625 C 19.923 7.603 19.727 7.637 19.553 7.725 L 15.000 10.000 L 15.000 14.000 L 19.553 16.275 C 19.863 16.430 20.230 16.413 20.525 16.232 C 20.819 16.050 20.999 15.729 21.000 15.383 L 21.000 8.617 C 20.999 8.110 20.620 7.684 20.117 7.625 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 C 3.355 5.000 2.000 6.355 2.000 8.000 L 2.000 16.000 C 2.000 17.645 3.355 19.000 5.000 19.000 L 13.000 19.000 C 14.645 19.000 16.000 17.645 16.000 16.000 L 16.000 8.000 C 16.000 6.355 14.645 5.000 13.000 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _video!!
    }

private var _video: ImageVector? = null
