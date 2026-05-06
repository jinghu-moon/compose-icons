package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PinterestLine: ImageVector
    get() {
        if (_pinterestLine != null) return _pinterestLine!!
        _pinterestLine = remixIcon(
            name = "PinterestLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.492 19.191c.024-.337 .071-.671 .143-1.002 .063-.295 .254-1.13 .534-2.34l.007-.031c.123-.532 .255-1.1 .387-1.667 .079-.34 .141-.604 .182-.692-.194-.448-.291-.934-.285-1.423 0-1.337 .756-2.374 1.736-2.374 .36-.006 .704 .15 .943 .426 .238 .276 .348 .643 .302 .996 0 .452-.086 .798-.454 2.035-.071 .238-.119 .404-.165 .571-.052 .188-.095 .358-.133 .522-.096 .387-.008 .797 .238 1.106 .245 .308 .616 .477 1.006 .457 1.492 0 2.6-1.985 2.6-4.549 0-1.97-1.291-3.273-3.432-3.274C11.022 7.911 9.975 8.325 9.201 9.1c-.774 .775-1.206 1.844-1.195 2.962-.023 .602 .165 1.192 .512 1.644 .181 .139 .251 .383 .175 .589-.041 .169-.14 .553-.176 .681-.022 .128-.102 .238-.215 .296-.114 .059-.25 .058-.355 .002C6.785 14.795 6.15 13.496 6.15 11.835c0-2.986 2.492-5.585 6.192-5.585 3.135 0 5.481 2.329 5.481 5.14 0 3.532-1.932 6.105-4.689 6.105-.794 .026-1.55-.332-2.047-.959l-.043 .177c-.094 .387-.141 .581-.207 .852l-.002 .008c-.146 .6-.248 1.017-.288 1.174-.106 .355-.24 .703-.4 1.039 .595 .141 1.216 .216 1.854 .216 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C7.583 4 4.001 7.582 4.001 12c0 3.159 1.831 5.891 4.491 7.191ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _pinterestLine!!
    }

private var _pinterestLine: ImageVector? = null
