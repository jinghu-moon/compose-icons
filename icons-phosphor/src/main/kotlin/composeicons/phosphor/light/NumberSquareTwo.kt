package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorLightIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM158 176c0 3.314-2.686 6-6 6h-48c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283l43.17-57.56c4.229-5.667 4.748-13.286 1.327-19.475-3.422-6.189-10.15-9.8-17.198-9.232C119.45 86.701 113.387 91.343 111 98c-.676 2.07-2.422 3.612-4.56 4.027-2.138 .415-4.333-.361-5.735-2.028C99.303 98.331 98.914 96.035 99.69 94c3.994-11.071 14.092-18.783 25.824-19.723 11.731-.94 22.929 5.067 28.634 15.36 5.706 10.293 4.866 22.972-2.148 32.423L116 170h36c3.314 0 6 2.686 6 6Z"),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
