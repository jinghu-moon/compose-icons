package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsRight: ImageVector
    get() {
        if (_circleChevronsRight != null) return _circleChevronsRight!!
        _circleChevronsRight = tablerFilledIcon(
            name = "CircleChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.073 1.868c5.494 .04 9.926 4.505 9.926 10 0 5.494-4.432 9.959-9.926 10C6.579 21.908 2.081 17.508 2 12.015v-.295C2.081 6.227 6.579 1.827 12.073 1.868M9.707 8.293c-.391-.39-1.023-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32L10.585 12 8.293 14.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l3-3c.39-.391 .39-1.023 0-1.414ZM13.707 8.293c-.391-.39-1.023-.39-1.414 0l-.083 .094c-.309 .398-.273 .964 .083 1.32L14.585 12l-2.292 2.293c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l3-3c.39-.391 .39-1.023 0-1.414Z"),
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
        return _circleChevronsRight!!
    }

private var _circleChevronsRight: ImageVector? = null
