package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) return _discoBall!!
        _discoBall = phosphorRegularIcon(
            name = "DiscoBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 64.37v-48.37c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48.37C57.151 68.647 21.951 109.014 24.091 156.01c2.141 46.995 40.865 83.996 87.909 83.996 47.044 0 85.768-37.001 87.909-83.996C202.049 109.014 166.849 68.647 120 64.37ZM183.54 144h-31.77C150.26 115.64 140.98 95.64 132.33 82.94c27.78 8.227 47.946 32.272 51.21 61.06ZM88.24 160h47.52c-2 33.52-16.13 52.95-23.76 61.08C104.36 212.93 90.23 193.51 88.24 160ZM88.24 144c2-33.52 16.13-52.95 23.76-61.08 7.64 8.15 21.77 27.57 23.76 61.08ZM91.67 82.94C83 95.64 73.74 115.64 72.23 144h-31.77C43.724 115.212 63.89 91.167 91.67 82.94ZM40.46 160h31.77c1.51 28.36 10.79 48.36 19.44 61.06C63.89 212.833 43.724 188.788 40.46 160ZM132.33 221.06c8.65-12.7 17.93-32.7 19.44-61.06h31.77c-3.264 28.788-23.43 52.833-51.21 61.06ZM256 88c0 4.418-3.582 8-8 8h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8ZM152 40c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
