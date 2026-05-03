package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SurgicalMaskFill: ImageVector
    get() {
        if (_surgicalMaskFill != null) return _surgicalMaskFill!!
        _surgicalMaskFill = remixIcon(
            name = "SurgicalMaskFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.485 3.121 L 20.243 5.061 C 20.688 5.172 21.000 5.572 21.000 6.031 L 21.000 7.000 L 22.000 7.000 C 23.100 7.000 24.000 7.900 24.000 9.000 L 24.000 12.000 C 24.000 13.657 22.657 15.000 21.000 15.000 L 20.579 15.000 C 20.044 16.350 19.028 17.486 17.683 18.158 L 12.894 20.553 C 12.331 20.834 11.669 20.834 11.106 20.553 L 6.317 18.158 C 4.973 17.486 3.956 16.350 3.421 15.000 L 3.000 15.000 C 1.343 15.000 0.000 13.657 0.000 12.000 L 0.000 9.000 C 0.000 7.895 0.895 7.000 2.000 7.000 L 3.000 7.000 L 3.000 6.031 C 3.000 5.572 3.312 5.172 3.757 5.061 L 11.515 3.121 C 11.833 3.042 12.167 3.042 12.485 3.121 ZM 3.000 9.000 L 2.000 9.000 L 2.000 12.000 C 2.000 12.552 2.448 13.000 3.000 13.000 L 3.000 9.000 ZM 22.000 9.000 L 21.000 9.000 L 21.000 13.000 C 21.552 13.000 22.000 12.552 22.000 12.000 L 22.000 9.000 Z"),
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
        return _surgicalMaskFill!!
    }

private var _surgicalMaskFill: ImageVector? = null
