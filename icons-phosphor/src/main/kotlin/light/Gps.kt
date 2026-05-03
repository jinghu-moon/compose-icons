package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorLightIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 122.000 L 213.770 122.000 C 210.720 79.271 176.729 45.280 134.000 42.230 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 42.230 C 79.271 45.280 45.280 79.271 42.230 122.000 L 16.000 122.000 C 12.686 122.000 10.000 124.686 10.000 128.000 C 10.000 131.314 12.686 134.000 16.000 134.000 L 42.230 134.000 C 45.280 176.729 79.271 210.720 122.000 213.770 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 213.770 C 176.729 210.720 210.720 176.729 213.770 134.000 L 240.000 134.000 C 243.314 134.000 246.000 131.314 246.000 128.000 C 246.000 124.686 243.314 122.000 240.000 122.000 ZM 128.000 202.000 C 87.131 202.000 54.000 168.869 54.000 128.000 C 54.000 87.131 87.131 54.000 128.000 54.000 C 168.869 54.000 202.000 87.131 202.000 128.000 C 201.950 168.849 168.849 201.950 128.000 202.000 Z"),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
