package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitlabLine: ImageVector
    get() {
        if (_gitlabLine != null) return _gitlabLine!!
        _gitlabLine = remixIcon(
            name = "GitlabLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.544 2.673c.272-.173 .592-.257 .914-.24 .323 .017 .633 .135 .885 .337l.001 .001c.246 .198 .426 .466 .515 .769L9.305 7.968h5.389L16.141 3.54c.089-.303 .268-.571 .515-.769l.005-.004c.252-.2 .56-.316 .882-.333 .321-.017 .64 .066 .912 .238l.002 .002c.274 .174 .486 .43 .605 .731l.004 .01 2.473 6.451c.423 1.105 .474 2.317 .147 3.454-.327 1.137-1.015 2.136-1.96 2.848l-6.731 5.065-.001 .001c-.288 .217-.639 .335-1 .335-.361 0-.712-.118-1-.336L4.263 16.168C3.321 15.456 2.635 14.457 2.31 13.322 1.984 12.187 2.036 10.977 2.457 9.874L4.937 3.405c.12-.302 .332-.558 .607-.732ZM6.355 4.736 4.16 10.464c-.28 .737-.337 1.604-.12 2.362 .217 .755 .671 1.42 1.295 1.896l6.659 5.01 6.654-5.006c.631-.476 1.09-1.144 1.308-1.904 .219-.76 .158-1.638-.124-2.377L17.644 4.736 16 9.768h-8L6.355 4.736Z"),
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
        return _gitlabLine!!
    }

private var _gitlabLine: ImageVector? = null
