package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorBoldIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48v104c0 11.046-8.954 20-20 20h-95.08c4.23 4.85 3.881 12.174-.792 16.599-4.672 4.426-12.004 4.377-16.618-.109l-20-20c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l20-20c4.594-4.624 12.04-4.735 16.77-.25 4.73 4.485 5.014 11.927 .64 16.76h91.08v-96h-104c0 6.627-5.373 12-12 12C81.373 64 76 58.627 76 52v-4C76 36.954 84.954 28 96 28h112c11.046 0 20 8.954 20 20ZM168 192c-6.627 0-12 5.373-12 12h-104v-96h91.08c-4.23 4.85-3.881 12.174 .792 16.599 4.673 4.426 12.004 4.377 16.618-.109l20-20c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5l-20-20c-4.594-4.624-12.04-4.735-16.77-.25-4.73 4.485-5.014 11.927-.64 16.76h-95.08C36.954 84 28 92.954 28 104v104c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-4c0-6.627-5.373-12-12-12Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
