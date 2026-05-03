package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerFilledIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.348 3.169 L 3.198 6.282 C 2.201 6.725 1.742 7.885 2.168 8.890 L 7.088 20.785 C 7.286 21.273 7.672 21.661 8.160 21.861 C 8.647 22.061 9.194 22.056 9.678 21.848 L 16.820 18.738 C 17.820 18.297 18.282 17.134 17.856 16.127 L 12.936 4.233 C 12.738 3.745 12.352 3.358 11.865 3.158 C 11.379 2.958 10.832 2.962 10.348 3.169 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 C 17.047 3.000 17.917 3.806 17.995 4.850 L 18.000 5.000 L 18.000 8.500 C 17.999 9.029 17.587 9.466 17.059 9.497 C 16.530 9.528 16.069 9.142 16.007 8.617 L 16.000 8.500 L 16.000 5.000 L 15.000 5.000 C 14.471 4.999 14.034 4.587 14.003 4.059 C 13.972 3.530 14.358 3.069 14.883 3.007 L 15.000 3.000 L 16.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.080 5.610 C 19.296 5.102 19.882 4.865 20.390 5.080 C 20.647 5.188 20.895 5.290 21.159 5.394 C 22.121 5.802 22.606 6.883 22.273 7.873 L 22.217 8.019 L 19.919 13.393 C 19.709 13.877 19.159 14.115 18.663 13.936 C 18.166 13.757 17.894 13.224 18.041 12.717 L 18.081 12.607 L 20.377 7.236 L 20.011 7.088 L 19.609 6.921 C 19.365 6.817 19.171 6.621 19.072 6.375 C 18.973 6.129 18.975 5.853 19.079 5.609 Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
