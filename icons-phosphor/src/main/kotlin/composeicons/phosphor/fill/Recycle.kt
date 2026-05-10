package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Recycle: ImageVector
    get() {
        if (_recycle != null) return _recycle!!
        _recycle = phosphorFillIcon(
            name = "Recycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 208c0 4.418-3.582 8-8 8h-48c-8.572-.005-16.49-4.582-20.774-12.006C14.943 196.569 14.944 187.423 19.23 180l28-48.3-13.82-8c-2.833-1.605-4.41-4.768-3.989-7.996 .422-3.229 2.758-5.88 5.909-6.704l32.77-8.77c2.05-.55 4.235-.262 6.073 .799 1.838 1.062 3.179 2.81 3.727 4.86l8.79 32.77c.839 3.126-.289 6.45-2.857 8.421-2.568 1.97-6.071 2.199-8.873 .579l-13.88-8L33.11 188c-1.426 2.469-1.429 5.511-.01 7.984 1.42 2.473 4.048 4.003 6.9 4.016h48c4.418 0 8 3.582 8 8ZM128 32c2.864-.029 5.516 1.504 6.92 4l28 48.3-13.82 8c-2.779 1.622-4.316 4.75-3.901 7.94 .415 3.19 2.7 5.822 5.801 6.68l32.78 8.79c.676 .177 1.371 .268 2.07 .27 3.618-.003 6.784-2.435 7.72-5.93l8.79-32.79c.835-3.123-.292-6.443-2.856-8.412-2.564-1.969-6.062-2.201-8.864-.588l-13.89 8L148.77 28C144.479 20.589 136.564 16.025 128 16.025c-8.564 0-16.479 4.563-20.77 11.975L84.07 68c-2.069 3.811-.726 8.576 3.029 10.745 3.755 2.169 8.554 .951 10.821-2.745L121.08 36c1.404-2.496 4.056-4.029 6.92-4ZM236.73 180 213.59 140c-2.3-3.618-7.043-4.78-10.755-2.634-3.712 2.145-5.072 6.836-3.085 10.634l23.14 40c1.426 2.469 1.429 5.511 .01 7.984-1.42 2.473-4.048 4.003-6.9 4.016h-56v-16c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-24 24c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l24 24c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-16h56c8.572-.005 16.49-4.582 20.774-12.006 4.284-7.425 4.282-16.57-.004-23.994Z"),
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
