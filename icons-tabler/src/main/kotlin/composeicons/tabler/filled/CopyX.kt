package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyX: ImageVector
    get() {
        if (_copyX != null) return _copyX!!
        _copyX = tablerFilledIcon(
            name = "CopyX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 6C20.358 6 22 7.642 22 9.667v8.666C22 20.358 20.358 22 18.333 22h-8.666C7.642 22 6 20.358 6 18.333v-8.666C6 7.642 7.642 6 9.667 6ZM15 2c1.094 0 1.828 .533 2.374 1.514 .268 .483 .095 1.092-.388 1.36-.483 .268-1.092 .095-1.36-.388C15.405 4.088 15.284 4 15 4h-10C4.452 4 4 4.452 4 5v9.998c0 .32 .154 .618 .407 .805l.1 .065c.48 .273 .647 .884 .374 1.364-.273 .48-.884 .647-1.364 .374C2.58 17.073 2.001 16.078 2 15v-10C2 3.348 3.348 2 5 2ZM15.8 10.786l-1.837 1.799L12.214 10.8c-.353-.36-.918-.401-1.319-.096l-.095 .082c-.394 .387-.401 1.02-.014 1.414l1.749 1.785-1.835 1.8c-.36 .353-.401 .919-.096 1.32l.082 .095c.387 .394 1.02 .401 1.414 .014l1.836-1.8 1.75 1.786c.353 .36 .918 .401 1.319 .096l.095-.082c.394-.387 .401-1.02 .014-1.414L15.364 14.014l1.836-1.8c.36-.353 .401-.918 .096-1.319l-.082-.095c-.387-.394-1.02-.401-1.414-.014"),
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
        return _copyX!!
    }

private var _copyX: ImageVector? = null
