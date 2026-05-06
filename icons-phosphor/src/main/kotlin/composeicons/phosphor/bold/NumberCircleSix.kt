package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorBoldIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM133.06 108.33 146.3 86.15c2.326-3.685 2.47-8.342 .379-12.165-2.092-3.823-6.092-6.211-10.449-6.239-4.358-.028-8.388 2.308-10.529 6.104l-32.24 54c-8.892 15.248-6.738 34.522 5.3 47.431 12.038 12.909 31.115 16.401 46.946 8.594 15.831-7.807 24.673-25.069 21.759-42.478-2.914-17.409-16.895-30.85-34.405-33.077ZM128 164c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
