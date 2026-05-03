package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorDuotoneIcon(
            name = "XSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 165.660 101.660 L 139.310 128.000 L 165.660 154.340 C 168.786 157.466 168.786 162.534 165.660 165.660 C 162.534 168.786 157.466 168.786 154.340 165.660 L 128.000 139.310 L 101.660 165.660 C 98.534 168.786 93.466 168.786 90.340 165.660 C 87.214 162.534 87.214 157.466 90.340 154.340 L 116.690 128.000 L 90.340 101.660 C 87.214 98.534 87.214 93.466 90.340 90.340 C 93.466 87.214 98.534 87.214 101.660 90.340 L 128.000 116.690 L 154.340 90.340 C 157.466 87.214 162.534 87.214 165.660 90.340 C 168.786 93.466 168.786 98.534 165.660 101.660 Z"),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null
