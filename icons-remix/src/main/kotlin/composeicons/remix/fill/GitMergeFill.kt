package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitMergeFill: ImageVector
    get() {
        if (_gitMergeFill != null) return _gitMergeFill!!
        _gitMergeFill = remixIcon(
            name = "GitMergeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.105 8.79C7.452 10.064 8.617 11 10 11h4c2.47 0 4.522 1.792 4.927 4.146C20.13 15.537 21 16.667 21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.267 .785-2.35 1.895-2.79C16.548 13.936 15.384 13 14 13h-4C8.874 13 7.836 12.628 7 12v3.17c1.165 .412 2 1.523 2 2.829 0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18c0-1.306 .835-2.417 2-2.829v-6.341C3.835 8.417 3 7.306 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6 9 7.267 8.215 8.35 7.105 8.79Z"),
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
        return _gitMergeFill!!
    }

private var _gitMergeFill: ImageVector? = null
