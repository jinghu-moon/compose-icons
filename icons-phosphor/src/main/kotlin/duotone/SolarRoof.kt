package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorDuotoneIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 128.000 L 96.000 128.000 L 56.000 48.000 L 200.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 247.160 124.420 L 207.160 44.420 C 205.803 41.709 203.031 39.998 200.000 40.000 L 56.000 40.000 C 52.969 39.998 50.197 41.709 48.840 44.420 L 8.840 124.420 C 8.289 125.533 8.001 126.758 8.000 128.000 L 8.000 184.000 C 8.000 192.837 15.163 200.000 24.000 200.000 L 232.000 200.000 C 240.837 200.000 248.000 192.837 248.000 184.000 L 248.000 128.000 C 247.999 126.758 247.711 125.533 247.160 124.420 ZM 99.060 56.000 L 111.060 80.000 L 80.940 80.000 L 68.940 56.000 ZM 147.060 56.000 L 159.060 80.000 L 128.940 80.000 L 116.940 56.000 ZM 100.940 120.000 L 88.940 96.000 L 119.060 96.000 L 131.060 120.000 ZM 148.940 120.000 L 136.940 96.000 L 167.060 96.000 L 179.060 120.000 ZM 196.940 120.000 L 184.940 96.000 L 215.060 96.000 L 227.060 120.000 ZM 207.060 80.000 L 176.940 80.000 L 164.940 56.000 L 195.060 56.000 ZM 24.000 129.890 L 56.000 65.890 L 88.000 129.890 L 88.000 184.000 L 24.000 184.000 ZM 104.000 184.000 L 104.000 136.000 L 232.000 136.000 L 232.000 184.000 Z"),
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
