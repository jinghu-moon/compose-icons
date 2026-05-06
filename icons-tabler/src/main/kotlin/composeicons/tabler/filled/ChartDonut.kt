package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = tablerFilledIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.292 2.61c.396 .318 .65 .78 .703 1.286L12 4v4c0 .455-.307 .853-.748 .968C9.79 9.348 8.815 10.726 8.943 12.231c.128 1.505 1.322 2.699 2.826 2.826 1.505 .128 2.883-.847 3.263-2.309 .115-.441 .513-.748 .968-.748h3.8c1.105 0 2 .895 2 2-0 .076-.009 .152-.026 .226-1.115 4.811-5.576 8.087-10.5 7.713C6.349 21.564 2.436 17.651 2.061 12.726 1.687 7.802 4.963 3.341 9.774 2.226l.057-.01 .052-.01c.505-.059 1.012 .086 1.409 .404M14.995 2.5l.045 .002 .067 .004 .081 .014 .032 .004 .072 .022 .04 .01c2.755 .97 4.947 3.095 6.003 5.818l.108 .294c.108 .306 .06 .645-.127 .91-.187 .265-.492 .422-.816 .422h-4.5c-.292 0-.57-.128-.76-.35-.273-.32-.57-.617-.89-.89C14.128 8.57 14 8.292 14 8v-4.5q.001-.119 .026-.23l.03-.102c.038-.109 .095-.21 .168-.299l.03-.033 .039-.043c.028-.028 .058-.055 .089-.08l.051-.034 .03-.023 .045-.025 .052-.03c.136-.066 .284-.101 .435-.101"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
