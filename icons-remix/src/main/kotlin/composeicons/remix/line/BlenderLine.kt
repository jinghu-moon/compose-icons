package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlenderLine: ImageVector
    get() {
        if (_blenderLine != null) return _blenderLine!!
        _blenderLine = remixIcon(
            name = "BlenderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.122 2.217c-.432-.344-1.061-.272-1.405 .161-.344 .432-.272 1.061 .161 1.405l3.419 2.717h-10.797c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h5.472L.878 15.717c-.433 .343-.505 .972-.162 1.405 .343 .433 .972 .505 1.405 .162L7.545 12.98c-.029 .253-.045 .51-.045 .77 0 4.108 3.691 7.25 8 7.25 4.309 0 8-3.142 8-7.25 0-2.247-1.124-4.227-2.835-5.539L13.122 2.217ZM11.565 9.789c1.046-.797 2.419-1.289 3.935-1.289 1.52 0 2.895 .494 3.942 1.295 1.284 .981 2.058 2.404 2.058 3.955 0 2.796-2.577 5.25-6 5.25C12.077 19 9.5 16.546 9.5 13.75c0-1.48 .704-2.842 1.882-3.816l.182-.145ZM14.478 14.092c-.277-.26-.398-.565-.381-.882C14.129 12.645 14.72 12 15.595 12c.873 0 1.465 .644 1.498 1.209 .017 .33-.108 .633-.378 .887-.286 .269-.697 .44-1.12 .44-.413 0-.826-.17-1.117-.444ZM15.595 10c-1.746 0-3.394 1.295-3.495 3.099-.107 1.946 1.626 3.437 3.495 3.437 1.876 0 3.602-1.477 3.495-3.438C18.988 11.294 17.341 10 15.595 10Z"),
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
        return _blenderLine!!
    }

private var _blenderLine: ImageVector? = null
