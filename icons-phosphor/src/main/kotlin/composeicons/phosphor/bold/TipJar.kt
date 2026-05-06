package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorBoldIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 49.68v-17.68C188 20.954 179.046 12 168 12h-80C76.954 12 68 20.954 68 32v17.68C49.083 55.063 36.026 72.332 36 92v108c.028 24.289 19.711 43.972 44 44h96c24.289-.028 43.972-19.711 44-44v-108C219.974 72.332 206.917 55.063 188 49.68ZM164 48h-24v-12h24ZM116 36v12h-24v-12ZM196 200c0 11.046-8.954 20-20 20h-96C68.954 220 60 211.046 60 200v-108C60 80.954 68.954 72 80 72h96c11.046 0 20 8.954 20 20ZM168 162c-.002 15.791-12.244 28.877-28 29.93v4.07c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h30c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-20C101.839 155.974 88.603 143.152 88.064 127.001 87.525 110.849 99.877 97.173 116 96.07v-.07c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-30c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h20c16.569 0 30 13.431 30 30Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
