package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorDuotoneIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 120.000 L 176.000 120.000 L 176.000 208.000 C 176.000 212.418 172.418 216.000 168.000 216.000 L 88.000 216.000 C 83.582 216.000 80.000 212.418 80.000 208.000 L 80.000 120.000 L 32.000 120.000 L 128.000 24.000 Z"),
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
                pathData = parseSvgPathData("M 229.660 114.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 26.340 114.340 C 24.049 116.628 23.364 120.071 24.603 123.062 C 25.842 126.053 28.762 128.003 32.000 128.000 L 72.000 128.000 L 72.000 208.000 C 72.000 216.837 79.163 224.000 88.000 224.000 L 168.000 224.000 C 176.837 224.000 184.000 216.837 184.000 208.000 L 184.000 128.000 L 224.000 128.000 C 227.238 128.003 230.158 126.053 231.397 123.062 C 232.636 120.071 231.951 116.628 229.660 114.340 ZM 176.000 112.000 C 171.582 112.000 168.000 115.582 168.000 120.000 L 168.000 208.000 L 88.000 208.000 L 88.000 120.000 C 88.000 115.582 84.418 112.000 80.000 112.000 L 51.310 112.000 L 128.000 35.310 L 204.690 112.000 Z"),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
