package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorFillIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 117.660 149.660 L 85.660 181.660 C 84.159 183.162 82.123 184.006 80.000 184.006 C 77.877 184.006 75.841 183.162 74.340 181.660 L 58.340 165.660 C 55.214 162.534 55.214 157.466 58.340 154.340 C 61.466 151.214 66.534 151.214 69.660 154.340 L 80.000 164.690 L 106.340 138.340 C 109.466 135.214 114.534 135.214 117.660 138.340 C 120.786 141.466 120.786 146.534 117.660 149.660 ZM 117.660 85.660 L 85.660 117.660 C 84.159 119.162 82.123 120.006 80.000 120.006 C 77.877 120.006 75.841 119.162 74.340 117.660 L 58.340 101.660 C 55.214 98.534 55.214 93.466 58.340 90.340 C 61.466 87.214 66.534 87.214 69.660 90.340 L 80.000 100.690 L 106.340 74.340 C 109.466 71.214 114.534 71.214 117.660 74.340 C 120.786 77.466 120.786 82.534 117.660 85.660 ZM 192.000 168.000 L 144.000 168.000 C 139.582 168.000 136.000 164.418 136.000 160.000 C 136.000 155.582 139.582 152.000 144.000 152.000 L 192.000 152.000 C 196.418 152.000 200.000 155.582 200.000 160.000 C 200.000 164.418 196.418 168.000 192.000 168.000 ZM 192.000 104.000 L 144.000 104.000 C 139.582 104.000 136.000 100.418 136.000 96.000 C 136.000 91.582 139.582 88.000 144.000 88.000 L 192.000 88.000 C 196.418 88.000 200.000 91.582 200.000 96.000 C 200.000 100.418 196.418 104.000 192.000 104.000 Z"),
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
