package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpCircle: ImageVector
    get() {
        if (_arrowUpCircle != null) return _arrowUpCircle!!
        _arrowUpCircle = tablerFilledIcon(
            name = "ArrowUpCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.852 2.011l.058-.007L12 2l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 5.415v10.756c1.378 .487 2.205 1.896 1.958 3.337-.247 1.441-1.496 2.494-2.958 2.494-1.462 0-2.711-1.053-2.958-2.494C8.795 18.067 9.622 16.658 11 16.171v-10.756L9.707 6.707c-.356 .356-.922 .392-1.32 .083L8.293 6.707c-.39-.39-.39-1.023 0-1.414l3-3q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z"),
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
        return _arrowUpCircle!!
    }

private var _arrowUpCircle: ImageVector? = null
