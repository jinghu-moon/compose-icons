package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorBoldIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 68.000 60.000 C 30.445 60.000 0.000 90.445 0.000 128.000 C 0.000 165.555 30.445 196.000 68.000 196.000 C 105.555 196.000 136.000 165.555 136.000 128.000 C 135.961 90.461 105.539 60.039 68.000 60.000 ZM 68.000 172.000 C 43.699 172.000 24.000 152.301 24.000 128.000 C 24.000 103.699 43.699 84.000 68.000 84.000 C 92.301 84.000 112.000 103.699 112.000 128.000 C 111.972 152.289 92.289 171.972 68.000 172.000 ZM 184.000 60.000 C 160.370 60.000 148.000 94.210 148.000 128.000 C 148.000 161.790 160.370 196.000 184.000 196.000 C 207.630 196.000 220.000 161.790 220.000 128.000 C 220.000 94.210 207.630 60.000 184.000 60.000 ZM 184.000 171.870 C 180.260 169.710 172.000 154.780 172.000 128.000 C 172.000 101.220 180.260 86.290 184.000 84.130 C 187.740 86.290 196.000 101.220 196.000 128.000 C 196.000 154.780 187.740 169.710 184.000 171.870 ZM 256.000 72.000 L 256.000 184.000 C 256.000 190.627 250.627 196.000 244.000 196.000 C 237.373 196.000 232.000 190.627 232.000 184.000 L 232.000 72.000 C 232.000 65.373 237.373 60.000 244.000 60.000 C 250.627 60.000 256.000 65.373 256.000 72.000 Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
