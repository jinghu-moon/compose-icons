package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorThinIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.580 126.210 L 203.580 46.210 C 202.902 44.855 201.516 43.999 200.000 44.000 L 56.000 44.000 C 54.484 43.999 53.098 44.855 52.420 46.210 L 12.420 126.210 C 12.143 126.766 11.999 127.379 12.000 128.000 L 12.000 184.000 C 12.000 190.627 17.373 196.000 24.000 196.000 L 232.000 196.000 C 238.627 196.000 244.000 190.627 244.000 184.000 L 244.000 128.000 C 244.001 127.379 243.857 126.766 243.580 126.210 ZM 98.470 124.000 L 82.470 92.000 L 121.530 92.000 L 137.530 124.000 ZM 101.530 52.000 L 117.530 84.000 L 78.470 84.000 L 62.470 52.000 ZM 149.530 52.000 L 165.530 84.000 L 126.470 84.000 L 110.470 52.000 ZM 146.470 124.000 L 130.470 92.000 L 169.530 92.000 L 185.530 124.000 ZM 194.470 124.000 L 178.470 92.000 L 217.530 92.000 L 233.530 124.000 ZM 213.530 84.000 L 174.470 84.000 L 158.470 52.000 L 197.530 52.000 ZM 20.000 184.000 L 20.000 128.940 L 56.000 56.940 L 92.000 128.940 L 92.000 188.000 L 24.000 188.000 C 21.791 188.000 20.000 186.209 20.000 184.000 ZM 232.000 188.000 L 100.000 188.000 L 100.000 132.000 L 236.000 132.000 L 236.000 184.000 C 236.000 186.209 234.209 188.000 232.000 188.000 Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
