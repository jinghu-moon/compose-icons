package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorBoldIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 150.69v-94.69C180 27.281 156.719 4 128 4 99.281 4 76 27.281 76 56v94.69c-19.039 26.536-15.044 63.15 9.27 84.956 24.314 21.805 61.146 21.805 85.46 0 24.314-21.805 28.309-58.42 9.27-84.956ZM128 228c-15.47 .001-29.553-8.919-36.165-22.906-6.611-13.986-4.565-30.531 5.255-42.484 1.876-2.177 2.909-4.956 2.91-7.83v-98.78c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v98.77c-.003 2.805 .977 5.522 2.77 7.68 9.904 11.931 12.021 28.511 5.433 42.547C157.614 219.034 143.506 227.997 128 228ZM152 188c.002 11.648-8.359 21.615-19.829 23.639-11.47 2.024-22.738-4.48-26.723-15.425-3.984-10.945 .465-23.171 10.552-28.995v-75.22c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v75.22c7.424 4.286 11.998 12.207 12 20.78Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
