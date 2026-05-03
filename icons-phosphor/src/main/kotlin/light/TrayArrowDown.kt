package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) return _trayArrowDown!!
        _trayArrowDown = phosphorLightIcon(
            name = "TrayArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 154.000 L 179.310 154.000 C 175.596 153.993 172.032 155.469 169.410 158.100 L 150.100 177.410 C 149.727 177.786 149.220 177.998 148.690 178.000 L 107.310 178.000 C 106.782 178.000 106.275 177.792 105.900 177.420 L 86.590 158.100 C 83.968 155.469 80.404 153.993 76.690 154.000 L 46.000 154.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 166.000 L 76.690 166.000 C 77.218 166.000 77.725 166.208 78.100 166.580 L 97.410 185.900 C 100.032 188.531 103.596 190.007 107.310 190.000 L 148.690 190.000 C 152.404 190.007 155.968 188.531 158.590 185.900 L 177.900 166.590 C 178.273 166.214 178.780 166.002 179.310 166.000 L 210.000 166.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 91.760 124.240 C 89.557 121.876 89.622 118.192 91.907 115.907 C 94.192 113.622 97.876 113.557 100.240 115.760 L 122.000 137.510 L 122.000 72.000 C 122.000 68.686 124.686 66.000 128.000 66.000 C 131.314 66.000 134.000 68.686 134.000 72.000 L 134.000 137.510 L 155.760 115.760 C 158.124 113.557 161.808 113.622 164.093 115.907 C 166.378 118.192 166.443 121.876 164.240 124.240 L 132.240 156.240 C 129.897 158.580 126.103 158.580 123.760 156.240 Z"),
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
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null
