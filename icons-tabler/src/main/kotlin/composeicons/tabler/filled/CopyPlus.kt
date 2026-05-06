package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyPlus: ImageVector
    get() {
        if (_copyPlus != null) return _copyPlus!!
        _copyPlus = tablerFilledIcon(
            name = "CopyPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 6C20.358 6 22 7.642 22 9.667v8.666C22 20.358 20.358 22 18.333 22h-8.666C7.642 22 6 20.358 6 18.333v-8.666C6 7.642 7.642 6 9.667 6ZM14 10c-.552 0-1 .448-1 1v2h-2c-.507 0-.934 .38-.993 .883L10 14c0 .552 .448 1 1 1h2v2c0 .507 .38 .934 .883 .993L14 18c.552 0 1-.448 1-1v-2h2c.507-0 .934-.38 .993-.883L18 14c0-.552-.448-1-1-1h-2v-2c-0-.507-.38-.934-.883-.993ZM15 2c1.094 0 1.828 .533 2.374 1.514 .268 .483 .095 1.092-.388 1.36-.483 .268-1.092 .095-1.36-.388C15.405 4.088 15.284 4 15 4h-10C4.452 4 4 4.452 4 5v9.998c0 .32 .154 .618 .407 .805l.1 .065c.48 .273 .647 .884 .374 1.364-.273 .48-.884 .647-1.364 .374C2.58 17.073 2.001 16.078 2 15v-10C2 3.348 3.348 2 5 2Z"),
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
        return _copyPlus!!
    }

private var _copyPlus: ImageVector? = null
