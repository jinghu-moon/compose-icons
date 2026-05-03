package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorDuotoneIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 56.000 L 240.000 184.000 C 240.000 192.837 232.837 200.000 224.000 200.000 L 72.000 200.000 L 72.000 152.000 L 128.000 152.000 L 128.000 104.000 L 184.000 104.000 L 184.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 56.000 C 248.000 60.418 244.418 64.000 240.000 64.000 L 192.000 64.000 L 192.000 104.000 C 192.000 108.418 188.418 112.000 184.000 112.000 L 136.000 112.000 L 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 L 80.000 160.000 L 80.000 200.000 C 80.000 204.418 76.418 208.000 72.000 208.000 L 16.000 208.000 C 11.582 208.000 8.000 204.418 8.000 200.000 C 8.000 195.582 11.582 192.000 16.000 192.000 L 64.000 192.000 L 64.000 152.000 C 64.000 147.582 67.582 144.000 72.000 144.000 L 120.000 144.000 L 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 L 176.000 96.000 L 176.000 56.000 C 176.000 51.582 179.582 48.000 184.000 48.000 L 240.000 48.000 C 244.418 48.000 248.000 51.582 248.000 56.000 Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
