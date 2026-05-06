package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorRegularIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 40C106.089 39.99 86.185 52.759 77.061 72.68c-9.124 19.92-5.793 43.332 8.526 59.917 14.319 16.585 36.995 23.295 58.033 17.173L113 204.07c-2.168 3.866-.791 8.757 3.075 10.925 3.866 2.168 8.757 .791 10.925-3.075l49.55-88c9.967-17.33 9.94-38.658-.071-55.963C166.468 50.653 147.992 39.998 128 40ZM128 136C105.909 136 88 118.091 88 96 88 73.909 105.909 56 128 56c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
