package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Farm: ImageVector
    get() {
        if (_farm != null) return _farm!!
        _farm = phosphorRegularIcon(
            name = "Farm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136.83 220.43c-2.447 3.678-7.412 4.676-11.09 2.23C95.602 202.611 60.198 191.941 24 192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 39.351-.06 77.838 11.542 110.6 33.34 3.678 2.447 4.676 7.412 2.23 11.09ZM24 144c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 56.548-.129 110.867 22.044 151.17 61.71 2.024 2.081 5.017 2.903 7.82 2.146 2.803-.757 4.976-2.972 5.678-5.79 .702-2.817-.178-5.794-2.298-7.777C143.084 167.679 84.74 143.859 24 144ZM232 160c-16.352-.011-32.653 1.831-48.59 5.49q8.24 6.25 16 13.16C210.184 176.885 221.083 175.999 232 176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-6 0-11.93 .29-17.85 .86q8.32 8.67 15.94 18.14c1.895 2.219 2.431 5.293 1.4 8.023-1.031 2.729-3.467 4.681-6.355 5.092-2.889 .412-5.772-.782-7.525-3.115C170.635 162.094 99.343 127.849 24 128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 16.099 .003 32.165 1.466 48 4.37v-36.37c0-2.518 1.186-4.889 3.2-6.4l64-48c2.844-2.133 6.756-2.133 9.6 0l64 48C214.814 75.111 216 77.482 216 80v32.49c5.31-.31 10.64-.49 16-.49 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-28.728-.055-57.245 4.917-84.26 14.69q9.44 5 18.46 10.78C187.566 147.174 209.726 143.984 232 144c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM120 88h48c4.418 0 8 3.582 8 8v21.94q11.88-2.56 24-4v-29.94L144 42 88 84v35.81q12.19 3 24 7.18v-30.99c0-4.418 3.582-8 8-8ZM128.07 133.27c10.388-4.46 21.054-8.245 31.93-11.33v-17.94h-32v29.24Z"),
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
        return _farm!!
    }

private var _farm: ImageVector? = null
