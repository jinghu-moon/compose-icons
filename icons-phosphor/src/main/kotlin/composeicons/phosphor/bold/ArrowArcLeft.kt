package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorBoldIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 184c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 .002-33.977-20.464-64.609-51.854-77.612C128.756 93.386 92.624 100.574 68.6 124.6L53.11 140h34.89c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12v-64C12 81.373 17.373 76 24 76c6.627 0 12 5.373 12 12v35.16L51.66 107.61C82.553 76.739 128.999 67.513 169.345 84.233 209.692 100.952 235.998 140.326 236 184Z"),
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
