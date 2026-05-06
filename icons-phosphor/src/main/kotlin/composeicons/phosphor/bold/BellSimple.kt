package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorBoldIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.29 165.93C216.61 151 212 129.57 212 104 212 57.608 174.392 20 128 20 81.608 20 44 57.608 44 104c0 25.58-4.59 47-13.27 61.93-3.605 6.198-3.631 13.847-.07 20.07 3.541 6.229 10.175 10.055 17.34 10h160c7.154 .044 13.774-3.78 17.31-10 3.577-6.214 3.569-13.863-.02-20.07ZM54.66 172C63.51 154 68 131.14 68 104 68 70.863 94.863 44 128 44c33.137 0 60 26.863 60 60 0 27.13 4.48 50 13.33 68ZM172 224c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12Z"),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
