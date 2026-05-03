package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorBoldIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 88.000 L 212.000 176.000 C 212.000 182.627 206.627 188.000 200.000 188.000 C 193.373 188.000 188.000 182.627 188.000 176.000 L 188.000 88.000 C 188.000 63.699 168.301 44.000 144.000 44.000 C 119.699 44.000 100.000 63.699 100.000 88.000 L 100.000 195.000 L 127.510 167.480 C 132.204 162.786 139.816 162.786 144.510 167.480 C 149.204 172.174 149.204 179.786 144.510 184.480 L 96.510 232.480 C 94.258 234.739 91.200 236.009 88.010 236.009 C 84.820 236.009 81.762 234.739 79.510 232.480 L 31.510 184.480 C 26.816 179.786 26.816 172.174 31.510 167.480 C 36.204 162.786 43.816 162.786 48.510 167.480 L 76.000 195.000 L 76.000 88.000 C 76.000 50.445 106.445 20.000 144.000 20.000 C 181.555 20.000 212.000 50.445 212.000 88.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
