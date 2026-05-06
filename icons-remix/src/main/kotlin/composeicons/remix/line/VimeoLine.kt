package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VimeoLine: ImageVector
    get() {
        if (_vimeoLine != null) return _vimeoLine!!
        _vimeoLine = remixIcon(
            name = "VimeoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.994 3.004c2.432 0 4.005 1.512 4.005 4.496 0 1.72-.998 3.94-1.832 5.235-2.789 4.333-6.233 8.74-9.644 8.74-3.706 0-4.669-6.831-5.091-8.432C5.01 11.442 4.899 10.834 4.262 9.81c-.318 .219-.761 .528-1.33 .929-.224 .158-.533 .106-.693-.116L.926 8.807C.79 8.62 .801 8.363 .953 8.188 3.78 4.914 6.129 3.278 8.001 3.278c2.392 0 3.124 2.815 3.324 4.222 .3 2.117 .691 4.738 1.245 5.872 .556-.792 2.18-2.888 1.966-3.991-.094-.486-1.317 .184-1.887 .078-.425-.079-.806-.402-.806-1.026 0-1.31 1.852-5.429 6.151-5.429ZM18.001 5.004c-2.195 0-3.251 1.532-3.653 2.207 1.25 .046 1.97 .819 2.134 1.803 .389 2.329-1.916 4.92-2.339 5.565-.396 .603-3.062 3.329-4.251-3.359C9.78 10.591 9.525 9.057 9.227 7.034 9.057 5.883 8.355 5.271 7.998 5.271c-.843 0-1.921 .65-3.855 2.515 1.905-.115 2.545 2.276 2.916 3.633 .816 2.984 1.571 8.055 3.62 8.055 1.726 0 4.438-2.646 7.37-7.039 .209-.312 1.966-3.025 1.966-5.037 0-2.395-1.469-2.395-2.013-2.395Z"),
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
        return _vimeoLine!!
    }

private var _vimeoLine: ImageVector? = null
