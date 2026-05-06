package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShieldCheckFill: ImageVector
    get() {
        if (_shieldCheckFill != null) return _shieldCheckFill!!
        _shieldCheckFill = remixIcon(
            name = "ShieldCheckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1l8.217 1.826c.458 .102 .783 .507 .783 .976v9.987c0 2.006-1.003 3.879-2.672 4.992L12 23 5.672 18.781C4.003 17.668 3 15.795 3 13.789v-9.987c0-.469 .326-.875 .783-.976L12 1ZM16.452 8.222l-4.951 4.949L8.674 10.343 7.26 11.757 11.503 16 17.867 9.636 16.452 8.222Z"),
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
        return _shieldCheckFill!!
    }

private var _shieldCheckFill: ImageVector? = null
