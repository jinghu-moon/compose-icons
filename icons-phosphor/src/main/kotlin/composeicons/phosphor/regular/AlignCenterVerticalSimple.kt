package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorRegularIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 120h-32v-72c0-8.837-7.163-16-16-16h-64C87.163 32 80 39.163 80 48v72h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v72c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-72h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 208h-64v-160h64Z"),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
