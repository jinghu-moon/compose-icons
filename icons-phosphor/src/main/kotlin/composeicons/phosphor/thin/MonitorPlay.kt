package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorThinIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.22 116.67l-48-32c-1.228-.819-2.807-.896-4.108-.199-1.301 .697-2.113 2.053-2.112 3.529v64c-.002 1.476 .809 2.833 2.11 3.53 1.302 .697 2.882 .62 4.11-.2l48-32c1.114-.742 1.784-1.991 1.784-3.33 0-1.339-.67-2.588-1.784-3.33ZM116 144.53v-49.06L152.79 120ZM208 44h-160C36.954 44 28 52.954 28 64v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 52.954 219.046 44 208 44ZM220 176c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-112C36 57.373 41.373 52 48 52h160c6.627 0 12 5.373 12 12ZM164 224c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
