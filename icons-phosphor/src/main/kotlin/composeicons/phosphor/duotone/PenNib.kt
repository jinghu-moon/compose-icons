package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorDuotoneIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 48 68.32 70.38c-2.673 1.003-4.609 3.354-5.08 6.17L40 216 179.45 192.76c2.816-.471 5.167-2.407 6.17-5.08L208 128ZM124 152c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M248 92.68c.014-4.246-1.676-8.32-4.69-11.31L174.63 12.68C171.629 9.679 167.559 7.992 163.315 7.992c-4.244 0-8.314 1.686-11.315 4.688L123.57 41.11l-58 21.77c-5.365 2.001-9.258 6.706-10.22 12.35L32.11 214.68c-.388 2.32 .265 4.694 1.785 6.489 1.52 1.795 3.753 2.831 6.105 2.831 .442-.002 .884-.039 1.32-.11L180.76 200.65c5.638-.941 10.345-4.817 12.35-10.17l21.77-58L243.31 104c3.016-2.993 4.705-7.071 4.69-11.32ZM178.13 184.87 63.32 204l47.37-47.37c12.23 6.61 27.457 3.245 35.764-7.901 8.307-11.147 7.178-26.7-2.652-36.53-9.83-9.83-25.384-10.959-36.53-2.652-11.147 8.307-14.511 23.534-7.901 35.764L52 192.7 71.13 77.86 126 57.29 198.7 130ZM112 132c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM208 116.68 139.31 48l24-24L232 92.68Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
