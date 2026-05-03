package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorDuotoneIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 112.000 L 128.000 184.000 L 56.000 112.000 Z"),
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
                pathData = parseSvgPathData("M 122.340 189.660 C 123.841 191.162 125.877 192.006 128.000 192.006 C 130.123 192.006 132.159 191.162 133.660 189.660 L 205.660 117.660 C 207.951 115.372 208.636 111.929 207.397 108.938 C 206.158 105.947 203.238 103.997 200.000 104.000 L 136.000 104.000 L 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 104.000 L 56.000 104.000 C 52.762 103.997 49.842 105.947 48.603 108.938 C 47.364 111.929 48.049 115.372 50.340 117.660 ZM 180.690 120.000 L 128.000 172.690 L 75.310 120.000 ZM 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 Z"),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
