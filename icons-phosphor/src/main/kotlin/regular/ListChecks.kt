package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorRegularIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 128.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 68.418 224.000 64.000 C 224.000 59.582 220.418 56.000 216.000 56.000 L 128.000 56.000 C 123.582 56.000 120.000 59.582 120.000 64.000 C 120.000 68.418 123.582 72.000 128.000 72.000 ZM 216.000 184.000 L 128.000 184.000 C 123.582 184.000 120.000 187.582 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 82.340 42.340 L 56.000 68.690 L 45.660 58.340 C 42.534 55.214 37.466 55.214 34.340 58.340 C 31.214 61.466 31.214 66.534 34.340 69.660 L 50.340 85.660 C 51.841 87.162 53.877 88.006 56.000 88.006 C 58.123 88.006 60.159 87.162 61.660 85.660 L 93.660 53.660 C 96.786 50.534 96.786 45.466 93.660 42.340 C 90.534 39.214 85.466 39.214 82.340 42.340 ZM 82.340 106.340 L 56.000 132.690 L 45.660 122.340 C 42.534 119.214 37.466 119.214 34.340 122.340 C 31.214 125.466 31.214 130.534 34.340 133.660 L 50.340 149.660 C 51.841 151.162 53.877 152.006 56.000 152.006 C 58.123 152.006 60.159 151.162 61.660 149.660 L 93.660 117.660 C 96.786 114.534 96.786 109.466 93.660 106.340 C 90.534 103.214 85.466 103.214 82.340 106.340 ZM 82.340 170.340 L 56.000 196.690 L 45.660 186.340 C 42.534 183.214 37.466 183.214 34.340 186.340 C 31.214 189.466 31.214 194.534 34.340 197.660 L 50.340 213.660 C 51.841 215.162 53.877 216.006 56.000 216.006 C 58.123 216.006 60.159 215.162 61.660 213.660 L 93.660 181.660 C 96.786 178.534 96.786 173.466 93.660 170.340 C 90.534 167.214 85.466 167.214 82.340 170.340 Z"),
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
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
