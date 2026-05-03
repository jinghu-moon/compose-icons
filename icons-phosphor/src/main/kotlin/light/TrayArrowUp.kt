package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorLightIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 154.000 L 179.310 154.000 C 175.598 153.991 172.037 155.468 169.420 158.100 L 150.100 177.410 C 149.727 177.786 149.220 177.998 148.690 178.000 L 107.310 178.000 C 106.780 177.998 106.273 177.786 105.900 177.410 L 86.590 158.100 C 83.968 155.469 80.404 153.993 76.690 154.000 L 46.000 154.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 166.000 L 76.690 166.000 C 77.220 166.002 77.727 166.214 78.100 166.590 L 97.410 185.900 C 100.032 188.531 103.596 190.007 107.310 190.000 L 148.690 190.000 C 152.402 190.009 155.963 188.532 158.580 185.900 L 177.900 166.590 C 178.273 166.214 178.780 166.002 179.310 166.000 L 210.000 166.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 91.760 108.240 C 89.420 105.897 89.420 102.103 91.760 99.760 L 123.760 67.760 C 126.103 65.420 129.897 65.420 132.240 67.760 L 164.240 99.760 C 165.845 101.256 166.506 103.508 165.963 105.634 C 165.420 107.760 163.760 109.420 161.634 109.963 C 159.508 110.506 157.256 109.845 155.760 108.240 L 134.000 86.490 L 134.000 152.000 C 134.000 155.314 131.314 158.000 128.000 158.000 C 124.686 158.000 122.000 155.314 122.000 152.000 L 122.000 86.490 L 100.240 108.240 C 97.897 110.580 94.103 110.580 91.760 108.240 Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
