package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorThinIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 172c24.289-.028 43.972-19.711 44-44v-64C172 39.699 152.301 20 128 20 103.699 20 84 39.699 84 64v64c.028 24.289 19.711 43.972 44 44ZM92 64C92 44.118 108.118 28 128 28c19.882 0 36 16.118 36 36v64c0 19.882-16.118 36-36 36C108.118 164 92 147.882 92 128ZM132 203.89v36.11c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36.11C83.659 201.718 52.048 168.399 52 128c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 37.555 30.445 68 68 68 37.555 0 68-30.445 68-68 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4-.048 40.399-31.659 73.718-72 75.89Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
