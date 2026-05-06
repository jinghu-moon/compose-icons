package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorFillIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 152c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM128 116c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM164 152c.001-11.23-5.249-21.815-14.19-28.61 9.623-8.962 12.783-22.899 7.967-35.135C152.961 76.018 141.15 67.974 128 67.974c-13.15 0-24.961 8.045-29.777 20.281-4.816 12.236-1.656 26.173 7.967 35.135C92.744 133.629 88.231 151.842 95.34 167.175c7.109 15.332 23.927 23.655 40.429 20.008C152.271 183.536 164.015 168.9 164 152Z"),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
