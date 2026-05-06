package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) return _numberCircleOne!!
        _numberCircleOne = phosphorBoldIcon(
            name = "NumberCircleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM144 80v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-73.58L114.66 106c-5.523 3.678-12.982 2.183-16.66-3.34C94.322 97.137 95.817 89.678 101.34 86l24-16c3.685-2.458 8.424-2.687 12.328-.595 3.904 2.092 6.338 6.165 6.332 10.595Z"),
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
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
