package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorDuotoneIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 136.000 L 24.000 136.000 C 21.226 136.002 18.649 134.567 17.190 132.207 C 15.731 129.848 15.599 126.901 16.840 124.420 L 56.840 44.420 C 58.197 41.709 60.969 39.998 64.000 40.000 L 192.000 40.000 C 195.031 39.998 197.803 41.709 199.160 44.420 L 239.160 124.420 C 240.401 126.901 240.269 129.848 238.810 132.207 C 237.351 134.567 234.774 136.002 232.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 246.300 120.840 L 206.300 40.840 C 203.605 35.412 198.061 31.984 192.000 32.000 L 64.000 32.000 C 57.939 31.984 52.395 35.412 49.700 40.840 L 9.700 120.840 C 7.219 125.798 7.482 131.688 10.395 136.406 C 13.308 141.124 18.455 143.997 24.000 144.000 L 120.000 144.000 L 120.000 208.000 L 96.000 208.000 C 91.582 208.000 88.000 211.582 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 L 160.000 224.000 C 164.418 224.000 168.000 220.418 168.000 216.000 C 168.000 211.582 164.418 208.000 160.000 208.000 L 136.000 208.000 L 136.000 144.000 L 232.000 144.000 C 237.546 144.001 242.697 141.129 245.613 136.410 C 248.528 131.692 248.792 125.800 246.310 120.840 ZM 24.000 128.000 L 64.000 48.000 L 192.000 48.000 L 232.000 128.000 ZM 192.000 104.000 C 192.000 108.418 188.418 112.000 184.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 184.000 96.000 C 188.418 96.000 192.000 99.582 192.000 104.000 Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
