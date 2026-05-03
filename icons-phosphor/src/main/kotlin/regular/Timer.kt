package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = phosphorRegularIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 40.000 C 74.981 40.000 32.000 82.981 32.000 136.000 C 32.000 189.019 74.981 232.000 128.000 232.000 C 181.019 232.000 224.000 189.019 224.000 136.000 C 223.939 83.006 180.994 40.061 128.000 40.000 ZM 128.000 216.000 C 83.817 216.000 48.000 180.183 48.000 136.000 C 48.000 91.817 83.817 56.000 128.000 56.000 C 172.183 56.000 208.000 91.817 208.000 136.000 C 207.950 180.162 172.162 215.950 128.000 216.000 ZM 173.660 90.340 C 175.162 91.841 176.006 93.877 176.006 96.000 C 176.006 98.123 175.162 100.159 173.660 101.660 L 133.660 141.660 C 130.534 144.786 125.466 144.786 122.340 141.660 C 119.214 138.534 119.214 133.466 122.340 130.340 L 162.340 90.340 C 163.841 88.838 165.877 87.994 168.000 87.994 C 170.123 87.994 172.159 88.838 173.660 90.340 ZM 96.000 16.000 C 96.000 11.582 99.582 8.000 104.000 8.000 L 152.000 8.000 C 156.418 8.000 160.000 11.582 160.000 16.000 C 160.000 20.418 156.418 24.000 152.000 24.000 L 104.000 24.000 C 99.582 24.000 96.000 20.418 96.000 16.000 Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
