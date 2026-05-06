package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorBoldIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM160 140h-4v-60c-0-5.126-3.256-9.686-8.104-11.35-4.848-1.664-10.218-.065-13.366 3.98l-56 72c-2.815 3.617-3.324 8.523-1.31 12.641 2.013 4.118 6.197 6.729 10.78 6.729h44v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM132 140h-19.46L132 115Z"),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
