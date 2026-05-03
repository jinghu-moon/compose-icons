package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorFillIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 144.000 L 224.000 208.000 C 224.000 212.418 220.418 216.000 216.000 216.000 L 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 144.000 C 32.000 139.582 35.582 136.000 40.000 136.000 C 44.418 136.000 48.000 139.582 48.000 144.000 L 48.000 200.000 L 208.000 200.000 L 208.000 144.000 C 208.000 139.582 211.582 136.000 216.000 136.000 C 220.418 136.000 224.000 139.582 224.000 144.000 ZM 88.000 80.000 L 120.000 80.000 L 120.000 144.000 C 120.000 148.418 123.582 152.000 128.000 152.000 C 132.418 152.000 136.000 148.418 136.000 144.000 L 136.000 80.000 L 168.000 80.000 C 171.238 80.003 174.158 78.053 175.397 75.062 C 176.636 72.071 175.951 68.628 173.660 66.340 L 133.660 26.340 C 132.159 24.838 130.123 23.994 128.000 23.994 C 125.877 23.994 123.841 24.838 122.340 26.340 L 82.340 66.340 C 80.049 68.628 79.364 72.071 80.603 75.062 C 81.842 78.053 84.762 80.003 88.000 80.000 Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
