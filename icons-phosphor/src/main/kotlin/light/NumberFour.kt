package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorLightIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 162.000 L 166.000 162.000 L 166.000 48.000 C 166.003 45.449 164.393 43.175 161.986 42.330 C 159.579 41.486 156.901 42.256 155.310 44.250 L 59.310 164.250 C 57.868 166.052 57.586 168.521 58.587 170.601 C 59.587 172.681 61.692 174.002 64.000 174.000 L 154.000 174.000 L 154.000 208.000 C 154.000 211.314 156.686 214.000 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 L 166.000 174.000 L 184.000 174.000 C 187.314 174.000 190.000 171.314 190.000 168.000 C 190.000 164.686 187.314 162.000 184.000 162.000 ZM 154.000 162.000 L 76.480 162.000 L 154.000 65.100 Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
