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
                pathData = parseSvgPathData("M11 7.066v-6.066h2v6.066c3.669 .489 6.5 3.631 6.5 7.434C19.5 18.642 16.142 22 12 22 7.858 22 4.5 18.642 4.5 14.5 4.5 10.697 7.331 7.555 11 7.066Z"),
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
