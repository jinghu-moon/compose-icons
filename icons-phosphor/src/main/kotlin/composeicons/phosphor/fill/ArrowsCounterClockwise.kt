package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorFillIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 104h-48c-4.418 0-8-3.582-8-8v-48c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L64 60.7C81.722 43.597 105.371 34.008 130 33.94h.53c25.081-.065 49.177 9.754 67.07 27.33 3.039 3.109 3.039 8.075 .001 11.184-3.038 3.109-8.003 3.223-11.181 .256C171.506 58.071 151.428 49.891 130.53 49.94h-.45C109.682 49.998 90.087 57.896 75.35 72L93.66 90.34c2.291 2.288 2.976 5.731 1.737 8.722C94.158 102.053 91.238 104.003 88 104ZM216 152h-48c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722L180.65 184c-14.729 14.113-34.321 22.022-54.72 22.09h-.45c-20.898 .049-40.976-8.131-55.89-22.77-2.028-2.075-5.021-2.889-7.821-2.127-2.8 .762-4.968 2.98-5.665 5.797-.697 2.817 .185 5.79 2.306 7.77 17.893 17.576 41.989 27.395 67.07 27.33h.52c24.629-.068 48.278-9.657 66-26.76l18.36 18.36c2.294 2.28 5.735 2.955 8.72 1.71 2.985-1.245 4.927-4.165 4.92-7.4v-48c0-4.418-3.582-8-8-8Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
