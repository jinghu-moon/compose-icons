package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CarSimple: ImageVector
    get() {
        if (_carSimple != null) return _carSimple!!
        _carSimple = phosphorDuotoneIcon(
            name = "CarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 112h-192L61.89 44.75C63.174 41.861 66.039 40 69.2 40h117.6c3.161 0 6.026 1.861 7.31 4.75Z"),
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
                pathData = parseSvgPathData("M240 104h-10.8L201.42 41.5C198.852 35.723 193.122 32 186.8 32h-117.6c-6.322 0-12.052 3.723-14.62 9.5L26.8 104h-10.8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v80c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h96v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-80h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM69.2 48h117.6l24.89 56h-167.38ZM216 200h-24v-24c0-4.418-3.582-8-8-8h-112c-4.418 0-8 3.582-8 8v24h-24v-80h176Z"),
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
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
