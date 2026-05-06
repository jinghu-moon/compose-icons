package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorRegularIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM128 112c-.61 0-1.22 0-1.82 0L142.87 84.1c2.264-3.794 1.024-8.706-2.77-10.97-3.794-2.264-8.706-1.024-10.97 2.77L96.9 129.9c-8.198 14.095-5.899 31.941 5.605 43.498 11.504 11.557 29.339 13.937 43.472 5.803 14.133-8.134 21.033-24.752 16.819-40.504C158.582 122.944 144.306 111.991 128 112ZM128 168c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
