package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorBoldIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 60h-192C20.954 60 12 68.954 12 80v72c0 11.046 8.954 20 20 20h20v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h104v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h20c11.046 0 20-8.954 20-20v-72C244 68.954 235.046 60 224 60ZM220 119 185 84h35ZM177 148 113 84h38l64 64ZM105 148 41 84h38l64 64ZM36 113l35 35h-35Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
