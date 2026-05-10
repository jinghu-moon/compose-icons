package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeFill: ImageVector
    get() {
        if (_homeFill != null) return _homeFill!!
        _homeFill = remixIcon(
            name = "HomeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 20c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-10.511c0-.309 .142-.6 .386-.789L11.386 2.477c.361-.281 .867-.281 1.228 0l8 6.222c.244 .189 .386 .481 .386 .789v10.511Z"),
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
        return _homeFill!!
    }

private var _homeFill: ImageVector? = null
