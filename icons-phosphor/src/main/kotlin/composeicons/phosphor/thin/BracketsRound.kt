package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorThinIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M55 62.67C46.34 74.93 36 96.22 36 128c0 31.78 10.34 53.07 19 65.33 9.41 13.3 19 19.19 19.06 19.24 1.542 .925 2.277 2.766 1.797 4.499-.48 1.733-2.058 2.932-3.857 2.931-.705-.01-1.395-.207-2-.57C68.23 218.4 28 193.51 28 128 28 62.49 68.23 37.6 69.94 36.57c1.894-1.14 4.355-.529 5.495 1.365 1.14 1.894 .529 4.355-1.365 5.495C74 43.48 64.42 49.37 55 62.67ZM186.05 36.57c-1.894-1.14-4.355-.529-5.495 1.365-1.14 1.894-.529 4.355 1.365 5.495 .1 0 9.65 5.94 19.06 19.24 8.67 12.26 19 33.55 19 65.33 0 31.78-10.34 53.07-19 65.33-9.41 13.3-19 19.19-19.05 19.24-1.894 1.138-2.508 3.596-1.37 5.49 1.138 1.894 3.596 2.508 5.49 1.37 1.71-1 41.94-25.92 41.94-91.43 0-65.51-40.22-90.4-41.93-91.43Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
