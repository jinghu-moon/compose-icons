package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorLightIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 58.840 L 206.000 32.000 C 206.000 28.686 203.314 26.000 200.000 26.000 C 196.686 26.000 194.000 28.686 194.000 32.000 L 194.000 58.840 C 184.536 61.523 178.003 70.163 178.000 80.000 L 178.000 125.660 L 134.000 100.520 L 134.000 72.000 C 134.000 68.686 131.314 66.000 128.000 66.000 C 124.686 66.000 122.000 68.686 122.000 72.000 L 122.000 100.520 L 78.000 125.660 L 78.000 80.000 C 77.997 70.163 71.464 61.523 62.000 58.840 L 62.000 32.000 C 62.000 28.686 59.314 26.000 56.000 26.000 C 52.686 26.000 50.000 28.686 50.000 32.000 L 50.000 58.840 C 40.536 61.523 34.003 70.163 34.000 80.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 112.000 222.000 C 115.314 222.000 118.000 219.314 118.000 216.000 L 118.000 176.000 C 118.000 170.477 122.477 166.000 128.000 166.000 C 133.523 166.000 138.000 170.477 138.000 176.000 L 138.000 216.000 C 138.000 219.314 140.686 222.000 144.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 80.000 C 221.997 70.163 215.464 61.523 206.000 58.840 ZM 200.000 70.000 C 205.523 70.000 210.000 74.477 210.000 80.000 L 210.000 106.000 L 190.000 106.000 L 190.000 80.000 C 190.000 74.477 194.477 70.000 200.000 70.000 ZM 56.000 70.000 C 61.523 70.000 66.000 74.477 66.000 80.000 L 66.000 106.000 L 46.000 106.000 L 46.000 80.000 C 46.000 74.477 50.477 70.000 56.000 70.000 ZM 46.000 118.000 L 66.000 118.000 L 66.000 210.000 L 46.000 210.000 ZM 128.000 154.000 C 115.850 154.000 106.000 163.850 106.000 176.000 L 106.000 210.000 L 78.000 210.000 L 78.000 139.480 L 128.000 110.910 L 178.000 139.480 L 178.000 210.000 L 150.000 210.000 L 150.000 176.000 C 150.000 163.850 140.150 154.000 128.000 154.000 ZM 190.000 210.000 L 190.000 118.000 L 210.000 118.000 L 210.000 210.000 Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
