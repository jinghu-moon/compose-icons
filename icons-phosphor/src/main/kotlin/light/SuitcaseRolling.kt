package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorLightIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 102.000 88.000 L 102.000 184.000 C 102.000 187.314 99.314 190.000 96.000 190.000 C 92.686 190.000 90.000 187.314 90.000 184.000 L 90.000 88.000 C 90.000 84.686 92.686 82.000 96.000 82.000 C 99.314 82.000 102.000 84.686 102.000 88.000 ZM 128.000 82.000 C 124.686 82.000 122.000 84.686 122.000 88.000 L 122.000 184.000 C 122.000 187.314 124.686 190.000 128.000 190.000 C 131.314 190.000 134.000 187.314 134.000 184.000 L 134.000 88.000 C 134.000 84.686 131.314 82.000 128.000 82.000 ZM 160.000 82.000 C 156.686 82.000 154.000 84.686 154.000 88.000 L 154.000 184.000 C 154.000 187.314 156.686 190.000 160.000 190.000 C 163.314 190.000 166.000 187.314 166.000 184.000 L 166.000 88.000 C 166.000 84.686 163.314 82.000 160.000 82.000 ZM 206.000 64.000 L 206.000 208.000 C 206.000 215.732 199.732 222.000 192.000 222.000 L 174.000 222.000 L 174.000 240.000 C 174.000 243.314 171.314 246.000 168.000 246.000 C 164.686 246.000 162.000 243.314 162.000 240.000 L 162.000 222.000 L 94.000 222.000 L 94.000 240.000 C 94.000 243.314 91.314 246.000 88.000 246.000 C 84.686 246.000 82.000 243.314 82.000 240.000 L 82.000 222.000 L 64.000 222.000 C 56.268 222.000 50.000 215.732 50.000 208.000 L 50.000 64.000 C 50.000 56.268 56.268 50.000 64.000 50.000 L 90.000 50.000 L 90.000 24.000 C 90.000 11.850 99.850 2.000 112.000 2.000 L 144.000 2.000 C 156.150 2.000 166.000 11.850 166.000 24.000 L 166.000 50.000 L 192.000 50.000 C 199.732 50.000 206.000 56.268 206.000 64.000 ZM 102.000 50.000 L 154.000 50.000 L 154.000 24.000 C 154.000 18.477 149.523 14.000 144.000 14.000 L 112.000 14.000 C 106.477 14.000 102.000 18.477 102.000 24.000 ZM 194.000 64.000 C 194.000 62.895 193.105 62.000 192.000 62.000 L 64.000 62.000 C 62.895 62.000 62.000 62.895 62.000 64.000 L 62.000 208.000 C 62.000 209.105 62.895 210.000 64.000 210.000 L 192.000 210.000 C 193.105 210.000 194.000 209.105 194.000 208.000 Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
