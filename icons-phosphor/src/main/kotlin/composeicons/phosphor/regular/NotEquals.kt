package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorRegularIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 160c0 4.418-3.582 8-8 8h-113.55L53.92 221.38c-2.985 3.207-7.994 3.416-11.236 .469-3.242-2.946-3.511-7.952-.604-11.229L80.82 168h-40.82c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h55.37L139 104h-99c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h113.55L202.08 34.62c2.985-3.207 7.994-3.416 11.236-.469 3.242 2.946 3.511 7.952 .604 11.229L175.18 88h40.82c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-55.37L117 152h99c4.418 0 8 3.582 8 8Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
