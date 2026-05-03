package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorDuotoneIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 56.690 216.000 L 166.340 106.340 C 167.841 104.838 169.877 103.994 172.000 103.994 C 174.123 103.994 176.159 104.838 177.660 106.340 L 216.000 144.690 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 96.000 112.000 C 87.163 112.000 80.000 104.837 80.000 96.000 C 80.000 87.163 87.163 80.000 96.000 80.000 C 104.837 80.000 112.000 87.163 112.000 96.000 C 112.000 104.837 104.837 112.000 96.000 112.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 48.000 48.000 L 208.000 48.000 L 208.000 125.380 L 183.310 100.680 C 177.062 94.437 166.938 94.437 160.690 100.680 L 53.370 208.000 L 48.000 208.000 ZM 208.000 208.000 L 76.000 208.000 L 172.000 112.000 L 208.000 148.000 L 208.000 208.000 ZM 96.000 120.000 C 109.255 120.000 120.000 109.255 120.000 96.000 C 120.000 82.745 109.255 72.000 96.000 72.000 C 82.745 72.000 72.000 82.745 72.000 96.000 C 72.000 109.255 82.745 120.000 96.000 120.000 ZM 96.000 88.000 C 100.418 88.000 104.000 91.582 104.000 96.000 C 104.000 100.418 100.418 104.000 96.000 104.000 C 91.582 104.000 88.000 100.418 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
