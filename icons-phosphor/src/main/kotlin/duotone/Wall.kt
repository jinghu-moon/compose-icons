package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorDuotoneIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 104.000 L 32.000 104.000 L 32.000 56.000 L 128.000 56.000 ZM 176.000 104.000 L 176.000 152.000 L 128.000 152.000 L 128.000 200.000 L 224.000 200.000 L 224.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 27.582 48.000 24.000 51.582 24.000 56.000 L 24.000 200.000 C 24.000 204.418 27.582 208.000 32.000 208.000 L 224.000 208.000 C 228.418 208.000 232.000 204.418 232.000 200.000 L 232.000 56.000 C 232.000 51.582 228.418 48.000 224.000 48.000 ZM 88.000 144.000 L 88.000 112.000 L 168.000 112.000 L 168.000 144.000 ZM 40.000 144.000 L 40.000 112.000 L 72.000 112.000 L 72.000 144.000 ZM 184.000 112.000 L 216.000 112.000 L 216.000 144.000 L 184.000 144.000 ZM 216.000 96.000 L 136.000 96.000 L 136.000 64.000 L 216.000 64.000 ZM 120.000 64.000 L 120.000 96.000 L 40.000 96.000 L 40.000 64.000 ZM 40.000 160.000 L 120.000 160.000 L 120.000 192.000 L 40.000 192.000 ZM 136.000 192.000 L 136.000 160.000 L 216.000 160.000 L 216.000 192.000 Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
