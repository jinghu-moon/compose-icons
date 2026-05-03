package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorLightIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 80.000 C 238.000 59.013 220.987 42.000 200.000 42.000 L 48.000 42.000 C 29.768 42.009 14.112 54.965 10.692 72.873 C 7.273 90.781 17.054 108.594 34.000 115.320 L 34.000 200.000 C 34.000 207.732 40.268 214.000 48.000 214.000 L 200.000 214.000 C 207.732 214.000 214.000 207.732 214.000 200.000 L 214.000 115.320 C 228.471 109.564 237.978 95.574 238.000 80.000 ZM 46.000 200.000 L 46.000 118.000 C 46.660 118.000 47.330 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 C 54.000 108.686 51.314 106.000 48.000 106.000 C 33.641 106.000 22.000 94.359 22.000 80.000 C 22.000 65.641 33.641 54.000 48.000 54.000 L 144.000 54.000 C 158.359 54.000 170.000 65.641 170.000 80.000 C 170.000 94.359 158.359 106.000 144.000 106.000 C 140.686 106.000 138.000 108.686 138.000 112.000 C 138.000 115.314 140.686 118.000 144.000 118.000 C 144.670 118.000 145.340 118.000 146.000 118.000 L 146.000 200.000 C 146.000 201.105 145.105 202.000 144.000 202.000 L 48.000 202.000 C 46.895 202.000 46.000 201.105 46.000 200.000 ZM 200.000 106.000 C 196.686 106.000 194.000 108.686 194.000 112.000 C 194.000 115.314 196.686 118.000 200.000 118.000 C 200.670 118.000 201.340 118.000 202.000 118.000 L 202.000 200.000 C 202.000 201.105 201.105 202.000 200.000 202.000 L 157.840 202.000 C 157.939 201.338 157.992 200.670 158.000 200.000 L 158.000 115.320 C 169.688 110.677 178.321 100.553 181.060 88.278 C 183.798 76.004 180.286 63.170 171.680 54.000 L 200.000 54.000 C 214.359 54.000 226.000 65.641 226.000 80.000 C 226.000 94.359 214.359 106.000 200.000 106.000 Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
