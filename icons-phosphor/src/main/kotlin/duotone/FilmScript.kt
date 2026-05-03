package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorDuotoneIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 40.000 C 48.000 35.582 51.582 32.000 56.000 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 200.000 40.000 L 200.000 216.000 ZM 96.000 80.000 C 96.000 86.627 90.627 92.000 84.000 92.000 C 77.373 92.000 72.000 86.627 72.000 80.000 C 72.000 73.373 77.373 68.000 84.000 68.000 C 90.627 68.000 96.000 73.373 96.000 80.000 ZM 96.000 176.000 C 96.000 182.627 90.627 188.000 84.000 188.000 C 77.373 188.000 72.000 182.627 72.000 176.000 C 72.000 169.373 77.373 164.000 84.000 164.000 C 90.627 164.000 96.000 169.373 96.000 176.000 ZM 96.000 128.000 C 96.000 134.627 90.627 140.000 84.000 140.000 C 77.373 140.000 72.000 134.627 72.000 128.000 C 72.000 121.373 77.373 116.000 84.000 116.000 C 90.627 116.000 96.000 121.373 96.000 128.000 Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
