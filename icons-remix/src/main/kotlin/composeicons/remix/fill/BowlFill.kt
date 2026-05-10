package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BowlFill: ImageVector
    get() {
        if (_bowlFill != null) return _bowlFill!!
        _bowlFill = remixIcon(
            name = "BowlFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 1.5C8 .948 7.552 .5 7 .5c-.552 0-1 .448-1 1v1c0 .007 0 .013 .001 .018 .003 .043 .004 .062-.208 .274l-.02 .02C5.506 3.079 5 3.584 5 4.5v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1C7 4.493 7 4.487 6.999 4.482c-.003-.043-.004-.062 .208-.274l.02-.02C7.494 3.921 8 3.416 8 2.5v-1ZM2 9C2 8.448 2.448 8 3 8h18c.552 0 1 .448 1 1v1c0 4.101-2.468 7.625-6 9.168v.832c0 .552-.448 1-1 1h-6C8.448 21 8 20.552 8 20v-.832C4.468 17.625 2 14.101 2 10v-1ZM18 .5c.552 0 1 .448 1 1v1c0 .916-.506 1.421-.773 1.687l-.02 .02c-.212 .212-.211 .231-.208 .274 0 .006 .001 .012 .001 .018v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1c0-.916 .506-1.421 .773-1.687l.02-.02c.212-.212 .211-.231 .208-.274C17 2.513 17 2.507 17 2.5v-1c0-.552 .448-1 1-1ZM13.5 1.5c0-.552-.448-1-1-1-.552 0-1 .448-1 1v1c0 .007 0 .013 .001 .018 .003 .043 .004 .062-.208 .274l-.02 .02c-.267 .266-.773 .771-.773 1.687v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1c0-.007-0-.013-.001-.018-.003-.043-.004-.062 .208-.274l.02-.02c.267-.266 .773-.771 .773-1.687v-1Z"),
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
        return _bowlFill!!
    }

private var _bowlFill: ImageVector? = null
