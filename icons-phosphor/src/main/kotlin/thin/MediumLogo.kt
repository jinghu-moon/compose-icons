package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorThinIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 68.000 C 38.863 68.000 12.000 94.863 12.000 128.000 C 12.000 161.137 38.863 188.000 72.000 188.000 C 105.137 188.000 132.000 161.137 132.000 128.000 C 131.961 94.879 105.121 68.039 72.000 68.000 ZM 72.000 180.000 C 43.281 180.000 20.000 156.719 20.000 128.000 C 20.000 99.281 43.281 76.000 72.000 76.000 C 100.719 76.000 124.000 99.281 124.000 128.000 C 123.967 156.705 100.705 179.967 72.000 180.000 ZM 184.000 68.000 C 168.000 68.000 156.000 93.790 156.000 128.000 C 156.000 162.210 168.000 188.000 184.000 188.000 C 200.000 188.000 212.000 162.210 212.000 128.000 C 212.000 93.790 200.000 68.000 184.000 68.000 ZM 184.000 180.000 C 174.540 180.000 164.000 158.640 164.000 128.000 C 164.000 97.360 174.540 76.000 184.000 76.000 C 193.460 76.000 204.000 97.360 204.000 128.000 C 204.000 158.640 193.460 180.000 184.000 180.000 ZM 244.000 72.000 L 244.000 184.000 C 244.000 186.209 242.209 188.000 240.000 188.000 C 237.791 188.000 236.000 186.209 236.000 184.000 L 236.000 72.000 C 236.000 69.791 237.791 68.000 240.000 68.000 C 242.209 68.000 244.000 69.791 244.000 72.000 Z"),
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
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
