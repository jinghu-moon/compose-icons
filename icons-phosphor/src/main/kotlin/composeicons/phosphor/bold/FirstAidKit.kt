package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorBoldIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-36v-8C180 28.536 167.464 16 152 16h-48C88.536 16 76 28.536 76 44v8h-36C28.954 52 20 60.954 20 72v128c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-128C236 60.954 227.046 52 216 52ZM100 44c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v8h-56ZM212 196h-168v-120h168ZM164 136c0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12Z"),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
