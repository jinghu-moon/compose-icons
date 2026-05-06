package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DingdingLine: ImageVector
    get() {
        if (_dingdingLine != null) return _dingdingLine!!
        _dingdingLine = remixIcon(
            name = "DingdingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM16.49 11.04l-.007 .014c-.42 .898-1.515 2.659-1.515 2.659 0 0-.002-.004-.006-.011l-.32 .557h1.543l-2.947 3.919 .669-2.666h-1.214l.422-1.763c-.341 .082-.745 .195-1.223 .349 0 0-.646 .379-1.862-.728 0 0-.82-.722-.345-.903 .202-.077 .982-.174 1.595-.257 .829-.112 1.339-.171 1.339-.171 0 0-2.555 .038-3.161-.057C8.852 11.887 8.083 10.875 7.919 9.986c0 0-.253-.488 .545-.257 .798 .231 4.102 .899 4.102 .899 0 0-4.296-1.317-4.582-1.638C7.697 8.669 7.142 7.236 7.214 6.356c0 0 .031-.219 .256-.161 0 0 3.176 1.451 5.348 2.246 2.172 .795 4.06 1.199 3.816 2.227-.021 .088-.072 .216-.144 .371Z"),
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
        return _dingdingLine!!
    }

private var _dingdingLine: ImageVector? = null
