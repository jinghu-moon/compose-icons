package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorDuotoneIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.93 100.72C214.11 57.24 177.869 23.19 134.36 24.082 90.851 24.974 56.036 60.482 56 104L32.65 148.87c-1.671 3.893-.018 8.414 3.77 10.31L64 171.81v36.19c0 4.418 3.582 8 8 8h48c0 8.837 7.163 16 16 16h56l-8-64c21.089-15.788 33.035-40.96 31.93-67.28ZM112.13 74.08c-.889-6.794 2.648-13.4 8.794-16.428 6.147-3.028 13.539-1.806 18.384 3.039 4.845 4.845 6.067 12.238 3.039 18.384-3.028 6.147-9.634 9.683-16.428 8.794-7.191-.94-12.85-6.599-13.79-13.79ZM146.13 151.87c-6.794 .889-13.4-2.648-16.428-8.794-3.028-6.147-1.806-13.539 3.039-18.384 4.845-4.845 12.238-6.067 18.384-3.039 6.147 3.028 9.683 9.634 8.794 16.428-.946 7.207-6.63 12.871-13.84 13.79Z"),
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
                pathData = parseSvgPathData("M192.5 171.47C212.991 154.258 224.575 128.685 224 101.93 223 56.22 186.39 18.53 140.76 16.13 116.973 14.835 93.678 23.24 76.196 39.422 58.715 55.605 48.541 78.184 48 102L25.55 145.18c-.09 .18-.18 .36-.26 .54-3.341 7.788-.03 16.831 7.55 20.62l.25 .11L56 176.94v31.06c0 8.837 7.163 16 16 16h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48v-36.19c.002-3.132-1.823-5.977-4.67-7.28L40 152 63.07 107.66c.601-1.127 .92-2.383 .93-3.66C63.995 70.396 87.236 41.258 120 33.79v15.59c-11.02 3.896-17.631 15.165-15.654 26.686 1.977 11.521 11.965 19.942 23.654 19.942 11.689 0 21.678-8.421 23.654-19.942C153.631 64.545 147.02 53.276 136 49.38v-17.38c1.3 0 2.6 0 3.9 .1 29.005 1.661 54.194 20.532 63.94 47.9h-19.84c-2.376-.001-4.629 1.054-6.15 2.88l-25.51 30.62c-10.985-4.093-23.32 .326-29.207 10.463-5.887 10.137-3.611 23.042 5.389 30.553 8.999 7.512 22.103 7.444 31.024-.16 8.922-7.604 11.065-20.531 5.074-30.607L187.75 96h19.79q.36 3.12 .44 6.3c.506 23.246-10.205 45.315-28.78 59.3-2.297 1.722-3.495 4.542-3.14 7.39l8 64c.504 3.997 3.901 6.996 7.93 7 .334-0 .668-.02 1-.06 2.106-.262 4.021-1.35 5.325-3.025 1.303-1.675 1.888-3.799 1.625-5.905ZM128 80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM144 144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
