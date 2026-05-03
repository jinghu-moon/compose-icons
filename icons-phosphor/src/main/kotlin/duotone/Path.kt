package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorDuotoneIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 200.000 C 224.000 213.255 213.255 224.000 200.000 224.000 C 186.745 224.000 176.000 213.255 176.000 200.000 C 176.000 186.745 186.745 176.000 200.000 176.000 C 213.255 176.000 224.000 186.745 224.000 200.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 168.000 C 185.409 168.014 172.668 177.878 169.000 192.000 L 72.000 192.000 C 54.327 192.000 40.000 177.673 40.000 160.000 C 40.000 142.327 54.327 128.000 72.000 128.000 L 168.000 128.000 C 190.091 128.000 208.000 110.091 208.000 88.000 C 208.000 65.909 190.091 48.000 168.000 48.000 L 72.000 48.000 C 67.582 48.000 64.000 51.582 64.000 56.000 C 64.000 60.418 67.582 64.000 72.000 64.000 L 168.000 64.000 C 181.255 64.000 192.000 74.745 192.000 88.000 C 192.000 101.255 181.255 112.000 168.000 112.000 L 72.000 112.000 C 45.490 112.000 24.000 133.490 24.000 160.000 C 24.000 186.510 45.490 208.000 72.000 208.000 L 169.000 208.000 C 173.157 224.099 188.951 234.333 205.344 231.548 C 221.736 228.763 233.265 213.888 231.871 197.319 C 230.478 180.750 216.627 168.008 200.000 168.000 ZM 200.000 216.000 C 191.163 216.000 184.000 208.837 184.000 200.000 C 184.000 191.163 191.163 184.000 200.000 184.000 C 208.837 184.000 216.000 191.163 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
