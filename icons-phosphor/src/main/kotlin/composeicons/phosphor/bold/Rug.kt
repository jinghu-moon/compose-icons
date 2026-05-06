package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorBoldIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 12c-6.627 0-12 5.373-12 12v12h-24v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-24v-12c0-6.627-5.373-12-12-12C97.373 12 92 17.373 92 24v12h-24v-12C68 17.373 62.627 12 56 12 49.373 12 44 17.373 44 24v208c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-208c0-6.627-5.373-12-12-12ZM68 60h120v136h-120ZM128 180c4.216-.001 8.122-2.214 10.29-5.83l24-40c2.277-3.798 2.277-8.542 0-12.34l-24-40C136.121 78.215 132.215 76.004 128 76.004c-4.215 0-8.121 2.212-10.29 5.826l-24 40c-2.277 3.798-2.277 8.542 0 12.34l24 40c2.168 3.616 6.074 5.829 10.29 5.83ZM128 111.32 138 128l-10 16.68L118 128Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
