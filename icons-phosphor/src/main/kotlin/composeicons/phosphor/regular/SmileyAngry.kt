package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorRegularIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM164 128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128C216 79.399 176.601 40 128 40 79.399 40 40 79.399 40 128c0 48.601 39.399 88 88 88 48.578-.055 87.945-39.422 88-88ZM171.56 81.34 128 110.39l-43.56-29C80.762 78.938 75.792 79.932 73.34 83.61c-2.452 3.678-1.458 8.648 2.22 11.1l48 32c2.688 1.794 6.192 1.794 8.88 0l48-32c3.678-2.452 4.672-7.422 2.22-11.1-2.452-3.678-7.422-4.672-11.1-2.22ZM156.43 177.34C148 171.73 139.94 168 128 168c-11.94 0-20 3.73-28.43 9.34-3.591 2.48-4.532 7.38-2.115 11.013 2.417 3.633 7.3 4.66 10.975 2.307C114.93 186.34 120 184 128 184c8 0 13.07 2.34 19.57 6.66 2.379 1.643 5.46 1.875 8.058 .605 2.598-1.269 4.309-3.841 4.475-6.728 .166-2.887-1.238-5.638-3.673-7.197Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
