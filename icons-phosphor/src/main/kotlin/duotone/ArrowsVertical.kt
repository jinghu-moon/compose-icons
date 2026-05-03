package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorDuotoneIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 56.000 L 160.000 200.000 L 128.000 232.000 L 96.000 200.000 L 96.000 56.000 L 128.000 24.000 Z"),
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
                pathData = parseSvgPathData("M 165.660 194.340 C 167.162 195.841 168.006 197.877 168.006 200.000 C 168.006 202.123 167.162 204.159 165.660 205.660 L 133.660 237.660 C 132.159 239.162 130.123 240.006 128.000 240.006 C 125.877 240.006 123.841 239.162 122.340 237.660 L 90.340 205.660 C 87.214 202.534 87.214 197.466 90.340 194.340 C 93.466 191.214 98.534 191.214 101.660 194.340 L 120.000 212.690 L 120.000 43.310 L 101.660 61.660 C 98.534 64.786 93.466 64.786 90.340 61.660 C 87.214 58.534 87.214 53.466 90.340 50.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 165.660 50.340 C 168.786 53.466 168.786 58.534 165.660 61.660 C 162.534 64.786 157.466 64.786 154.340 61.660 L 136.000 43.310 L 136.000 212.690 L 154.340 194.340 C 155.841 192.838 157.877 191.994 160.000 191.994 C 162.123 191.994 164.159 192.838 165.660 194.340 Z"),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
