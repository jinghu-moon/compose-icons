package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorRegularIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 104c-5.286 .002-10.545 .753-15.62 2.23L143 51.93c2.168-3.866 .791-8.757-3.075-10.925-3.866-2.168-8.757-.791-10.925 3.075l-49.55 88c-12.632 21.963-8.944 49.672 8.993 67.566 17.937 17.894 45.655 21.515 67.587 8.83 21.933-12.685 32.616-38.516 26.05-62.987C175.515 121.017 153.337 104.003 128 104ZM128 200C105.909 200 88 182.091 88 160c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
