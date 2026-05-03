package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorRegularIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 189.660 122.340 C 192.786 125.466 192.786 130.534 189.660 133.660 C 186.534 136.786 181.466 136.786 178.340 133.660 L 168.000 123.310 L 157.660 133.660 C 154.534 136.786 149.466 136.786 146.340 133.660 C 143.214 130.534 143.214 125.466 146.340 122.340 L 156.690 112.000 L 146.340 101.660 C 143.214 98.534 143.214 93.466 146.340 90.340 C 149.466 87.214 154.534 87.214 157.660 90.340 L 168.000 100.690 L 178.340 90.340 C 181.466 87.214 186.534 87.214 189.660 90.340 C 192.786 93.466 192.786 98.534 189.660 101.660 L 179.310 112.000 ZM 109.660 101.660 L 99.310 112.000 L 109.660 122.340 C 112.786 125.466 112.786 130.534 109.660 133.660 C 106.534 136.786 101.466 136.786 98.340 133.660 L 88.000 123.310 L 77.660 133.660 C 74.534 136.786 69.466 136.786 66.340 133.660 C 63.214 130.534 63.214 125.466 66.340 122.340 L 76.690 112.000 L 66.340 101.660 C 63.214 98.534 63.214 93.466 66.340 90.340 C 69.466 87.214 74.534 87.214 77.660 90.340 L 88.000 100.690 L 98.340 90.340 C 101.466 87.214 106.534 87.214 109.660 90.340 C 112.786 93.466 112.786 98.534 109.660 101.660 ZM 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 C 116.000 173.373 121.373 168.000 128.000 168.000 C 134.627 168.000 140.000 173.373 140.000 180.000 Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
