package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorDuotoneIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 56.000 L 240.000 200.000 C 240.000 208.837 232.837 216.000 224.000 216.000 L 32.000 216.000 C 23.163 216.000 16.000 208.837 16.000 200.000 L 16.000 56.000 C 16.000 47.163 23.163 40.000 32.000 40.000 L 224.000 40.000 C 232.837 40.000 240.000 47.163 240.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 136.000 40.000 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 ZM 69.660 90.340 C 66.534 87.214 61.466 87.214 58.340 90.340 C 55.214 93.466 55.214 98.534 58.340 101.660 L 76.690 120.000 L 16.000 120.000 C 11.582 120.000 8.000 123.582 8.000 128.000 C 8.000 132.418 11.582 136.000 16.000 136.000 L 76.690 136.000 L 58.340 154.340 C 55.214 157.466 55.214 162.534 58.340 165.660 C 61.466 168.786 66.534 168.786 69.660 165.660 L 101.660 133.660 C 103.162 132.159 104.006 130.123 104.006 128.000 C 104.006 125.877 103.162 123.841 101.660 122.340 ZM 240.000 120.000 L 179.310 120.000 L 197.660 101.660 C 200.786 98.534 200.786 93.466 197.660 90.340 C 194.534 87.214 189.466 87.214 186.340 90.340 L 154.340 122.340 C 152.838 123.841 151.994 125.877 151.994 128.000 C 151.994 130.123 152.838 132.159 154.340 133.660 L 186.340 165.660 C 189.466 168.786 194.534 168.786 197.660 165.660 C 200.786 162.534 200.786 157.466 197.660 154.340 L 179.310 136.000 L 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
