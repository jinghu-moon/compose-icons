package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorBoldIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 172c0 22.091-17.909 40-40 40-22.091 0-40-17.909-40-40v-96h-56v124c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-124h-4C52.118 76 36 92.118 36 112c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C12.039 78.879 38.879 52.039 72 52h152c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-44v96c0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
