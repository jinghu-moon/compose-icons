package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Click: ImageVector
    get() {
        if (_click != null) return _click!!
        _click = tablerFilledIcon(
            name = "Click",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 12c0 .552-.448 1-1 1h-3C2.448 13 2 12.552 2 12c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1M13 3v3c0 .552-.448 1-1 1C11.448 7 11 6.552 11 6v-3c0-.552 .448-1 1-1 .552 0 1 .448 1 1M6.307 4.893 8.507 7.093c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L4.893 6.307C4.514 5.915 4.519 5.291 4.905 4.905c.386-.386 1.009-.391 1.402-.012M19.107 4.893c.39 .39 .39 1.023 0 1.414L16.907 8.507c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L17.693 4.893c.39-.39 1.023-.39 1.414 0M8.507 15.493c.39 .391 .39 1.024 0 1.414L6.307 19.107c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L7.093 15.493c.391-.39 1.023-.39 1.414 0M11.927 11.003 11.976 11l.098 .003 .097 .012 .097 .022 9.048 3.014c.845 .282 .928 1.445 .131 1.843l-3.702 1.851-1.85 3.702c-.399 .797-1.562 .714-1.844-.13L11.048 12.306l-.033-.135-.012-.097v-.148l.012-.097 .022-.097 .03-.094 .04-.09 .05-.084 .086-.117 .067-.07 .037-.034 .076-.06 .081-.052 .087-.043 .103-.04 .135-.033Z"),
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
        return _click!!
    }

private var _click: ImageVector? = null
