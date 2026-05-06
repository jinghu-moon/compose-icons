package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorFillIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.31 81.36 174.63 12.68C171.629 9.679 167.559 7.992 163.315 7.992c-4.244 0-8.314 1.686-11.315 4.688L123.56 41.12l-58 21.76c-5.364 1.996-9.254 6.705-10.2 12.35L34.59 199.83c-.286 1.714 .568 3.417 2.113 4.213 1.545 .796 3.427 .504 4.657-.723l57-57c-1.806-3.757-2.596-7.922-2.29-12.08 .763-10.499 8.279-19.276 18.537-21.644 10.257-2.369 20.86 2.223 26.15 11.325 5.29 9.101 4.031 20.588-3.104 28.327-7.135 7.74-18.482 9.926-27.982 5.392l-57 57c-1.227 1.231-1.519 3.113-.723 4.657 .796 1.545 2.499 2.398 4.213 2.113L180.77 200.64c5.635-.939 10.342-4.811 12.35-10.16l21.77-58.07L243.31 104c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM208 116.68 139.32 48l24-24L232 92.68Z"),
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
