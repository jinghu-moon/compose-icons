package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorRegularIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 80.000 108.000 C 80.000 101.373 85.373 96.000 92.000 96.000 C 98.627 96.000 104.000 101.373 104.000 108.000 C 104.000 114.627 98.627 120.000 92.000 120.000 C 85.373 120.000 80.000 114.627 80.000 108.000 ZM 176.000 108.000 C 176.000 114.627 170.627 120.000 164.000 120.000 C 157.373 120.000 152.000 114.627 152.000 108.000 C 152.000 101.373 157.373 96.000 164.000 96.000 C 170.627 96.000 176.000 101.373 176.000 108.000 ZM 174.920 172.000 C 176.496 174.480 176.586 177.624 175.154 180.191 C 173.722 182.757 170.999 184.331 168.060 184.291 C 165.122 184.251 162.442 182.604 161.080 180.000 C 153.610 167.090 141.870 160.000 128.000 160.000 C 114.130 160.000 102.390 167.100 94.920 180.000 C 93.558 182.604 90.878 184.251 87.940 184.291 C 85.001 184.331 82.278 182.757 80.846 180.191 C 79.414 177.624 79.504 174.480 81.080 172.000 C 91.370 154.210 108.470 144.000 128.000 144.000 C 147.530 144.000 164.630 154.200 174.920 172.000 Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
