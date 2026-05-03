package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorDuotoneIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 128.000 L 216.000 168.000 L 40.000 168.000 L 40.000 128.000 C 40.000 114.745 50.745 104.000 64.000 104.000 L 192.000 104.000 C 205.255 104.000 216.000 114.745 216.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 247.870 30.590 C 247.089 26.245 242.936 23.354 238.590 24.130 L 14.590 64.130 C 10.523 64.872 7.692 68.590 8.058 72.708 C 8.423 76.826 11.866 79.987 16.000 80.000 C 16.476 79.999 16.951 79.959 17.420 79.880 L 120.000 61.560 L 120.000 96.000 L 64.000 96.000 C 46.327 96.000 32.000 110.327 32.000 128.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 128.000 C 224.000 110.327 209.673 96.000 192.000 96.000 L 136.000 96.000 L 136.000 58.700 L 241.400 39.880 C 243.491 39.507 245.347 38.319 246.561 36.576 C 247.774 34.834 248.245 32.680 247.870 30.590 ZM 104.000 160.000 L 104.000 112.000 L 152.000 112.000 L 152.000 160.000 ZM 64.000 112.000 L 88.000 112.000 L 88.000 160.000 L 48.000 160.000 L 48.000 128.000 C 48.000 119.163 55.163 112.000 64.000 112.000 ZM 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 176.000 L 208.000 176.000 L 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 ZM 208.000 128.000 L 208.000 160.000 L 168.000 160.000 L 168.000 112.000 L 192.000 112.000 C 200.837 112.000 208.000 119.163 208.000 128.000 Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
