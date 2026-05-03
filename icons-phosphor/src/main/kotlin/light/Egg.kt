package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorLightIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 185.000 60.670 C 167.180 34.000 145.870 18.000 128.000 18.000 C 110.130 18.000 88.820 34.000 71.000 60.670 C 52.570 88.320 42.000 121.610 42.000 152.000 C 42.000 199.496 80.504 238.000 128.000 238.000 C 175.496 238.000 214.000 199.496 214.000 152.000 C 214.000 121.610 203.430 88.320 185.000 60.670 ZM 128.000 226.000 C 87.151 225.950 54.050 192.849 54.000 152.000 C 54.000 123.920 63.840 93.060 81.000 67.330 C 96.110 44.650 114.560 30.000 128.000 30.000 C 141.440 30.000 159.890 44.650 175.000 67.330 C 192.150 93.060 202.000 123.920 202.000 152.000 C 201.950 192.849 168.849 225.950 128.000 226.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _egg!!
    }

private var _egg: ImageVector? = null
