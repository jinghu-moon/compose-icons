package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorBoldIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 104c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-35l-59.51 59.51c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L187 52h-35c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM184 128c-6.627 0-12 5.373-12 12v64h-120v-120h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-68C36.954 60 28 68.954 28 80v128c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-68c0-6.627-5.373-12-12-12Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
