package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorDuotoneIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 8.000 88.000 L 104.000 88.000 L 104.000 168.000 L 8.000 168.000 ZM 184.000 88.000 L 184.000 168.000 L 248.000 168.000 L 248.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 160.000 L 192.000 160.000 L 192.000 96.000 L 248.000 96.000 C 252.418 96.000 256.000 92.418 256.000 88.000 C 256.000 83.582 252.418 80.000 248.000 80.000 L 189.840 80.000 C 186.985 75.055 181.710 72.006 176.000 72.000 L 112.000 72.000 C 106.290 72.006 101.015 75.055 98.160 80.000 L 64.000 80.000 C 64.000 75.582 60.418 72.000 56.000 72.000 C 51.582 72.000 48.000 75.582 48.000 80.000 L 8.000 80.000 C 3.582 80.000 0.000 83.582 0.000 88.000 C 0.000 92.418 3.582 96.000 8.000 96.000 L 48.000 96.000 L 48.000 160.000 L 8.000 160.000 C 3.582 160.000 0.000 163.582 0.000 168.000 C 0.000 172.418 3.582 176.000 8.000 176.000 L 48.000 176.000 C 48.000 180.418 51.582 184.000 56.000 184.000 C 60.418 184.000 64.000 180.418 64.000 176.000 L 98.160 176.000 C 101.015 180.945 106.290 183.994 112.000 184.000 L 176.000 184.000 C 181.710 183.994 186.985 180.945 189.840 176.000 L 248.000 176.000 C 252.418 176.000 256.000 172.418 256.000 168.000 C 256.000 163.582 252.418 160.000 248.000 160.000 ZM 64.000 96.000 L 96.000 96.000 L 96.000 160.000 L 64.000 160.000 ZM 112.000 168.000 L 112.000 88.000 L 176.000 88.000 L 176.000 120.000 L 144.000 120.000 C 139.582 120.000 136.000 123.582 136.000 128.000 C 136.000 132.418 139.582 136.000 144.000 136.000 L 176.000 136.000 L 176.000 167.800 C 176.000 167.870 176.000 167.930 176.000 168.000 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
