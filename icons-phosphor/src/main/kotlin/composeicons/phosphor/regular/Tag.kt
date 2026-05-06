package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorRegularIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.31 136 144 36.69C141.01 33.676 136.936 31.986 132.69 32h-92.69c-4.418 0-8 3.582-8 8v92.69c-.014 4.246 1.676 8.32 4.69 11.31L136 243.31c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688l84.68-84.68c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM147.31 232 48 132.69v-84.69h84.69L232 147.31ZM96 84c0 6.627-5.373 12-12 12C77.373 96 72 90.627 72 84 72 77.373 77.373 72 84 72c6.627 0 12 5.373 12 12Z"),
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
