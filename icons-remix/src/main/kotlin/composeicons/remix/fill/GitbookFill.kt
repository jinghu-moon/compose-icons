package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GitbookFill: ImageVector
    get() {
        if (_gitbookFill != null) return _gitbookFill!!
        _gitbookFill = remixIcon(
            name = "GitbookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.42 12.535c.979 .592 1.469 .888 2.007 .888 .538 0 1.028-.295 2.008-.884L20.671 8.786c.282-.169 .456-.484 .456-.824 0-.34-.174-.655-.456-.824L14.433 3.384c-.979-.59-1.469-.884-2.006-.884-.538 0-1.027 .295-2.006 .886L5.061 6.616c-.043 .026-.065 .039-.085 .053C3.147 7.792 2.017 9.837 2 12.054v.206c.016 2.215 1.144 4.258 2.97 5.382l.086 .052 3.352 2.026c1.962 1.185 2.942 1.778 4.02 1.778 1.077 0 2.058-.591 4.02-1.776l3.543-2.138c.981-.592 1.471-.888 1.74-1.375C22 15.723 22 15.131 22 13.947v-2.294c-.001-.323-.165-.622-.433-.783-.267-.162-.597-.162-.865-.001l-7.273 4.377c-.489 .294-.733 .441-1.002 .441-.268 0-.512-.146-1.001-.441L6.504 12.288c-.247-.148-.37-.223-.47-.236-.226-.03-.443 .102-.529 .322-.038 .097-.037 .246-.035 .545 .001 .219 .001 .328 .021 .429 .044 .225 .157 .429 .322 .58 .074 .068 .165 .123 .347 .232l5.263 3.18c.49 .297 .736 .444 1.005 .444 .27 0 .515-.148 1.005-.444l6.451-3.893c.168-.101 .251-.151 .314-.114 .063 .038 .063 .139 .063 .341v1.039c0 .296 0 .444-.067 .566-.067 .122-.19 .196-.435 .344l-5.319 3.21c-.981 .592-1.472 .888-2.01 .888-.539 0-1.03-.297-2.01-.89L5.442 15.826l-.035-.021C4.365 15.166 3.722 14 3.715 12.737v-.998c0-.698 .355-1.343 .932-1.693 .511-.31 1.141-.311 1.653-.001l4.121 2.49-.001 .001Z"),
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
        return _gitbookFill!!
    }

private var _gitbookFill: ImageVector? = null
