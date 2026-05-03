package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorFillIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 120.000 C 172.000 144.301 152.301 164.000 128.000 164.000 C 103.699 164.000 84.000 144.301 84.000 120.000 C 84.000 95.699 103.699 76.000 128.000 76.000 C 152.289 76.028 171.972 95.711 172.000 120.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 215.974 104.067 206.212 81.175 188.958 64.589 C 171.705 48.003 148.445 39.152 124.530 40.070 C 77.430 41.890 39.870 81.120 40.000 128.250 C 40.045 149.705 47.958 170.399 62.240 186.410 C 68.056 177.974 75.444 170.739 84.000 165.100 C 85.499 164.110 87.475 164.241 88.830 165.420 C 111.303 184.858 144.637 184.858 167.110 165.420 C 168.465 164.241 170.441 164.110 171.940 165.100 C 180.506 170.736 187.905 177.971 193.730 186.410 C 208.082 170.340 216.011 149.546 216.000 128.000 Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
