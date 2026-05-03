package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorLightIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.410 173.400 C 244.410 171.321 242.307 169.999 240.000 170.000 L 142.000 170.000 L 142.000 142.000 L 216.000 142.000 C 218.360 141.987 220.494 140.592 221.452 138.435 C 222.410 136.278 222.014 133.759 220.440 132.000 L 142.000 45.680 L 142.000 8.000 C 142.000 5.459 140.400 3.194 138.005 2.344 C 135.610 1.495 132.941 2.247 131.340 4.220 L 27.340 132.220 C 25.882 134.017 25.588 136.492 26.583 138.581 C 27.578 140.670 29.686 142.000 32.000 142.000 L 130.000 142.000 L 130.000 170.000 L 16.000 170.000 C 13.692 169.998 11.587 171.319 10.587 173.399 C 9.586 175.479 9.868 177.948 11.310 179.750 L 40.910 216.750 C 43.567 220.069 47.589 222.000 51.840 222.000 L 204.160 222.000 C 208.411 222.000 212.433 220.069 215.090 216.750 L 244.690 179.750 C 246.131 177.948 246.411 175.479 245.410 173.400 ZM 202.410 130.000 L 142.000 130.000 L 142.000 63.520 ZM 44.610 130.000 L 130.000 24.900 L 130.000 130.000 ZM 205.720 209.250 C 205.341 209.724 204.767 210.000 204.160 210.000 L 51.840 210.000 C 51.233 210.000 50.659 209.724 50.280 209.250 L 28.480 182.000 L 227.480 182.000 Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
