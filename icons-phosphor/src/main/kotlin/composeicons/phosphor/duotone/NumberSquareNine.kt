package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorDuotoneIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h160v160ZM146 76.82c-13.1-7.561-29.53-6.126-41.121 3.591C93.287 90.128 89.005 106.054 94.162 120.274c5.157 14.219 18.652 23.699 33.778 23.726q.94 0 1.89-.06l-16.7 28c-1.097 1.825-1.422 4.011-.902 6.076 .52 2.065 1.841 3.837 3.672 4.924 1.825 1.097 4.011 1.422 6.076 .902 2.065-.52 3.837-1.841 4.924-3.672l32.24-54 .07-.1h0c4.781-8.282 6.075-18.125 3.597-27.362C160.33 89.472 154.284 81.598 146 76.82ZM145.33 118h0c-5.52 9.567-17.751 12.848-27.318 7.328-9.567-5.52-12.849-17.75-7.329-27.317C116.202 88.443 128.432 85.161 138 90.68c9.562 5.526 12.834 17.757 7.31 27.32Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
