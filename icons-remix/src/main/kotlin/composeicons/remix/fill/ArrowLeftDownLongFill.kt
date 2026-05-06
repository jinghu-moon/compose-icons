package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftDownLongFill: ImageVector
    get() {
        if (_arrowLeftDownLongFill != null) return _arrowLeftDownLongFill!!
        _arrowLeftDownLongFill = remixIcon(
            name = "ArrowLeftDownLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.778 5.636 18.364 4.222 8.757 13.828 4.929 10v9.071h9.071L10.172 15.243 19.778 5.636Z"),
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
        return _arrowLeftDownLongFill!!
    }

private var _arrowLeftDownLongFill: ImageVector? = null
