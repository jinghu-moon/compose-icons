package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorRegularIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 40.000 C 74.981 40.000 32.000 82.981 32.000 136.000 C 32.000 189.019 74.981 232.000 128.000 232.000 C 181.019 232.000 224.000 189.019 224.000 136.000 C 223.939 83.006 180.994 40.061 128.000 40.000 ZM 128.000 216.000 C 83.817 216.000 48.000 180.183 48.000 136.000 C 48.000 91.817 83.817 56.000 128.000 56.000 C 172.183 56.000 208.000 91.817 208.000 136.000 C 207.950 180.162 172.162 215.950 128.000 216.000 ZM 61.660 37.660 L 29.660 69.660 C 26.534 72.786 21.466 72.786 18.340 69.660 C 15.214 66.534 15.214 61.466 18.340 58.340 L 50.340 26.340 C 53.466 23.214 58.534 23.214 61.660 26.340 C 64.786 29.466 64.786 34.534 61.660 37.660 ZM 237.660 69.660 C 236.159 71.162 234.123 72.006 232.000 72.006 C 229.877 72.006 227.841 71.162 226.340 69.660 L 194.340 37.660 C 191.214 34.534 191.214 29.466 194.340 26.340 C 197.466 23.214 202.534 23.214 205.660 26.340 L 237.660 58.340 C 239.162 59.841 240.006 61.877 240.006 64.000 C 240.006 66.123 239.162 68.159 237.660 69.660 ZM 184.000 128.000 C 188.418 128.000 192.000 131.582 192.000 136.000 C 192.000 140.418 188.418 144.000 184.000 144.000 L 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 L 136.000 128.000 Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
