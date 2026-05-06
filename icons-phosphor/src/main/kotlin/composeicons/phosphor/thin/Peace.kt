package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorThinIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM220 128c.021 17.52-4.991 34.677-14.44 49.43L132 125.92v-89.83c49.182 2.197 87.942 42.679 88 91.91ZM124 36.09v89.83L50.44 177.43C32.783 149.712 31.253 114.681 46.425 85.528 61.597 56.376 91.168 37.531 124 36.09ZM55 184l69-48.29v84.23C96.815 218.761 71.548 205.6 55 184ZM132 219.94v-84.26L201 184c-16.554 21.589-41.82 34.738-69 35.91Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
