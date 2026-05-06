package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FingerprintSimple: ImageVector
    get() {
        if (_fingerprintSimple != null) return _fingerprintSimple!!
        _fingerprintSimple = phosphorLightIcon(
            name = "FingerprintSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 128c.058 32.063-6.187 63.825-18.38 93.48-.925 2.251-3.117 3.72-5.55 3.72-.782-.003-1.556-.156-2.28-.45-1.474-.605-2.648-1.771-3.261-3.242-.613-1.471-.617-3.125-.009-4.598C164.118 188.705 170.057 158.496 170 128c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM128 86c11.951 .009 23.335 5.099 31.31 14 1.414 1.655 3.613 2.415 5.746 1.985 2.134-.43 3.867-1.981 4.531-4.054 .663-2.073 .151-4.343-1.337-5.931C153.324 75.311 129.648 69.565 108.732 77.554 87.816 85.543 74 105.61 74 128c.008 23.372-5.917 46.363-17.22 66.82-1.104 1.879-1.102 4.208 .004 6.085 1.106 1.877 3.143 3.007 5.321 2.952 2.178-.055 4.155-1.287 5.165-3.217C79.562 178.403 86.007 153.408 86 128c0-23.196 18.804-42 42-42ZM128 26c-11.582-.016-23.081 1.949-34 5.81-2.07 .676-3.612 2.422-4.027 4.56-.415 2.138 .361 4.333 2.028 5.735 1.667 1.402 3.963 1.79 5.998 1.015 27.55-9.706 58.096-5.45 81.943 11.418C203.79 71.406 217.977 98.79 218 128c.005 21.085-2.343 42.105-7 62.67-.513 2.104 .148 4.321 1.73 5.801 1.581 1.48 3.837 1.993 5.903 1.342 2.066-.651 3.62-2.364 4.068-4.483C227.556 171.893 230.005 149.98 230 128 229.934 71.694 184.306 26.066 128 26ZM68 60.92c2.251-2.254 2.349-5.875 .222-8.246C66.095 50.302 62.485 50.006 60 52 38.393 71.359 26.032 98.989 26 128c.032 12.943-2.748 25.738-8.15 37.5-.987 1.961-.825 4.305 .424 6.111 1.249 1.806 3.384 2.785 5.568 2.554 2.183-.231 4.066-1.637 4.908-3.665C34.88 157.172 38.036 142.67 38 128 38.02 102.394 48.927 78.005 68 60.92ZM113.08 202.56c-1.451-.678-3.113-.747-4.615-.193-1.503 .554-2.721 1.686-3.385 3.143-2 4.24-4.09 8.47-6.36 12.57-1.602 2.897-.555 6.544 2.34 8.15 .885 .5 1.884 .761 2.9 .76 2.182 .001 4.192-1.182 5.25-3.09 2.42-4.36 4.7-8.87 6.78-13.39 1.384-2.999 .083-6.553-2.91-7.95ZM128 122c-3.314 0-6 2.686-6 6 .009 15.685-1.96 31.308-5.86 46.5-.398 1.542-.166 3.179 .645 4.551 .81 1.371 2.133 2.364 3.675 2.759 .49 .127 .994 .191 1.5 .19 2.732-.004 5.117-1.854 5.8-4.5C131.911 161.328 134.007 144.697 134 128c0-3.314-2.686-6-6-6Z"),
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
        return _fingerprintSimple!!
    }

private var _fingerprintSimple: ImageVector? = null
