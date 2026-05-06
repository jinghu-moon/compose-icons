package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorLightIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 144c0 3.314-2.686 6-6 6h-48c-2.273 0-4.35-1.284-5.367-3.317-1.016-2.033-.797-4.465 .567-6.283L230.37 82.85c4.223-5.667 4.739-13.281 1.319-19.466-3.42-6.185-10.143-9.796-17.188-9.232C207.456 54.715 201.393 59.35 199 66c-1.16 3.044-4.536 4.606-7.607 3.52C188.322 68.434 186.678 65.096 187.69 62c1.024-2.869 2.477-5.567 4.31-8 9.958-13.255 28.775-15.928 42.03-5.97 13.255 9.958 15.928 28.775 5.97 42.03L204 138h36c3.314 0 6 2.686 6 6ZM147.93 75.47c-2.502-2.169-6.289-1.9-8.46 .6L92 130.84 44.53 76.07C43.148 74.374 40.952 73.565 38.8 73.958c-2.152 .393-3.92 1.927-4.613 4.002-.693 2.075-.202 4.363 1.282 5.97L84.06 140 35.47 196.07c-1.484 1.608-1.975 3.895-1.282 5.97 .693 2.075 2.46 3.608 4.613 4.002 2.152 .393 4.348-.416 5.73-2.112L92 149.16l47.47 54.77c2.199 2.382 5.892 2.587 8.341 .462 2.449-2.124 2.767-5.809 .719-8.322L99.94 140 148.53 83.93c2.169-2.502 1.9-6.289-.6-8.46Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
