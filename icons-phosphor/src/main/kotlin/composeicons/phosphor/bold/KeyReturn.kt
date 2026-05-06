package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorBoldIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M71.51 144.49c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l24-24c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L109 124h55v-20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v32c0 6.627-5.373 12-12 12h-67l3.52 3.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0ZM236 56v144c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v136h168Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
