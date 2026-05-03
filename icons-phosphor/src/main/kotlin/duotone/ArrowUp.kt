package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorDuotoneIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 112.000 L 56.000 112.000 L 128.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 205.660 106.340 L 133.660 34.340 C 132.159 32.838 130.123 31.994 128.000 31.994 C 125.877 31.994 123.841 32.838 122.340 34.340 L 50.340 106.340 C 48.049 108.628 47.364 112.071 48.603 115.062 C 49.842 118.053 52.762 120.003 56.000 120.000 L 120.000 120.000 L 120.000 216.000 C 120.000 220.418 123.582 224.000 128.000 224.000 C 132.418 224.000 136.000 220.418 136.000 216.000 L 136.000 120.000 L 200.000 120.000 C 203.238 120.003 206.158 118.053 207.397 115.062 C 208.636 112.071 207.951 108.628 205.660 106.340 ZM 75.310 104.000 L 128.000 51.310 L 180.690 104.000 Z"),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
