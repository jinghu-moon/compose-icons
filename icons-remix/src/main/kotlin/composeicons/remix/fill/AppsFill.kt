package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppsFill: ImageVector
    get() {
        if (_appsFill != null) return _appsFill!!
        _appsFill = remixIcon(
            name = "AppsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.75 2.5C9.097 2.5 11 4.403 11 6.75v4.25h-4.25C4.403 11 2.5 9.097 2.5 6.75 2.5 4.403 4.403 2.5 6.75 2.5ZM6.75 13h4.25v4.25c0 2.347-1.903 4.25-4.25 4.25-2.347 0-4.25-1.903-4.25-4.25C2.5 14.903 4.403 13 6.75 13ZM17.25 2.5c2.347 0 4.25 1.903 4.25 4.25C21.5 9.097 19.597 11 17.25 11h-4.25v-4.25C13 4.403 14.903 2.5 17.25 2.5ZM13 13h4.25c2.347 0 4.25 1.903 4.25 4.25 0 2.347-1.903 4.25-4.25 4.25C14.903 21.5 13 19.597 13 17.25v-4.25Z"),
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
        return _appsFill!!
    }

private var _appsFill: ImageVector? = null
