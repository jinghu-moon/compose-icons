package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MaskSad: ImageVector
    get() {
        if (_maskSad != null) return _maskSad!!
        _maskSad = phosphorBoldIcon(
            name = "MaskSad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.29 31.5c-5.443-3.723-12.371-4.524-18.52-2.14C187 34.72 159.17 43.7 128 43.7c-31.17 0-59-9-72.77-14.34C49.079 26.975 42.147 27.777 36.703 31.504 31.258 35.231 28.002 41.402 28 48v55.77c0 36.64 9.9 71.25 27.88 97.45C74.81 228.81 100.42 244 128 244c27.58 0 53.19-15.19 72.12-42.76C218.1 175 228 140.43 228 103.79v-55.79c-.003-6.6-3.262-12.774-8.71-16.5ZM204 103.79c0 31.84-8.41 61.63-23.67 83.87C166 208.51 147.43 220 128 220 108.57 220 90 208.51 75.67 187.66 60.41 165.42 52 135.63 52 103.79v-50c16.59 5.95 44.67 13.94 76 13.94 31.33 0 59.41-8 76-13.94ZM158.38 187.51c-1.595 2.755-4.219 4.762-7.295 5.582-3.076 .82-6.351 .384-9.105-1.212-8.612-5.188-19.388-5.188-28 0-3.72 2.365-8.437 2.5-12.286 .352-3.849-2.148-6.211-6.234-6.151-10.641 .06-4.407 2.531-8.427 6.437-10.471 16.04-9.47 35.96-9.47 52 0 5.741 3.311 7.711 10.649 4.4 16.39ZM137.89 113.51c1.72-2.68 4.435-4.566 7.547-5.243 3.112-.677 6.365-.09 9.043 1.633 2.874 1.747 6.158 2.705 9.52 2.78 2.503-.062 4.97-.602 7.27-1.59 6.092-2.612 13.148 .208 15.76 6.3 2.612 6.092-.208 13.148-6.3 15.76-12.762 5.624-27.494 4.475-39.23-3.06-5.575-3.582-7.191-11.005-3.61-16.58ZM114.5 130.09c-11.744 7.522-26.479 8.649-39.23 3-4.22-1.493-7.258-5.211-7.881-9.644-.623-4.433 1.274-8.844 4.92-11.442 3.646-2.598 8.434-2.95 12.421-.914 2.3 .988 4.767 1.528 7.27 1.59 3.369-.074 6.659-1.033 9.54-2.78 5.575-3.59 13.005-1.98 16.595 3.595 3.59 5.575 1.98 13.005-3.595 16.595Z"),
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
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
