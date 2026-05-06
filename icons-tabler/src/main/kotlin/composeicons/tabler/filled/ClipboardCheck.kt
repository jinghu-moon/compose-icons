package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) return _clipboardCheck!!
        _clipboardCheck = tablerFilledIcon(
            name = "ClipboardCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.997 4.17C19.197 4.593 20 5.727 20 7v12c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-12C4 5.727 4.803 4.593 6.003 4.17 6.094 6.311 7.857 8 10 8h4c2.053 0 3.773-1.554 3.98-3.597ZM14.293 11.293 11 14.585 9.707 13.293c-.251-.26-.623-.364-.973-.273-.35 .092-.623 .365-.714 .714-.092 .35 .013 .721 .273 .973l2 2c.391 .39 1.023 .39 1.414 0l4-4c.379-.392 .374-1.016-.012-1.402-.386-.386-1.009-.391-1.402-.012M14 2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4C8.895 6 8 5.105 8 4 8 2.895 8.895 2 10 2Z"),
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
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
