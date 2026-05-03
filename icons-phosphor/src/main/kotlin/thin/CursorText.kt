package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorThinIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 208.000 C 180.000 210.209 178.209 212.000 176.000 212.000 L 160.000 212.000 C 146.516 211.994 134.165 204.452 128.000 192.460 C 121.835 204.452 109.484 211.994 96.000 212.000 L 80.000 212.000 C 77.791 212.000 76.000 210.209 76.000 208.000 C 76.000 205.791 77.791 204.000 80.000 204.000 L 96.000 204.000 C 111.464 204.000 124.000 191.464 124.000 176.000 L 124.000 132.000 L 104.000 132.000 C 101.791 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 101.791 124.000 104.000 124.000 L 124.000 124.000 L 124.000 80.000 C 124.000 64.536 111.464 52.000 96.000 52.000 L 80.000 52.000 C 77.791 52.000 76.000 50.209 76.000 48.000 C 76.000 45.791 77.791 44.000 80.000 44.000 L 96.000 44.000 C 109.484 44.006 121.835 51.548 128.000 63.540 C 134.165 51.548 146.516 44.006 160.000 44.000 L 176.000 44.000 C 178.209 44.000 180.000 45.791 180.000 48.000 C 180.000 50.209 178.209 52.000 176.000 52.000 L 160.000 52.000 C 144.536 52.000 132.000 64.536 132.000 80.000 L 132.000 124.000 L 152.000 124.000 C 154.209 124.000 156.000 125.791 156.000 128.000 C 156.000 130.209 154.209 132.000 152.000 132.000 L 132.000 132.000 L 132.000 176.000 C 132.000 191.464 144.536 204.000 160.000 204.000 L 176.000 204.000 C 178.209 204.000 180.000 205.791 180.000 208.000 Z"),
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
