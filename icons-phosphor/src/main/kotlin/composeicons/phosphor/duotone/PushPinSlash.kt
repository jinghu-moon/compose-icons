package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorDuotoneIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 98.34l-57.27 57.46c11.46 22.93-1.72 45.86-10.11 57-1.396 1.832-3.514 2.974-5.812 3.133-2.298 .159-4.553-.68-6.188-2.303L42.34 105.76c-1.611-1.609-2.46-3.829-2.334-6.103 .126-2.274 1.215-4.386 2.994-5.807 29.65-23.92 57.4-10 57.4-10L157.67 26.39c3.124-3.122 8.186-3.122 11.31 0L229.66 87c1.508 1.501 2.356 3.542 2.356 5.67 0 2.128-.848 4.169-2.356 5.67Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L67.37 73.2C56.575 75.615 46.509 80.561 38 87.63c-3.541 2.847-5.704 7.065-5.95 11.602-.246 4.537 1.448 8.964 4.66 12.178L85 159.71 42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L96.29 171l48.29 48.29c2.998 3.011 7.071 4.705 11.32 4.71 .38 0 .75 0 1.13 0 4.615-.32 8.863-2.63 11.64-6.33 4.726-6.224 8.619-13.038 11.58-20.27l21.84 24c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM155.9 208 48 100.08C58.23 91.83 69.2 87.72 80.66 87.81l87.16 95.88c-2.23 9.87-7.58 18.54-11.92 24.31ZM235.32 104l-44.64 44.79c-3.12 3.129-8.186 3.135-11.315 .015-3.129-3.12-3.135-8.186-.015-11.315L224 92.7 163.32 32 122.1 73.35c-3.14 2.994-8.094 2.94-11.168-.123-3.073-3.062-3.145-8.017-.162-11.167L152 20.7c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l60.69 60.68c6.243 6.248 6.243 16.372 0 22.62Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
