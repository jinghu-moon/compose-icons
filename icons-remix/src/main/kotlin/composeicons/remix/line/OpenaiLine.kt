package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenaiLine: ImageVector
    get() {
        if (_openaiLine != null) return _openaiLine!!
        _openaiLine = remixIcon(
            name = "OpenaiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 4c.649 0 1.25 .206 1.741 .556C11.449 5.229 10.26 6.076 9 6.804l1 1.732c1.575-.909 3.052-2.05 4.761-2.706 1.353-.518 2.92 .009 3.667 1.304 .324 .562 .447 1.185 .389 1.786C17.588 8.137 16.26 7.531 15 6.804L14 8.536c1.575 .909 3.302 1.618 4.723 2.77 1.125 .912 1.452 2.534 .705 3.828-.324 .562-.803 .98-1.353 1.23C18.139 14.908 18 13.455 18 12h-2c0 1.818 .25 3.668-.037 5.476C15.735 18.906 14.494 20 13 20c-.649 0-1.25-.206-1.742-.557 1.292-.673 2.481-1.519 3.742-2.247L14 15.464c-1.575 .909-3.052 2.051-4.761 2.705C7.887 18.688 6.319 18.16 5.572 16.866c-.324-.562-.447-1.185-.389-1.787 1.229 .783 2.556 1.389 3.817 2.117l1-1.732C8.425 14.555 6.698 13.846 5.276 12.694 4.151 11.782 3.825 10.16 4.572 8.866c.324-.562 .803-.98 1.353-1.23-.063 1.456 .075 2.909 .075 4.364h2c0-1.818-.25-3.669 .037-5.476C8.265 5.094 9.506 4 11 4ZM14.792 3.742C13.877 2.677 12.518 2 11 2 8.778 2 6.896 3.448 6.244 5.452 4.864 5.713 3.599 6.552 2.84 7.866c-1.111 1.924-.798 4.278 .612 5.845-.464 1.326-.371 2.841 .388 4.155 1.111 1.924 3.306 2.83 5.368 2.392C10.123 21.323 11.482 22 13 22c2.222 0 4.104-1.448 4.756-3.452 1.38-.261 2.646-1.099 3.405-2.414 1.111-1.924 .798-4.278-.612-5.845 .465-1.326 .371-2.841-.388-4.155C19.049 4.21 16.854 3.304 14.792 3.742Z"),
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
        return _openaiLine!!
    }

private var _openaiLine: ImageVector? = null
