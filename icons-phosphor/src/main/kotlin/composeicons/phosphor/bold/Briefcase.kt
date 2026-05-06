package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorBoldIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 100c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12ZM236 68v128c0 11.046-8.954 20-20 20h-176C28.954 216 20 207.046 20 196v-128C20 56.954 28.954 48 40 48h36v-8C76 24.536 88.536 12 104 12h48c15.464 0 28 12.536 28 28v8h36c11.046 0 20 8.954 20 20ZM100 48h56v-8c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4ZM44 72v35.23c25.895 13.648 54.728 20.777 84 20.77 29.273 .007 58.106-7.126 84-20.78v-35.22ZM212 192v-58.06C185.597 145.847 156.964 152.003 128 152c-28.964 .005-57.598-6.151-84-18.06v58.06Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
