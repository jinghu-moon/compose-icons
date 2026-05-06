package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = phosphorRegularIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 208c0 4.418-3.582 8-8 8h-48c-8.572-.005-16.49-4.582-20.774-12.006C14.943 196.569 14.944 187.423 19.23 180L53.52 120.75l-14.05 3.75c-4.28 1.143-8.677-1.4-9.82-5.68-1.143-4.28 1.4-8.677 5.68-9.82l32.77-8.77c2.05-.55 4.235-.262 6.073 .799 1.838 1.062 3.179 2.81 3.727 4.86l8.79 32.77c.561 2.06 .275 4.258-.794 6.106-1.069 1.848-2.832 3.192-4.896 3.734-.679 .177-1.378 .268-2.08 .27-3.618-.003-6.784-2.435-7.72-5.93L67.4 128.69 33.11 188c-1.426 2.469-1.429 5.511-.01 7.984 1.42 2.473 4.048 4.003 6.9 4.016h48c4.418 0 8 3.582 8 8ZM236.73 180 213.59 140c-2.3-3.618-7.043-4.78-10.755-2.634-3.712 2.145-5.072 6.836-3.085 10.634l23.14 40c1.426 2.469 1.429 5.511 .01 7.984-1.42 2.473-4.048 4.003-6.9 4.016h-68.69l10.34-10.34c3.126-3.123 3.128-8.189 .005-11.315-3.123-3.126-8.189-3.128-11.315-.005l-24 24c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l24 24c3.126 3.123 8.192 3.121 11.315-.005 3.123-3.126 3.121-8.192-.005-11.315L147.31 216h68.69c8.572-.005 16.49-4.582 20.774-12.006 4.284-7.425 4.282-16.57-.004-23.994ZM128 32c2.864-.029 5.516 1.504 6.92 4l34.29 59.25L155.13 91.47c-4.208-.988-8.44 1.546-9.557 5.722-1.116 4.176 1.287 8.484 5.427 9.728l32.78 8.79c.676 .177 1.371 .268 2.07 .27 3.618-.003 6.784-2.435 7.72-5.93l8.79-32.79c.822-2.787 .067-5.8-1.97-7.872-2.037-2.071-5.038-2.875-7.838-2.1-2.8 .775-4.96 3.008-5.642 5.832l-3.8 14.17L148.77 28C144.479 20.589 136.564 16.025 128 16.025c-8.564 0-16.479 4.563-20.77 11.975L84.07 68c-2.069 3.811-.726 8.576 3.029 10.745 3.755 2.169 8.554 .951 10.821-2.745L121.08 36c1.404-2.496 4.056-4.029 6.92-4Z"),
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
        return _recycle!!
    }

private var _recycle: ImageVector? = null
