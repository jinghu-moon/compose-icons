package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorDuotoneIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 176.000 L 168.000 224.000 L 168.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 221.660 170.340 L 173.660 122.340 C 171.372 120.049 167.929 119.364 164.938 120.603 C 161.947 121.842 159.997 124.762 160.000 128.000 L 160.000 168.000 L 80.000 168.000 L 80.000 32.000 C 80.000 27.582 76.418 24.000 72.000 24.000 C 67.582 24.000 64.000 27.582 64.000 32.000 L 64.000 176.000 C 64.000 180.418 67.582 184.000 72.000 184.000 L 160.000 184.000 L 160.000 224.000 C 159.997 227.238 161.947 230.158 164.938 231.397 C 167.929 232.636 171.372 231.951 173.660 229.660 L 221.660 181.660 C 223.162 180.159 224.006 178.123 224.006 176.000 C 224.006 173.877 223.162 171.841 221.660 170.340 ZM 176.000 204.690 L 176.000 147.310 L 204.690 176.000 Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
