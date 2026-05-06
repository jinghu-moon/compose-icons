package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorDuotoneIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 167.06v.94h-216v-92.46C31.991 72.167 34.099 69.151 37.27 68L113 40.48c3.937-1.409 8.295 .452 10 4.27l23.27 54.35c3.652 8.216 10.591 14.516 19.12 17.36l60.73 20.25c13.064 4.355 21.877 16.579 21.88 30.35Z"),
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
                pathData = parseSvgPathData("M228.65 129.11 167.92 108.87c-6.385-2.133-11.581-6.85-14.32-13L130.39 41.6c0 0 0-.07 0-.1C126.96 33.807 118.154 30.091 110.25 33L34.53 60.49C28.216 62.803 24.013 68.806 24 75.53v116.47c0 8.837 7.163 16 16 16h200c8.837 0 16-7.163 16-16v-24.94c.001-17.218-11.016-32.505-27.35-37.95ZM40 75.53 115.72 48l7.11 16.63-21.56 7.85c-3.651 1.325-5.822 5.081-5.15 8.906 .673 3.825 3.996 6.614 7.88 6.614 .932-.001 1.856-.167 2.73-.49l22.4-8.14 4.74 11.07-16.6 6c-3.713 1.284-5.944 5.074-5.266 8.943 .679 3.87 4.067 6.674 7.996 6.617 .932-.001 1.856-.167 2.73-.49l17.6-6.4c2.016 3.718 4.608 7.093 7.68 10l-14.74 5.36c-3.666 1.315-5.852 5.079-5.178 8.915 .674 3.836 4.013 6.629 7.908 6.615 .931-.003 1.854-.165 2.73-.48l28-10.18 56.87 18.95c7.346 2.456 13.054 8.306 15.33 15.71h-198.93ZM240 192h-200v-16h200Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
