package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorDuotoneIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 80.000 40.000 C 75.582 40.000 72.000 43.582 72.000 48.000 L 72.000 176.000 C 72.000 180.418 75.582 184.000 80.000 184.000 L 96.690 184.000 L 174.340 106.340 C 175.841 104.838 177.877 103.994 180.000 103.994 C 182.123 103.994 184.159 104.838 185.660 106.340 L 216.000 136.690 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 ZM 120.000 104.000 C 111.163 104.000 104.000 96.837 104.000 88.000 C 104.000 79.163 111.163 72.000 120.000 72.000 C 128.837 72.000 136.000 79.163 136.000 88.000 C 136.000 96.837 128.837 104.000 120.000 104.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 80.000 32.000 C 71.163 32.000 64.000 39.163 64.000 48.000 L 64.000 64.000 L 48.000 64.000 C 39.163 64.000 32.000 71.163 32.000 80.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 176.000 224.000 C 184.837 224.000 192.000 216.837 192.000 208.000 L 192.000 192.000 L 208.000 192.000 C 216.837 192.000 224.000 184.837 224.000 176.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 80.000 48.000 L 208.000 48.000 L 208.000 117.380 L 191.300 100.680 C 185.052 94.437 174.928 94.437 168.680 100.680 L 93.370 176.000 L 80.000 176.000 ZM 176.000 208.000 L 48.000 208.000 L 48.000 80.000 L 64.000 80.000 L 64.000 176.000 C 64.000 184.837 71.163 192.000 80.000 192.000 L 176.000 192.000 ZM 208.000 176.000 L 116.000 176.000 L 180.000 112.000 L 208.000 140.000 L 208.000 176.000 ZM 120.000 112.000 C 133.255 112.000 144.000 101.255 144.000 88.000 C 144.000 74.745 133.255 64.000 120.000 64.000 C 106.745 64.000 96.000 74.745 96.000 88.000 C 96.000 101.255 106.745 112.000 120.000 112.000 ZM 120.000 80.000 C 124.418 80.000 128.000 83.582 128.000 88.000 C 128.000 92.418 124.418 96.000 120.000 96.000 C 115.582 96.000 112.000 92.418 112.000 88.000 C 112.000 83.582 115.582 80.000 120.000 80.000 Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
