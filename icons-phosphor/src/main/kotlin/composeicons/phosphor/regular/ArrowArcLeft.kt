package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorRegularIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8-.004-35.589-21.445-67.672-54.325-81.291C128.794 89.09 90.948 96.617 65.78 121.78L43.4 144h44.6c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v44.77L54.48 110.44C84.228 80.707 128.957 71.819 167.812 87.92 206.668 104.021 232.001 141.941 232 184Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
