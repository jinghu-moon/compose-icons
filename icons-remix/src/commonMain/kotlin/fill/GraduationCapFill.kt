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
                pathData = parseSvgPathData("M 12.000 2.000 L 0.000 9.000 L 12.000 16.000 L 22.000 10.167 L 22.000 17.500 L 24.000 17.500 L 24.000 9.000 L 12.000 2.000 ZM 3.999 13.491 L 3.999 18.000 C 5.823 20.429 8.728 22.000 12.000 22.000 C 15.271 22.000 18.176 20.429 20.000 18.000 L 20.000 13.491 L 12.000 18.158 L 3.999 13.491 Z"),
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
