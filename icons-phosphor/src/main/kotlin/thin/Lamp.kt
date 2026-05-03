package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorThinIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.680 150.420 L 195.680 38.420 C 195.048 36.950 193.600 35.998 192.000 36.000 L 64.000 36.000 C 62.400 35.998 60.952 36.950 60.320 38.420 L 12.320 150.420 C 11.788 151.657 11.914 153.078 12.656 154.202 C 13.397 155.326 14.654 156.002 16.000 156.000 L 124.000 156.000 L 124.000 212.000 L 96.000 212.000 C 93.791 212.000 92.000 213.791 92.000 216.000 C 92.000 218.209 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 218.209 164.000 216.000 C 164.000 213.791 162.209 212.000 160.000 212.000 L 132.000 212.000 L 132.000 156.000 L 196.000 156.000 L 196.000 192.000 C 196.000 194.209 197.791 196.000 200.000 196.000 C 202.209 196.000 204.000 194.209 204.000 192.000 L 204.000 156.000 L 240.000 156.000 C 241.346 156.002 242.603 155.326 243.344 154.202 C 244.086 153.078 244.212 151.657 243.680 150.420 ZM 22.070 148.000 L 66.640 44.000 L 189.360 44.000 L 233.930 148.000 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
