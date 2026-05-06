package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorThinIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.17 51.49 202.83 34.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-17 17C149.658 21.889 106.422 21.889 75.91 46.17L58.91 29.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L69.83 51.49C53.326 67.292 43.995 89.151 44 112v40c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84v-40c.005-22.849-9.326-44.708-25.83-60.51ZM128 36c41.955 .044 75.956 34.045 76 76v12h-152v-12C52.044 70.045 86.045 36.044 128 36ZM128 228C86.045 227.956 52.044 193.955 52 152v-20h152v20c-.044 41.955-34.045 75.956-76 76ZM148 92c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM92 92c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
