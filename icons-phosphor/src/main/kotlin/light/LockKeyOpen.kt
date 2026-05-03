package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorLightIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 82.000 L 94.000 82.000 L 94.000 56.000 C 94.000 37.222 109.222 22.000 128.000 22.000 C 144.300 22.000 159.000 33.690 162.120 49.190 C 162.822 52.390 165.960 54.435 169.171 53.785 C 172.381 53.135 174.478 50.031 173.880 46.810 C 169.550 25.480 150.260 10.000 128.000 10.000 C 102.609 10.033 82.033 30.609 82.000 56.000 L 82.000 82.000 L 48.000 82.000 C 40.268 82.000 34.000 88.268 34.000 96.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 96.000 C 222.000 88.268 215.732 82.000 208.000 82.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 96.000 C 46.000 94.895 46.895 94.000 48.000 94.000 L 208.000 94.000 C 209.105 94.000 210.000 94.895 210.000 96.000 ZM 128.000 114.000 C 114.822 114.017 103.742 123.891 102.211 136.979 C 100.679 150.067 109.182 162.232 122.000 165.290 L 122.000 184.000 C 122.000 187.314 124.686 190.000 128.000 190.000 C 131.314 190.000 134.000 187.314 134.000 184.000 L 134.000 165.290 C 146.818 162.232 155.321 150.067 153.789 136.979 C 152.258 123.891 141.178 114.017 128.000 114.000 ZM 128.000 154.000 C 120.268 154.000 114.000 147.732 114.000 140.000 C 114.000 132.268 120.268 126.000 128.000 126.000 C 135.732 126.000 142.000 132.268 142.000 140.000 C 142.000 147.732 135.732 154.000 128.000 154.000 Z"),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
