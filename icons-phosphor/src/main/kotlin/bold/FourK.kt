package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorBoldIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 44.000 C 20.000 37.373 25.373 32.000 32.000 32.000 L 224.000 32.000 C 230.627 32.000 236.000 37.373 236.000 44.000 C 236.000 50.627 230.627 56.000 224.000 56.000 L 32.000 56.000 C 25.373 56.000 20.000 50.627 20.000 44.000 ZM 224.000 200.000 L 32.000 200.000 C 25.373 200.000 20.000 205.373 20.000 212.000 C 20.000 218.627 25.373 224.000 32.000 224.000 L 224.000 224.000 C 230.627 224.000 236.000 218.627 236.000 212.000 C 236.000 205.373 230.627 200.000 224.000 200.000 ZM 148.000 68.000 C 141.373 68.000 136.000 73.373 136.000 80.000 L 136.000 176.000 C 136.000 182.627 141.373 188.000 148.000 188.000 C 154.627 188.000 160.000 182.627 160.000 176.000 L 160.000 148.510 L 168.440 138.860 L 193.630 182.050 C 197.067 187.532 204.231 189.303 209.826 186.052 C 215.421 182.802 217.431 175.701 214.370 170.000 L 185.110 119.860 L 213.000 87.900 C 216.158 84.736 217.296 80.078 215.951 75.814 C 214.607 71.550 211.003 68.387 206.601 67.607 C 202.199 66.827 197.728 68.558 195.000 72.100 L 160.000 112.100 L 160.000 80.000 C 160.000 73.373 154.627 68.000 148.000 68.000 ZM 80.000 176.000 L 80.000 164.000 L 36.000 164.000 C 31.416 164.000 27.233 161.389 25.220 157.271 C 23.206 153.153 23.715 148.247 26.530 144.630 L 82.530 72.630 C 85.678 68.585 91.048 66.986 95.896 68.650 C 100.744 70.314 104.000 74.874 104.000 80.000 L 104.000 140.000 L 108.000 140.000 C 114.627 140.000 120.000 145.373 120.000 152.000 C 120.000 158.627 114.627 164.000 108.000 164.000 L 104.000 164.000 L 104.000 176.000 C 104.000 182.627 98.627 188.000 92.000 188.000 C 85.373 188.000 80.000 182.627 80.000 176.000 ZM 80.000 140.000 L 80.000 115.000 L 60.540 140.000 Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
