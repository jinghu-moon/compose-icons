package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorDuotoneIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 128.000 L 200.000 160.000 L 56.000 160.000 L 24.000 128.000 L 56.000 96.000 L 200.000 96.000 Z"),
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
                pathData = parseSvgPathData("M 237.660 133.660 L 205.660 165.660 C 202.534 168.786 197.466 168.786 194.340 165.660 C 191.214 162.534 191.214 157.466 194.340 154.340 L 212.690 136.000 L 43.310 136.000 L 61.660 154.340 C 64.786 157.466 64.786 162.534 61.660 165.660 C 58.534 168.786 53.466 168.786 50.340 165.660 L 18.340 133.660 C 16.838 132.159 15.994 130.123 15.994 128.000 C 15.994 125.877 16.838 123.841 18.340 122.340 L 50.340 90.340 C 53.466 87.214 58.534 87.214 61.660 90.340 C 64.786 93.466 64.786 98.534 61.660 101.660 L 43.310 120.000 L 212.690 120.000 L 194.340 101.660 C 191.214 98.534 191.214 93.466 194.340 90.340 C 197.466 87.214 202.534 87.214 205.660 90.340 L 237.660 122.340 C 239.162 123.841 240.006 125.877 240.006 128.000 C 240.006 130.123 239.162 132.159 237.660 133.660 Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
