package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorDuotoneIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 152.000 L 176.000 200.000 L 176.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 229.660 146.340 L 181.660 98.340 C 179.372 96.049 175.929 95.364 172.938 96.603 C 169.947 97.842 167.997 100.762 168.000 104.000 L 168.000 144.000 L 128.000 144.000 C 79.422 143.945 40.055 104.578 40.000 56.000 C 40.000 51.582 36.418 48.000 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 C 24.061 113.412 70.588 159.939 128.000 160.000 L 168.000 160.000 L 168.000 200.000 C 167.997 203.238 169.947 206.158 172.938 207.397 C 175.929 208.636 179.372 207.951 181.660 205.660 L 229.660 157.660 C 231.162 156.159 232.006 154.123 232.006 152.000 C 232.006 149.877 231.162 147.841 229.660 146.340 ZM 184.000 180.690 L 184.000 123.310 L 212.690 152.000 Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
