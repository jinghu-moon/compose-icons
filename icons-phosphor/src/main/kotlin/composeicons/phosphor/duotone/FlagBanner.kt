package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorDuotoneIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56l-45.71 96h-146.29L88 104 40 56Z"),
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
                pathData = parseSvgPathData("M238.76 51.73C237.295 49.41 234.744 48.002 232 48h-192c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722L76.69 104 34.34 146.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h133.62l-28.84 60.56c-1.313 2.591-1.118 5.69 .508 8.096 1.627 2.406 4.43 3.742 7.324 3.489 2.894-.253 5.423-2.054 6.608-4.706l80-168c1.18-2.479 1.006-5.389-.46-7.71ZM181.23 144h-121.92L93.66 109.66c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66L59.31 64h160Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
