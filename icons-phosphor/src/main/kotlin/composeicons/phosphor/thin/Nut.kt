package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorThinIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM221.76 69.66l-88-48.18c-3.589-1.964-7.931-1.964-11.52 0L34.24 69.66C30.395 71.764 28.003 75.797 28 80.18v95.64c.003 4.383 2.395 8.416 6.24 10.52l88 48.18c3.587 1.973 7.933 1.973 11.52 0l88-48.18h0c3.845-2.104 6.237-6.137 6.24-10.52v-95.64c-.003-4.383-2.395-8.416-6.24-10.52ZM220 175.82c-.003 1.459-.8 2.8-2.08 3.5l-88 48.18c-1.196 .655-2.644 .655-3.84 0l-88-48.17c-1.283-.702-2.08-2.048-2.08-3.51v-95.64c.003-1.459 .8-2.8 2.08-3.5l88-48.18c1.193-.666 2.647-.666 3.84 0l88 48.18c1.28 .7 2.077 2.041 2.08 3.5Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
