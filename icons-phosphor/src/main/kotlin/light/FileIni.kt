package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorLightIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 46.000 152.000 L 46.000 208.000 C 46.000 211.314 43.314 214.000 40.000 214.000 C 36.686 214.000 34.000 211.314 34.000 208.000 L 34.000 152.000 C 34.000 148.686 36.686 146.000 40.000 146.000 C 43.314 146.000 46.000 148.686 46.000 152.000 ZM 120.000 146.000 C 116.686 146.000 114.000 148.686 114.000 152.000 L 114.000 189.280 L 84.880 148.510 C 83.363 146.389 80.650 145.491 78.167 146.288 C 75.685 147.084 74.000 149.393 74.000 152.000 L 74.000 208.000 C 74.000 211.314 76.686 214.000 80.000 214.000 C 83.314 214.000 86.000 211.314 86.000 208.000 L 86.000 170.720 L 115.120 211.490 C 116.246 213.065 118.064 214.000 120.000 214.000 C 120.622 214.002 121.240 213.904 121.830 213.710 C 124.313 212.915 125.998 210.607 126.000 208.000 L 126.000 152.000 C 126.000 148.686 123.314 146.000 120.000 146.000 ZM 160.000 146.000 C 156.686 146.000 154.000 148.686 154.000 152.000 L 154.000 208.000 C 154.000 211.314 156.686 214.000 160.000 214.000 C 163.314 214.000 166.000 211.314 166.000 208.000 L 166.000 152.000 C 166.000 148.686 163.314 146.000 160.000 146.000 ZM 214.000 88.000 L 214.000 224.000 C 214.000 227.314 211.314 230.000 208.000 230.000 C 204.686 230.000 202.000 227.314 202.000 224.000 L 202.000 94.000 L 152.000 94.000 C 148.686 94.000 146.000 91.314 146.000 88.000 L 146.000 38.000 L 56.000 38.000 C 54.895 38.000 54.000 38.895 54.000 40.000 L 54.000 112.000 C 54.000 115.314 51.314 118.000 48.000 118.000 C 44.686 118.000 42.000 115.314 42.000 112.000 L 42.000 40.000 C 42.000 32.268 48.268 26.000 56.000 26.000 L 152.000 26.000 C 153.594 25.999 155.123 26.632 156.250 27.760 L 212.250 83.760 C 213.372 84.886 214.001 86.411 214.000 88.000 ZM 158.000 82.000 L 193.520 82.000 L 158.000 46.480 Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
