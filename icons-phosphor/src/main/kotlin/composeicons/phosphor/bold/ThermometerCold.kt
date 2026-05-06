package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorBoldIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 56C160 27.281 136.719 4 108 4 79.281 4 56 27.281 56 56v94.69c-19.039 26.536-15.044 63.15 9.27 84.956 24.314 21.805 61.146 21.805 85.46 0 24.314-21.805 28.309-58.42 9.27-84.956ZM108 228c-15.47 .001-29.553-8.919-36.165-22.906-6.611-13.986-4.565-30.531 5.255-42.484 1.876-2.177 2.909-4.956 2.91-7.83v-98.78C80 40.536 92.536 28 108 28c15.464 0 28 12.536 28 28v98.77c-.003 2.805 .977 5.522 2.77 7.68 9.904 11.931 12.021 28.511 5.433 42.547C137.614 219.034 123.506 227.997 108 228ZM246.14 81.52l-14.72 4.79 9.1 12.52c3.896 5.363 2.708 12.869-2.655 16.765-5.363 3.896-12.869 2.708-16.765-2.655L212 100.42l-9.1 12.52c-3.896 5.363-11.402 6.551-16.765 2.655-5.363-3.896-6.551-11.402-2.655-16.765l9.1-12.52L177.86 81.52c-4.175-1.245-7.348-4.654-8.289-8.908-.941-4.254 .497-8.684 3.758-11.573 3.261-2.889 7.831-3.785 11.941-2.339L200 63.48v-15.48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v15.48l14.73-4.78c4.11-1.446 8.68-.55 11.941 2.339 3.261 2.889 4.699 7.319 3.758 11.573-.941 4.254-4.114 7.663-8.289 8.908ZM132 188c.002 11.648-8.359 21.615-19.829 23.639-11.47 2.024-22.738-4.48-26.723-15.425C81.463 185.27 85.913 173.044 96 167.22v-35.22c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v35.22c7.424 4.286 11.998 12.207 12 20.78Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
