package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorFillIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 193.660 169.660 L 185.660 177.660 C 182.177 181.169 182.177 186.831 185.660 190.340 L 189.660 194.340 C 192.786 197.466 192.786 202.534 189.660 205.660 C 186.534 208.786 181.466 208.786 178.340 205.660 L 174.340 201.660 C 164.600 191.901 164.600 176.099 174.340 166.340 L 182.340 158.340 C 185.823 154.831 185.823 149.169 182.340 145.660 C 178.831 142.177 173.169 142.177 169.660 145.660 L 121.660 193.660 C 111.791 202.684 96.568 202.343 87.113 192.887 C 77.657 183.432 77.316 168.209 86.340 158.340 L 158.340 86.340 C 161.823 82.831 161.823 77.169 158.340 73.660 C 154.831 70.177 149.169 70.177 145.660 73.660 L 97.660 121.660 C 87.791 130.684 72.568 130.343 63.113 120.887 C 53.657 111.432 53.316 96.209 62.340 86.340 L 90.340 58.340 C 93.466 55.214 98.534 55.214 101.660 58.340 C 104.786 61.466 104.786 66.534 101.660 69.660 L 73.660 97.660 C 70.177 101.169 70.177 106.831 73.660 110.340 C 77.169 113.823 82.831 113.823 86.340 110.340 L 134.340 62.340 C 144.209 53.316 159.432 53.657 168.887 63.113 C 178.343 72.568 178.684 87.791 169.660 97.660 L 97.660 169.660 C 94.177 173.169 94.177 178.831 97.660 182.340 C 101.169 185.823 106.831 185.823 110.340 182.340 L 158.340 134.340 C 168.209 125.316 183.432 125.657 192.887 135.113 C 202.343 144.568 202.684 159.791 193.660 169.660 Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
