package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorRegularIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 66.340 L 189.660 18.340 C 186.534 15.214 181.466 15.214 178.340 18.340 C 175.214 21.466 175.214 26.534 178.340 29.660 L 196.690 48.000 L 168.000 76.690 L 133.660 42.340 C 130.534 39.214 125.466 39.214 122.340 42.340 C 119.214 45.466 119.214 50.534 122.340 53.660 L 128.690 60.000 L 44.690 144.000 C 41.676 146.990 39.986 151.064 40.000 155.310 L 40.000 204.690 L 18.340 226.340 C 15.214 229.466 15.214 234.534 18.340 237.660 C 21.466 240.786 26.534 240.786 29.660 237.660 L 51.310 216.000 L 100.690 216.000 C 104.936 216.014 109.010 214.324 112.000 211.310 L 196.000 127.310 L 202.340 133.660 C 205.466 136.786 210.534 136.786 213.660 133.660 C 216.786 130.534 216.786 125.466 213.660 122.340 L 179.310 88.000 L 208.000 59.310 L 226.340 77.660 C 229.466 80.786 234.534 80.786 237.660 77.660 C 240.786 74.534 240.786 69.466 237.660 66.340 ZM 100.690 200.000 L 56.000 200.000 L 56.000 155.310 L 74.000 137.310 L 94.340 157.660 C 97.466 160.786 102.534 160.786 105.660 157.660 C 108.786 154.534 108.786 149.466 105.660 146.340 L 85.310 126.000 L 98.000 113.310 L 118.340 133.660 C 121.466 136.786 126.534 136.786 129.660 133.660 C 132.786 130.534 132.786 125.466 129.660 122.340 L 109.310 102.000 L 140.000 71.310 L 184.690 116.000 Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
