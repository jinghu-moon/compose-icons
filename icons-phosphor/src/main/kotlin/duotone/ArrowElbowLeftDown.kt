package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorDuotoneIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 136.000 168.000 L 88.000 216.000 L 40.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 232.000 64.000 L 88.000 64.000 C 83.582 64.000 80.000 67.582 80.000 72.000 L 80.000 160.000 L 40.000 160.000 C 36.762 159.997 33.842 161.947 32.603 164.938 C 31.364 167.929 32.049 171.372 34.340 173.660 L 82.340 221.660 C 83.841 223.162 85.877 224.006 88.000 224.006 C 90.123 224.006 92.159 223.162 93.660 221.660 L 141.660 173.660 C 143.951 171.372 144.636 167.929 143.397 164.938 C 142.158 161.947 139.238 159.997 136.000 160.000 L 96.000 160.000 L 96.000 80.000 L 232.000 80.000 C 236.418 80.000 240.000 76.418 240.000 72.000 C 240.000 67.582 236.418 64.000 232.000 64.000 ZM 88.000 204.690 L 59.310 176.000 L 116.690 176.000 Z"),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
