package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorBoldIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 63.510 L 192.490 15.510 C 187.796 10.816 180.184 10.816 175.490 15.510 C 170.796 20.204 170.796 27.816 175.490 32.510 L 191.000 48.000 L 168.000 71.000 L 136.490 39.510 C 131.796 34.816 124.184 34.816 119.490 39.510 C 114.796 44.204 114.796 51.816 119.490 56.510 L 123.000 60.000 L 41.860 141.170 C 38.096 144.911 35.986 150.003 36.000 155.310 L 36.000 203.000 L 15.510 223.510 C 10.816 228.204 10.816 235.816 15.510 240.510 C 20.204 245.204 27.816 245.204 32.510 240.510 L 53.000 220.000 L 100.720 220.000 C 106.027 220.014 111.119 217.904 114.860 214.140 L 196.000 133.000 L 199.510 136.520 C 204.204 141.214 211.816 141.214 216.510 136.520 C 221.204 131.826 221.204 124.214 216.510 119.520 L 185.000 88.000 L 208.000 65.000 L 223.510 80.520 C 228.204 85.214 235.816 85.214 240.510 80.520 C 245.204 75.826 245.204 68.214 240.510 63.520 ZM 99.000 196.000 L 60.000 196.000 L 60.000 157.000 L 74.000 143.000 L 91.510 160.520 C 96.204 165.214 103.816 165.214 108.510 160.520 C 113.204 155.826 113.204 148.214 108.510 143.520 L 91.000 126.000 L 102.000 115.000 L 119.510 132.520 C 124.204 137.214 131.816 137.214 136.510 132.520 C 141.204 127.826 141.204 120.214 136.510 115.520 L 119.000 98.000 L 140.000 77.000 L 179.000 116.000 Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
