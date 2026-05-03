package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LandscapeAiFill: ImageVector
    get() {
        if (_landscapeAiFill != null) return _landscapeAiFill!!
        _landscapeAiFill = remixIcon(
            name = "LandscapeAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.213 8.628 L 5.967 9.194 C 5.786 9.608 5.214 9.608 5.033 9.194 L 4.787 8.628 C 4.347 7.619 3.555 6.816 2.568 6.377 L 1.808 6.039 C 1.397 5.857 1.397 5.259 1.808 5.076 L 2.525 4.757 C 3.538 4.307 4.344 3.474 4.776 2.431 L 5.029 1.820 C 5.206 1.393 5.794 1.393 5.971 1.820 L 6.224 2.431 C 6.656 3.474 7.462 4.307 8.475 4.757 L 9.192 5.076 C 9.603 5.259 9.603 5.857 9.192 6.039 L 8.432 6.377 C 7.445 6.816 6.653 7.619 6.213 8.628 ZM 11.238 12.270 L 16.000 21.000 L 23.000 21.000 L 15.000 6.000 L 11.238 12.270 ZM 14.000 21.000 L 8.000 10.000 L 2.000 21.000 L 14.000 21.000 Z"),
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
        return _landscapeAiFill!!
    }

private var _landscapeAiFill: ImageVector? = null
