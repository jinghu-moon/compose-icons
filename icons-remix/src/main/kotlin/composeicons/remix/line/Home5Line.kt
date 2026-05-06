package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Home5Line: ImageVector
    get() {
        if (_home5Line != null) return _home5Line!!
        _home5Line = remixIcon(
            name = "Home5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 19h6v-9.022L12 4.534 5 9.978v9.022h6v-6h2v6ZM21 20c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-10.511c0-.309 .142-.6 .386-.789L11.386 2.477c.361-.281 .867-.281 1.228 0l8 6.222c.244 .189 .386 .481 .386 .789v10.511Z"),
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
        return _home5Line!!
    }

private var _home5Line: ImageVector? = null
