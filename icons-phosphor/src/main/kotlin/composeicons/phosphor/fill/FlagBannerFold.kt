package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorFillIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M131.79 69.65 88.16 165.65c-.647 1.43-2.071 2.348-3.64 2.35h-56.29c-2.562 .042-4.996-1.116-6.58-3.13-2.355-3.071-2.174-7.387 .43-10.25L57.19 116 22.08 77.38C19.471 74.515 19.29 70.193 21.65 67.12 23.238 65.112 25.671 63.959 28.23 64h99.92c1.358 .001 2.623 .692 3.359 1.834 .736 1.142 .842 2.579 .281 3.816ZM237.56 42.24C235.992 40.772 233.917 39.97 231.77 40h-63.77c-3.136 .001-5.982 1.835-7.28 4.69l-42.57 93.65c-.565 1.238-.461 2.679 .275 3.824 .736 1.145 2.004 1.837 3.365 1.836h57.79l-34.86 76.69c-1.274 2.615-1.028 5.716 .642 8.097 1.67 2.382 4.502 3.669 7.394 3.362 2.893-.307 5.391-2.16 6.524-4.839l80-176c1.405-3.083 .716-6.716-1.72-9.07Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
