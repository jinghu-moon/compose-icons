package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorFillIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M33.31 126.24c-2.543-5.806-1.318-12.574 3.1-17.12h0L110.14 31.61c4.669-4.863 11.119-7.611 17.86-7.611 6.741 0 13.191 2.749 17.86 7.611l73.73 77.51c4.418 4.546 5.643 11.314 3.1 17.12-2.572 5.95-8.448 9.791-14.93 9.76h-159.52c-6.482 .031-12.358-3.81-14.93-9.76ZM208 152h-160c-8.837 0-16 7.163-16 16v16c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-16c0-8.837-7.163-16-16-16Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
