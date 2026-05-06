package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorBoldIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.15 133.18 146.83 33.86C143.09 30.095 137.997 27.985 132.69 28h-92.69C33.373 28 28 33.373 28 40v92.69c-.015 5.307 2.095 10.4 5.86 14.14l99.32 99.32c7.81 7.808 20.47 7.808 28.28 0l84.69-84.69c7.808-7.81 7.808-20.47 0-28.28ZM147.32 226.35 52 131v-79h79l95.32 95.32ZM104 88c0 8.837-7.163 16-16 16C79.163 104 72 96.837 72 88 72 79.163 79.163 72 88 72c8.837 0 16 7.163 16 16Z"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
