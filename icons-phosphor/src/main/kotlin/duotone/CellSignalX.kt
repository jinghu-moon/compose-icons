package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorDuotoneIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 40.000 L 200.000 160.000 L 154.340 205.660 C 152.841 207.157 150.809 207.999 148.690 208.000 L 32.000 208.000 C 28.762 208.003 25.842 206.053 24.603 203.062 C 23.364 200.071 24.049 196.628 26.340 194.340 L 186.340 34.340 C 188.628 32.049 192.071 31.364 195.062 32.603 C 198.053 33.842 200.003 36.762 200.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 213.660 194.340 C 216.786 197.466 216.786 202.534 213.660 205.660 C 210.534 208.786 205.466 208.786 202.340 205.660 L 184.000 187.310 L 165.650 205.660 C 162.524 208.783 157.458 208.781 154.335 205.655 C 151.212 202.529 151.214 197.463 154.340 194.340 L 172.680 176.000 L 154.340 157.650 C 151.352 154.505 151.415 149.551 154.483 146.483 C 157.551 143.415 162.505 143.352 165.650 146.340 L 184.000 164.680 L 202.340 146.340 C 205.463 143.214 210.529 143.212 213.655 146.335 C 216.781 149.458 216.783 154.524 213.660 157.650 L 195.310 176.000 ZM 120.000 200.000 L 32.000 200.000 L 192.000 40.000 L 192.000 112.000 C 192.000 116.418 195.582 120.000 200.000 120.000 C 204.418 120.000 208.000 116.418 208.000 112.000 L 208.000 40.000 C 208.001 33.529 204.104 27.695 198.127 25.217 C 192.149 22.739 185.267 24.106 180.690 28.680 L 20.690 188.680 C 16.110 193.255 14.738 200.139 17.214 206.120 C 19.690 212.101 25.527 216.001 32.000 216.000 L 120.000 216.000 C 124.418 216.000 128.000 212.418 128.000 208.000 C 128.000 203.582 124.418 200.000 120.000 200.000 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
