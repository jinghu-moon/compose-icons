package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorThinIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 56.000 C 244.000 58.209 242.209 60.000 240.000 60.000 L 188.000 60.000 L 188.000 104.000 C 188.000 106.209 186.209 108.000 184.000 108.000 L 132.000 108.000 L 132.000 152.000 C 132.000 154.209 130.209 156.000 128.000 156.000 L 76.000 156.000 L 76.000 200.000 C 76.000 202.209 74.209 204.000 72.000 204.000 L 16.000 204.000 C 13.791 204.000 12.000 202.209 12.000 200.000 C 12.000 197.791 13.791 196.000 16.000 196.000 L 68.000 196.000 L 68.000 152.000 C 68.000 149.791 69.791 148.000 72.000 148.000 L 124.000 148.000 L 124.000 104.000 C 124.000 101.791 125.791 100.000 128.000 100.000 L 180.000 100.000 L 180.000 56.000 C 180.000 53.791 181.791 52.000 184.000 52.000 L 240.000 52.000 C 242.209 52.000 244.000 53.791 244.000 56.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _steps!!
    }

private var _steps: ImageVector? = null
