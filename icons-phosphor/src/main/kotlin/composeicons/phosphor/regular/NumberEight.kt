package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorRegularIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.55 119.27c17.152-12.022 24.528-33.777 18.225-53.751C167.472 45.545 148.945 31.964 128 31.964c-20.945 0-39.472 13.581-45.775 33.555-6.303 19.974 1.073 41.729 18.225 53.751C78.3 131.787 67.371 157.662 73.842 182.268c6.471 24.606 28.716 41.757 54.158 41.757 25.442 0 47.687-17.151 54.158-41.757 6.471-24.606-4.458-50.481-26.608-62.998ZM96 80C96 62.327 110.327 48 128 48c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 112 96 97.673 96 80ZM128 208C105.909 208 88 190.091 88 168c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
