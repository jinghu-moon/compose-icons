package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileShieldFill: ImageVector
    get() {
        if (_fileShieldFill != null) return _fileShieldFill!!
        _fileShieldFill = remixIcon(
            name = "FileShieldFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 7v13.993c0 .559-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.447 2 3.998 2h11.999L21 7ZM8 8v5.6c0 .849 .446 1.642 1.187 2.114L12 17.5l2.812-1.786C15.554 15.243 16 14.45 16 13.6v-5.6h-8ZM10 10h4v3.6c0 .158-.09 .317-.26 .425L12 15.131 10.26 14.026C10.09 13.918 10 13.758 10 13.6v-3.6Z"),
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
        return _fileShieldFill!!
    }

private var _fileShieldFill: ImageVector? = null
