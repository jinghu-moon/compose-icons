package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = tablerFilledIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.707 4.293l3 3c.39 .39 .39 1.023 0 1.414l-1.553 1.555c2.559 2.783 2.446 7.095-.256 9.74L19 20c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21c0-.552 .448-1 1-1h1v-1C5.448 19 5 18.552 5 18c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v1h4c1.969 0 3.756-1.155 4.562-2.952 .807-1.797 .484-3.899-.825-5.371l-3.03 3.03c-.391 .39-1.023 .39-1.414 0l-.793-.792-.793 .792c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973l.792-.793-.792-.793c-.39-.391-.39-1.023 0-1.414l6-6c.391-.39 1.023-.39 1.414 0M17.707 2.293l3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273l-3-3c-.26-.251-.364-.623-.273-.973 .092-.35 .365-.623 .714-.714 .35-.092 .721 .013 .973 .273"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
