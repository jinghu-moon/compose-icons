package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorFillIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 61.660 37.660 L 29.660 69.660 C 26.534 72.786 21.466 72.786 18.340 69.660 C 15.214 66.534 15.214 61.466 18.340 58.340 L 50.340 26.340 C 53.466 23.214 58.534 23.214 61.660 26.340 C 64.786 29.466 64.786 34.534 61.660 37.660 ZM 237.660 58.340 L 205.660 26.340 C 202.534 23.214 197.466 23.214 194.340 26.340 C 191.214 29.466 191.214 34.534 194.340 37.660 L 226.340 69.660 C 229.466 72.786 234.534 72.786 237.660 69.660 C 240.786 66.534 240.786 61.466 237.660 58.340 ZM 224.000 136.000 C 224.000 189.019 181.019 232.000 128.000 232.000 C 74.981 232.000 32.000 189.019 32.000 136.000 C 32.000 82.981 74.981 40.000 128.000 40.000 C 180.994 40.061 223.939 83.006 224.000 136.000 ZM 192.000 136.000 C 192.000 131.582 188.418 128.000 184.000 128.000 L 136.000 128.000 L 136.000 80.000 C 136.000 75.582 132.418 72.000 128.000 72.000 C 123.582 72.000 120.000 75.582 120.000 80.000 L 120.000 136.000 C 120.000 140.418 123.582 144.000 128.000 144.000 L 184.000 144.000 C 188.418 144.000 192.000 140.418 192.000 136.000 Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
