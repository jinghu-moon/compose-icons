package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorDuotoneIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 200.000 C 224.000 204.418 220.418 208.000 216.000 208.000 L 68.530 208.000 C 65.721 208.001 63.117 206.528 61.670 204.120 L 16.000 128.000 L 61.670 51.880 C 63.117 49.472 65.721 47.999 68.530 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 216.000 40.000 L 68.530 40.000 C 62.914 40.016 57.713 42.962 54.810 47.770 L 9.140 123.880 C 7.617 126.415 7.617 129.585 9.140 132.120 L 54.810 208.230 C 57.713 213.038 62.914 215.984 68.530 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 61.670 204.120 L 68.530 200.000 L 68.530 200.000 ZM 216.000 200.000 L 68.530 200.000 L 25.330 128.000 L 68.530 56.000 L 216.000 56.000 ZM 106.340 146.340 L 124.690 128.000 L 106.340 109.660 C 103.214 106.534 103.214 101.466 106.340 98.340 C 109.466 95.214 114.534 95.214 117.660 98.340 L 136.000 116.690 L 154.340 98.340 C 157.466 95.214 162.534 95.214 165.660 98.340 C 168.786 101.466 168.786 106.534 165.660 109.660 L 147.310 128.000 L 165.660 146.340 C 168.786 149.466 168.786 154.534 165.660 157.660 C 162.534 160.786 157.466 160.786 154.340 157.660 L 136.000 139.310 L 117.660 157.660 C 114.534 160.786 109.466 160.786 106.340 157.660 C 103.214 154.534 103.214 149.466 106.340 146.340 Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
