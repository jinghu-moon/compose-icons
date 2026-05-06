package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeDown: ImageVector
    get() {
        if (_arrowBadgeDown != null) return _arrowBadgeDown!!
        _arrowBadgeDown = tablerFilledIcon(
            name = "ArrowBadgeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.375 6.22 12 9.718 7.625 6.218C7.325 5.978 6.913 5.931 6.566 6.098 6.22 6.264 5.999 6.615 6 7v6c0 .303 .138 .59 .375 .78l5 4c.365 .292 .885 .292 1.25 0l5-4c.237-.19 .375-.477 .375-.78v-6c-0-.384-.221-.735-.567-.901-.347-.166-.758-.119-1.058 .121Z"),
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
        return _arrowBadgeDown!!
    }

private var _arrowBadgeDown: ImageVector? = null
