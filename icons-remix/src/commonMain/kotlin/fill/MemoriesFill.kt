package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MemoriesFill: ImageVector
    get() {
        if (_memoriesFill != null) return _memoriesFill!!
        _memoriesFill = remixIcon(
            name = "MemoriesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 8.984 2.000 6.280 3.335 4.447 5.446 L 2.000 3.000 L 2.000 9.000 L 8.000 9.000 L 5.865 6.865 C 7.332 5.114 9.536 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 L 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 ZM 10.777 8.518 L 15.376 11.584 C 15.673 11.782 15.673 12.218 15.376 12.416 L 10.777 15.482 C 10.445 15.703 10.000 15.465 10.000 15.066 L 10.000 8.934 C 10.000 8.535 10.445 8.297 10.777 8.518 Z"),
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
        return _memoriesFill!!
    }

private var _memoriesFill: ImageVector? = null
