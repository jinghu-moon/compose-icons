package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GraduationCapFill: ImageVector
    get() {
        if (_graduationCapFill != null) return _graduationCapFill!!
        _graduationCapFill = remixIcon(
            name = "GraduationCapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2 0 9l12 7L22 10.167v7.333h2v-8.5L12 2ZM3.999 13.491v4.51c1.824 2.429 4.729 4 8.001 4 3.272 0 6.176-1.571 8.001-4l-0-4.509-8 4.667L3.999 13.491Z"),
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
        return _graduationCapFill!!
    }

private var _graduationCapFill: ImageVector? = null
