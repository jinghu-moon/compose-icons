package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorLightIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.200 118.180 L 184.130 148.250 C 181.786 150.594 177.984 150.594 175.640 148.250 C 173.296 145.906 173.296 142.104 175.640 139.760 L 205.720 109.690 C 222.126 93.284 222.126 66.686 205.720 50.280 C 189.314 33.874 162.716 33.874 146.310 50.280 L 116.240 80.340 C 113.896 82.684 110.094 82.684 107.750 80.340 C 105.406 77.996 105.406 74.194 107.750 71.850 L 137.820 41.850 C 158.912 20.758 193.108 20.758 214.200 41.850 C 235.292 62.942 235.292 97.138 214.200 118.230 ZM 139.760 175.640 L 109.690 205.720 C 93.284 222.126 66.686 222.126 50.280 205.720 C 33.874 189.314 33.874 162.716 50.280 146.310 L 80.340 116.240 C 82.684 113.896 82.684 110.094 80.340 107.750 C 77.996 105.406 74.194 105.406 71.850 107.750 L 41.850 137.820 C 20.755 158.912 20.753 193.110 41.845 214.205 C 62.937 235.300 97.135 235.302 118.230 214.210 L 148.300 184.130 C 150.644 181.786 150.644 177.984 148.300 175.640 C 145.956 173.296 142.154 173.296 139.810 175.640 Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
