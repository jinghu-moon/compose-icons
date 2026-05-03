package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorLightIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 53.390 214.000 C 55.707 213.999 57.817 212.664 58.810 210.570 C 67.080 193.104 84.675 181.968 104.000 181.968 C 123.325 181.968 140.920 193.104 149.190 210.570 C 150.183 212.664 152.293 213.999 154.610 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 78.000 144.000 C 78.000 129.641 89.641 118.000 104.000 118.000 C 118.359 118.000 130.000 129.641 130.000 144.000 C 130.000 158.359 118.359 170.000 104.000 170.000 C 89.641 170.000 78.000 158.359 78.000 144.000 ZM 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 L 158.270 202.000 C 151.274 189.442 140.153 179.689 126.790 174.390 C 139.880 164.579 145.222 147.492 140.052 131.972 C 134.881 116.452 120.359 105.983 104.000 105.983 C 87.641 105.983 73.119 116.452 67.948 131.972 C 62.778 147.492 68.120 164.579 81.210 174.390 C 67.847 179.689 56.726 189.442 49.730 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 198.000 80.000 L 198.000 176.000 C 198.000 179.314 195.314 182.000 192.000 182.000 L 176.000 182.000 C 172.686 182.000 170.000 179.314 170.000 176.000 C 170.000 172.686 172.686 170.000 176.000 170.000 L 186.000 170.000 L 186.000 86.000 L 70.000 86.000 L 70.000 96.000 C 70.000 99.314 67.314 102.000 64.000 102.000 C 60.686 102.000 58.000 99.314 58.000 96.000 L 58.000 80.000 C 58.000 76.686 60.686 74.000 64.000 74.000 L 192.000 74.000 C 195.314 74.000 198.000 76.686 198.000 80.000 Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
