package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorDuotoneIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 88.000 L 192.000 192.000 L 88.000 192.000 Z"),
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
                pathData = parseSvgPathData("M 195.060 80.610 C 192.071 79.370 188.629 80.053 186.340 82.340 L 140.000 128.690 L 69.660 58.340 C 66.534 55.214 61.466 55.214 58.340 58.340 C 55.214 61.466 55.214 66.534 58.340 69.660 L 128.690 140.000 L 82.340 186.340 C 80.049 188.628 79.364 192.071 80.603 195.062 C 81.842 198.053 84.762 200.003 88.000 200.000 L 192.000 200.000 C 196.418 200.000 200.000 196.418 200.000 192.000 L 200.000 88.000 C 199.999 84.764 198.050 81.848 195.060 80.610 ZM 184.000 184.000 L 107.310 184.000 L 145.650 145.660 L 145.650 145.660 L 184.000 107.310 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
