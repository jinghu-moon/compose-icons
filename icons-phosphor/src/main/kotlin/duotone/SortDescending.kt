package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorDuotoneIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 88.000 L 224.000 176.000 C 224.000 184.837 216.837 192.000 208.000 192.000 L 48.000 192.000 L 48.000 64.000 L 200.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 40.000 128.000 C 40.000 123.582 43.582 120.000 48.000 120.000 L 120.000 120.000 C 124.418 120.000 128.000 123.582 128.000 128.000 C 128.000 132.418 124.418 136.000 120.000 136.000 L 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 ZM 48.000 72.000 L 104.000 72.000 C 108.418 72.000 112.000 68.418 112.000 64.000 C 112.000 59.582 108.418 56.000 104.000 56.000 L 48.000 56.000 C 43.582 56.000 40.000 59.582 40.000 64.000 C 40.000 68.418 43.582 72.000 48.000 72.000 ZM 184.000 184.000 L 48.000 184.000 C 43.582 184.000 40.000 187.582 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 L 184.000 200.000 C 188.418 200.000 192.000 196.418 192.000 192.000 C 192.000 187.582 188.418 184.000 184.000 184.000 ZM 229.660 82.340 L 189.660 42.340 C 188.159 40.838 186.123 39.994 184.000 39.994 C 181.877 39.994 179.841 40.838 178.340 42.340 L 138.340 82.340 C 135.214 85.466 135.214 90.534 138.340 93.660 C 141.466 96.786 146.534 96.786 149.660 93.660 L 176.000 67.310 L 176.000 144.000 C 176.000 148.418 179.582 152.000 184.000 152.000 C 188.418 152.000 192.000 148.418 192.000 144.000 L 192.000 67.310 L 218.340 93.660 C 221.466 96.786 226.534 96.786 229.660 93.660 C 232.786 90.534 232.786 85.466 229.660 82.340 Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
