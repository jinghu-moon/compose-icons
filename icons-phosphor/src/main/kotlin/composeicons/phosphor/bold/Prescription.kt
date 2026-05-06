package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorBoldIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M189 188l19.52-19.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L172 171 138.93 138c27.053-7.43 44.432-33.732 40.659-61.532C175.816 48.669 152.054 27.951 124 28h-52C65.373 28 60 33.373 60 40v152c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-52h23l48 48-19.52 19.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L172 205l19.51 19.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM84 52h40c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32h-40Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
