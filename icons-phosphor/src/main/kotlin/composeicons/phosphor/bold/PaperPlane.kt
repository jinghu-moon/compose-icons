package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorBoldIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.42 198.2l-.06-.09L145.3 30.17C141.752 23.894 135.1 20.013 127.89 20.013c-7.21 0-13.862 3.881-17.41 10.157L14.58 198.2c-4.064 7.255-3.215 16.268 2.133 22.636 5.348 6.368 14.078 8.763 21.927 6.014L128 196.67l89.36 30.18c2.148 .762 4.411 1.151 6.69 1.15 7.093-.023 13.643-3.8 17.215-9.928 3.572-6.128 3.631-13.689 .155-19.872ZM140 175.39v-55.39c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v55.39L40.72 200.82 127.89 48.06l87.37 152.75Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
