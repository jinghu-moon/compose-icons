package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorFillIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 68.530 40.000 C 62.916 40.024 57.718 42.967 54.810 47.770 L 9.140 123.880 C 7.617 126.415 7.617 129.585 9.140 132.120 L 54.810 208.230 L 54.810 208.230 C 57.717 213.034 62.915 215.978 68.530 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 165.660 146.340 C 168.786 149.466 168.786 154.534 165.660 157.660 C 162.534 160.786 157.466 160.786 154.340 157.660 L 136.000 139.310 L 117.650 157.660 C 114.524 160.783 109.458 160.781 106.335 157.655 C 103.212 154.529 103.214 149.463 106.340 146.340 L 124.690 128.000 L 106.340 109.660 C 103.214 106.537 103.212 101.471 106.335 98.345 C 109.458 95.219 114.524 95.217 117.650 98.340 L 136.000 116.690 L 154.340 98.340 C 157.466 95.214 162.534 95.214 165.660 98.340 C 168.786 101.466 168.786 106.534 165.660 109.660 L 147.310 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _backspace!!
    }

private var _backspace: ImageVector? = null
