package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorLightIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218 160c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM213.65 197.58C210.809 220.64 191.235 237.972 168 238h-24C118.609 237.967 98.033 217.391 98 192v-42.29C66.232 146.621 41.999 119.918 42 88v-48c0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v42c0 27.614 22.386 50 50 50h.67C131.87 137.64 154 114.84 154 87.17v-41.17h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6v47.17c0 32.43-24.68 59.44-56 62.52v42.31c0 18.778 15.222 34 34 34h24c16.669-.022 30.872-12.109 33.56-28.56-19.521-3.378-33.171-21.186-31.362-40.914 1.809-19.728 18.472-34.756 38.281-34.527 19.81 .229 36.119 15.639 37.471 35.404 1.352 19.765-12.707 37.252-32.301 40.177ZM234 160c0-14.359-11.641-26-26-26-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
