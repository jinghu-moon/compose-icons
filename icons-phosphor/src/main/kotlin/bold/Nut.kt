package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorBoldIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 76.000 128.000 C 76.000 156.719 99.281 180.000 128.000 180.000 C 156.719 180.000 180.000 156.719 180.000 128.000 C 180.000 99.281 156.719 76.000 128.000 76.000 C 99.293 76.028 76.028 99.293 76.000 128.000 ZM 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 ZM 225.600 62.640 L 137.600 14.470 C 131.623 11.180 124.377 11.180 118.400 14.470 L 30.400 62.640 C 23.986 66.149 19.998 72.879 20.000 80.190 L 20.000 175.810 C 19.998 183.121 23.986 189.851 30.400 193.360 L 118.400 241.530 C 124.376 244.824 131.624 244.824 137.600 241.530 L 225.600 193.360 L 225.600 193.360 C 232.014 189.851 236.002 183.121 236.000 175.810 L 236.000 80.190 C 236.002 72.879 232.014 66.149 225.600 62.640 ZM 212.000 173.440 L 128.000 219.440 L 44.000 173.440 L 44.000 82.560 L 128.000 36.560 L 212.000 82.560 Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
