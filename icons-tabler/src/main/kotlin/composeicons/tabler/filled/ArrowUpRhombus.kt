package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpRhombus: ImageVector
    get() {
        if (_arrowUpRhombus != null) return _arrowUpRhombus!!
        _arrowUpRhombus = tablerFilledIcon(
            name = "ArrowUpRhombus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.081 .003 .12 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 5.415v10.17l2.207 2.208c.39 .391 .39 1.024 0 1.414l-2.5 2.5c-.391 .39-1.023 .39-1.414 0L8.793 19.207c-.39-.391-.39-1.024 0-1.414L11 15.584v-10.169L9.707 6.707c-.356 .356-.922 .392-1.32 .083L8.293 6.707c-.39-.39-.39-1.023 0-1.414l3-3 .112-.097 .11-.071 .062-.031 .081-.034 .076-.024 .118-.025 .058-.007Z"),
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
        return _arrowUpRhombus!!
    }

private var _arrowUpRhombus: ImageVector? = null
