package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorLightIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.73 201.06C127.258 187.06 109.962 158.833 109.962 128c0-30.833 17.296-59.06 44.768-73.06 2.009-1.025 3.274-3.09 3.274-5.345 0-2.255-1.265-4.32-3.274-5.345C141.51 37.469 126.858 33.954 112 34 60.085 34 18 76.085 18 128c0 51.915 42.085 94 94 94 14.858 .046 29.51-3.469 42.73-10.25 2.009-1.025 3.274-3.09 3.274-5.345 0-2.255-1.265-4.32-3.274-5.345ZM112 210C79.453 209.958 50.012 190.67 36.973 160.849 23.935 131.027 29.768 96.318 51.838 72.396 73.908 48.475 108.037 39.871 138.81 50.47 113.244 67.997 97.962 97.002 97.962 128c0 30.998 15.282 60.003 40.848 77.53-8.623 2.982-17.686 4.493-26.81 4.47ZM250.38 122.49 222.77 110.58l-2.4-31c-.187-2.44-1.838-4.522-4.171-5.261-2.333-.739-4.881 .013-6.439 1.901L190.37 99.67 161.44 92.51c-2.345-.58-4.808 .303-6.251 2.239-1.443 1.937-1.584 4.55-.359 6.631L170.5 128l-15.67 26.62c-1.226 2.081-1.085 4.694 .359 6.631 1.443 1.937 3.907 2.819 6.251 2.239l28.93-7.16 19.39 23.49c1.558 1.888 4.106 2.64 6.439 1.901 2.333-.739 3.984-2.821 4.171-5.261l2.4-31 27.61-11.91c2.188-.954 3.602-3.113 3.602-5.5 0-2.387-1.414-4.546-3.602-5.5ZM214.69 135.84c-2.033 .873-3.421 2.795-3.61 5l-1.53 19.83L197.22 145.73c-1.141-1.381-2.839-2.181-4.63-2.18-.486 .001-.969 .061-1.44 .18l-18.74 4.63L182.64 131c1.103-1.877 1.103-4.203 0-6.08L172.41 107.55l18.74 4.63c2.24 .556 4.6-.222 6.07-2L209.55 95.24l1.53 19.83c.189 2.205 1.577 4.127 3.61 5L232.86 128Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
