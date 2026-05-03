package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorBoldIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.000 116.390 L 226.530 111.050 C 219.289 69.372 186.671 36.722 145.000 29.440 L 139.610 9.000 C 138.230 3.719 133.459 0.034 128.000 0.034 C 122.541 0.034 117.770 3.719 116.390 9.000 L 111.050 29.470 C 69.348 36.721 36.691 69.378 29.440 111.080 L 9.000 116.390 C 3.719 117.770 0.034 122.541 0.034 128.000 C 0.034 133.459 3.719 138.230 9.000 139.610 L 29.440 145.000 C 36.691 186.702 69.348 219.359 111.050 226.610 L 116.390 247.000 C 117.770 252.281 122.541 255.966 128.000 255.966 C 133.459 255.966 138.230 252.281 139.610 247.000 L 145.000 226.560 C 186.667 219.296 219.296 186.667 226.560 145.000 L 247.000 139.610 C 252.281 138.230 255.966 133.459 255.966 128.000 C 255.966 122.541 252.281 117.770 247.000 116.390 ZM 200.120 104.160 L 161.810 94.160 L 151.810 55.850 C 174.636 63.436 192.550 81.339 200.150 104.160 ZM 117.320 100.380 L 128.000 59.540 L 138.650 100.380 L 128.000 111.000 ZM 128.000 145.000 L 138.650 155.650 L 128.000 196.460 L 117.350 155.620 ZM 100.380 117.380 L 111.000 128.000 L 100.350 138.650 L 59.540 128.000 ZM 155.620 138.680 L 145.000 128.000 L 155.650 117.350 L 196.460 128.000 ZM 104.160 55.880 L 94.160 94.190 L 55.850 104.190 C 63.436 81.364 81.339 63.450 104.160 55.850 ZM 55.850 151.880 L 94.160 161.880 L 104.160 200.190 C 81.337 192.588 63.433 174.670 55.850 151.840 ZM 151.850 200.190 L 161.850 161.880 L 200.160 151.880 C 192.553 174.681 174.649 192.567 151.840 200.150 Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
