package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorLightIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 66.000 C 37.758 66.000 10.000 93.758 10.000 128.000 C 10.000 162.242 37.758 190.000 72.000 190.000 C 106.242 190.000 134.000 162.242 134.000 128.000 C 133.961 93.774 106.226 66.039 72.000 66.000 ZM 72.000 178.000 C 44.386 178.000 22.000 155.614 22.000 128.000 C 22.000 100.386 44.386 78.000 72.000 78.000 C 99.614 78.000 122.000 100.386 122.000 128.000 C 121.967 155.601 99.601 177.967 72.000 178.000 ZM 184.000 66.000 C 166.900 66.000 154.000 92.650 154.000 128.000 C 154.000 163.350 166.900 190.000 184.000 190.000 C 201.100 190.000 214.000 163.350 214.000 128.000 C 214.000 92.650 201.100 66.000 184.000 66.000 ZM 184.000 178.000 C 176.660 178.000 166.000 158.520 166.000 128.000 C 166.000 97.480 176.660 78.000 184.000 78.000 C 191.340 78.000 202.000 97.480 202.000 128.000 C 202.000 158.520 191.340 178.000 184.000 178.000 ZM 246.000 72.000 L 246.000 184.000 C 246.000 187.314 243.314 190.000 240.000 190.000 C 236.686 190.000 234.000 187.314 234.000 184.000 L 234.000 72.000 C 234.000 68.686 236.686 66.000 240.000 66.000 C 243.314 66.000 246.000 68.686 246.000 72.000 Z"),
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
