package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorBoldIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 72.000 C 244.000 78.627 238.627 84.000 232.000 84.000 L 100.000 84.000 L 100.000 187.000 L 127.510 159.480 C 132.204 154.786 139.816 154.786 144.510 159.480 C 149.204 164.174 149.204 171.786 144.510 176.480 L 96.510 224.480 C 94.258 226.739 91.200 228.009 88.010 228.009 C 84.820 228.009 81.762 226.739 79.510 224.480 L 31.510 176.480 C 26.816 171.786 26.816 164.174 31.510 159.480 C 36.204 154.786 43.816 154.786 48.510 159.480 L 76.000 187.000 L 76.000 72.000 C 76.000 65.373 81.373 60.000 88.000 60.000 L 232.000 60.000 C 238.627 60.000 244.000 65.373 244.000 72.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
