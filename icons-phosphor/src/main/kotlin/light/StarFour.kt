package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorLightIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.810 114.890 L 164.500 91.500 L 141.110 27.190 C 139.105 21.677 133.866 18.008 128.000 18.008 C 122.134 18.008 116.895 21.677 114.890 27.190 L 91.500 91.500 L 27.190 114.890 C 21.677 116.895 18.008 122.134 18.008 128.000 C 18.008 133.866 21.677 139.105 27.190 141.110 L 91.500 164.500 L 114.890 228.810 C 116.895 234.323 122.134 237.992 128.000 237.992 C 133.866 237.992 139.105 234.323 141.110 228.810 L 164.500 164.500 L 228.810 141.110 C 234.323 139.105 237.992 133.866 237.992 128.000 C 237.992 122.134 234.323 116.895 228.810 114.890 ZM 224.710 129.890 L 157.770 154.230 C 156.101 154.836 154.786 156.151 154.180 157.820 L 129.840 224.760 C 129.526 225.498 128.802 225.976 128.000 225.976 C 127.198 225.976 126.474 225.498 126.160 224.760 L 101.820 157.820 C 101.214 156.151 99.899 154.836 98.230 154.230 L 31.290 129.840 C 30.552 129.526 30.074 128.802 30.074 128.000 C 30.074 127.198 30.552 126.474 31.290 126.160 L 98.230 101.820 C 99.899 101.214 101.214 99.899 101.820 98.230 L 126.160 31.290 C 126.474 30.552 127.198 30.074 128.000 30.074 C 128.802 30.074 129.526 30.552 129.840 31.290 L 154.180 98.230 C 154.786 99.899 156.101 101.214 157.770 101.820 L 224.710 126.160 C 225.448 126.474 225.926 127.198 225.926 128.000 C 225.926 128.802 225.448 129.526 224.710 129.840 Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
