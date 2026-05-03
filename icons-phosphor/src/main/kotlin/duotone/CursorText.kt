package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorDuotoneIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 176.000 48.000 L 176.000 208.000 L 160.000 208.000 C 142.327 208.000 128.000 193.673 128.000 176.000 C 128.000 193.673 113.673 208.000 96.000 208.000 L 80.000 208.000 L 80.000 48.000 L 96.000 48.000 C 113.673 48.000 128.000 62.327 128.000 80.000 C 128.000 62.327 142.327 48.000 160.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 184.000 208.000 C 184.000 212.418 180.418 216.000 176.000 216.000 L 160.000 216.000 C 147.410 216.000 135.554 210.072 128.000 200.000 C 120.446 210.072 108.590 216.000 96.000 216.000 L 80.000 216.000 C 75.582 216.000 72.000 212.418 72.000 208.000 C 72.000 203.582 75.582 200.000 80.000 200.000 L 96.000 200.000 C 109.255 200.000 120.000 189.255 120.000 176.000 L 120.000 136.000 L 104.000 136.000 C 99.582 136.000 96.000 132.418 96.000 128.000 C 96.000 123.582 99.582 120.000 104.000 120.000 L 120.000 120.000 L 120.000 80.000 C 120.000 66.745 109.255 56.000 96.000 56.000 L 80.000 56.000 C 75.582 56.000 72.000 52.418 72.000 48.000 C 72.000 43.582 75.582 40.000 80.000 40.000 L 96.000 40.000 C 108.590 40.000 120.446 45.928 128.000 56.000 C 135.554 45.928 147.410 40.000 160.000 40.000 L 176.000 40.000 C 180.418 40.000 184.000 43.582 184.000 48.000 C 184.000 52.418 180.418 56.000 176.000 56.000 L 160.000 56.000 C 146.745 56.000 136.000 66.745 136.000 80.000 L 136.000 120.000 L 152.000 120.000 C 156.418 120.000 160.000 123.582 160.000 128.000 C 160.000 132.418 156.418 136.000 152.000 136.000 L 136.000 136.000 L 136.000 176.000 C 136.000 189.255 146.745 200.000 160.000 200.000 L 176.000 200.000 C 180.418 200.000 184.000 203.582 184.000 208.000 Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
