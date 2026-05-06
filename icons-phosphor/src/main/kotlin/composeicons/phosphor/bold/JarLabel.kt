package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) return _jarLabel!!
        _jarLabel = phosphorBoldIcon(
            name = "JarLabel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 49.68v-17.68C188 20.954 179.046 12 168 12h-80C76.954 12 68 20.954 68 32v17.68C49.083 55.063 36.026 72.332 36 92v108c.028 24.289 19.711 43.972 44 44h96c24.289-.028 43.972-19.711 44-44v-108C219.974 72.332 206.917 55.063 188 49.68ZM60 120h136v48h-136ZM164 48h-24v-12h24ZM116 36v12h-24v-12ZM80 72h96c11.046 0 20 8.954 20 20v4h-136v-4C60 80.954 68.954 72 80 72ZM176 220h-96C68.954 220 60 211.046 60 200v-8h136v8c0 11.046-8.954 20-20 20Z"),
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
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
