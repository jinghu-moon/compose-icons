package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorRegularIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-144C63.163 40 56 47.163 56 56v16h-16C31.163 72 24 79.163 24 88v112c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-16h16c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM184 88v16h-144v-16ZM184 200h-144v-80h144v80ZM216 168h-16v-80c0-8.837-7.163-16-16-16h-112v-16h144Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
