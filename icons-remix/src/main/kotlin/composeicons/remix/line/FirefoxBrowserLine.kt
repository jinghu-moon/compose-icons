package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirefoxBrowserLine: ImageVector
    get() {
        if (_firefoxBrowserLine != null) return _firefoxBrowserLine!!
        _firefoxBrowserLine = remixIcon(
            name = "FirefoxBrowserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 8.844 3.249 6.305 5.5 4.688c.409-.294 .842-.507 1.315-.741 .219-.108 .447-.22 .685-.347v1.9c0 0 2.598-1.281 2.95-1.35-.023 .098-.073 .268-.135 .481-.196 .669-.515 1.762-.515 2.369 0 .21 .016 .4 .045 .564 .286 .225 .531 .514 .774 .8 .055 .065 .11 .129 .165 .193 .443 .51 1.257 1.04 1.764 1.371 .264 .172 .446 .29 .447 .323 0 .277-.645 1.268-1.495 1.268-2.17 0-3.066 0-2.5 1.63 .475 1.369 1.75 2.102 3 2.102 1.5 0 2.9-1.245 2.9-2.75 0-1.776-.875-2.573-1.737-3.359C12.325 8.378 11.5 7.626 11.5 6c0-2.4 2-4.1 3.8-5.15 .481 1.663 1.652 2.66 2.883 3.707C20.025 6.124 22 7.805 22 12ZM5.5 7.4C4.456 8.668 4 10.343 4 11.986c0 4.427 3.578 8.014 8.003 8.014 3.958 0 7.258-2.87 7.909-6.638 .186-1.425 .122-2.83-.362-4.111l-1.05 .226c0-1.946-1.169-2.981-2.318-3.998C15.574 4.94 14.971 4.407 14.55 3.746c-.91 .876-1.287 1.504-1.287 2.254 0 .895 .631 1.272 1.749 1.94 .479 .286 1.047 .626 1.694 1.083l-.995 .274c.746 .962 1.188 2.036 1.188 3.203 0 2.5-2.237 4.716-4.895 4.75C9.35 17.283 6.84 15.074 6.84 12.438c0-.637 .16-2.238 2.26-2.758C8.879 9.35 8.313 8.85 8 8.65 7.917 8.36 7.8 7.6 7.8 7.6L5.5 8.7v-1.3Z"),
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
        return _firefoxBrowserLine!!
    }

private var _firefoxBrowserLine: ImageVector? = null
