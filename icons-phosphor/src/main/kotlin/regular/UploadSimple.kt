package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorRegularIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 144.000 L 224.000 208.000 C 224.000 212.418 220.418 216.000 216.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 C 44.418 136.000 48.000 139.582 48.000 144.000 L 48.000 200.000 L 208.000 200.000 L 208.000 144.000 C 208.000 139.582 211.582 136.000 216.000 136.000 C 220.418 136.000 224.000 139.582 224.000 144.000 ZM 93.660 77.660 L 120.000 51.310 L 120.000 144.000 C 120.000 148.418 123.582 152.000 128.000 152.000 C 132.418 152.000 136.000 148.418 136.000 144.000 L 136.000 51.310 L 162.340 77.660 C 165.466 80.786 170.534 80.786 173.660 77.660 C 176.786 74.534 176.786 69.466 173.660 66.340 L 133.660 26.340 C 132.159 24.838 130.123 23.994 128.000 23.994 C 125.877 23.994 123.841 24.838 122.340 26.340 L 82.340 66.340 C 79.214 69.466 79.214 74.534 82.340 77.660 C 85.466 80.786 90.534 80.786 93.660 77.660 Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
