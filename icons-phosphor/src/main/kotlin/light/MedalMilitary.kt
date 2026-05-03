package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorLightIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.000 42.000 L 49.000 42.000 C 40.716 42.000 34.000 48.716 34.000 57.000 L 34.000 106.210 C 34.002 112.089 37.438 117.426 42.790 119.860 L 109.190 150.000 C 89.388 158.873 78.480 180.377 83.017 201.596 C 87.553 222.815 106.301 237.978 128.000 237.978 C 149.699 237.978 168.447 222.815 172.983 201.596 C 177.520 180.377 166.612 158.873 146.810 150.000 L 213.210 119.820 C 218.549 117.392 221.983 112.075 222.000 106.210 L 222.000 57.000 C 222.000 48.716 215.284 42.000 207.000 42.000 ZM 162.000 54.000 L 162.000 130.000 L 128.000 145.450 L 94.000 130.000 L 94.000 54.000 ZM 46.000 106.210 L 46.000 57.000 C 46.000 55.343 47.343 54.000 49.000 54.000 L 82.000 54.000 L 82.000 124.500 L 47.760 108.940 C 46.689 108.454 46.001 107.386 46.000 106.210 ZM 162.000 192.000 C 162.000 210.778 146.778 226.000 128.000 226.000 C 109.222 226.000 94.000 210.778 94.000 192.000 C 94.000 173.222 109.222 158.000 128.000 158.000 C 146.778 158.000 162.000 173.222 162.000 192.000 ZM 210.000 106.210 C 209.999 107.386 209.311 108.454 208.240 108.940 L 174.000 124.500 L 174.000 54.000 L 207.000 54.000 C 208.657 54.000 210.000 55.343 210.000 57.000 Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
