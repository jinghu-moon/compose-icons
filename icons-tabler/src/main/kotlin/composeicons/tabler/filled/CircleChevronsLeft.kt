package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsLeft: ImageVector
    get() {
        if (_circleChevronsLeft != null) return _circleChevronsLeft!!
        _circleChevronsLeft = tablerFilledIcon(
            name = "CircleChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.927 2.133C17.421 2.093 21.919 6.492 22 11.985v.295c-.081 5.493-4.579 9.893-10.073 9.852C6.433 22.092 2.001 17.627 2.001 12.132c0-5.494 4.432-9.959 9.926-10M15.707 8.292c-.391-.39-1.023-.39-1.414 0l-3 3c-.39 .391-.39 1.024 0 1.414l3 3c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L13.415 12 15.707 9.707c.39-.391 .39-1.023 0-1.414M11.707 8.293c-.391-.39-1.023-.39-1.414 0l-3 3c-.39 .391-.39 1.023 0 1.414l3 3c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L9.415 12 11.707 9.707c.39-.391 .39-1.023 0-1.414"),
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
        return _circleChevronsLeft!!
    }

private var _circleChevronsLeft: ImageVector? = null
