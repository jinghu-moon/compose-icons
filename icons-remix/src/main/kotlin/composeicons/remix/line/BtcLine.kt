package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BtcLine: ImageVector
    get() {
        if (_btcLine != null) return _btcLine!!
        _btcLine = remixIcon(
            name = "BtcLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 12C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10ZM16.705 10.564c-.173 1.053-.725 1.567-1.47 1.749 .992 .555 1.47 1.398 .959 2.877-.635 1.854-2.057 2.023-3.941 1.663l-.485 1.957-1.094-.271 .485-1.957c-.298-.08-.602-.138-.899-.223l-.485 1.957L8.683 18.045l.485-1.957L6.992 15.496l.541-1.384c0 0 .821 .226 .809 .212 .305 .074 .454-.139 .515-.288l.776-3.137 .565-2.23c.024-.241-.051-.556-.496-.676 .03-.018-.801-.199-.801-.199L9.224 6.482l2.243 .556 .475-1.917 1.13 .28-.475 1.917c.292 .063 .575 .141 .866 .215l.475-1.917 1.099 .272-.487 1.967c1.386 .509 2.385 1.262 2.156 2.709ZM11.606 10.954c.657 .197 2.605 .783 2.933-.521C14.845 9.195 13.157 8.816 12.373 8.64c-.092-.021-.172-.039-.235-.055l-.586 2.352 .055 .016ZM10.592 14.774l.095 .028c.809 .241 3.106 .924 3.418-.37 .321-1.246-1.744-1.731-2.668-1.948-.101-.024-.189-.044-.258-.062l-.586 2.352Z"),
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
        return _btcLine!!
    }

private var _btcLine: ImageVector? = null
