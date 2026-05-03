package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorDuotoneIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 90.340 69.660 C 87.214 66.534 87.214 61.466 90.340 58.340 C 93.466 55.214 98.534 55.214 101.660 58.340 L 120.000 76.690 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 76.690 L 154.340 58.340 C 157.466 55.214 162.534 55.214 165.660 58.340 C 168.786 61.466 168.786 66.534 165.660 69.660 L 133.660 101.660 C 132.159 103.162 130.123 104.006 128.000 104.006 C 125.877 104.006 123.841 103.162 122.340 101.660 ZM 133.660 154.340 C 132.159 152.838 130.123 151.994 128.000 151.994 C 125.877 151.994 123.841 152.838 122.340 154.340 L 90.340 186.340 C 87.214 189.466 87.214 194.534 90.340 197.660 C 93.466 200.786 98.534 200.786 101.660 197.660 L 120.000 179.310 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 179.310 L 154.340 197.660 C 157.466 200.786 162.534 200.786 165.660 197.660 C 168.786 194.534 168.786 189.466 165.660 186.340 ZM 232.000 120.000 L 179.310 120.000 L 197.660 101.660 C 200.786 98.534 200.786 93.466 197.660 90.340 C 194.534 87.214 189.466 87.214 186.340 90.340 L 154.340 122.340 C 152.838 123.841 151.994 125.877 151.994 128.000 C 151.994 130.123 152.838 132.159 154.340 133.660 L 186.340 165.660 C 189.466 168.786 194.534 168.786 197.660 165.660 C 200.786 162.534 200.786 157.466 197.660 154.340 L 179.310 136.000 L 232.000 136.000 C 236.418 136.000 240.000 132.418 240.000 128.000 C 240.000 123.582 236.418 120.000 232.000 120.000 ZM 101.660 122.340 L 69.660 90.340 C 66.534 87.214 61.466 87.214 58.340 90.340 C 55.214 93.466 55.214 98.534 58.340 101.660 L 76.690 120.000 L 24.000 120.000 C 19.582 120.000 16.000 123.582 16.000 128.000 C 16.000 132.418 19.582 136.000 24.000 136.000 L 76.690 136.000 L 58.340 154.340 C 55.214 157.466 55.214 162.534 58.340 165.660 C 61.466 168.786 66.534 168.786 69.660 165.660 L 101.660 133.660 C 103.162 132.159 104.006 130.123 104.006 128.000 C 104.006 125.877 103.162 123.841 101.660 122.340 Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
