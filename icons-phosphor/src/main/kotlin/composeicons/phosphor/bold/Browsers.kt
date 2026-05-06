package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorBoldIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 32h-144C64.954 32 56 40.954 56 52v20h-20C24.954 72 16 80.954 16 92v112c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-20h20c11.046 0 20-8.954 20-20v-112C240 40.954 231.046 32 220 32ZM176 96v16h-136v-16ZM176 200h-136v-64h136ZM216 160h-16v-68C200 80.954 191.046 72 180 72h-100v-16h136Z"),
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
