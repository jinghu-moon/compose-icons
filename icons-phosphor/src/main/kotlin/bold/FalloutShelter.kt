package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorBoldIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 194.000 138.660 L 170.000 174.660 C 167.777 178.012 164.022 180.027 160.000 180.027 C 155.978 180.027 152.223 178.012 150.000 174.660 L 128.000 141.660 L 106.000 174.660 C 103.777 178.012 100.022 180.027 96.000 180.027 C 91.978 180.027 88.223 178.012 86.000 174.660 L 62.000 138.660 C 59.542 134.975 59.313 130.236 61.405 126.332 C 63.498 122.428 67.570 119.993 72.000 120.000 L 113.580 120.000 L 94.000 90.660 C 91.542 86.975 91.313 82.236 93.405 78.332 C 95.498 74.428 99.570 71.993 104.000 72.000 L 152.000 72.000 C 156.430 71.993 160.502 74.428 162.595 78.332 C 164.687 82.236 164.458 86.975 162.000 90.660 L 142.420 120.000 L 184.000 120.000 C 188.430 119.993 192.502 122.428 194.595 126.332 C 196.687 130.236 196.458 134.975 194.000 138.660 Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
