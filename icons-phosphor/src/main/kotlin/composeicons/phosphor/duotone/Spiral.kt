package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorDuotoneIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 144h-32c0 44.183-35.817 80-80 80C79.399 224 40 184.601 40 136 40 82.981 82.981 40 136 40c57.438 0 104 46.562 104 104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M248 144c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C231.939 91.006 188.994 48.061 136 48 87.422 48.055 48.055 87.422 48 136c.05 44.162 35.838 79.95 80 80 39.746-.044 71.956-32.254 72-72C199.961 108.67 171.33 80.039 136 80c-30.914 .033-55.967 25.086-56 56 .028 26.498 21.502 47.972 48 48 22.091 0 40-17.909 40-40 0-17.673-14.327-32-32-32-13.255 0-24 10.745-24 24 0 8.837 7.163 16 16 16 4.418 0 8-3.582 8-8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 8.837 0 16 7.163 16 16 0 13.255-10.745 24-24 24C110.327 168 96 153.673 96 136c0-22.091 17.909-40 40-40 26.498 .028 47.972 21.502 48 48-.033 30.914-25.086 55.967-56 56C92.67 199.961 64.039 171.33 64 136 64.044 96.254 96.254 64.044 136 64c44.162 .05 79.95 35.838 80 80-.055 48.578-39.422 87.945-88 88C75.006 231.939 32.061 188.994 32 136 32.061 78.588 78.588 32.061 136 32c61.828 .066 111.934 50.172 112 112Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
