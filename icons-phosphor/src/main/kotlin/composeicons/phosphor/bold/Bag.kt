package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bag: ImageVector
    get() {
        if (_bag != null) return _bag!!
        _bag = phosphorBoldIcon(
            name = "Bag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 60h-36.17C177.641 32.999 155.09 12.201 128 12.201 100.91 12.201 78.359 32.999 76.17 60h-36.17C28.954 60 20 68.954 20 80v120c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-120C236 68.954 227.046 60 216 60ZM128 36c13.918 .001 25.722 10.225 27.71 24h-55.42C102.278 46.225 114.082 36.001 128 36ZM212 196h-168v-112h32v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h56v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h32Z"),
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
        return _bag!!
    }

private var _bag: ImageVector? = null
