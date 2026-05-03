package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GenderlessFill: ImageVector
    get() {
        if (_genderlessFill != null) return _genderlessFill!!
        _genderlessFill = remixIcon(
            name = "GenderlessFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 7.066 L 11.000 1.000 L 13.000 1.000 L 13.000 7.066 C 16.669 7.555 19.500 10.697 19.500 14.500 C 19.500 18.642 16.142 22.000 12.000 22.000 C 7.858 22.000 4.500 18.642 4.500 14.500 C 4.500 10.697 7.331 7.555 11.000 7.066 Z"),
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
        return _genderlessFill!!
    }

private var _genderlessFill: ImageVector? = null
