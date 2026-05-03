package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Drinks2Line: ImageVector
    get() {
        if (_drinks2Line != null) return _drinks2Line!!
        _drinks2Line = remixIcon(
            name = "Drinks2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 2.000 L 7.323 2.000 L 8.523 5.000 L 3.000 5.000 L 3.000 7.000 L 5.118 7.000 L 5.945 21.059 C 5.976 21.587 6.413 22.000 6.943 22.000 L 17.057 22.000 C 17.587 22.000 18.024 21.587 18.055 21.059 L 18.882 7.000 L 21.000 7.000 L 21.000 5.000 L 10.677 5.000 L 8.677 0.000 L 4.000 0.000 L 4.000 2.000 ZM 7.299 10.025 L 7.121 7.000 L 16.879 7.000 L 16.587 11.967 C 14.280 11.853 13.423 11.492 12.371 11.071 C 11.279 10.635 9.971 10.135 7.299 10.025 ZM 7.417 12.033 C 9.721 12.147 10.589 12.513 11.640 12.933 C 12.700 13.357 13.956 13.837 16.469 13.964 L 16.114 20.000 L 7.886 20.000 L 7.417 12.033 Z"),
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
        return _drinks2Line!!
    }

private var _drinks2Line: ImageVector? = null
