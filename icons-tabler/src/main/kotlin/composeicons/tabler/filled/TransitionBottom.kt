package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionBottom: ImageVector
    get() {
        if (_transitionBottom != null) return _transitionBottom!!
        _transitionBottom = tablerFilledIcon(
            name = "TransitionBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 17c.552 0 1 .448 1 1 0 2.209-1.791 4-4 4h-12C3.791 22 2 20.209 2 18c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 1.105 .895 2 2 2h12c1.047 0 1.917-.806 1.995-1.85L20 18c0-.552 .448-1 1-1M12 18l-.082-.004-.119-.016-.111-.03-.111-.044-.098-.052-.096-.067-.09-.08-3-3c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L11 14.586v-4.586h-5C3.791 10 2 8.209 2 6 2 3.791 3.791 2 6 2h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-5v4.583l1.293-1.29c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .391 .39 1.023 0 1.414l-3 3-.112 .097-.11 .071-.062 .031-.081 .034-.076 .024-.149 .03Z"),
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
        return _transitionBottom!!
    }

private var _transitionBottom: ImageVector? = null
