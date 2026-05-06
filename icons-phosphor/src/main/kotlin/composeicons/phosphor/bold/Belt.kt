package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorBoldIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 156h-48v-56h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-52c-3.777-5.036-9.705-8-16-8h-64c-6.295 0-12.223 2.964-16 8h-28.7C65.594 71.225 61.07 68.039 56 68.039c-5.07 0-9.594 3.187-11.3 7.961h-32.7C5.373 76 0 81.373 0 88c0 6.627 5.373 12 12 12h32v56h-32C5.373 156 0 161.373 0 168c0 6.627 5.373 12 12 12h32.7c1.706 4.775 6.23 7.961 11.3 7.961 5.07 0 9.594-3.187 11.3-7.961h28.7c3.777 5.036 9.705 8 16 8h64c6.295 0 12.223-2.964 16-8h52c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM68 100h24v56h-24ZM116 92h56v24h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v24h-56Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
