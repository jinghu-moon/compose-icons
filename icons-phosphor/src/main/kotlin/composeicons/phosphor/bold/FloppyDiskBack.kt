package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorBoldIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-124.69c-5.307-.014-10.399 2.096-14.14 5.86L33.86 69.17C30.096 72.911 27.986 78.003 28 83.31v124.69c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM92 52h72v20h-72ZM204 204h-152v-119L68 69v7c0 11.046 8.954 20 20 20h80c11.046 0 20-8.954 20-20v-24h16ZM128 108c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42 0-23.196-18.804-42-42-42ZM128 168c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
