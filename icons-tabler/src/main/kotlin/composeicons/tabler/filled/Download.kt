package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = tablerFilledIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 16c.552 0 1 .448 1 1v2c0 1.657-1.343 3-3 3h-12C4.343 22 3 20.657 3 19v-2c0-.552 .448-1 1-1 .552 0 1 .448 1 1v2c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-2c0-.552 .448-1 1-1M12 3c.552 0 1 .448 1 1v9.585l3.293-3.292c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402l-5 5c-.028 .028-.058 .055-.09 .08l.09-.08c-.179 .179-.42 .284-.674 .292L12 17h-.032l-.054-.004L12 17c-.224 0-.441-.075-.617-.213-.032-.025-.062-.052-.09-.08l-5-5c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L11 13.585v-9.585c0-.552 .448-1 1-1"),
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
        return _download!!
    }

private var _download: ImageVector? = null
